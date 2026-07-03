package com.example

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class WarMachineViewModel(private val context: Context) : ViewModel() {

    private val sharedPrefs = context.getSharedPreferences("wm_prefs", Context.MODE_PRIVATE)

    private val _apiKey = MutableStateFlow(sharedPrefs.getString("wm_api_key", "") ?: "")
    val apiKey: StateFlow<String> = _apiKey.asStateFlow()

    private val _selectedModel = MutableStateFlow("gemini-3.5-flash")
    val selectedModel: StateFlow<String> = _selectedModel.asStateFlow()

    private val _selectedStyle = MutableStateFlow("Outline")
    val selectedStyle: StateFlow<String> = _selectedStyle.asStateFlow()

    private val _selectedCategory = MutableStateFlow(MasterDatabase.megaMicrostockDatabase.keys.first())
    val selectedCategory: StateFlow<String> = _selectedCategory.asStateFlow()

    private val _themes = MutableStateFlow<List<String>>(emptyList())
    val themes: StateFlow<List<String>> = _themes.asStateFlow()

    private val _selectedTheme = MutableStateFlow("")
    val selectedTheme: StateFlow<String> = _selectedTheme.asStateFlow()

    private val _niches = MutableStateFlow<List<String>>(emptyList())
    val niches: StateFlow<List<String>> = _niches.asStateFlow()

    private val _selectedNiche = MutableStateFlow("")
    val selectedNiche: StateFlow<String> = _selectedNiche.asStateFlow()

    private val _quantity = MutableStateFlow(10)
    val quantity: StateFlow<Int> = _quantity.asStateFlow()

    private val _instruction = MutableStateFlow("")
    val instruction: StateFlow<String> = _instruction.asStateFlow()

    private val _generatedPrompts = MutableStateFlow<List<String>>(emptyList())
    val generatedPrompts: StateFlow<List<String>> = _generatedPrompts.asStateFlow()

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading.asStateFlow()

    private val _errorMessage = MutableStateFlow<String?>(null)
    val errorMessage: StateFlow<String?> = _errorMessage.asStateFlow()

    init {
        updateThemes()
    }

    fun saveApiKey(key: String) {
        _apiKey.value = key
        sharedPrefs.edit().putString("wm_api_key", key).apply()
    }

    fun clearApiKey() {
        _apiKey.value = ""
        sharedPrefs.edit().remove("wm_api_key").apply()
    }

    fun setModel(model: String) { _selectedModel.value = model }
    fun setStyle(style: String) { _selectedStyle.value = style }

    fun setCategory(category: String) {
        _selectedCategory.value = category
        updateThemes()
    }

    private fun updateThemes() {
        val categoryData = MasterDatabase.megaMicrostockDatabase[_selectedCategory.value]
        if (categoryData != null) {
            val newThemes = categoryData.keys.toList()
            _themes.value = newThemes
            _selectedTheme.value = newThemes.firstOrNull() ?: ""
            updateNiches()
        }
    }

    fun setTheme(theme: String) {
        _selectedTheme.value = theme
        updateNiches()
    }

    private fun updateNiches() {
        val categoryData = MasterDatabase.megaMicrostockDatabase[_selectedCategory.value]
        val newNiches = categoryData?.get(_selectedTheme.value) ?: emptyList()
        _niches.value = newNiches
        _selectedNiche.value = newNiches.firstOrNull() ?: ""
    }

    fun setNiche(niche: String) { _selectedNiche.value = niche }
    fun setQuantity(qty: Int) { _quantity.value = qty }
    fun setInstruction(inst: String) { _instruction.value = inst }

    fun clearPrompts() {
        _generatedPrompts.value = emptyList()
    }
    
    fun clearError() {
        _errorMessage.value = null
    }

    fun generatePrompts() {
        if (_apiKey.value.isBlank()) {
            _errorMessage.value = "Isi dan simpan API Key Gemini lo dulu, bro!"
            return
        }

        _isLoading.value = true
        _errorMessage.value = null
        
        viewModelScope.launch {
            try {
                val style = _selectedStyle.value
                val masterPattern = when (style) {
                    "Outline" -> "A minimalist monoline line art [OBJECT/CHARACTER & ACTIVITY],center object, No text ,isolated on white background"
                    "Flat Vector Bold Outline" -> "A professional flat vector illustration of [OBJECT/CHARACTER & ACTIVITY], enclosed in solid thick bold black outlines, vibrant color,Flat design style,no text,no logo,center object isolated on white background"
                    "Flat Vector No Outline" -> "Premium minimalist flat vector illustration of [OBJECT/CHARACTER & ACTIVITY],pastel color,Flat designstyle, Center Object,No text,no logo,isolated on white background"
                    "3D Claymorphism" -> "High-end 3d render icon of [OBJECT/CHARACTER & ACTIVITY], modern claymorphism aesthetics, soft matte finish plastic textures, smooth ultra-rounded squircle corners visual aesthetics, stunning soft colorful lighting scheme, isolated on a blank,clean, and clear white background"
                    "Photography" -> "A high quality commercial photography of [OBJECT/CHARACTER,Atmosphere,ACTIVITY], relevant professional stock elements. Environment: Masterful composition matching the scene, clean frames, zero color cast, natural organic reflections and rich textures. Lighting: Masterful lighting setup, precise key light for soft depth, balanced fill light to retain subtle dimensional shadows, perfect highlights and natural micro-contrast. Camera & Lens: Shot on Hasselblad medium format camera, high-end prime lens, ultra-high resolution, sharp crisp focus on the central subject. Color & Tonal Qualities: Lifelike color accuracy, rich and smooth tonal transitions, soft organic drop-off blur, cinematic depth of field, premium professional presentation."
                    "Comercial Photo" -> "ultra realistic commercial stock photography of [Concept Description...], photographed using a Canon EOS R5 with 35mm lens, photography theme [...], tone warm cinematic commercial lighting with golden sunlight, subtle orange glow, creamy exposure and soft faded shadows, realistic natural colors and clean bright atmosphere, Background [...] with soft blur and warm sunlight entering from [...], clean negative space on [...] , Composition [...] focusing on [...],Angle shoot from [...] perspective with shallow depth of field and realistic editorial framing, Skenario [...], warm sunlight creating soft rim light and subtle flare reflections on [...], emotionally positive and relatable storytelling, premium commercial stock aesthetic, no visible face,no text, no logos, no brands, highly readable  concept [...]."
                    else -> ""
                }

                val sysPrompt = """You are an elite microstock prompt engineer. Your job is to output exactly ${_quantity.value} lines of unique, highly scalable commercial image generation prompts.
 TARGET CONTEXT FROM DATABASE INTERFACE:
        - Category: ${_selectedCategory.value}
        - Theme: ${_selectedTheme.value}
        - Niche Object Target: ${_selectedNiche.value}

        👑 ABSOLUTE PRIORITY USER RULE (CRITICAL):
        The user has provided this Custom Instruction: "${if (_instruction.value.isNotBlank()) _instruction.value else "None"}". 
        If this instruction contains specific subjects, colors, layout rules, lighting variations, time, location, or backgrounds, you MUST treat it as the dominant master command. Merge it into the core pattern aggressively, prioritizing it above all default settings.

        STRUCTURAL COMPOSITION BLUEPRINT:
        Use this exact pattern layout for line construction (Ensure the prompt remains strictly as one continuous block/line of text without any literal internal linebreaks):
        \"\"\"
        $masterPattern
        \"\"\"

        STRICT ARCHITECTURAL PROCESSING DIRECTIVES:
        1. Replace '[OBJECT/CHARACTER & ACTIVITY]' with  descriptive variations of elements or characters doing actions matching the theme "${_selectedTheme.value}" and target object "${_selectedNiche.value}".
        
        2. TRADEMARK SAFETY RULE:Do not use Text or logo. 
        
        3. OUTPUT EXECUTION FORMAT: You must only return lines of pure raw text. Exactly 1 complete prompt configuration per line. No line numbering, no markdown formatting, no code blocks (```), and no wrapping quotation marks. Do not inject any internal line breaks inside a single prompt block. All text must be in English."""

                val request = GenerateContentRequest(
                    contents = listOf(Content(parts = listOf(Part(text = sysPrompt))))
                )

                val response = RetrofitClient.service.generateContent(
                    model = _selectedModel.value,
                    apiKey = _apiKey.value,
                    request = request
                )
                
                val textResponse = response.candidates.firstOrNull()?.content?.parts?.firstOrNull()?.text ?: ""
                val promptsList = textResponse.split("\n").map { it.trim() }.filter { it.isNotEmpty() }
                
                _generatedPrompts.value = promptsList

            } catch (e: Exception) {
                _errorMessage.value = "Waduh, error bro! Detail: ${e.message}"
            } finally {
                _isLoading.value = false
            }
        }
    }
}
