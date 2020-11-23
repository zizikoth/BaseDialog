package com.memo.basedialog

import android.app.Dialog
import android.view.View
import android.view.WindowManager
import com.memo.dialog.BaseDialog

/**
 * title:广告弹窗
 * describe:
 *
 * @author memo
 * @date 2020-11-23 2:19 PM
 * @email zhou_android@163.com
 *
 * Talk is cheap, Show me the code.
 */
class AdDialog : BaseDialog() {
    /*** 绑定布局 ***/
    override fun bindLayout(): Int = R.layout.ad_dialog

    /*** 弹窗样式 ***/
    override fun bindAnimStyle(): Int = R.style.FadeDialogAnim

    /*** Dialog配置 ***/
    override fun bindDialog(dialog: Dialog) {
        dialog.setCancelable(true)
        dialog.setCanceledOnTouchOutside(true)
    }

    /*** 窗体配置 ***/
    override fun bindParams(attributes: WindowManager.LayoutParams) {
        attributes.width = 250.dp2px
        attributes.height = 250.dp2px
    }

    /*** 配置布局数据 ***/
    override fun bindView(root: View) {
    }
}