package com.dacha.android5lesson1.Presenter

import android.content.Context
import android.widget.Toast
import com.dacha.android5lesson1.Model.Model
import com.dacha.android5lesson1.View.View

class Presenter {
    private val model = Model()
    lateinit var view: View


    fun increment(){
        model.increment()
        view.updateCount(model.count)
        when{
            model.condition() == 10-> {
                view.showToastCount()
            }
            model.condition() == 15-> {
                view.setColorCount()
            }

        }
    }
    fun attachView(view:View){
        this.view = view
    }

}