package com.example.cicddemowithappcenter

class Student2{
    val name = "Anupam"
    val age = "28"
}

fun main(){


  /*  Scope Function : run
    Property 1 : Refer to context object using by this
    Property 2: The return value is 'Lambda result'*/

    // run is the combination of with and let
    // if you want to operate on nullable object and avoid NullpointerException then use run


    val student : Student2?=null

 /*   val newAge = with(student){
        println("student name ${student.name}")
        println("student age ${student.age}")
        age + 5
    }*/

    val newAge = student?.run {
        println("student name ${student.name}")
        println("student age ${student.age}")
        age + 5
    }?:"everything is null"

    println("student age ${newAge}")
}