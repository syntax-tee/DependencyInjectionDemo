package com.example.dependencyinjectiondemo

class ViewModel(private  val counter: Counter){


    var countUpdateCallBack: ((Int) -> Unit)? = null
    set(value) {
        field = value
        value?.invoke(counter.getCount())
    }

    fun addClicked(){
        counter.increment()
        countUpdateCallBack?.invoke(counter.getCount())
    }

    fun subractClick(){
        counter.decrement()
        countUpdateCallBack?.invoke(counter.getCount())

    }
}