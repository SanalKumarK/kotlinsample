//@file:JvmName("Util")
package test

/**
 * Created by Sanal on 2/12/2019.
 */
fun findMax(a:Int = 10, b:Int = 20):Int {
    return if(a>b) a else b;
}

fun main(args:Array<String>):Unit {
    println(listOf('a','b','c').joinToString(separator = ","));
    //println(findMax(40,100));
    println(findMax());
}