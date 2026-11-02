package com.appweek07

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

class DataModelsTest {

    @Test
    fun cartItem_totalPrice_isQuantityTimesUnitPrice() {
        val item = CartItem(name = "Apple", quantity = 3, price = 2.0)

        assertEquals(6.0, item.getTotalPrice(), 0.0)
    }

    @Test
    fun cartItem_toString_includesNameQuantityAndFormattedTotal() {
        val item = CartItem(name = "Milk", quantity = 2, price = 3.5)

        assertEquals("Milk (x2) - $7.00", item.toString())
    }

    @Test
    fun student_defaultId_isUnique() {
        val firstStudent = Student(name = "KIM")
        val secondStudent = Student(name = "KIM")

        assertNotEquals(firstStudent.id, secondStudent.id)
    }
}
