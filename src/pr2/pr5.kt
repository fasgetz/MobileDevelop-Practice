package pr2

// Объявляем массив чисел
var array = IntArray(10)

fun main(){



    KeyValuePairs(mapOf(1 to 5, 5 to 5))

    for (item in array)
        println(item)

}


fun KeyValuePairs (keyValues: Map<Int, Int>) {
    for (item in keyValues) {
        array[item.key] = item.value
    }
}


