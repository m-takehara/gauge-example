package com.example

import com.thoughtworks.gauge.Step

class FileReadingStep {
    @Step("<str>をprintしてみる")
    fun printString(str: String) {
        println("str: $str")
    }
}
