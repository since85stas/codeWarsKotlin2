package yandexRewKoylin

import java.io.File
import java.util.ArrayList

fun main(args: Array<String>) {
    val f = File("input.txt")
    val list : MutableList<String> = ArrayList<String> ()
    try {
        f.forEachLine { list.add(it) }
    } catch (e:Exception) {
    }

    val s1 : MutableMap<Char,Short> = HashMap()
    list[0].toCharArray().forEach {
        var count = s1.get(it)
        s1.put(it,  if (count != null) ++count else 0  )
    }
    val s2 : MutableMap<Char,Short> = HashMap()
    list[1].toCharArray().forEach {
        var count = s2.get(it)
        s2.put(it,  if (count != null) ++count else 0  )
    }
    if (s1.equals(s2)) print(1)
    else print(0)
}

