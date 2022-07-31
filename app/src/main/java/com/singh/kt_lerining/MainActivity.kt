package com.singh.kt_lerining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.singh.kt_lerining.databinding.ActivityMainBinding
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder


class MainActivity : AppCompatActivity() {

    lateinit var binidng: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        supportActionBar?.setTitle("Calculator")
        binidng=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binidng.root)



        binidng.btnAc.setOnClickListener {

            binidng.inputtext.text=""
            binidng.outputtext.text=""


        }


        binidng.one.setOnClickListener {

            binidng.inputtext.append("1")
        }




        binidng.two.setOnClickListener {

            binidng.inputtext.append("2")
        }


        binidng.three.setOnClickListener {

            binidng.inputtext.append("3")
        }


        binidng.four.setOnClickListener {

            binidng.inputtext.append("4")
        }


        binidng.five.setOnClickListener {

            binidng.inputtext.append("5")
        }


        binidng.six.setOnClickListener {

            binidng.inputtext.append("6")
        }


        binidng.seven.setOnClickListener {

            binidng.inputtext.append("7")
        }

        binidng.eight.setOnClickListener {

            binidng.inputtext.append("8")
        }

        binidng.nine.setOnClickListener {

            binidng.inputtext.append("9")
        }

        binidng.openbracket.setOnClickListener {

            binidng.inputtext.append(" ( ")
        }

        binidng.closebracket.setOnClickListener {

            binidng.inputtext.append(" ) ")
        }


        binidng.point.setOnClickListener {

            binidng.inputtext.append(".")
        }

        binidng.zero.setOnClickListener {

            binidng.inputtext.append("0")
        }



        binidng.plus.setOnClickListener {

            binidng.inputtext.append(" + ")
        }
        binidng.minus.setOnClickListener {

            binidng.inputtext.append(" - ")
        }
        binidng.divide.setOnClickListener {

            binidng.inputtext.append(" / ")
        }


        binidng.equal.setOnClickListener {
val expression =ExpressionBuilder(binidng.inputtext.text.toString()).build()
val result=expression.evaluate()
            val longresult=result.toLong()

            if (result==longresult.toDouble()){
binidng.outputtext.text=longresult.toString()
            }else{
                    binidng.outputtext.text=result.toString()
            }
        }

    }


}