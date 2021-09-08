package com.example.cicddemowithappcenter


fun main(){


/*    Scope Function : 'let'
    Property 1 : Refer to context object by "it"
    Property 2: The return value is 'lambda result'*/


    // use of 'let' to avoid NUll pointer excpetion


    var name:String?=null

    // var name:String?="hello"

   /* println(name.reversed())
    println(name.capitalize())
    println(name.length)*/

     /* println(name!!.reversed())
    println(name.capitalize())
    println(name.length)*/

   val newString =  name?.let {
        println(name.reversed())
        println(name.capitalize())
        println(name.length)
    }?:"String is blank"

    /* val stringLength =  name?.let { println(name.reversed())
          println(name.capitalize())
          println(name.length)
          name.length
     }*/

     println("String  $newString")


}