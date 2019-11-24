package com.r4sh33d.animatedcounttextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.animation.AccelerateInterpolator
import com.r4sh33d.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CountEndListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        playButton.setOnClickListener {
            countTextView.run {
                countEndListener(this@MainActivity)
                interpolator(AccelerateInterpolator())
                start()
            }
            countTextView.start()

            countTextView.startWith(0)
            countTextView.endWith(100)
            countTextView.duration(100)
        }
    }

    override fun onCountFinish() {
        Log.d("MainActivity", "onCountFinish")
    }
}
