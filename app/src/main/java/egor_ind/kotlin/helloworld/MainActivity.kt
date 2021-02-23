package egor_ind.kotlin.helloworld

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

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
                textView.text = "Hello ${editText.text}"
            } else {
                Snackbar.make(findViewById(android.R.id.content), "Enter Name in the field given", Snackbar.LENGTH_LONG).show()
//                Toast.makeText(this@MainActivity, "Enter Name in the field given", Toast.LENGTH_LONG).show()
            }
        }
    }
}