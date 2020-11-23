package com.memo.basedialog

import android.app.Dialog
import android.view.Gravity
import android.view.View
import android.view.WindowManager
import com.memo.dialog.BaseDialog
import kotlinx.android.synthetic.main.dialog_alert.view.*

/**
 * title:文字提示弹窗
 * describe:
 *
 * @author memo
 * @date 2020-11-23 11:54 AM
 * @email zhou_android@163.com
 *
 * Talk is cheap, Show me the code.
 */
class AlertDialog(
    private val title: String = "提示", private val message: String = "内容",
    private val positive: String = "确定", private val negative: String = "取消"
) : BaseDialog() {

    private var onPositive: () -> Unit = {}
    private var onNegative: () -> Unit = {}

    /*** 绑定布局 ***/
    override fun bindLayout(): Int = R.layout.dialog_alert

    /*** 弹窗样式 ***/
    override fun bindAnimStyle(): Int = R.style.FadeDialogAnim

    /*** Dialog配置 ***/
    override fun bindDialog(dialog: Dialog) {}

    /*** 窗体配置 ***/
    override fun bindParams(attributes: WindowManager.LayoutParams) {
        attributes.gravity = Gravity.CENTER
        attributes.width = 280.dp2px
    }

    /*** 配置布局数据 ***/
    override fun bindView(root: View) {
        root.mTvTitle.text = title
        root.mTvMessage.text = message
        root.mTvPositive.text = positive
        root.mTvNegative.text = negative
        root.mTvPositive.setOnClickListener {
            onPositive.invoke()
            dismiss()
        }
        root.mTvNegative.setOnClickListener {
            onNegative.invoke()
            dismiss()
        }
    }


    /**
     * 设置点击事件
     * @param onPositive 确定点击
     * @param onNegative 取消点击
     */
    fun setOnDialogClickListener(onPositive: () -> Unit, onNegative: () -> Unit) {
        this.onPositive = onPositive
        this.onNegative = onNegative
    }


}