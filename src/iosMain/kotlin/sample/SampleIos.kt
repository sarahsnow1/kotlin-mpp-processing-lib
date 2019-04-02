package com.processing

actual class Processing {
    actual fun version() = 8
}

actual object ProcessingPlatform {
    actual val name: String = "iOS"
}