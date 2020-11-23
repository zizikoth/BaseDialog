package com.memo.basedialog

import android.content.res.Resources

/**
 * title:
 * describe:
 *
 * @author memo
 * @date 2020-11-23 2:01 PM
 * @email zhou_android@163.com
 *
 * Talk is cheap, Show me the code.
 */
val Int.dp2px: Int get() = (Resources.getSystem().displayMetrics.density * this + 0.5f).toInt()