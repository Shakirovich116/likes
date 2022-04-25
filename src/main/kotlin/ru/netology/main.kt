package ru.netology

fun main() {
    print("Введите число людей: ")
    val likes :UInt = readLine()!!.toUInt()
    if (likes == 1u)
    println("Понравилось $likes человеку")
    if (likes == 2u)
        println("Понравилось двоим")
    if (likes == 3u)
        println("Понравилось троим")
    if (likes == 4u)
        println("Понравилось четверым")
    if ((likes == 11u) || (likes == 21u) || (likes == 31u) || (likes == 41u) || (likes == 51u) || (likes == 61u) || (likes == 71u) || (likes == 81u))
        println("Понравилось $likes человеку")
          else {
        println("Понравилось $likes человекам")
    }
}