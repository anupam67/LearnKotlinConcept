package com.example.cicddemowithappcenter


fun main() {
    //getSecondLargestNumber()
    getDuplicateFromString()
}

fun getSecondLargestNumber() {
    val arrayRandom = IntArray(5)
    arrayRandom[0] = 8
    arrayRandom[1] = 9
    arrayRandom[2] = 7
    arrayRandom[3] = 5
    arrayRandom[4] = 6


    println("Array Random $arrayRandom")

    var largestElement = 0
    var secondLargestElement = 0

    for (i in arrayRandom) {
        if (i > largestElement) {
            secondLargestElement = largestElement
            largestElement = i
        } else if (i > secondLargestElement && i != largestElement)
            secondLargestElement = i
        // print element
        //  else if()
    }

    println("Second Largest $secondLargestElement")

    /* for (i in arrayRandom)
     {
         if(i!=largestElement)
             secondLargestElement = i



         // print element
         //  else if()
     }*/


}


fun getDuplicateFromString() {
    val name = "abbcgh"
    val charArray = name.toCharArray()


    println("Array Random ${charArray.toString()}")
    val hashSet = mutableSetOf<Char>()
    for (i in charArray) {
        if (!hashSet.add(i)) {
            println("Duplicate Value $i")
            break
        }


        /*   if(!hashSet.add(i))
        {
            println("Duplicate $i")
        }*/
        // print element
        //  else if()
    }
}



    /* for (i in arrayRandom)
     {
         if(i!=largestElement)
             secondLargestElement = i



         // print element
         //  else if()
     }*/




