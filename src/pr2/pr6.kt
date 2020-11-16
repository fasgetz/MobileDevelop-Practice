package pr2

// Объявляем массив чисел
var items = IntArray(10)

fun main(){



    FunctionM(action(5,5), action(1, 220))

    for (n in items)
        println("$n")
}


fun action (n1: Int, n2: Int) {


    // Далее присваиваем в элемент массива
    items[n1!! - 1] = n2

    println("Присвоено")


}


fun FunctionM(vararg numbers: Unit) {

}