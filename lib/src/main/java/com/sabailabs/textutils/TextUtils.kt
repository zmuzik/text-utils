package com.sabailabs.textutils


/**
 * @returns the first non-repeating character in a particular string
 * @throws [IllegalArgumentException] when string is empty
 * @throws [IllegalArgumentException] when all the characters in the string are repeated
 */
fun String.getFirstNonrepeatingChar(): Char {
    if (this.isEmpty()) throw IllegalArgumentException("String is empty")

    // For each found character store a flag whether it is repeating or not
    // LinkedHashMap maintains insertion order
    val repeatingFlags = LinkedHashMap<Char, Boolean>()

    this.toCharArray().forEach { char ->
        if (repeatingFlags.containsKey(char)) {
            if (repeatingFlags[char] == false) {
                repeatingFlags[char] = true
            }
        } else {
            repeatingFlags[char] = false
        }
    }

    repeatingFlags.forEach { (char, isRepeating) ->
        if (!isRepeating) return char
    }

    throw IllegalArgumentException("All the characters in the string are repeated")
}
