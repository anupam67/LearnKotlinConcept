package com.example.cicddemowithappcenter

fun main(){


   /* Scope Function :also
    Property 1 : Refere to the context object by "it"
    Property 2 : The return value is context object*/

    val mutableList = mutableListOf<Int>(1,2,3)

     val duplicateList = mutableList.also {
         println("Numbers list are $it")
         it.add(4)
         println("Updated Numbers list are $it")
         it.removeAt(2)
         println("Updated Numbers list after removing are $it")

         // return context
     }

    println("Numbers list $mutableList")
    println("duplicate list $duplicateList")



}