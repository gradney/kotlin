// https://kotlinlang.org/docs/tutorials/koans.html
// https://play.kotlinlang.org/koans/overview
// ----
// As described online,
// Kotlin Koans are a series of exercises to get you
// familiar with the Kotlin Syntax.
//
// One can also use the EduTools plugin.

// join Strings into JSON format
fun joinOptions(options: Collection<String>): String
{
    return options.joinToString(", ","[", "]")
}

// testing call of function with default arguments for method overloading
// requires 'name' parameter
fun foo(name: String, number: Int = 1, toUpperCase: Boolean = false) =
    (if (toUpperCase) name.toUpperCase() else name) + number

fun useFoo() = listOf(
    foo("a"),
    foo("b", number = 1),
    foo("c", toUpperCase = true),
    foo(name = "d", number = 2, toUpperCase = true)
)

// koan lambda expression example?
fun containsEven(collection: Collection<Int>): Boolean
        = collection.any { it % 2 == 0 }