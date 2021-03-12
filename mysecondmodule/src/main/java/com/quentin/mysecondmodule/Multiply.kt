package com.quentin.mysecondmodule

import com.quentin.sample.Add

/**
 * Multiply a value using a multiplier, after adding.
 *
 * @see Add
 *
 * @param add Add class to add to value.
 */
class Multiply(private val add: Add) {
    /**
     * Multiply a value using a multiplier.
     *
     * @param value To multiply to the value.
     * @param multiplier value to multiply to.
     */
    fun multiply(value: Int, multiplier: Int) = add.add(value) * multiplier
}
