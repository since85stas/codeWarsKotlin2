package yandexRewKoylin

import java.io.File
import java.util.*


fun main(args: Array<String>) {
    val f = File("input.txt")
    val list : MutableList<String> = ArrayList<String> ()
    f.forEachLine { list.add(it) }
    print("end load")
    val res = brill(list.get(0),list.get(1))
}

fun brill (s1:String, s2:String) : Int{
    val listBrill = s1.toSet()
    var count = 0
    for (rock in s2.toList()) {
        if (listBrill.contains(rock)) count++
    }
    return count;
}






