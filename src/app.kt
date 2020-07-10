fun main() {
    println("Hello World!")
    println( start() )
    useFoo()
}

fun start(): String = "Kotlin application is starting, better buckle up youngin'!!"

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