package com.example

object MasterDatabase {
    val megaMicrostockDatabase: Map<String, Map<String, List<String>>> = mapOf(
        "Graphic Resources" to mapOf(
            "Flat Design" to listOf("Character", "Ilustration", "Mascot", "Landscape", "Children", "Animals", "Tree", "Watercolor", "Vegetables", "Fruits", "Object", "Logo", "Isometric", "Background", "Templates"),
            "Icons" to listOf("Single Icon", "Icon Set", "Hand drawn", "Flat Color", "Glyphs", "Monoline", "Duo Tone Solid Glyphs", "Duotone Outline", "Outline Fill Color"),
            "Shapes" to listOf("Geometric Elements", "Lines", "Circles", "Squares", "Triangles", "Polygons", "Curves", "Spirals", "Fractals", "Mandalas"),
            "Frames" to listOf("Borders", "Dividers", "Ornaments", "Corner Elements", "Badge Frames", "Photo Frames", "Certificate Borders"),
            "Labels" to listOf("Badges", "Stickers", "Ribbons", "Banners", "Tags", "Price Tags", "Seals", "Stamps"),
            "Templates" to listOf("Mockups", "Social Media Post", "Card Name", "Poster", "Landing Page", "Banner", "Power Point", "Abstract Background"),
            "Infographic" to listOf("Charts", "Diagrams", "Timeline", "Flowchart", "Maps", "Pie Chart", "Bar Chart", "Line Chart", "Area Chart", "Radar Chart"),
            "Typography" to listOf("Lettering", "Alphabet", "Numbers", "Calligraphy", "Hand Lettering", "Display Font", "Serif", "Sans Serif", "Script", "Decorative"),
            "Decorative Elements" to listOf("Floral Elements", "Ornamental Elements", "Filigree", "Arabesque", "Scrollwork", "Swirls", "Dots", "Stars", "Hearts"),
            "Brushes" to listOf("Halftone", "Grunge", "Overlay", "Watercolor", "Ink", "Spray", "Marker", "Charcoal", "Pencil", "Acrylic"),
            "Light Effect" to listOf("Shadow Overlay", "Paper Cut", "Memphis Style", "Liquid Shapes", "Glow Effect", "Lens Flare", "Bokeh", "Light Leak"),
            "Social Media Templates" to listOf("Presentation Templates", "Instagram Post", "Facebook Cover", "Twitter Header", "YouTube Thumbnail", "LinkedIn Banner", "Pinterest Pin"),
            "Packaging" to listOf("Box Design", "Label Design", "Bottle", "Can", "Bag", "Wrapper", "Tag", "Sleeve", "Display"),
            "Stationery" to listOf("Letterhead", "Envelope", "Business Card", "Notebook", "Planner", "Calendar", "Invitation", "Greeting Card")
        ),
        "Technology" to mapOf(
            "AI Concept" to listOf("Artificial Intelligence", "Machine Learning", "Neural Network", "Deep Learning", "Natural Language Processing", "Computer Vision", "Generative AI", "LLM", "Chatbot", "AI Ethics"),
            "Robotics" to listOf("Automation", "Humanoid Robot", "Industrial Robot", "Drone", "Robotic Arm", "Exoskeleton", "AI Robot", "Robot Pet", "Robot Companion"),
            "Big Data" to listOf("Data Visualization", "Analytics", "Dashboard", "Data Science", "Data Mining", "Data Warehouse", "ETL", "Business Intelligence"),
            "Cloud Computing" to listOf("Cybersecurity", "Hacking Concept", "Encryption", "Cloud Storage", "DevOps", "Serverless", "Edge Computing", "Virtualization"),
            "Blockchain" to listOf("Cryptocurrency", "NFT", "Smart Contract", "Web3", "Decentralized", "Bitcoin", "Ethereum", "Digital Wallet", "Mining"),
            "Internet of Things (IoT)" to listOf("Smart Home", "Smart City", "5G", "Connected Devices", "Wearable", "Sensor", "Industrial IoT", "Smart Agriculture"),
            "Virtual Reality (VR)" to listOf("Augmented Reality (AR)", "Metaverse", "Mixed Reality", "3D Modeling", "Digital Twin", "VR Headset", "AR Glasses"),
            "Coding" to listOf("Programming", "Software Development", "Code Review", "Debugging", "Web Development", "App Development", "Game Development", "Open Source"),
            "UI Design" to listOf("App Interface", "Mobile Technology", "Responsive Design", "User Experience", "Interaction Design", "Wireframing", "Prototyping"),
            "Computer Hardware" to listOf("Circuit Board", "Microchip", "Processor", "Motherboard", "GPU", "RAM", "Storage", "Cooling System", "Power Supply"),
            "Server" to listOf("Data Center", "Digital Network", "Cloud Server", "Network Switch", "Router", "Firewall", "Cable Management", "Rack Server"),
            "Quantum Computing" to listOf("Qubit", "Quantum Processor", "Superposition", "Entanglement", "Quantum Algorithm", "Quantum Cryptography"),
            "Biotechnology" to listOf("Bioinformatics", "Genetics", "CRISPR", "DNA Sequence", "Biotech Lab", "Bioengineering", "Pharmaceutical"),
            "Nanotechnology" to listOf("Nanobot", "Nano Material", "Nanoparticle", "Molecular Engineering", "Nano Sensor", "Nano Coating")
        ),
        "Business" to mapOf(
            "Office" to listOf("Workspace", "Teamwork", "Leadership", "Collaboration", "Coworking", "Cubicle", "Meeting Room", "Break Room", "Reception"),
            "Meeting" to listOf("Conference", "Presentation", "Boardroom", "Video Call", "Webinar", "Workshop", "Brainstorming", "Strategy Session"),
            "Startup" to listOf("Entrepreneurship", "Innovation", "Pitch Deck", "Funding", "Incubator", "Accelerator", "Founders", "Scale Up"),
            "Marketing" to listOf("Digital Marketing", "SEO", "Content Marketing", "Social Media Marketing", "Email Marketing", "Influencer Marketing", "Branding", "Advertising"),
            "Finance" to listOf("Investment", "Banking", "Accounting", "Budget", "Stocks", "Bonds", "Real Estate Investment", "Cryptocurrency", "Wealth Management"),
            "Sales" to listOf("Profit", "Growth", "Strategy", "Lead Generation", "Conversion", "CRM", "Negotiation", "Closing Deal", "Sales Funnel"),
            "Productivity" to listOf("Success", "Career", "Time Management", "Goal Setting", "Task Planning", "Workflow", "Efficiency", "Focus", "Achievement"),
            "Recruitment" to listOf("Human Resources", "Customer Service", "Talent Acquisition", "Employee Onboarding", "Training", "Performance Review", "Company Culture"),
            "E-commerce" to listOf("Online Business", "Business Analytics", "Business Infographic", "Shopping Cart", "Payment Gateway", "Logistics", "Customer Experience"),
            "Legal" to listOf("Law Firm", "Contract", "Compliance", "Intellectual Property", "Patents", "Trademarks", "Litigation", "Mediation"),
            "Consulting" to listOf("Management Consulting", "Strategy Consulting", "Financial Consulting", "IT Consulting", "HR Consulting", "Business Coach"),
            "Corporate" to listOf("Headquarters", "Corporate Culture", "Board of Directors", "Executive", "Manager", "Employee", "Intern", "Corporate Social Responsibility")
        ),
        "Lifestyle" to mapOf(
            "Daily Life" to listOf("Family", "Parenting", "Friendship", "Couple", "Neighborhood", "Community", "Routine", "Morning", "Evening"),
            "Home Living" to listOf("Cooking", "Shopping", "Fashion", "Beauty", "Cleaning", "Organizing", "Gardening", "DIY", "Renovation"),
            "Self Care" to listOf("Wellness", "Healthy Lifestyle", "Fitness", "Mental Health", "Meditation", "Spa", "Massage", "Aromatherapy", "Journaling"),
            "Remote Working" to listOf("Studying", "Relaxation", "Travel Lifestyle", "Minimalism", "Digital Nomad", "Work From Home", "Video Conference", "Home Office"),
            "Urban Living" to listOf("City Life", "Apartment", "Public Transport", "Walking", "Cycling", "Coffee Shop", "Park", "Street Style"),
            "Rural Living" to listOf("Countryside", "Farm Life", "Homestead", "Off Grid", "Simple Living", "Nature", "Gardening", "Animals"),
            "Senior Life" to listOf("Elderly", "Retirement", "Grandparent", "Active Aging", "Caregiving", "Senior Community", "Legacy"),
            "Student Life" to listOf("College", "University", "Study", "Library", "Campus", "Graduation", "Exam", "Research", "Student Activity")
        ),
        "Food" to mapOf(
            "Fruits" to listOf("Vegetables", "Meat", "Seafood", "Poultry", "Eggs", "Dairy", "Cheese", "Butter", "Milk", "Yogurt"),
            "Desserts" to listOf("Bakery", "Fast Food", "Cake", "Pastry", "Pie", "Cookie", "Brownie", "Muffin", "Donut", "Ice Cream"),
            "Healthy Food" to listOf("Organic Food", "Ingredients", "Spices", "Superfood", "Salad", "Smoothie", "Juice", "Vegan", "Gluten Free", "Keto"),
            "Breakfast" to listOf("Lunch", "Dinner", "Snacks", "Street Food", "Brunch", "Dessert", "Appetizer", "Main Course", "Side Dish"),
            "Isolated Food" to listOf("Food Pattern", "Food Background", "Food Packaging", "Food Label", "Menu", "Recipe Card"),
            "Cuisine" to listOf("Italian", "Mexican", "Chinese", "Japanese", "Indian", "Thai", "French", "Mediterranean", "Middle Eastern", "American"),
            "Cooking" to listOf("Kitchenware", "Cookware", "Utensils", "Cutting Board", "Knife", "Pan", "Pot", "Bowl", "Plate", "Glassware"),
            "Baking" to listOf("Bread", "Pastry", "Cake Decorating", "Cookie", "Dough", "Oven", "Baking Sheet", "Muffin Tin", "Rolling Pin"),
            "Beverages" to listOf("Hot Drink", "Cold Drink", "Coffee", "Tea", "Juice", "Smoothie", "Milk", "Soda", "Wine", "Beer", "Cocktail", "Water")
        ),
        "Nature / Environment" to mapOf(
            "Forest" to listOf("Mountains", "Beach", "River", "Waterfall", "Lake", "Pond", "Stream", "Creek", "Canyon", "Valley"),
            "Sky" to listOf("Clouds", "Sunrise", "Sunset", "Rain", "Snow", "Leaves", "Stars", "Moon", "Lightning", "Rainbow", "Aurora"),
            "Ecology" to listOf("Sustainability", "Renewable Energy", "Recycling", "Climate Change", "Green Energy", "Solar Power", "Wind Power", "Hydro Power", "Geothermal", "Biofuel"),
            "Landscape" to listOf("Mountain", "Hill", "Plain", "Desert", "Tundra", "Taiga", "Tropical", "Temperate", "Arctic", "Alpine"),
            "Weather" to listOf("Sunny", "Rainy", "Cloudy", "Storm", "Snowy", "Windy", "Foggy", "Humid", "Dry", "Cold", "Hot"),
            "Conservation" to listOf("Wildlife Conservation", "Forest Protection", "Ocean Cleanup", "Eco Friendly", "Zero Waste", "Carbon Footprint", "Biodiversity"),
            "Botany" to listOf("Flower", "Tree", "Leaf", "Fern", "Moss", "Mushroom", "Algae", "Cactus", "Succulent", "Bonsai")
        ),
        "People" to mapOf(
            "People" to listOf("Business People", "Children", "Senior", "Diversity", "Teenager", "Baby", "Family", "Couple", "Friends", "Solo"),
            "Hands" to listOf("Silhouette", "Gesture", "Emotion", "Handshake", "Pointing", "Holding", "Reaching", "Working", "Caring"),
            "Team" to listOf("Doctor", "Engineer", "Teacher", "Worker", "Student", "Children", "Musician", "Athlete", "Chef", "Pilot"),
            "Expressions" to listOf("Happiness", "Sadness", "Surprise", "Anger", "Fear", "Disgust", "Contempt", "Pride", "Shame", "Joy"),
            "Poses" to listOf("Standing", "Sitting", "Walking", "Running", "Jumping", "Dancing", "Yoga", "Working", "Resting", "Playing"),
            "Groups" to listOf("Team", "Family", "Friends", "Community", "Audience", "Crowd", "Couple", "Group of 3", "Group of 4"),
            "Culture" to listOf("Traditional", "Modern", "Indigenous", "Ethnic", "Folk", "Ceremony", "Festival", "Ritual"),
            "Professions" to listOf("Doctor", "Nurse", "Engineer", "Teacher", "Lawyer", "Architect", "Artist", "Designer", "Developer", "Scientist")
        ),
        "Animals" to mapOf(
            "Wildlife" to listOf("Birds", "Insects", "Mammals", "Fish", "Pets", "Reptiles", "Amphibians", "Marine", "Primates", "Cats", "Dogs"),
            "Animal Portrait" to listOf("Animal Pattern", "Animal Silhouette", "Animal Paw", "Animal Face", "Animal Eye", "Animal Fur", "Animal Feather"),
            "Farm Animals" to listOf("Cow", "Sheep", "Goat", "Pig", "Horse", "Chicken", "Duck", "Turkey", "Rabbit", "Donkey"),
            "Pets" to listOf("Dog", "Cat", "Fish", "Bird", "Hamster", "Rabbit", "Turtle", "Parrot", "Guinea Pig", "Ferret"),
            "Wild Animals" to listOf("Lion", "Tiger", "Bear", "Elephant", "Giraffe", "Zebra", "Hippo", "Rhino", "Crocodile", "Wolf"),
            "Marine Life" to listOf("Dolphin", "Whale", "Shark", "Jellyfish", "Octopus", "Seahorse", "Starfish", "Crab", "Lobster", "Coral"),
            "Birds" to listOf("Eagle", "Falcon", "Owl", "Swan", "Duck", "Parrot", "Penguin", "Flamingo", "Peacock", "Hummingbird"),
            "Insects" to listOf("Butterfly", "Bee", "Dragonfly", "Beetle", "Spider", "Ant", "Ladybug", "Grasshopper", "Moth", "Caterpillar"),
            "Reptiles" to listOf("Snake", "Lizard", "Turtle", "Crocodile", "Alligator", "Chameleon", "Gecko", "Iguana", "Komodo", "Python")
        ),
        "Plants & Flowers" to mapOf(
            "Flowers" to listOf("Leaves", "Trees", "Tropical Plants", "Houseplants", "Wildflowers", "Garden Flowers", "Exotic Flowers", "Seasonal Flowers"),
            "Herbs" to listOf("Succulents", "Cactus", "Botanical Illustration", "Floral Background", "Dried Flowers", "Pressed Flowers", "Flower Arrangement"),
            "Trees" to listOf("Oak", "Pine", "Maple", "Birch", "Willow", "Palm", "Bonsai", "Olive", "Fruit Tree", "Evergreen"),
            "Indoor Plants" to listOf("Monstera", "Fern", "Pothos", "Snake Plant", "Zamioculcas", "Aloe Vera", "Cactus", "Orchid", "Peace Lily", "Spider Plant"),
            "Garden" to listOf("Vegetable Garden", "Flower Garden", "Herb Garden", "Rock Garden", "Water Garden", "Zen Garden", "Butterfly Garden"),
            "Botany" to listOf("Plant Anatomy", "Photosynthesis", "Pollination", "Seed", "Sprout", "Bloom", "Foliage", "Root", "Stem", "Petal")
        ),
        "Travel" to mapOf(
            "Landmarks" to listOf("Tourist Attractions", "Hotels", "Resorts", "Historical Sites", "Monuments", "Castles", "Temples", "Palaces", "Ruins"),
            "Camping" to listOf("Backpacking", "Passport", "Luggage", "Trekking", "Hiking", "Glamping", "Survival", "Navigation", "Bonfire"),
            "Airplane Travel" to listOf("Road Trip", "Cruise", "Train Journey", "Safari", "Cruise Ship", "Backpacking", "Luxury Travel"),
            "Adventure" to listOf("Mountaineering", "Scuba Diving", "Skydiving", "Bungee", "Rafting", "Zip Line", "Paragliding", "Cave Exploring"),
            "Culture" to listOf("Local Culture", "Street Food", "Local Market", "Festival", "Traditional Dance", "Artisan", "Handicraft"),
            "Destinations" to listOf("Beach", "Mountain", "City", "Countryside", "Desert", "Jungle", "Island", "Polar", "Historic", "Modern"),
            "Accommodation" to listOf("Hotel", "Resort", "Hostel", "Airbnb", "Lodge", "Villa", "Cottage", "Camping", "Treehouse", "Houseboat")
        ),
        "Sports" to mapOf(
            "Team Sports" to listOf("Football", "Basketball", "Soccer", "Volleyball", "Rugby", "Cricket", "Baseball", "Ice Hockey", "Handball", "Water Polo"),
            "Individual Sports" to listOf("Running", "Cycling", "Swimming", "Tennis", "Golf", "Boxing", "Martial Arts", "Fencing", "Archery", "Gymnastics"),
            "Fitness" to listOf("Gym", "Yoga", "Hiking", "Weightlifting", "CrossFit", "Pilates", "Zumba", "Calisthenics", "Bodybuilding"),
            "Extreme Sports" to listOf("Surfing", "Snowboarding", "Skateboarding", "BMX", "Parkour", "Windsurfing", "Kitesurfing", "Climbing"),
            "Water Sports" to listOf("Sailing", "Kayaking", "Canoeing", "Rafting", "Diving", "Snorkeling", "Jet Ski", "Wakeboarding"),
            "Winter Sports" to listOf("Skiing", "Snowboarding", "Ice Skating", "Curling", "Bob", "Skeleton", "Luge", "Ice Hockey"),
            "Athletics" to listOf("Track", "Field", "Marathon", "Triathlon", "Decathlon", "Race Walking", "Hurdles", "Relay"),
            "E-sports" to listOf("Gaming", "Esports Tournament", "Esports Team", "Gamer", "Streaming", "Gaming Setup", "Esports Arena")
        ),
        "Buildings & Architecture" to mapOf(
            "Residential" to listOf("Houses", "Apartments", "Villa", "Cottage", "Mansion", "Townhouse", "Modular", "Eco House", "Smart Home"),
            "Commercial" to listOf("Office Buildings", "Shopping Mall", "Hotel", "Restaurant", "Coffee Shop", "Retail Store", "Bank", "Cinema"),
            "Public" to listOf("Schools", "Hospital", "Museum", "Library", "Church", "Mosque", "Temple", "City Hall", "Courthouse", "Fire Station"),
            "Industrial" to listOf("Factory", "Warehouse", "Mining", "Construction Site", "Power Plant", "Refinery", "Workshop", "Laboratory"),
            "Interior" to listOf("Exterior", "Bridges", "Skyscrapers", "Doors", "Windows", "Construction", "Staircase", "Elevator", "Ventilation"),
            "Landscape" to listOf("Garden", "Park", "Plaza", "Fountain", "Bench", "Walking Path", "Green Space", "Urban Furniture"),
            "Historical" to listOf("Castle", "Palace", "Ruins", "Cathedral", "Pyramid", "Colosseum", "Acropolis", "Stonehenge", "Taj Mahal", "Great Wall"),
            "Modern" to listOf("Skyscraper", "Glass Building", "Curved Architecture", "Futuristic", "Sustainable Architecture", "Green Building", "High Tech")
        ),
        "Science" to mapOf(
            "Laboratory" to listOf("Microscope", "DNA", "Cells", "Virus", "Bacteria", "Petri Dish", "Test Tube", "Beaker", "Flask", "Centrifuge"),
            "Medical Research" to listOf("Chemistry", "Physics", "Astronomy", "Geology", "Biology", "Botany", "Zoology", "Ecology", "Genetics"),
            "Space" to listOf("Solar System", "Galaxy", "Black Hole", "Nebula", "Astronaut", "Rocket", "Satellite", "Telescope", "Space Station"),
            "Physics" to listOf("Energy", "Matter", "Motion", "Force", "Light", "Sound", "Magnetism", "Electricity", "Quantum", "Relativity"),
            "Chemistry" to listOf("Molecule", "Atom", "Chemical Reaction", "Elements", "Periodic Table", "Bonding", "Crystal", "Solution"),
            "Biology" to listOf("Cell", "Organism", "Evolution", "Genetics", "DNA", "RNA", "Protein", "Enzyme", "Metabolism", "Ecosystem"),
            "Earth Science" to listOf("Rock", "Mineral", "Fossil", "Plate Tectonics", "Volcano", "Earthquake", "Tsunami", "Weathering"),
            "Anatomy" to listOf("Human Body", "Organs", "Skeleton", "Muscle", "Brain", "Heart", "Lungs", "Eye", "Ear", "Nervous System")
        ),
        "Industry" to mapOf(
            "Factory" to listOf("Manufacturing", "Warehouse", "Mining", "Construction Site", "Assembly Line", "Quality Control", "Packaging", "Logistics"),
            "Heavy Machinery" to listOf("Engineering", "Logistics", "Industrial Robot", "Production Line", "Crane", "Forklift", "Conveyor", "Turbine"),
            "Energy" to listOf("Oil Rig", "Refinery", "Power Plant", "Solar Farm", "Wind Turbine", "Hydroelectric", "Nuclear", "Geothermal"),
            "Agriculture" to listOf("Tractor", "Harvester", "Irrigation", "Crop", "Farmland", "Orchard", "Livestock", "Greenhouse", "Vertical Farm"),
            "Textile" to listOf("Weaving", "Spinning", "Dyeing", "Sewing", "Fabric", "Cotton", "Wool", "Silk", "Synthetic", "Recycled"),
            "Automotive" to listOf("Car Factory", "Assembly", "Paint Shop", "Engine", "Robot Arm", "Welding", "Quality Inspection"),
            "Chemical" to listOf("Chemical Plant", "Distillation", "Reactor", "Storage Tank", "Pipeline", "Safety Equipment")
        ),
        "Transport" to mapOf(
            "Road" to listOf("Cars", "Trucks", "Motorcycles", "Bicycle", "Bus", "Taxi", "Rickshaw", "Trolley", "Towing", "Road Sign"),
            "Rail" to listOf("Train", "Subway", "Tram", "Monorail", "Maglev", "High Speed Train", "Steam Train", "Cable Car"),
            "Air" to listOf("Airplane", "Helicopter", "Private Jet", "Propeller Plane", "Hot Air Balloon", "Blimp", "Glider", "Spacecraft"),
            "Water" to listOf("Ship", "Boat", "Ferry", "Yacht", "Cruise Ship", "Cargo Ship", "Submarine", "Kayak", "Canoe", "Sailboat"),
            "Electric" to listOf("Electric Vehicle", "Charging Station", "E-bike", "E-scooter", "EV Battery", "Hydrogen Vehicle"),
            "Traffic" to listOf("Traffic Jam", "Highway", "Intersection", "Traffic Light", "Roundabout", "Pedestrian", "Cycling Path"),
            "Logistics" to listOf("Cargo", "Container", "Port", "Warehouse", "Fleet", "Delivery", "Drone Delivery", "Autonomous Vehicle")
        ),
        "States of Mind" to mapOf(
            "Positive" to listOf("Happiness", "Joy", "Gratitude", "Hope", "Optimism", "Love", "Peace", "Excitement", "Pride", "Contentment"),
            "Negative" to listOf("Sadness", "Stress", "Anxiety", "Fear", "Anger", "Frustration", "Guilt", "Shame", "Jealousy", "Loneliness"),
            "Motivation" to listOf("Success", "Ambition", "Determination", "Perseverance", "Courage", "Confidence", "Focus", "Energy", "Drive"),
            "Calm" to listOf("Mindfulness", "Meditation", "Serenity", "Tranquility", "Balance", "Harmony", "Patience", "Acceptance", "Gratitude"),
            "Creative" to listOf("Inspiration", "Imagination", "Curiosity", "Flow", "Innovation", "Intuition", "Originality", "Wonder"),
            "Social" to listOf("Empathy", "Compassion", "Kindness", "Generosity", "Forgiveness", "Respect", "Trust", "Collaboration"),
            "Challenge" to listOf("Resilience", "Adaptability", "Problem Solving", "Decision Making", "Critical Thinking", "Creativity")
        ),
        "Hobbies & Leisure" to mapOf(
            "Reading" to listOf("Gaming", "Photography", "Painting", "Music", "Fishing", "Gardening", "Chess", "Camping", "DIY Craft", "Knitting"),
            "Games" to listOf("Board Games", "Card Games", "Video Games", "E-sports", "Puzzle", "Role Playing", "Strategy", "Simulation"),
            "Creative" to listOf("Drawing", "Sculpture", "Pottery", "Woodworking", "Jewelry Making", "Scrapbooking", "Calligraphy", "Origami"),
            "Music" to listOf("Guitar", "Piano", "Drums", "Singing", "Composing", "Music Production", "DJ", "Concert", "Musical Instruments"),
            "Collecting" to listOf("Stamps", "Coins", "Comics", "Trading Cards", "Action Figures", "Antiques", "Minerals", "Art"),
            "Outdoor" to listOf("Hiking", "Camping", "Fishing", "Hunting", "Birdwatching", "Climbing", "Canoeing", "Skiing", "Surfing"),
            "DIY" to listOf("Home Improvement", "Carpentry", "Plumbing", "Electric", "Painting", "Decorating", "Renovation", "Upcycling"),
            "Cooking" to listOf("Baking", "Grilling", "Brewing", "Canning", "Fermenting", "Charcuterie", "Pastry", "Cake Decorating")
        ),
        "Culture & Religion" to mapOf(
            "Festival" to listOf("Traditional Clothing", "Cultural Dance", "Temple", "Mosque", "Church", "Ritual", "Holiday", "Heritage", "Traditional Art"),
            "Religion" to listOf("Christianity", "Islam", "Hinduism", "Buddhism", "Judaism", "Sikhism", "Taoism", "Shinto", "Indigenous"),
            "Traditions" to listOf("Wedding", "Funeral", "Birth", "Coming of Age", "Harvest", "New Year", "Carnival", "Procession"),
            "Cuisine" to listOf("Food Culture", "Street Food", "Family Meal", "Festival Food", "Religious Food", "Comfort Food", "Heritage Recipe"),
            "Art" to listOf("Cultural Art", "Traditional Music", "Folk Dance", "Craft", "Handicraft", "Textile Art", "Wood Carving", "Batik"),
            "Language" to listOf("Writing", "Script", "Calligraphy", "Typography", "Literature", "Poetry", "Proverb", "Folklore"),
            "Clothing" to listOf("Traditional Costume", "Religious Garment", "Ceremonial Dress", "Folk Dress", "Uniform", "Symbolic Clothing")
        ),
        "Social Issues" to mapOf(
            "Poverty" to listOf("Pollution", "Equality", "Human Rights", "Bullying", "Homelessness", "Education", "Healthcare", "Diversity", "Inclusion"),
            "Environment" to listOf("Climate Change", "Deforestation", "Pollution", "Plastic Waste", "Clean Energy", "Recycling", "Water Scarcity"),
            "Equality" to listOf("Gender Equality", "Racial Equality", "LGBTQ+", "Disability Rights", "Ageism", "Social Justice", "Fair Trade"),
            "Education" to listOf("Access to Education", "Literacy", "STEM", "Online Learning", "Educational Equity", "Lifelong Learning"),
            "Health" to listOf("Mental Health", "Healthcare Access", "Vaccination", "Nutrition", "Exercise", "Disease Prevention", "Healthy Lifestyle"),
            "Community" to listOf("Community Support", "Social Cohesion", "Volunteering", "Local Business", "Neighborhood", "Civic Engagement")
        ),
        "Education" to mapOf(
            "School" to listOf("Classroom", "Teacher", "Student", "Desk", "Blackboard", "Textbook", "Notebook", "Pencil", "Backpack", "Globe"),
            "Online Learning" to listOf("E-learning", "Video Course", "Webinar", "Digital Classroom", "Learning Platform", "Educational App"),
            "Subjects" to listOf("Math", "Science", "History", "Geography", "English", "Art", "Music", "Physical Education", "Language"),
            "Library" to listOf("Book", "Reading", "Study", "Quiet", "Shelf", "Librarian", "Research", "Knowledge", "Literature"),
            "STEM" to listOf("Science", "Technology", "Engineering", "Math", "Robotics", "Coding", "Lab", "Experiment", "Innovation"),
            "Preschool" to listOf("Childcare", "Playground", "Nursery", "Early Learning", "Colors", "Shapes", "Alphabet", "Numbers"),
            "Higher Education" to listOf("University", "Campus", "Lecture Hall", "Research Lab", "Student Union", "Dormitory", "Library"),
            "Vocational" to listOf("Trade School", "Apprenticeship", "Carpentry", "Plumbing", "Welding", "Culinary", "Healthcare", "IT")
        ),
        "Music & Entertainment" to mapOf(
            "Instruments" to listOf("Guitar", "Piano", "Violin", "Drums", "Flute", "Saxophone", "Trumpet", "Cello", "Harp", "Drum Set"),
            "Performance" to listOf("Concert", "Band", "Orchestra", "Solo", "Recital", "Festival", "Karaoke", "Street Performer", "Stage"),
            "Genres" to listOf("Rock", "Classical", "Jazz", "Pop", "Electronic", "Hip Hop", "Reggae", "Country", "R&B", "Metal"),
            "Music Production" to listOf("Studio", "Recording", "Mixer", "Microphone", "Headphones", "MIDI", "Synth", "Speakers"),
            "Dance" to listOf("Ballet", "Modern Dance", "Hip Hop", "Ballroom", "Salsa", "Tango", "Breakdance", "Contemporary"),
            "Theatre" to listOf("Drama", "Musical", "Comedy", "Improv", "Puppetry", "Mime", "Opera", "Stage Design"),
            "Film" to listOf("Cinema", "Filmmaking", "Director", "Actor", "Script", "Camera", "Lighting", "Sound", "Editing")
        ),
        "Fashion & Beauty" to mapOf(
            "Clothing" to listOf("Women's Fashion", "Men's Fashion", "Children's Fashion", "Outerwear", "Activewear", "Formal Wear", "Casual Wear"),
            "Accessories" to listOf("Bags", "Shoes", "Jewelry", "Hats", "Scarves", "Belts", "Watches", "Sunglasses", "Ties"),
            "Beauty" to listOf("Makeup", "Skincare", "Haircare", "Cosmetics", "Facial", "Nail Art", "Perfume", "Beauty Tools"),
            "Fashion Shows" to listOf("Runway", "Designer", "Collection", "Fashion Week", "Catwalk", "Backstage", "Styling"),
            "Textiles" to listOf("Fabric", "Pattern", "Print", "Texture", "Silk", "Cotton", "Wool", "Denim", "Lace", "Leather"),
            "Trends" to listOf("Street Style", "Vintage", "Sustainable Fashion", "Minimalist", "Bohemian", "Athleisure", "Cyberpunk"),
            "Jewelry" to listOf("Rings", "Necklaces", "Bracelets", "Earrings", "Pendants", "Cufflinks", "Brooches", "Gold", "Silver")
        ),
        "Health & Medical" to mapOf(
            "Hospital" to listOf("Clinic", "Nurse", "Doctor", "Patient", "Bed", "Stethoscope", "Surgery", "Emergency Room", "Waiting Room"),
            "Wellness" to listOf("Spa", "Massage", "Yoga", "Meditation", "Fitness", "Nutrition", "Sleep", "Hydration", "Relaxation"),
            "Medical Equipment" to listOf("MRI", "X-ray", "Ultrasound", "Defibrillator", "Ventilator", "Monitor", "Scalpel", "Gloves"),
            "Pharmacy" to listOf("Medication", "Pill", "Tablet", "Capsule", "Syringe", "Medicine Bottle", "Prescription", "Cough Syrup"),
            "First Aid" to listOf("Bandage", "Band-Aid", "Gauze", "Tape", "Scissors", "Tweezers", "Antiseptic", "Pain Reliever"),
            "Dental" to listOf("Toothbrush", "Toothpaste", "Dentist", "Dental Chair", "X-ray", "Cavity", "Braces", "Mouthwash"),
            "Vision" to listOf("Eyes", "Glasses", "Contact Lens", "Optometrist", "Eye Chart", "Lasik", "Eye Exam")
        ),
        "Real Estate" to mapOf(
            "Residential" to listOf("House", "Apartment", "Condominium", "Townhouse", "Villa", "Cottage", "Mansion", "Bungalow"),
            "Commercial" to listOf("Office", "Retail", "Industrial", "Warehouse", "Mixed Use", "Land", "Investment Property"),
            "Interior" to listOf("Living Room", "Kitchen", "Bedroom", "Bathroom", "Home Office", "Basement", "Attic", "Garage"),
            "Exterior" to listOf("Facade", "Garden", "Driveway", "Deck", "Patio", "Pool", "Fence", "Landscaping"),
            "Architecture" to listOf("Design", "Plan", "Blueprints", "Model", "Rendering", "3D Visualization", "Floor Plan"),
            "Neighborhood" to listOf("Street", "Community", "Park", "School", "Shopping", "Transport", "Amenities")
        ),
        "Gaming" to mapOf(
            "Consoles" to listOf("PlayStation", "Xbox", "Nintendo Switch", "PC Gaming", "VR Gaming", "Handheld", "Retro Console"),
            "Genres" to listOf("Action", "RPG", "Adventure", "Strategy", "Sports", "Racing", "FPS", "Puzzle", "Simulation"),
            "E-sports" to listOf("Tournament", "Team", "Gamer", "Streamer", "Spectator", "Arena", "Sponsor"),
            "Setups" to listOf("Gaming Desk", "Gaming Chair", "Monitor", "Keyboard", "Mouse", "Headset", "RGB Lighting", "PC Build"),
            "Game Development" to listOf("Design", "Programming", "Art", "Sound", "Testing", "Publishing", "Indie Game"),
            "Characters" to listOf("Hero", "Villain", "NPC", "Avatar", "Costume", "Weapon", "Vehicle", "Monster"),
            "Worlds" to listOf("Fantasy", "Sci-Fi", "Medieval", "Post Apocalyptic", "Cyberpunk", "Steampunk", "Underwater", "Space")
        ),
        "Space & Astronomy" to mapOf(
            "Solar System" to listOf("Sun", "Moon", "Planets", "Asteroid", "Comet", "Meteor", "Space Dust", "Aurora"),
            "Galaxy" to listOf("Milky Way", "Andromeda", "Spiral", "Elliptical", "Irregular", "Galaxy Cluster", "Quasar"),
            "Stars" to listOf("Constellation", "Nebula", "Supernova", "Black Hole", "Pulsar", "Binary Star", "Red Giant"),
            "Space Exploration" to listOf("Astronaut", "Rocket", "Satellite", "Space Station", "Spacecraft", "Moon Landing", "Mars Rover"),
            "Astronomy" to listOf("Telescope", "Observatory", "Astronomer", "Space Science", "Cosmology", "Astrophysics"),
            "Deep Space" to listOf("Exoplanet", "Interstellar", "Cosmic Web", "Dark Matter", "Gravitational Wave")
        ),
        "Military & Defense" to mapOf(
            "Soldiers" to listOf("Army", "Marine", "Navy", "Air Force", "Special Forces", "Combat", "Training", "Patrol"),
            "Vehicles" to listOf("Tank", "Jeep", "Humvee", "Armored Vehicle", "Aircraft Carrier", "Jet Fighter", "Helicopter", "Drone"),
            "Weapons" to listOf("Rifle", "Pistol", "Machine Gun", "Artillery", "Missile", "Bomb", "Nuclear", "Chemical"),
            "Uniform" to listOf("Camouflage", "Combat Uniform", "Dress Uniform", "Helmet", "Body Armor", "Boots"),
            "Operations" to listOf("Mission", "Reconnaissance", "Surveillance", "Peacekeeping", "Humanitarian", "Disaster Response"),
            "Military Tech" to listOf("Radar", "Sonar", "GPS", "Night Vision", "Thermal", "Communication", "Encryption")
        ),
        "Horror & Dark" to mapOf(
            "Creatures" to listOf("Vampire", "Werewolf", "Zombie", "Ghost", "Demon", "Witch", "Golem", "Mummy", "Frankenstein"),
            "Scenes" to listOf("Haunted House", "Abandoned Building", "Graveyard", "Dark Forest", "Cave", "Dungeon", "Asylum"),
            "Symbols" to listOf("Skull", "Cross", "Blood", "Candle", "Spider", "Bat", "Raven", "Knife", "Mask"),
            "Subgenres" to listOf("Psychological", "Slasher", "Supernatural", "Body Horror", "Cosmic Horror", "Gothic"),
            "Atmosphere" to listOf("Dark", "Misty", "Foggy", "Moonlit", "Shadowy", "Creepy", "Eerie", "Sinister"),
            "Props" to listOf("Coffin", "Dagger", "Crystal Ball", "Spell Book", "Pentagram", "Axe", "Chainsaw")
        ),
        "Fantasy & Mythology" to mapOf(
            "Creatures" to listOf("Dragon", "Griffin", "Unicorn", "Phoenix", "Centaur", "Minotaur", "Mermaid", "Medusa", "Basilisk"),
            "Gods" to listOf("Zeus", "Thor", "Ra", "Odin", "Athena", "Aphrodite", "Apollo", "Artemis", "Anubis", "Loki"),
            "Magic" to listOf("Wizard", "Sorcerer", "Witch", "Mage", "Enchantress", "Alchemist", "Illusionist", "Necromancer"),
            "Weapons" to listOf("Sword", "Shield", "Bow", "Staff", "Spear", "Axe", "Dagger", "Hammer", "Wand", "Crystal"),
            "Locations" to listOf("Castle", "Kingdom", "Enchanted Forest", "Underwater", "Mountain", "Volcano", "Cave", "Ruins"),
            "Quest" to listOf("Adventure", "Fellowship", "Prophecy", "Sacred Item", "Battle", "Rescue", "Revenge"),
            "Mythical Realm" to listOf("Asgard", "Olympus", "Valhalla", "Atlantis", "Avalon", "El Dorado", "Shangri-La")
        ),
        "Holiday & Celebration" to mapOf(
            "Christmas" to listOf("Santa", "Snow", "Tree", "Gift", "Reindeer", "Angel", "Star", "Elf", "Candy Cane", "Winter"),
            "New Year" to listOf("Fireworks", "Countdown", "Champagne", "Clock", "Party", "Resolution", "Confetti", "Balloon"),
            "Easter" to listOf("Rabbit", "Egg", "Chick", "Basket", "Lily", "Candy", "Spring", "Resurrection"),
            "Halloween" to listOf("Pumpkin", "Ghost", "Bat", "Spider", "Costume", "Trick or Treat", "Skeleton", "Candle"),
            "Thanksgiving" to listOf("Turkey", "Pumpkin", "Corn", "Family", "Feast", "Autumn", "Harvest", "Parade"),
            "Independence Day" to listOf("Flag", "Fireworks", "Barbecue", "Parade", "Patriotism", "Stars", "Stripes"),
            "Valentine" to listOf("Heart", "Rose", "Cupid", "Love", "Chocolate", "Lovers", "Kiss", "Gift"),
            "Birthday" to listOf("Cake", "Candle", "Gift", "Balloon", "Party", "Crown", "Confetti", "Happy"),
            "Wedding" to listOf("Ring", "Bride", "Groom", "Dress", "Flowers", "Cake", "Doves", "Altar", "Kiss")
        ),
        "Wedding & Romance" to mapOf(
            "Ceremony" to listOf("Church", "Outdoor", "Beach", "Chapel", "Temple", "Altar", "Aisle", "Vows", "Rings"),
            "Reception" to listOf("Banquet", "Ballroom", "Garden", "Tent", "Dinner", "Toast", "Dance", "Cake", "Music"),
            "Attire" to listOf("Wedding Dress", "Suit", "Veil", "Tiara", "Tuxedo", "Bridesmaid", "Flower Girl", "Ring Bearer"),
            "Decor" to listOf("Flowers", "Candles", "Centerpiece", "Lighting", "Chairs", "Table Setting", "Backdrop"),
            "Romance" to listOf("Couple", "Kiss", "Embrace", "Sunset", "Candlelight", "Flowers", "Love Letter", "Stroll"),
            "Honeymoon" to listOf("Beach", "Mountain", "City", "Resort", "Spa", "Dinner", "Sunset", "Adventure")
        ),
        "Vintage & Retro" to mapOf(
            "Decades" to listOf("1920s", "1930s", "1940s", "1950s", "1960s", "1970s", "1980s", "1990s"),
            "Fashion" to listOf("Flapper", "Pin Up", "Rockabilly", "Disco", "Grunge", "Mod", "Hippie", "Punk"),
            "Design" to listOf("Art Deco", "Mid Century", "Industrial", "Rustic", "Shabby Chic", "Victorian", "Edwardian"),
            "Objects" to listOf("Vintage Car", "Old Camera", "Vinyl Record", "Typewriter", "Telephone", "Radio", "Gramophone"),
            "Media" to listOf("Film Strip", "Vinyl", "Casette", "VHS", "Polaroid", "Retro Poster", "Vintage Ad"),
            "Architecture" to listOf("Art Nouveau", "Colonial", "Renaissance", "Baroque", "Gothic", "Romanesque")
        ),
        "Futuristic & Sci-Fi" to mapOf(
            "Technology" to listOf("Hologram", "AI", "Nanotech", "Biotech", "Cybernetics", "Neuralink", "Cloning"),
            "Settings" to listOf("City of Future", "Space Station", "Mars Colony", "Underwater City", "Floating City", "Dystopia"),
            "Vehicles" to listOf("Flying Car", "Spaceship", "Hovercraft", "Spacecraft", "Mecha", "Robot", "Cyber Bike"),
            "Robots" to listOf("Android", "Cyborg", "AI Robot", "Nano-bot", "Humanoid", "Robot Pet", "War Bot"),
            "Science" to listOf("Time Travel", "Teleportation", "Dark Matter", "Wormhole", "Multiverse", "Quantum"),
            "Atmosphere" to listOf("Neon", "Cyberpunk", "Clean", "Minimal", "High Tech", "Gleaming", "Metallic")
        ),
        "Abstract & Conceptual" to mapOf(
            "Geometric" to listOf("Minimalist", "Vibrant", "Gradient", "3D", "Pattern", "Symmetry", "Asymmetry", "Kinetic"),
            "Textures" to listOf("Marble", "Wood", "Metal", "Glass", "Fabric", "Leather", "Stone", "Concrete"),
            "Shapes" to listOf("Fluid", "Curve", "Spiral", "Morph", "Blend", "Warp", "Distort", "Fragment"),
            "Conceptual" to listOf("Connection", "Growth", "Change", "Balance", "Perspective", "Infinity", "Unity"),
            "Visual Effects" to listOf("Blur", "Glow", "Shadow", "Reflection", "Transparency", "Light Leak", "Chromatic"),
            "Artistic" to listOf("Watercolor", "Oil", "Pastel", "Ink", "Charcoal", "Sketch", "Digital Art")
        ),
        "Underwater & Marine" to mapOf(
            "Marine Life" to listOf("Coral Reef", "Seaweed", "Jellyfish", "Sea Turtle", "Dolphin", "Whale", "Shark", "Clownfish"),
            "Diving" to listOf("Scuba", "Freediving", "Underwater Photography", "Marine Conservation", "Cave Diving", "Wreck Diving"),
            "Ocean" to listOf("Wave", "Tide", "Current", "Ocean Floor", "Sunlight Underwater", "Deep Sea", "Coast"),
            "Water Sports" to listOf("Surfing", "Kayaking", "Snorkeling", "Rafting", "Sailing", "Windsurfing", "Kitesurfing"),
            "Exploration" to listOf("Submarine", "ROV", "Deep Sea Vessel", "Marine Biology", "Oceanography"),
            "Conservation" to listOf("Plastic Free", "Reef Conservation", "Marine Protected Area", "Sustainable Fishing")
        ),
        "Rural & Countryside" to mapOf(
            "Farm" to listOf("Fields", "Barn", "Crops", "Harvest", "Livestock", "Tractor", "Hay", "Silo", "Orchard", "Vineyard"),
            "Village" to listOf("Countryside", "Cottage", "Church", "Green", "Stream", "Bridge", "Garden", "Woodland"),
            "Nature" to listOf("Meadow", "Forest", "River", "Hill", "Sky", "Wildflowers", "Butterflies", "Birds"),
            "Activities" to listOf("Gardening", "Farming", "Fishing", "Hiking", "Picnic", "Camping", "Stargazing"),
            "Animals" to listOf("Horses", "Cows", "Sheep", "Goats", "Chickens", "Ducks", "Geese", "Pigs"),
            "Agriculture" to listOf("Organic Farm", "Permaculture", "Greenhouse", "Vertical Farm", "Aquaponics", "Hydroponics")
        ),
        "Urban & City" to mapOf(
            "Cityscape" to listOf("Skyline", "Downtown", "Skyscraper", "Street", "Bridge", "Night", "Sunset", "Traffic"),
            "Neighborhood" to listOf("Community", "Suburb", "Park", "School", "Library", "Cafe", "Shop", "Street Art"),
            "Transport" to listOf("Subway", "Bus", "Train", "Tram", "Bicycle", "Pedestrian", "Bridge", "Tunnel"),
            "Culture" to listOf("Museum", "Theatre", "Gallery", "Cinema", "Concert", "Festival", "Sporting Event"),
            "Activities" to listOf("Dining", "Shopping", "Work", "Living", "Exercise", "Relaxing", "Exploring"),
            "Architecture" to listOf("Modern", "Historical", "Glass", "Steel", "Green Building", "Eco Friendly")
        )
    )
}
