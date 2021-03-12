package com.quentin.sample

/**
 * Add an offset to a value.
 *
 * @param offset value to add.
 */
class Add(private val offset: Int = 0) {
    /**
     * Add a value using an offset.
     *
     * @param value To add to the offset to.
     */
    fun add(value: Int) = value + offset
}
