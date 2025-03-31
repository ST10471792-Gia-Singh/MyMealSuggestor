package vcmsa.ci.mymealsuggestor

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Ensure the XML layout is named activity_main.xml

        // Fetch references to UI elements
        val inputTimeOfDay = findViewById<EditText>(R.id.inputTimeOfDay)
        val determineMealButton = findViewById<Button>(R.id.determineMealButton)
        val mealSuggestionsBox = findViewById<TextView>(R.id.mealSuggestionsBox)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val exitButton = findViewById<Button>(R.id.exitButton)

        // Meal suggestions logic
        determineMealButton.setOnClickListener {
            val timeOfDay = inputTimeOfDay.text.toString().trim()

            // Meal suggestions based on the given time of day
            val suggestions = when (timeOfDay) {
                "Morning" -> "Morning: Eggs and bread with bacon"
                "Brunch" -> "Brunch: Noodles with sweetcorn and fried onions"
                "Lunch" -> "Lunch: Chicken mayo sandwich"
                "Afternoon Snack" -> "Afternoon Snack: Tea and biscuits of your choice"
                "Supper" -> "Supper: Mince Lasagne"
                "Dessert" -> "Dessert: Ice cream of your choice"
                else -> "Unknown meal time! Please enter 'Morning', 'Brunch', 'Lunch', 'Afternoon Snack', 'Supper', or 'Dessert'."
            }

            // Display the suggestion in the TextView
            mealSuggestionsBox.text = suggestions
        }

        // Reset button logic
        resetButton.setOnClickListener {
            inputTimeOfDay.text.clear() // Clear user input
            mealSuggestionsBox.text = "" // Clear the suggestion box
        }

        // Exit button logic
        exitButton.setOnClickListener {
            finish() // Close the app
        }
    }
}
