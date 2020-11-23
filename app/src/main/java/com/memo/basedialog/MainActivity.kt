package com.memo.basedialog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mAlertDialog = AlertDialog()
    private val mBottomDialog = BottomDialog()
    private val mAdDialog = AdDialog()
    private val mLoadDialog = LoadDialog()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mBtnAlert.setOnClickListener { mAlertDialog.show(supportFragmentManager) }
        mBtnBottom.setOnClickListener { mBottomDialog.show(supportFragmentManager) }
        mBtnAd.setOnClickListener { mAdDialog.show(supportFragmentManager) }
        mBtnLoad.setOnClickListener { mLoadDialog.show(supportFragmentManager) }
    }
}