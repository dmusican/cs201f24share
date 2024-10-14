fun main() {
    // val myMap = mutableMapOf("one" to 1)
    val myMap = mutableMapOf<String, Int>()
    myMap.put("one", 1)
    myMap["twothousand"] = 2000
    myMap["three"] = 3
    println(myMap.get("one"))
    println(myMap["two"])
    println(myMap["three"])
}
