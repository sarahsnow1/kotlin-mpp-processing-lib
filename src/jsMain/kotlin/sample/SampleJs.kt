package com.processing

actual class Processing {
    actual fun version() = 12
}

actual object ProcessingPlatform {
    actual val name: String = "JS"
}