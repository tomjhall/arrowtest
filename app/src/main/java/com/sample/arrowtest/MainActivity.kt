package com.sample.arrowtest

import android.app.Activity
import android.os.Bundle
import arrow.fx.IO
import arrow.fx.extensions.fx
import arrow.fx.extensions.io.unsafeRun.runBlocking
import arrow.fx.typeclasses.seconds
import arrow.unsafe

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        unsafe {
            runBlocking {
                IO.fx {
                    !sleep(1.seconds)
                }
            }
        }
    }
}
