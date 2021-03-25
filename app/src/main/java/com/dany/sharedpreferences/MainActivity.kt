package com.dany.sharedpreferences

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val PREFS_NAME = "learning preferences"
    lateinit var myPref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        saveId.setOnClickListener {

            myPref = getSharedPreferences(PREFS_NAME, 0)

            // To adding things inside our preferences
            var editor: SharedPreferences.Editor = (myPref as SharedPreferences).edit()

            if (!TextUtils.isEmpty(enterSomethingId.text.toString())) {
                // If it's not empty, save the message
                var message = enterSomethingId.text.toString()
                editor.putString("message", message)
                editor.commit() // To commit, to save

            } else {
                Toast.makeText(this, "Please, introduce a text", Toast.LENGTH_LONG).show()
            }

        }

        // Get data back

        // Creating a new instance of SharedPreferences:
        var dataBack: SharedPreferences = getSharedPreferences(PREFS_NAME, 0)

        if (dataBack.contains("message")) {
            var myMessage = dataBack.getString("message", "not found!")
            resultId.text = myMessage
        }
    }
}