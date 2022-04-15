package com.sslwireless.nfcreader

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import io.flutter.embedding.android.FlutterActivity


class MainActivity : AppCompatActivity() {
    private lateinit var counterLabel: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        counterLabel = findViewById(R.id.counter_label)

        val button = findViewById<Button>(R.id.launch_button)



        button.setOnClickListener {
            val intent =
                FlutterActivity
              .withNewEngine()
                .initialRoute("/")
                .build(this)
//                FlutterActivity
//                    .withCachedEngine(ENGINE_ID)
//                    .build(this);
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        val app = MyApplication()
        counterLabel.text = "Current count: ${app.count}"
    }
}
