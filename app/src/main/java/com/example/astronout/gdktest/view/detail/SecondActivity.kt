package com.example.astronout.gdktest.view.detail

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.example.astronout.gdktest.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(), SecondContract.View {

    var presenter: SecondContract.Presenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        presenter = SecondPresenter()
        presenter?.takeView(this)

        btn_hasil.setOnClickListener{
            val txtSatu = angka1.text.toString().toInt()
            val txtDua = angka2.text.toString().toInt()
            presenter?.hitung(txtSatu, txtDua)
        }
    }

    override fun showHasil(hasil: Int?) {
        text_hasil.text = hasil.toString()
    }

    override fun showProgress() {

    }

    override fun hideProgress() {

    }

    override fun showError(error: String?) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter?.dropView()
    }

}
