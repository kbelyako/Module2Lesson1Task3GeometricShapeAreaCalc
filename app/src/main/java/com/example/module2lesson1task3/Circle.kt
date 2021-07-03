package com.example.module2lesson1task3

import kotlin.math.pow

class Circle : Shape {

   var radius: Double;

    constructor(radius: Double) : super() {
        this.radius = radius
    }




    override fun calcArea(): Double {

        return this.radius.pow(2)*3.14
    }

    override fun calcPerimeter(): Double {
        TODO("Not yet implemented")
    }
}