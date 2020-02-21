package yandexRewKoylin

import java.io.File

fun main(args: Array<String>) {
    val f = File("input.txt")
    try {
        var lines = 0
        if (f.exists()) {
            f.useLines {
                lines = it.first().toInt()
                for (i in 0..lines) {
                    val value = it.onEach {  }
                }
            }
        }
        f.delete()
    } catch (e:Exception) {

    }
}