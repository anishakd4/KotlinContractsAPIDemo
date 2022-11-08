package com.anish.kotlincontractsapidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstExample()
        secondExample()
        thirdExample()

        var anish: String? = "Anish"
        requireNotNull(anish)
    }

    fun firstExample() {
        val name: String? = null
        if (name.isNull()) return
        Log.i("anisham", "name is ${name.length} characters long")
    }

    fun secondExample() {
        val names: List<String>? = null
        if (names.isNullOrEmpty()) return

        println("")
        Log.i("anisham", "names is ${names.size} characters long")
    }

    fun thirdExample() {
        val names: List<String>? = null
        if (names.isNotNullOrEmpty()) {
            Log.i("anisham", "names is ${names.size} characters long")
        }

    }

//    fun firstExample() {
//        val name: String? = null
//        if (name.isNull) return
//        Log.i("anisham", "name is ${name?.length} characters long")
//        //compiler error
//        //Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?s
//    }
//
//    fun secondExample() {
//        val names: List<String>? = null
//        if (names.isNullOrEmpty) return
//
//        println("")
//        Log.i("anisham", "names is ${names?.size} characters long")
//        // compiler error
//        //Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type List<String>?
//    }
//
//    fun thirdExample() {
//        val names: List<String>? = null
//        if (names.isNotNullOrEmpty) {
//            Log.i("anisham", "names is ${names?.size} characters long")
//            //compiler error
//            //Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type List<String>?
//        }
//
//    }
}