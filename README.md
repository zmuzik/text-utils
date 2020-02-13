# Text Utils

## What is Text Utils
This project represents a Kotlin library for work with Strings. The library contains only one extension function `String.getFirstNonrepeatingChar()` which returns the first non-repeating character in the string.

## Assignment
```
Please implement the second example from the tech interview ("Find the first non-repeating character in a string") in way that you think is optimal. 
- Kotlin is the preferred language for this example, however please feel free to use any language you are comfortable with.
- You are creating a library that could be used by anyone. Expect faulty input.
- You can expect that other developers are going to work with your code sooner or later as well.
- You can make assumptions for everything that is not specified. Please document assumptions that are not obvious.

Example input: "MYSUGRISMYSUGR!" 
Result: "I" (since it is the first character that occurs only once)
```

## Assumptions
* Library will be used mostly in Kotlin code, so it's desirable to implement the fuctionality as an extension function.
* We prefer to "play it safe", so any incorrect input which does not contain any non-repeating character throws an `Exception`. In case we don't need to be that strict, we can add a "wrapper" `String.getFirstNonrepeatingCharOrNull()` method which would return a null in case of incorrect input.

## Implementation
* The logic itself is implemented in [TextUtils.kt](lib/src/main/java/com/sabailabs/textutils/TextUtils.kt)
* The tests are implemented in [TextUtilsTest.kt](lib/src/test/java/com/sabailabs/textutils/TextUtilsTest.kt)

