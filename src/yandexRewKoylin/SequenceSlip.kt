package yandexRewKoylin

import java.io.File

fun main(args: Array<String>) {
    val f = File("input.txt")
    try {
        if (f.exists()) {

        }
        f.delete()
    } catch (e: Exception) {

    }
}