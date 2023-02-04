package com.jiangdg.demo

import android.app.ProgressDialog
import android.content.Context

/**
 *  Created by HuangXin on 2023/1/10.
 */
object LoadingHelper {

    var startTime = 0L

    var dialog: ProgressDialog? = null

    fun showLoading(context: Context) {
        dialog = ProgressDialog.show(context, "", "正在加载PDF", true)
    }


    fun hideLoading() {
        dialog?.dismiss()
    }
}