package test

/**
 * Created by Sanal on 2/13/2019.
 */
fun isValidIdentifier(s: String): Boolean {
    return (!s.isEmpty() && (s.elementAt(0) in 'a'..'z' || s.elementAt(0) == '_' ) &&
            !('$' in s))
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}