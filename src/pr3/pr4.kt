package pr3

// Побитовое И предпоследней цифры всех чисел

fun main(){



    var inputStr = "66 77 8525"
    val sumBit = (inputStr.split(" ").map { it[it.length - 2].toInt() - '0'.toInt() }).reduce{item, item2 -> item and item2}


    println(sumBit)


}
