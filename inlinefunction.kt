package com.example.cicddemowithappcenter

fun main()
{
   /* An inline function declare with keyword inline
    The use of inline function enhance the use of high order function
    the inline function tells the compiler to copy parameters and functions to call site  */
    inlineFunctions { println(" Calling inline function")  }
    val name = "anupam tyagi"
    print("length of $name.length")


}

inline fun inlineFunctions( anyFunction:() -> Unit) {
  //  anyFunction()
    println("Code inside inline function")
}