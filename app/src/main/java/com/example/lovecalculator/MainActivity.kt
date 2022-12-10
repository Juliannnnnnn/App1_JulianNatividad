package com.example.lovecalculator
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.app_instructions.*
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var Name1: EditText
    lateinit var Name2: EditText
    lateinit var Calculate: Button
    lateinit var Percentage: TextView
  override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContentView(R.layout.activity_main)
      val button2 = findViewById<Button>(R.id.button2)

      button2.setOnClickListener{
          val instructionsBinding = layoutInflater.inflate(R.layout.app_instructions, null)

          val app_instructions = Dialog(this)
          app_instructions.setContentView(instructionsBinding)

          app_instructions.setCancelable(true)
          app_instructions.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
          app_instructions.show()


      }

      Name1=findViewById(R.id.editText)
      Name2=findViewById(R.id.editText1)
      Calculate=findViewById(R.id.button)
      Percentage=findViewById(R.id.textView)
      Calculate.setOnClickListener(this)

    }
    override fun onClick(v: View?)
    {
        val Str1:String =Name1.text.toString()
        val Str2:String =Name2.text.toString()

        var count:Int = 0
        for(i in Str1.indices)
        {
            for(j in Str2.indices)
            {
                if(Str1[i]==Str2[j])
                {
                    count++
                }
            }
        }
        Percentage.setText("-"+(count*10)+"%")
    }
}

