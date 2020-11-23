package com.memo.basedialog

import android.app.Dialog
import android.view.Gravity
import android.view.View
import android.view.WindowManager
import com.memo.dialog.BaseDialog
import kotlinx.android.synthetic.main.bottom_dialog.view.*

/**
 * title:底部弹窗
 * describe:
 *
 * @author memo
 * @date 2020-11-23 2:12 PM
 * @email zhou_android@163.com
 *
 * Talk is cheap, Show me the code.
 */
class BottomDialog : BaseDialog() {

    /*** 绑定布局 ***/
    override fun bindLayout(): Int = R.layout.bottom_dialog

    /*** 弹窗样式 ***/
    override fun bindAnimStyle(): Int = R.style.BottomDialogAnim

    /*** Dialog配置 ***/
    override fun bindDialog(dialog: Dialog) {}

    /*** 窗体配置 ***/
    override fun bindParams(attributes: WindowManager.LayoutParams) {
        attributes.width = WindowManager.LayoutParams.MATCH_PARENT
        attributes.gravity = Gravity.BOTTOM
    }

    /*** 配置布局数据 ***/
    override fun bindView(root: View) {
        root.mTvCancel.setOnClickListener { dismiss() }
    }
}