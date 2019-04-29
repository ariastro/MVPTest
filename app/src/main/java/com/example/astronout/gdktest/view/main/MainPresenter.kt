package com.example.astronout.gdktest.view.main

class MainPresenter: MainContract.Presenter{

    var view:MainContract.View? = null

    override fun changeName(string : String?) {
        view?.showName(string)
    }

    override fun takeView(View: MainContract.View) {
        this.view = view
    }

    override fun dropView() {
        this.view = null
    }

}