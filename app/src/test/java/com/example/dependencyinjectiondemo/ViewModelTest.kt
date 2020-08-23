package com.example.dependencyinjectiondemo

import org.junit.Before
import org.junit.Test

class ViewModelTest {

    private lateinit var  viewModel: ViewModel

    @Before
    fun setUp(){
        viewModel = ViewModel(FakeCounter())
    }

    @Test
    fun countUpdatedCallback(){
        var lastRmmittedCount = 0
        viewModel.countUpdateCallBack = {count -> lastRmmittedCount = count}
        viewModel.addClicked()

            assert(lastRmmittedCount == 1)

    }
}

class FakeCounter:Counter{

    private  var count = 0

    override fun getCount(): Int {
        return  count
    }

    override fun increment() {
        count++
    }

    override fun decrement() {
        count--
    }

}