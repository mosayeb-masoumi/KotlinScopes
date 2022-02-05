package com.example.kotlintest

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*********************apply object*********************/

        val myModel = MyModel().apply {
            name = "hassan"
            family = "reza"
        }

        var zz = myModel


        /*********************apply list*********************/

        val list1 = arrayListOf<MyModel>().apply {
            add(MyModel("ali", "rezai"))
            add(MyModel("hassan", "moradi"))
        }
        var z2 = list1


        /*********************also list*********************/
        val list3 = arrayListOf<String>().also {
            it.add("ali")
            it.add("moradi")
        }
        var z3 = list3;


        /*********************let*********************/
//        علاوه بر اینکه یک قلمرو ایجاد می کند، می تواند مقدارِ آخرین دستور قلمرو را برگرداند. به عنوان مثال، می توانیم یک رشته به این صورت برگردانیم:
        // it can return a string
        val obj1 = MyModel().let {
            it.name = "milad"
            it.family = "rezai"
            "salam"
        }
        var z4 = obj1


        /*********************run*********************/
        // run == apply+let
        val obj2 = MyModel().run {
            name = "taghi"
            family = "shiri"
            "salam"
        }

        var ss = obj2
        var dd = ss


        /********************* apply + also *********************/
//also == do something after set data
        val obj3 = MyModel().apply {
            name = "gholam"
            family = "minai"
        }.also {
            var name2 = it.name
            // send to server name2
        }

        var hhh = obj3


        /********************* apply + with *********************/
 // by with we chan change the prooerties of apply
        val obj4= MyModel().apply {
            name = "gholam"
            family = "minai"
        }
        with(obj4){
           name = "gholam new"
        }

        var gg = obj4








        /*****************************************************/

        val list: MutableList<String> = ArrayList()
        list.add("ali")
        list.add("reza")
        list.add("milad")

        for (i in list.indices) {
            if (list[i] == "ali") {
                var a = 5;
            }
        }

        var list10 = list;
        Log.i(TAG, "onCreate: " + list10.toString())
        val iterator = list.iterator()
        for (i in iterator) {
            if (i == "reza") {
                iterator.remove()
            }
        }
        var list11 = list
        Log.i(TAG, "onCreate: " + list11.toString())
        var a = 5;

    }
}