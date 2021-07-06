package com.example.module2lesson1task3
/*
ДЗ. Задание 3. Вам не выжить :)
Написать программу-калькулятор площадей
геометрических фигур:
круг, квадрат, прямоугольник.
В настоящих проектах хорошим тоном является держать в master только рабочие и
оттестированные версии приложения. Поэтому после первого коммита сразу создаем новую
ветку dev и в ней пишем приложение для расчета площади круга.
Потом в отдельной ветке за несколько коммитов дописываем функционал для квадрата. И
еще в отдельной ветке – для прямоугольника.
И мерждим все это в ветку dev,
И только потом уже сливаем с master.
Мне прислать скрин с историей коммитов.
 */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresPermission
import androidx.core.widget.doAfterTextChanged

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val r=5.0;
        val l=6.0;
        val circle1= Circle(r)
        val suare1= Square(l)
        val rectangle1=Rectangle(4.0,5.0)
        var shapeType:String=""

        var rectangle11:Rectangle= Rectangle(0.0,0.0)
        var circle11:Circle= Circle(0.0)
        var square11:Square= Square(0.0)


        Log.d("mylog","Hello Kotlin!")
      
        Log.d("mylog","circle1 area="+circle1.calcArea().toString())
        Log.d("mylog","suare1 area="+suare1.calcArea().toString())
        Log.d("mylog","rectangle1 area="+rectangle1.calcArea().toString())

// get reference to ImageView
        val ivCircle = findViewById(R.id.ivCircle) as ImageView
        val ivRectangle = findViewById(R.id.ivRectangle) as ImageView
        val ivSquare = findViewById(R.id.ivSquare)as ImageView
        val calculate = findViewById(R.id.btCalc)as Button

        var etShapeParam1 = findViewById(R.id.etShapeParam1) as EditText
        var etShapeParam2 = findViewById(R.id.etShapeParam2) as EditText

        var tvShapeParam1 = findViewById(R.id.tvShapeParam1) as TextView
        var tvShapeParam2 = findViewById(R.id.tvShapeParam2) as TextView
        var tvHeader = findViewById(R.id.tvHeader) as TextView

        var tvResult = findViewById(R.id.tvResult) as TextView
// set on-click listener for ImageView
        ivCircle.setOnClickListener {
            ivRectangle.setVisibility(View.INVISIBLE)
            ivSquare.setVisibility(View.INVISIBLE)
            tvShapeParam1.text="enter radius"
            shapeType="circle"
            tvShapeParam1.setVisibility(View.VISIBLE)
            etShapeParam1.setVisibility(View.VISIBLE)
            etShapeParam2.setVisibility(View.INVISIBLE)
            tvShapeParam2.setVisibility(View.INVISIBLE)
            tvHeader.setVisibility(View.INVISIBLE)

            etShapeParam1.getText().clear()

        }

        ivSquare.setOnClickListener {
            ivRectangle.setVisibility(View.INVISIBLE)
            ivCircle.setVisibility(View.INVISIBLE)
            tvShapeParam1.text="enter side size"
            etShapeParam2.setVisibility(View.INVISIBLE)
            tvShapeParam2.setVisibility(View.INVISIBLE)
            shapeType="square"
            tvShapeParam1.setVisibility(View.VISIBLE)
            etShapeParam1.setVisibility(View.VISIBLE)
            tvHeader.setVisibility(View.INVISIBLE)

            etShapeParam1.getText().clear()


        }

        ivRectangle.setOnClickListener {
            ivCircle.setVisibility(View.INVISIBLE)
            ivSquare.setVisibility(View.INVISIBLE)
            tvShapeParam1.text="enter length"
            tvShapeParam1.setVisibility(View.VISIBLE)
            etShapeParam1.setVisibility(View.VISIBLE)
            tvShapeParam2.text="enter width"
            tvShapeParam2.setVisibility(View.VISIBLE)
            etShapeParam2.setVisibility(View.VISIBLE)
            etShapeParam1.getText().clear()
            etShapeParam2.getText().clear()
            tvHeader.setVisibility(View.INVISIBLE)

            shapeType="rectangle"

        }

        etShapeParam1.doAfterTextChanged{
            if(etShapeParam1.getText().length>0)
                calculate.setVisibility(View.VISIBLE)
        }

        etShapeParam2.doAfterTextChanged{
            if(etShapeParam1.getText().length>0)
                calculate.setVisibility(View.VISIBLE)
        }

        calculate.setOnClickListener {
            Log.d("mylog","pushed="+etShapeParam1.text)
           // val r=et.text.toString().toDouble()
          //  val square1= Square(etShapeParam1.text.toString().toDouble())
         //  Log.d("mylog","pushed="+square1.calcArea().toString())
            if (shapeType=="square") {
                square11=Square(etShapeParam1.text.toString().toDouble())
                tvResult.text="area of square="+square11.calcArea().toString()
            }
            if (shapeType=="circle") {
                circle11= Circle(etShapeParam1.text.toString().toDouble())
                tvResult.text="area of circle="+circle11.calcArea().toString()
            }
            if (shapeType=="rectangle") {
                var a=etShapeParam1.text.toString().toDouble()
                var b=etShapeParam2.text.toString().toDouble()
                rectangle11= Rectangle(a,b)
                tvResult.text="area of rectangle="+rectangle11.calcArea().toString()
            }

            ivRectangle.setVisibility(View.VISIBLE)
            ivSquare.setVisibility(View.VISIBLE)
            ivCircle.setVisibility(View.VISIBLE)
            tvHeader.setVisibility(View.VISIBLE)


            tvShapeParam1.setVisibility(View.INVISIBLE)
            etShapeParam1.setVisibility(View.INVISIBLE)

            tvShapeParam2.setVisibility(View.INVISIBLE)
            etShapeParam2.setVisibility(View.INVISIBLE)
            calculate.setVisibility(View.INVISIBLE)

        }






    }
}