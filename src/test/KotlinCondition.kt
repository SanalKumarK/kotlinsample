package test

/**
 * Created by Sanal on 2/13/2019.
 */

enum class Color {
    RED, GREEN, BLUE
}

fun main(args:Array<String>) {
    println("test");
    println(testWhen1(Color.RED));
    println(testWhen2(Color.RED));
    println(testWhen2(0));

    println(testWhen3(0.0));
    println(testWhen3(3.14));

    testListforLoop(); testMapForLoop()

    testRange1(); testRange2(); testRange3();

    println("Kotlin" in "Java".."Scala")
}

fun testWhen1(colr:Color):String {
    return when(colr) {
        Color.RED -> "RED"
        Color.GREEN -> "GREEN"
        Color.BLUE -> "BLUE"
    }
}

fun testWhen2(a:Any):String {
    return when(a) {
        0 -> "ZERO"
        is Int -> "Integer"
        is String -> "String"
        else -> "Something else"
    }
}

fun testWhen3(a:Double):Pair<Double, String> {
    return when {
        (a < 0) -> a to "NEGATIVE"
        (a > 0) -> a to "POSITIVE"
        (a == 0.0) -> a to "ZERO"
        else -> a to "INFINITY"
    }
}

fun testListforLoop() {
    var list = listOf<String>("ABC", "DEF", "GHI")
    for((i,e) in list.withIndex()) {
        println("$i => $e")
    }
}

fun testMapForLoop() {
    var map = mapOf<Int, String>( 1 to "ONE", 2 to "TWO", 3 to "THREE")
    for ((k,v) in map) {
        println("$k => $v")
    }
}

fun testRange1() {
    for(c in 1..10 step 2) {
        print(c)
    }
}

fun testRange2() {
    for(c in '1'..'9'){
        print(c)
    }
}

fun testRange3() {
    for(c in 'a'..'z'){
        print(c)
    }
}