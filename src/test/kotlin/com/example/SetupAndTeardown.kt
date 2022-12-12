package com.example

import com.thoughtworks.gauge.BeforeScenario

class SetupAndTeardown {
    @BeforeScenario
    fun beforeScenario() {
        println("シナリオの実行前に1度実行されます")
    }

    @BeforeScenario(tags = ["sample1"])
    fun beforeScenarioSample1() {
        println("タグ sample1 が付いたシナリオの実行前に1度実行されます")
    }
}
