package basic.types

import java.util.*

/*
 *  Multiline comment
 *   Basic Types: https://kotlinlang.org/docs/reference/basic-types.html
 */
fun main(args: Array<String>) {

    // Val is readonly, assign once
    val PI = 3.14159

    // Single line comment
    println("Hello basic syntax")

    // Type is derived by compiler, foo is a String.
    var foo = "Foo"
    println("foo = " + foo)

    // Types can be explicitely defined
    var bar:String = "Bar"

    // simple name in template
    val baz = "Foo is $foo"

    // Using an expression in template
    val bim = "${baz.replace("Foo", "Blah")}, but now is $bar"

    // Int type
    var count = 42
    var counter:Int = sum(count, 0) / 2



}

fun sum(a: Int, b: Int): Int {
    println("sum of $a and $b is ${a + b}")
    return a + b
}

// Conditional expression
fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

