package com.memo.dialog

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.fragment.app.FixDialogFragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.LifecycleObserver

/**
 * title:BaseDialog
 * describe:创建Dialog继承BaseDialog，进行配置
 *
 * @author memo
 * @date 2020-11-23 11:25 AM
 * @email zhou_android@163.com
 *
 * Talk is cheap, Show me the code.
 */
abstract class BaseDialog : FixDialogFragment(), LifecycleObserver {

    protected var mRootView: View? = null

    /*** 绑定布局 ***/
    abstract fun bindLayout(): Int

    /*** 弹窗样式 ***/
    abstract fun bindAnimStyle(): Int

    /*** Dialog配置 ***/
    abstract fun bindDialog(dialog: Dialog)

    /*** 窗体配置 ***/
    abstract fun bindParams(attributes: WindowManager.LayoutParams)

    /*** 配置布局数据 ***/
    abstract fun bindView(root: View)

    /*** Fragment TAG ***/
    open fun bindTag(): String = this::class.java.simpleName

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(bindLayout(), container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mRootView = view
        bindView(view)
    }

    override fun onStart() {
        super.onStart()

        dialog?.apply {
            setCancelable(false)
            setCanceledOnTouchOutside(false)
            bindDialog(this)
        }

        dialog?.window?.apply {
            setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            setWindowAnimations(bindAnimStyle())

            val params = attributes
            params.dimAmount = 0.3f
            bindParams(params)
            attributes = params
        }
    }

    fun show(manager: FragmentManager) {
        super.show(manager, bindTag())
    }

}
