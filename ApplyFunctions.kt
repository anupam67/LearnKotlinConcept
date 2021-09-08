package com.example.cicddemowithappcenter

class Student1{
    var name =""
    var age =0
}

fun main(){


    /*** Scope Function : Apply
    Property 1 : Refer to context object by this
    Property 2 : The rteurn value is context object ***/

    val studen = Student1()
    studen.name = "hjsdhfds"

    val student = Student1().apply {
        name = "Anupam Tyagi"
        age = 28
    }

    with(student) {
        println("Name $name")
        println("Age $age")
    }

    studen.also {
        it.name = "Anupam kumar Tyagi"
        print("Updated name ${it.name}")
    }
    // perform some other operation on student object

    student.also {
        it.name = "Anupam kumar Tyagi"
        print("Updated name ${it.name}")
    }

  print("Int value ${calculate(1,2)}")
  print("Int value ${someMethod(3)}")
}
fun calculate(a: Int, b: Int): Int {
    try {
        return a - b
    } catch (e: Exception) {
        return a + b
    } finally {
        return a * b
    }
}
fun someMethod(i: Int): Int {
    return try {
        //some statement
        1
    } catch (e: java.lang.Exception) {
        //some statement
        999
    } finally {
        return 7
        //finally block statements
    }
}