package com.quickbirdstudios.opencvexample

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.quickbirdstudios.opencvexample.databinding.ActivityMainBinding
import org.opencv.android.OpenCVLoader

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        Log.d(OpenCVTag, "Version : ${OpenCVLoader.OPENCV_VERSION}")
        if(!OpenCVLoader.initDebug()) {
            binding.tvStatus.text = "Unable to load OpenCV"
            return
        }

        binding.tvStatus.text = "OpenCV Loaded Successfully!"
    }

    companion object {
        const val OpenCVTag = "OpenCV"
    }
}