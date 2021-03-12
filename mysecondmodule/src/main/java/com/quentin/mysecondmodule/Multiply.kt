package com.quentin.mysecondmodule

import com.quentin.sample.Add

class Multiply(private val add: Add) {
    fun multiply(value: Int, multiplier: Int) = add.add(value) * multiplier
}
