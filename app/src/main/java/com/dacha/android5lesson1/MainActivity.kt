package com.dacha.android5lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import com.dacha.android5lesson1.Presenter.Presenter
import com.dacha.android5lesson1.View.View
import com.dacha.android5lesson1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() , View {
    var presenter= Presenter()
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClick()
        presenter.attachView(this)
    }
    private fun initClick(){
        with(binding){
            btnPlus.setOnClickListener{
                presenter.increment()
            }
        }
    }

    override fun updateCount(int: Int) {
     binding.tvResult.text = int.toString()
    }

    override fun showToastCount() {
        this.showToast("Поздровляю")
    }

    override fun setColorCount() {
       binding.tvResult.setTextColor(getColor(R.color.purple_200))
    }
}
