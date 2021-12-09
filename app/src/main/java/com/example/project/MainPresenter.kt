package com.example.project


class MainPresenter(
    private val view: MainView,
    private val model: CountersModel = CountersModel()
) {

    //Архитектурная ошибка. В качестве практического задания - исправить
    fun counterClickFirst() {

        val nextValue = model.next(0)
        view.setButtonTextFirst(nextValue.toString())
    }

    fun counterClickSecond() {

        val nextValue1 = model.next(1)
        view.setButtonTextSecond(nextValue1.toString())

    }

    fun counterClickThird() {

        val nextValue2 = model.next(2)
        view.setButtonTextThird(nextValue2.toString())

    }
}
