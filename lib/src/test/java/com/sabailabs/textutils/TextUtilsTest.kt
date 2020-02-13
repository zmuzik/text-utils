package com.sabailabs.textutils

import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test

class TextUtilsTest {


    @Test
    fun `Should throw exception when string is empty`() {
        val exception = assertThrows(IllegalArgumentException::class.java) {
            "".getFirstNonrepeatingChar()
        }
        assertEquals("String is empty", exception.message)
    }

    @Test
    fun `Should throw exception when all characters are repeated`() {
        val expectedMessage = "All the characters in the string are repeated"
        val exception1 = assertThrows(IllegalArgumentException::class.java) {
            "AA".getFirstNonrepeatingChar()
        }
        assertEquals(expectedMessage, exception1.message)

        val exception2 = assertThrows(IllegalArgumentException::class.java) {
            "AAaa".getFirstNonrepeatingChar()
        }
        assertEquals(expectedMessage, exception2.message)

        val exception3 = assertThrows(IllegalArgumentException::class.java) {
            "AAbbCCCCCCC".getFirstNonrepeatingChar()
        }
        assertEquals(expectedMessage, exception3.message)
    }

    @Test
    fun `Should return the first non-repeating character when input is correct`() {
        assert("MYSUGRISMYSUGR!".getFirstNonrepeatingChar() == 'I')
        assert("$$##@@!".getFirstNonrepeatingChar() == '!')
        assert("aAasdf!".getFirstNonrepeatingChar() == 'A')
        assert("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".getFirstNonrepeatingChar() == 'a')
        assert("žluťoučký kůň úpěl ďábelské ódy".getFirstNonrepeatingChar() == 'ž')
        assert("+_)(*&^%$#@!@#$%^&*()_+".getFirstNonrepeatingChar() == '!')
    }
}
