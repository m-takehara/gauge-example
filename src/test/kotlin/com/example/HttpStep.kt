package com.example

import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.result.Result
import com.jayway.jsonpath.Configuration
import com.jayway.jsonpath.JsonPath
import com.thoughtworks.gauge.Step
import com.thoughtworks.gauge.datastore.ScenarioDataStore
import kotlin.test.assertEquals

class HttpStep {
    private val httpResponseKey = "httpResponse"

    @Step("URL<url>にGETリクエストを送る")
    fun executeGet(url: String) {
        val (request, response, result) = url.httpGet().responseString()

        when (result) {
            is Result.Failure -> ScenarioDataStore.put(httpResponseKey, result.getException())
            is Result.Success -> ScenarioDataStore.put(httpResponseKey, result.get())
        }
    }

    @Step("レスポンスのJSONの<jsonPath>が文字列の<expected>である")
    fun assertResponseValueEquals(jsonPath: String, expected: String) {
        val response = ScenarioDataStore.get(httpResponseKey) as String
        val json = Configuration.defaultConfiguration()
            .jsonProvider()
            .parse(response)
        val actual = JsonPath.read<String>(json, jsonPath)
        assertEquals(expected, actual)
    }
}
