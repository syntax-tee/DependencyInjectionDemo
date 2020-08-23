package com.example.dependencyinjectiondemo

class SingleStepCounter: Counter {

    private var count: Int = 0

    override fun getCount(): Int {
        return  count;
    }

    override fun increment() {
        count++
    }

    override fun decrement() {
        count--
    }

}