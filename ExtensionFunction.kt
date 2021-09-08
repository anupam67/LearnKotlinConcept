package com.example.cicddemowithappcenter

private val p1 :Int by lazy {
    10
}

fun main()
{
    val str1 = "s1"
    val str2 = "s2"
    println("String ${str1.add(str2)}")
    println("String ${str1 add str2}")
    println("Integer from lazy $p1")
    println("Integer from lazy $p1")
    val intArray = intArrayOf(4, 6, 7, 8, 4, 9,8,7)
    println("Duplicates  ${DuplicatesArray.findDuplicates(intArray)}")
}

infix fun String.add(inputString : String) : String {
    return this+inputString
}

