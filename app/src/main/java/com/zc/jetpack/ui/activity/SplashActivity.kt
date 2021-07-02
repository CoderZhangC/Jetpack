package com.zc.jetpack.ui.activity

import android.content.Intent
import android.os.Bundle
import com.zc.jetpack.MainActivity
import com.zc.jetpack.R
import com.zs.base_library.base.BaseVmActivity
import io.reactivex.Flowable
import io.reactivex.disposables.Disposable
import java.util.concurrent.TimeUnit

class SplashActivity : BaseVmActivity() {

    private var disposable: Disposable? = null

    override fun getLayoutId(): Int = R.layout.activity_splash

    override fun init(savedInstanceState: Bundle?) {
        disposable = Flowable.timer(3, TimeUnit.SECONDS).subscribe {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        disposable?.dispose()
    }
}