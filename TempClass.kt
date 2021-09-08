package com.example.cicddemowithappcenter

import io.reactivex.rxjava3.core.Observable


class TempClass {




   /* fun modificationByRxJava()
    {

        Observable
        Observable.create({ subscriber ->
            for (item in items) {
                subscriber.onNext(transformA2B(item))
            }
            subscriber.onCompleted()
        })

    }
*/

    fun getList(): MutableList<Int>
    {
        val listData = mutableListOf<Int>()
        listData.add(1)
        listData.add(2)
        listData.add(3)
        listData.add(4)
        return listData
    }
}