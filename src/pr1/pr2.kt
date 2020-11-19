package pr1

import java.lang.Exception

// Выведите все
//элементы массива в порядке возрастания номеров.

fun main(){

    // Объявляем массив чисел
    var allStr: String = ""

    while (true){
        print("Заполните массив в формате номер(0-9):значение (для выхода !) - ")
        var str = readLine()
        val exp = (Regex("([!]|([0-9]):([1-9]+))\$"))

        if (exp.matches(str.toString()) == true) {
            // Выход из цикла
            if (str == "!")
                break

            allStr += str + " "
        }
    }

    myFunc(allStr.dropLast(1))
}

// перебрать все символы и обработать for
fun myFunc(str: String) {
    val splittedStr = str.split(" ")
    val items = IntArray(10) // Объявляем массив чисел

    for (item in splittedStr) {
        var Index: Int = 0
        var lastCh: Int? = null

        for (ch in item) {
            val its = ch.toInt() - '0'.toInt()

            // Если равно разделителю
            if (ch == ':') {
                Index = lastCh!!

                continue
            }

            if (lastCh != null)  {
                // 25 = 0 * 10 + 2 = 2 * 10 + 5 = 25
                items[Index] = (items[Index] * 10) + its
            }

            lastCh = its
        }
    }

    for ((index, item) in items.withIndex())
        println("$index - $item")
}
