package pr2

import java.awt.List
import java.util.function.Predicate
import kotlin.collections.List as List1

fun main(){



}


fun test(predicate: (String) -> Boolean){
    val char = "Найдите первый символ в первом максимально длинном слове с четным числом символов в строке"
            .split(" ") // Разбить по разделителю пробела
            .sortedByDescending { it.length } // Отсортировать по длине
            .first(predicate)
            //.first { it.count()     % 2 == 1 } // Выбрать первый символ с нечетным количеством символов в слове
            //.first { it.count()     % 2 == 1 } // Выбрать первый символ с нечетным количеством символов в слове
            .first() // Первый символ в CHAR

    println("Символ: $char")
}