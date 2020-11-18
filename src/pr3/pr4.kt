package pr3

// Побитовое И предпоследней цифры всех чисел

fun main(){

    var res = GetListNumbers("1253 2372 2352595 333")


    var result = res.first(); // Результат

    for ((index) in res.withIndex()){

        // Если не конец цикла, то побитовое сложение
        if (res.count() - 1 > index) {
            val sum = res[index] and res[index + 1]

            result = result and sum;

        }

    }

    //res.fold()
    //reduce fold


    println(result)

}


fun GetListNumbers(inpStr: String) : List<Int> {
    val resList = mutableListOf<Int>()
    inpStr.split(" ").forEach {
        // Добавляем предпоследний символ в список
        resList.add(it[it.length - 2].toInt() - '0'.toInt())
    }
    return resList
}