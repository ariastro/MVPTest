package com.example.astronout.gdktest.view.detail

class SecondPresenter: SecondContract.Presenter{

    var view: SecondContract.View? = null

    override fun hitung(angkaSatu : Int?, angkaDua : Int?) {
        if (angkaSatu == null || angkaDua == null){
            view?.showError("Tidak boleh kosong")
        }else {
            val result = angkaSatu + angkaDua
            view?.showHasil(result)
        }
    }

    override fun takeView(View: SecondContract.View) {
        this.view = view
    }

    override fun dropView() {
        this.view = null
    }

}