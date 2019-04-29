package com.example.astronout.gdktest.view.base

interface BasePresenter<T> {
    fun takeView(View: T)
    fun dropView()
}