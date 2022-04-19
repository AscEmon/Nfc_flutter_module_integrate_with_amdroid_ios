package com.sslwireless.nfcreader

//import android.app.Application
//import androidx.multidex.MultiDexApplication
//import io.flutter.embedding.engine.FlutterEngine
//import io.flutter.embedding.engine.FlutterEngineCache
//import io.flutter.embedding.engine.dart.DartExecutor
//import io.flutter.plugin.common.MethodChannel




//const val ENGINE_ID = "my_engine_id"
//
//class MyApplication : MultiDexApplication() {
//    var count = 0
//
//    private lateinit var channel: MethodChannel
//
//    override fun onCreate() {
//        super.onCreate()
//        // Create and pre-warm a FlutterEngine.
//
//        val flutterEngine = FlutterEngine(this)
//        flutterEngine
//            .dartExecutor
//            .executeDartEntrypoint(
//                DartExecutor.DartEntrypoint.createDefault()
//            )
//
//        FlutterEngineCache.getInstance().put(ENGINE_ID, flutterEngine)
//
//        channel = MethodChannel(flutterEngine.dartExecutor, "dev.flutter.example/counter")
//
//        channel.setMethodCallHandler { call, _ ->
//            when (call.method) {
//                "incrementCounter" -> {
//                    count++
//                    reportCounter()
//                }
//                "requestCounter" -> {
//                    reportCounter()
//                }
//            }
//        }
//    }
//
//    private fun reportCounter() {
//        channel.invokeMethod("reportCounter", count)
//    }
//}

import androidx.multidex.MultiDexApplication
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.FlutterEngineCache
import io.flutter.embedding.engine.dart.DartExecutor
import io.flutter.plugin.common.MethodChannel

const val ENGINE_ID = "1"

class MyApplication : MultiDexApplication() {
    var count = 0

    private lateinit var channel: MethodChannel

    override fun onCreate() {
        super.onCreate()

        val flutterEngine = FlutterEngine(this)
        flutterEngine
            .dartExecutor
            .executeDartEntrypoint(
                DartExecutor.DartEntrypoint.createDefault()
            )

        FlutterEngineCache.getInstance().put(ENGINE_ID, flutterEngine)

        channel = MethodChannel(flutterEngine.dartExecutor, "dev.flutter.example/counter")

        channel.setMethodCallHandler { call, _ ->
            when (call.method) {
                "incrementCounter" -> {
                    count++
                    reportCounter()
                }
                "requestCounter" -> {
                    reportCounter()
                }
            }
        }
    }

    private fun reportCounter() {
        channel.invokeMethod("reportCounter", count)
    }
}
