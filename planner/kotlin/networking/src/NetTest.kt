import java.net.HttpURLConnection
import java.net.URL

class NetTest(val url: String) {

    fun getURL() {
        URL("https://google.com").readText()
    }

    fun sendGet() {
        val url = URL("http://www.google.com/")

        with(url.openConnection() as HttpURLConnection) {
            requestMethod = "GET"  // optional default is GET

            println("\nSent 'GET' request to URL : $url; Response Code : $responseCode")

            inputStream.bufferedReader().use {
                it.lines().forEach { line ->
                    println(line)
                }
            }
        }
    }
}