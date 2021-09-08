package com.example.cicddemowithappcenter

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes


class MainActivity : AppCompatActivity() {
    private val name : String = "anupam"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCenter.start(
            application, "ecc71f49-2119-43b5-88f2-7fee5e2a4369",
            Analytics::class.java, Crashes::class.java
        )
        getValueOrNull()
    }

    fun  getValueOrNull() {
       val list = listOf(1, 2, 3)
       Log.e("List", "" + list.getOrNull(0)) // 1
       Log.e("List", "" + list.getOrNull(2))
       Log.e("List", "" + list.getOrNull(3))
       println(list.getOrNull(0)) // 1
       println(list.getOrNull(2)) // 3
       println(list.getOrNull(3)) // null
       val emptyList = emptyList<Int>()
       val value : String?= null
       val lengthValue = value?.length?: 0
       Log.e("value",""+ lengthValue)
       println(emptyList.getOrNull(0)) // null
       println("value $name")
       emptyList.let { it[0] }
       //Log.e("EmptyList", "" + emptyList[0])
      // startActivity(Intent(this,MainActivity2::class.java))
   }
}