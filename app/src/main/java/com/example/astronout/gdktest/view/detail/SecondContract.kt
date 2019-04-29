package com.example.astronout.gdktest.view.detail

import com.example.astronout.gdktest.view.base.BasePresenter
import com.example.astronout.gdktest.view.base.BaseView

interface SecondContract {

    interface View : BaseView<Presenter>{
        fun showHasil(hasil : Int?)
        fun showError(error : String?)
    }

    interface Presenter : BasePresenter<View>{
        fun hitung(angkaSatu : Int?, angkaDua : Int?)
    }

}