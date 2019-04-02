package com.processing

actual class Processing {
    actual fun version() = 42
}

actual object ProcessingPlatform {
    actual val name: String = "JVM"
}