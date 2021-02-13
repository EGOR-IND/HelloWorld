package egor_ind.kotlin.helloworld

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var textView: TextView
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.nameTIET)
        textView = findViewById(R.id.helloTxt)

        val button: Button = findViewById(R.id.sayHelloBtn)
        button.setOnClickListener {
            if (editText.text.isNotEmpty()){
                textView.setText("Hello ${editText.text}")
            } else {
                Toast.makeText(this@MainActivity, "Enter Name in the field given", Toast.LENGTH_LONG).show()
            }
        }
    }
}