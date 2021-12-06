package com.example.project


class MainPresenter(
    private val view: MainView,
    private val model: CountersModel = CountersModel()
) {

    //Архитектурная ошибка. В качестве практического задания - исправить
    fun counterClick0() {

        val nextValue = model.next(0)
        view.setButtonText0(nextValue.toString())
    }

    fun counterClick1() {

        val nextValue1 = model.next(1)
        view.setButtonText1(nextValue1.toString())

    }

    fun counterClick2() {

        val nextValue2 = model.next(2)
        view.setButtonText2(nextValue2.toString())

    }
}
