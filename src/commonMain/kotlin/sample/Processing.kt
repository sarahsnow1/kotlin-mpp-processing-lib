package com.processing

expect class Processing() {
    fun version(): Int
}

expect object ProcessingPlatform {
    val name: String
}

fun hello(): String = "Hello from ${ProcessingPlatform.name}"