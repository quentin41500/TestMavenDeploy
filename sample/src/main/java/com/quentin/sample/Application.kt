package com.quentin.sample

import com.quentin.mysecondmodule.Multiply

fun main() {
    val add = Add(2)
    val multiply = Multiply(add)

    println("(3 + 2) * 5 = ${multiply.multiply(3, 5)}")
}
