package com.example.astronout.gdktest.view.main

import com.example.astronout.gdktest.view.base.BasePresenter
import com.example.astronout.gdktest.view.base.BaseView

interface MainContract {
    interface View : BaseView<Presenter>{
        fun showName(name : String?)
    }

    interface Presenter : BasePresenter<View>{
        fun changeName(string : String?)
    }

}