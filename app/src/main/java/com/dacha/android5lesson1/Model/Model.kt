package com.dacha.android5lesson1.Model

import android.content.Context
import android.widget.Toast

class Model {

    var count = 0


    fun increment(){
        ++count
    }
    fun condition():Int{
        return count
    }


}