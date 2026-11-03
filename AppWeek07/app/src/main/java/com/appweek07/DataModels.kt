package com.appweek07

import java.util.Date
import java.util.Locale
import java.util.UUID

data class Student(
    val name: String,
    val id: String = UUID.randomUUID().toString(),
    val addedDate: Date = Date()
)

data class CartItem(
    val name: String,
    var quantity: Int = 1,
    val price: Double,
    val id: String = UUID.randomUUID().toString(),
    val addedDate: Date = Date()
) {
    fun getTotalPrice(): Double = quantity * price

    override fun toString(): String {
        val formattedTotal = String.format(Locale.US, "%.2f", getTotalPrice())
        return "$name (x$quantity) - $$formattedTotal"
    }
}

enum class AppMode(val displayName: String) {
    STUDENT_LIST("Student List"),
    SHOPPING_CART("Shopping Cart"),
}
