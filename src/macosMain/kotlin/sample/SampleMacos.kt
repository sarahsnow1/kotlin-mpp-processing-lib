package com.processing

actual class Processing {
    actual fun version() = 7
}

actual object ProcessingPlatform {
    actual val name: String = "Native"
}