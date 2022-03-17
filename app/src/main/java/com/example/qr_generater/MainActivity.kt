package com.example.qr_generater

import android.os.Bundle
import androidmads.library.qrgenearator.QRGContents
import androidmads.library.qrgenearator.QRGEncoder
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        QRGSaver
        btn_qr.setOnClickListener {
            val text = vf_qr.text.toString()
            val qrgEncoder = QRGEncoder(text, null, QRGContents.Type.TEXT, 800)
            img_qr.setImageBitmap(qrgEncoder.bitmap)

        }
    }
}