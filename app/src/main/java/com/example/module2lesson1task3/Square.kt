package com.example.module2lesson1task3

import kotlin.math.pow

class Square :Shape {

    var sideLength: Double;

    constructor(sideLength: Double) : super() {
        this.sideLength = sideLength
    }

    override fun calcArea(): Double {
        return this.sideLength.pow(2)
    }

    override fun calcPerimeter(): Double {
        TODO("Not yet implemented")
    }
}