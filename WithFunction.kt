package com.example.cicddemowithappcenter

class Student{
    var name = "Anupam Tyagi"
    var age = 28
}

fun main(){

   /*** Scope Function : with
    Property 1: Refer to context object using by this
    Property 2: The return value is 'Lambda Result' ****/

    val student = Student()
    println("Student Name ${student.name}")
    println("Student Age  ${student.age}")

    with(student) {

    }


   val newNameAge =  with(student) { // lambda expression
     /*   println("Student Name ${name}")
        println("Student Age  ${age}") */

        println("Student Name ${name}")
        println("Student Age  ${age}")
         age+5
         name + "kumar"
    }

    println("Student New Age  ${newNameAge}")

}