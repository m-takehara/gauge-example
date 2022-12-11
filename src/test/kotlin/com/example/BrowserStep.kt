package com.example

import com.codeborne.selenide.Condition
import com.codeborne.selenide.Selenide.`$`
import com.codeborne.selenide.Selenide.open
import com.thoughtworks.gauge.Step

class BrowserStep {
    @Step("<url>をブラウザで開く")
    fun openInBrowser(url: String) {
        open(url)
    }

    @Step("タイトル<title>が表示される")
    fun assertTitleIsDisplayed(title: String) {
        `$`("h1").shouldHave(Condition.exactText(title))
    }
}
