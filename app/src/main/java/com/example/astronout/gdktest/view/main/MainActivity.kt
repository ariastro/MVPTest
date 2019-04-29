package com.example.astronout.gdktest.view.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.astronout.gdktest.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainContract.View{

    val TAG = "MainActivity"

    var presenter: MainContract.Presenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter()
        presenter?.takeView(this)

        btn_proses.setOnClickListener{
            presenter?.changeName("Ari")
        }

    }

    override fun showName(name: String?) {
        lbl_name.text = name
    }

    override fun showProgress() {

    }

    override fun hideProgress() {

    }

}
