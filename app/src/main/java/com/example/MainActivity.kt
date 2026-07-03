package com.example

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDownward
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material.icons.filled.ContentCopy
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Save
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.ui.theme.MyApplicationTheme
import kotlinx.coroutines.launch

class WarMachineViewModelFactory(private val context: Context) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(WarMachineViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return WarMachineViewModel(context) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val windowInsetsController = WindowCompat.getInsetsController(window, window.decorView)
        windowInsetsController.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        windowInsetsController.hide(WindowInsetsCompat.Type.systemBars())
        
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = Color(0xFF111827)
                ) { innerPadding ->
                    val factory = WarMachineViewModelFactory(LocalContext.current.applicationContext)
                    val viewModel: WarMachineViewModel = viewModel(factory = factory)
                    WarMachineScreen(viewModel, modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WarMachineScreen(viewModel: WarMachineViewModel, modifier: Modifier = Modifier) {
    val apiKey by viewModel.apiKey.collectAsStateWithLifecycle()
    val selectedModel by viewModel.selectedModel.collectAsStateWithLifecycle()
    val selectedStyle by viewModel.selectedStyle.collectAsStateWithLifecycle()
    val selectedCategory by viewModel.selectedCategory.collectAsStateWithLifecycle()
    val themes by viewModel.themes.collectAsStateWithLifecycle()
    val selectedTheme by viewModel.selectedTheme.collectAsStateWithLifecycle()
    val niches by viewModel.niches.collectAsStateWithLifecycle()
    val selectedNiche by viewModel.selectedNiche.collectAsStateWithLifecycle()
    val quantity by viewModel.quantity.collectAsStateWithLifecycle()
    val instruction by viewModel.instruction.collectAsStateWithLifecycle()
    val generatedPrompts by viewModel.generatedPrompts.collectAsStateWithLifecycle()
    val isLoading by viewModel.isLoading.collectAsStateWithLifecycle()
    val errorMessage by viewModel.errorMessage.collectAsStateWithLifecycle()

    val context = LocalContext.current
    var customToastMessage by remember { mutableStateOf<String?>(null) }
    
    val scrollState = rememberScrollState()
    val coroutineScope = rememberCoroutineScope()

    LaunchedEffect(errorMessage) {
        if (errorMessage != null) {
            customToastMessage = errorMessage
            viewModel.clearError()
        }
    }
    
    LaunchedEffect(customToastMessage) {
        if (customToastMessage != null) {
            kotlinx.coroutines.delay(2000)
            customToastMessage = null
        }
    }

    Box(modifier = modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            // Header
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF0F172A))
                    .border(width = 2.dp, color = Color(0xFF00E5FF))
                    .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("SUPER MASTERPROMPT ENGINE", color = Color.White, fontSize = 11.sp, fontWeight = FontWeight.Bold, letterSpacing = 1.sp)
            Text("WAR MACHINE", color = Color(0xFFF97316), fontSize = 24.sp, fontWeight = FontWeight.Black, letterSpacing = 0.5.sp)
        }

        // Content layout
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .verticalScroll(scrollState),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Form Panel
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color(0xFF1E293B))
                    .border(2.dp, Color(0xFF00E5FF), RoundedCornerShape(12.dp))
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                // API Key
                var isApiKeyVisible by remember { mutableStateOf(false) }
                var tempApiKey by remember { mutableStateOf("") }
                val isApiLocked = apiKey.isNotEmpty()
                
                Text("Api Key Gemini", color = Color.White, fontSize = 13.sp, fontWeight = FontWeight.Bold)
                OutlinedTextField(
                    value = if (isApiLocked) apiKey else tempApiKey,
                    onValueChange = { tempApiKey = it },
                    modifier = Modifier.fillMaxWidth(),
                    enabled = !isApiLocked,
                    visualTransformation = if (isApiKeyVisible) VisualTransformation.None else PasswordVisualTransformation(),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White,
                        disabledContainerColor = Color(0xFFE2E8F0),
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black,
                        disabledTextColor = Color.Gray,
                    ),
                    shape = RoundedCornerShape(8.dp),
                    trailingIcon = {
                        Row {
                            IconButton(onClick = { isApiKeyVisible = !isApiKeyVisible }) {
                                Icon(if (isApiKeyVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff, contentDescription = "Toggle API Key", tint = Color.Gray)
                            }
                            if (isApiLocked) {
                                IconButton(onClick = { viewModel.clearApiKey() }) {
                                    Icon(Icons.Default.Delete, contentDescription = "Clear API Key", tint = Color.Red)
                                }
                            } else {
                                IconButton(onClick = { 
                                    if(tempApiKey.isNotBlank()) viewModel.saveApiKey(tempApiKey)
                                }) {
                                    Icon(Icons.Default.Save, contentDescription = "Save API Key", tint = Color.Gray)
                                }
                            }
                        }
                    }
                )

                // Model Selector
                DropdownField(
                    label = "Gemini Model AI",
                    options = listOf(
                        "gemini-3.5-flash" to "Gemini 3.5 Flash",
                        "gemini-3.1-flash-lite-preview" to "Gemini 3.1 Flash Lite",
                        "gemini-2.5-flash" to "Gemini 2.5 Flash"
                    ),
                    selectedValue = selectedModel,
                    onValueChange = { viewModel.setModel(it) }
                )

                // Style
                DropdownField(
                    label = "Style",
                    options = listOf(
                        "Outline" to "Outline",
                        "Flat Vector Bold Outline" to "Flat Vector Outline",
                        "Flat Vector No Outline" to "Flat Vector",
                        "3D Claymorphism" to "3D Claymorphism",
                        "Photography" to "Medium Format",
                        "Comercial Photo" to "Comercial Photo"
                    ),
                    selectedValue = selectedStyle,
                    onValueChange = { viewModel.setStyle(it) }
                )

                // Category
                DropdownField(
                    label = "Category",
                    options = MasterDatabase.megaMicrostockDatabase.keys.map { it to it },
                    selectedValue = selectedCategory,
                    onValueChange = { viewModel.setCategory(it) }
                )

                // Theme
                DropdownField(
                    label = "Sub Category",
                    options = themes.map { it to it },
                    selectedValue = selectedTheme,
                    onValueChange = { viewModel.setTheme(it) }
                )

                // Niche
                DropdownField(
                    label = "Niche",
                    options = niches.map { it to it },
                    selectedValue = selectedNiche,
                    onValueChange = { viewModel.setNiche(it) }
                )

                // Quantity
                Text("Quantity: $quantity", color = Color.White, fontSize = 13.sp, fontWeight = FontWeight.Bold)
                Slider(
                    value = quantity.toFloat(),
                    onValueChange = { viewModel.setQuantity(it.toInt()) },
                    valueRange = 1f..50f,
                    colors = SliderDefaults.colors(
                        thumbColor = Color(0xFFF97316),
                        activeTrackColor = Color(0xFFF97316),
                        inactiveTrackColor = Color.White
                    )
                )

                // Instruction
                Text("Prompt (Opsional)", color = Color.White, fontSize = 13.sp, fontWeight = FontWeight.Bold)
                OutlinedTextField(
                    value = instruction,
                    onValueChange = { viewModel.setInstruction(it) },
                    modifier = Modifier.fillMaxWidth().height(100.dp),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White,
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black
                    ),
                    shape = RoundedCornerShape(8.dp),
                    placeholder = { Text("Tulis Deskripsi Spesifik atau Kosongkan...") }
                )

                Button(
                    onClick = { viewModel.generatePrompts() },
                    modifier = Modifier.fillMaxWidth().height(50.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF97316)),
                    enabled = !isLoading,
                    shape = RoundedCornerShape(25.dp)
                ) {
                    if (isLoading) {
                        CircularProgressIndicator(color = Color.White, modifier = Modifier.size(24.dp))
                    } else {
                        Text("WAR MACHINE ARISE", fontWeight = FontWeight.Bold, color = Color.White)
                    }
                }
            }

            // Output Panel
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color(0xFF111827))
                    .border(2.dp, Color(0xFF00E5FF), RoundedCornerShape(12.dp))
                    .padding(16.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = if(isLoading) "GENERATING PROMPTS... PLEASE WAIT" else "PROMPT CREATED (${generatedPrompts.size}/$quantity)",
                        color = Color(0xFF94A3B8),
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp
                    )
                    if (generatedPrompts.isNotEmpty() && !isLoading) {
                        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            Button(
                                onClick = { viewModel.clearPrompts() },
                                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFEF4444)),
                                contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp)
                            ) {
                                Text("Clear", fontSize = 12.sp)
                            }
                            Button(
                                onClick = { /* To do: write to file (not directly supported in simple compose without intent) */ },
                                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF10B981)),
                                contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp)
                            ) {
                                Text("Download TXT", fontSize = 12.sp)
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                Column(
                    verticalArrangement = Arrangement.spacedBy(12.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    generatedPrompts.forEachIndexed { index, prompt ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(8.dp))
                                .background(Color.White),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier
                                    .width(40.dp)
                                    .fillMaxHeight()
                                    .background(Color(0xFFF1F5F9))
                                    .padding(vertical = 16.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text("${index + 1}", fontWeight = FontWeight.Bold, color = Color(0xFF1E293B))
                            }
                            Text(
                                text = prompt,
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(12.dp),
                                color = Color(0xFF334155),
                                fontSize = 13.sp
                            )
                            IconButton(onClick = {
                                val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
                                clipboard.setPrimaryClip(ClipData.newPlainText("prompt", prompt))
                                customToastMessage = "Prompt Copied!"
                            }) {
                                Icon(Icons.Default.ContentCopy, contentDescription = "Copy", tint = Color(0xFFF97316))
                            }
                        }
                    }
                }
            }
        }
        }

        if (customToastMessage != null) {
            Box(
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(top = 16.dp)
                    .background(Color(0xFF10B981), RoundedCornerShape(16.dp))
                    .padding(horizontal = 12.dp, vertical = 6.dp)
            ) {
                Text(
                    text = customToastMessage!!,
                    color = Color.White,
                    fontSize = 11.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
        
        // Scrollbar
        val scrollFraction = if (scrollState.maxValue > 0) {
            scrollState.value.toFloat() / scrollState.maxValue.toFloat()
        } else 0f
        
        if (scrollState.maxValue > 0) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .fillMaxHeight()
                    .width(6.dp)
                    .padding(vertical = 80.dp, horizontal = 2.dp)
            ) {
                Spacer(modifier = Modifier.weight(if (scrollFraction > 0f) scrollFraction else 0.001f))
                Box(modifier = Modifier.width(4.dp).height(40.dp).clip(RoundedCornerShape(2.dp)).background(Color(0xFFF97316)))
                Spacer(modifier = Modifier.weight(if (scrollFraction < 1f) 1f - scrollFraction else 0.001f))
            }
        }
        
        // Quick Scroll Floating Action Button
        androidx.compose.material3.FloatingActionButton(
            onClick = {
                coroutineScope.launch {
                    if (scrollState.value < scrollState.maxValue / 2) {
                        scrollState.animateScrollTo(scrollState.maxValue)
                    } else {
                        scrollState.animateScrollTo(0)
                    }
                }
            },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(16.dp)
                .size(48.dp),
            containerColor = Color(0xFF0F172A),
            contentColor = Color(0xFFF97316)
        ) {
            Icon(
                imageVector = if (scrollState.value < scrollState.maxValue / 2) Icons.Default.ArrowDownward else Icons.Default.ArrowUpward,
                contentDescription = "Quick Scroll",
                tint = Color(0xFFF97316)
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DropdownField(
    label: String,
    options: List<Pair<String, String>>, // Pair(Value, DisplayName)
    selectedValue: String,
    onValueChange: (String) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }
    
    val displayValue = options.find { it.first == selectedValue }?.second ?: selectedValue

    Column {
        Text(label, color = Color.White, fontSize = 13.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(4.dp))
        
        OutlinedTextField(
            value = displayValue,
            onValueChange = {},
            readOnly = true,
            modifier = Modifier.fillMaxWidth(),
            trailingIcon = { Icon(Icons.Default.ArrowDropDown, contentDescription = "Dropdown", tint = Color.Black) },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                disabledContainerColor = Color.White,
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                disabledTextColor = Color.Black
            ),
            shape = RoundedCornerShape(8.dp),
            interactionSource = remember { MutableInteractionSource() }.also { interactionSource ->
                LaunchedEffect(interactionSource) {
                    interactionSource.interactions.collect {
                        if (it is PressInteraction.Release) {
                            expanded = true
                        }
                    }
                }
            }
        )
        
        if (expanded) {
            AlertDialog(
                onDismissRequest = { expanded = false },
                title = { Text(text = "Pilih $label", color = Color.Black) },
                text = {
                    LazyColumn {
                        items(options) { (value, displayName) ->
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable {
                                        onValueChange(value)
                                        expanded = false
                                    }
                                    .padding(vertical = 12.dp, horizontal = 8.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                RadioButton(
                                    selected = (value == selectedValue),
                                    onClick = {
                                        onValueChange(value)
                                        expanded = false
                                    }
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(text = displayName, color = Color.Black)
                            }
                        }
                    }
                },
                confirmButton = {
                    TextButton(onClick = { expanded = false }) {
                        Text("Tutup", color = Color(0xFFF97316))
                    }
                },
                containerColor = Color.White,
                titleContentColor = Color.Black,
                textContentColor = Color.Black
            )
        }
    }
}
