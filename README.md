# MyMealSuggestor
# My Youtube Video
https://youtu.be/oFn_pxq9Yxg?feature=shared

# Activity_Main.xml
# Root Layout (LinearLayout)
The root layout consists of width as well as height which makes sure that the entire screen is taken up. A linear layout is used with a vertical orientation which therefore stacks all my elements from top to bottom. I also added padding with the specification of 20dp which adds spacing within the layout. 

# TextView (Instruction Label)
This text view displays an instructon for users to enter a time of day, for example, Morning; Brunch; Lunch; Afternoon Snack; Supper; and Dessert. I included a margin below with the specification of 10dp for spacing. 

# EditText (User Input Field)
This allows users to enter the time of day that they want a meal suggestion for. I added an inputType="Text" to accept the specified text that the user will enter.

# Button (Find Meal)
This button allows users to click it and find their suggested meal for the time of day that they inserted. 

# TextView (Results Box)
This text box displays the suggested meals based on the time of day. The background colour is light gray (#E0E0E0) and the text is centered. The box is visible for everyone to see at all times. 

# Reset Button and Exit Button
When you click on the reset button then whatever information that is put into the text view for the users to enter the time of day will be cleared as well as the text box that will display the suggestion itself. The exit button is there for the users to easily exit from the app entirely

# Main_Activity.kt
# 1. Activity Setup
The app uses AppCompatActvity, which is a standard base class for activities as well as setContentView(R.layout.activity_main) which links the Kotlin file to the XML file. 

# 2. Fetching UI Elements
findViewById retrieves the input fields, buttons as well as text views from the layout. 

# 3. Meal Suggestion Logic
When the FindMeal button is clicked the user's input which is the time of day is trimmed for clean formatting which means that any unncessary characters such as spaces or tabs at the beginning or at the end of the input or multiple spaces between words or characters are removed to make input more tidy and easier to navigate. The suggestion is displayed in a meal suggestion box and if an invalid input is entered then an error message is shown. 

# 4. Reset Button Logic
This clears the users input and it clears the meal suggestion box.

# 5. Exit Button Logic 
Closes the app when clicked. 

# App running
The app runs and all buttons and texts views work.
