

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin_st2.R
import java.lang.Exception
import javax.xml.xpath.XPathExpression

class MainActivity : AppCompatActivity() {

    lateinit var mathOperation: TextView
    lateinit var resultText: TextView
    lateinit var zeroButton: TextView
    lateinit var oneButton: TextView
    lateinit var twoButton: TextView
    lateinit var threeButton: TextView
    lateinit var fourButton: TextView
    lateinit var fiveButton: TextView
    lateinit var sixButton: TextView
    lateinit var sevenButton: TextView
    lateinit var eightButton: TextView
    lateinit var nineButton: TextView
    lateinit var acButton: TextView
    lateinit var leftBracketButton: TextView
    lateinit var rightBracketButton: TextView
    lateinit var divideButton: TextView
    lateinit var multiplicationButton: TextView
    lateinit var addButton: TextView
    lateinit var subtractButton: TextView
    lateinit var equalButton: TextView
    lateinit var fractionButton: TextView
    lateinit var backButton: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mathOperation = findViewById(R.id.math_operation)
        resultText = findViewById(R.id.result_text)
        zeroButton = findViewById(R.id.zero_button)
        oneButton = findViewById(R.id.one_button)
        twoButton = findViewById(R.id.two_button)
        threeButton = findViewById(R.id.three_button)
        fourButton = findViewById(R.id.foure_button)
        fiveButton = findViewById(R.id.five_button)
        sixButton = findViewById(R.id.six_button)
        sevenButton = findViewById(R.id.seven_button)
        eightButton = findViewById(R.id.eight_button)
        nineButton = findViewById(R.id.nine_button)
        acButton = findViewById(R.id.AC_button)
        subtractButton = findViewById(R.id.subtract_button)
        equalButton = findViewById(R.id.equal_button)
        fractionButton = findViewById(R.id.fraction_button)
        backButton = findViewById(R.id.back_button)
        leftBracketButton = findViewById(R.id.left_bracket_button)
        rightBracketButton = findViewById(R.id.right_bracket_button)
        divideButton = findViewById(R.id.divide_button)
        multiplicationButton = findViewById(R.id.multiplication_button)
        addButton = findViewById(R.id.add_button)

        zeroButton.setOnClickListener { setTextFields("0") }
        oneButton.setOnClickListener { setTextFields("1") }
        twoButton.setOnClickListener { setTextFields("2") }
        threeButton.setOnClickListener { setTextFields("3") }
        fourButton.setOnClickListener { setTextFields("4") }
        fiveButton.setOnClickListener { setTextFields("5") }
        sixButton.setOnClickListener { setTextFields("6") }
        sevenButton.setOnClickListener { setTextFields("7") }
        eightButton.setOnClickListener { setTextFields("8") }
        nineButton.setOnClickListener { setTextFields("9") }
        acButton.setOnClickListener {
            mathOperation.text = ""
            resultText.text = ""
        }
        leftBracketButton.setOnClickListener { setTextFields("(") }
        rightBracketButton.setOnClickListener { setTextFields(")") }
        divideButton.setOnClickListener { setTextFields("/") }
        multiplicationButton.setOnClickListener { setTextFields("*") }
        addButton.setOnClickListener { setTextFields("+") }
        subtractButton.setOnClickListener { setTextFields("-") }
        equalButton.setOnClickListener { setTextFields("=") }
        fractionButton.setOnClickListener { setTextFields(".") }
        backButton.setOnClickListener {
            val input = mathOperation.text.toString()
            if (input.isNotEmpty()){
                mathOperation.text = input.substring(0, input.length - 1)
                resultText.text = ""
            }

            equalButton.setOnClickListener {
                try {
                    val ex = ExpressionBuilder(mathOperation)

                } catch (e:Exception) {
                    Log.d("Ошибка", "сщщбщение: ${e.message}")

                }
            }
        }
    }

    fun setTextFields(str: String) {
        mathOperation.append(str)
        resultText.append(str)



    }

}