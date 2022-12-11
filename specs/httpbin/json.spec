# https://httpbin.org/json から固定の JSON を取得できる

## スライドショーの著者名を取得できる
* URL"https://httpbin.org/json"にGETリクエストを送る
* レスポンスのJSONの"$.slideshow.author"が文字列の"Yours Truly"である

## 各スライドのタイトルを取得できる
* URL"https://httpbin.org/json"にGETリクエストを送る
* レスポンスのJSONの"$.slideshow.slides[0].title"が文字列の"Wake up to WonderWidgets!"である
* レスポンスのJSONの"$.slideshow.slides[1].title"が文字列の"Overview"である
