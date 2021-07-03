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
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val r=5.0;
        val circle1= Circle(r)
        Log.d("mylog","Hello Kotlin!")
      
        Log.d("mylog","circle1 area="+circle1.calcArea().toString())

    }
}