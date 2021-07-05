package com.example.module2lesson1task3

import kotlin.math.pow

class Rectangle:Shape {

    var sideOneLength: Double;
    var sideTwoLength: Double;


    constructor(sideOneLength: Double, sideTwoLength:Double) : super() {
        this.sideOneLength = sideOneLength
        this.sideTwoLength = sideTwoLength


    }

    override fun calcArea(): Double {
        return this.sideOneLength*this.sideTwoLength
    }

    override fun calcPerimeter(): Double {
        TODO("Not yet implemented")
    }
}