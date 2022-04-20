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
    else println("Понравилось $likes человекам")
}