package com.putrabahari.putrabaharilearningandeducation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import www.sanju.motiontoast.MotionToast
import www.sanju.motiontoast.MotionToastStyle

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        MotionToast.darkColorToast(this,
            "Hurray success 😍",
            "Upload Completed successfully!",
            MotionToastStyle.SUCCESS,
            MotionToast.GRAVITY_BOTTOM,
            5000000000000L,
            ResourcesCompat.getFont(this,R.font.googlesans_bold))



    }
}