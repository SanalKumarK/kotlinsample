package test

/**
 * Created by Sanal on 2/14/2019.
 */
fun String.repeat(n: Int): String {
    val sb = StringBuilder(n * length)
    for (i in 1..n) {
        sb.append(this)
    }
    return sb.toString()
}

fun main(args: Array<String>) {
    println("abc".repeat(5))
    println(listOf(1, 2, 3, 4).sum())    // 6
}


fun List<Int>.sum() : Int {
    var sum: Int = 0
    for(i:Int in this) {
        sum += i
    }
    return sum;
}