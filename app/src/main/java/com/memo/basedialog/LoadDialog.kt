package com.memo.basedialog

import android.app.Dialog
import android.view.View
import android.view.WindowManager
import com.memo.dialog.BaseDialog

/**
 * title:
 * describe:
 *
 * @author memo
 * @date 2020-11-23 2:25 PM
 * @email zhou_android@163.com
 *
 * Talk is cheap, Show me the code.
 */
class LoadDialog : BaseDialog() {
    /*** 绑定布局 ***/
    override fun bindLayout(): Int = R.layout.load_dialog

    /*** 弹窗样式 ***/
    override fun bindAnimStyle(): Int = R.style.FadeDialogAnim

    /*** Dialog配置 ***/
    override fun bindDialog(dialog: Dialog) {
        dialog.setCancelable(true)
    }

    /*** 窗体配置 ***/
    override fun bindParams(attributes: WindowManager.LayoutParams) {
        attributes.width = 120.dp2px
        attributes.height = 120.dp2px
    }

    /*** 配置布局数据 ***/
    override fun bindView(root: View) {
    }
}