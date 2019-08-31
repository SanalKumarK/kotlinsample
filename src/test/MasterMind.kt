package test

/**
 * Created by Sanal on 2/16/2019.
 */

fun main(args: Array<String>) {
    println(masterMind("abc", "cba"))
    println(masterMind("abc", "cab"))
    println(masterMind("xyz", "xyz"))
}

fun masterMind(str1:String, str2:String) : Pair<Int, Int> {
    var matches:Int = 0
    var posMatches:Int = 0

    for(i:Int in 0..str1.length-1) {
        for(j in 0..str2.length-1) {
            if(str1.get(i).equals(str2.get(j))) {
                matches++
                if(j == i) {
                    posMatches++
                }
                break
            }
        }
    }
    return matches to posMatches;
}