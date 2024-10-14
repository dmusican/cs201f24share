fun main() {
    // val myMap = mutableMapOf("one" to 1)
    val myMap = mutableMapOf<String, Int>()
    myMap.put("one", 1)
    myMap["two"] = 2
    print(myMap.get("one")]
    print(myMap["two"])
    print(myMap["three"])
}
