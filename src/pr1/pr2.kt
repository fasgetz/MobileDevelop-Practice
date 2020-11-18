package pr1

// ввод с :

fun main(){

    // Объявляем массив чисел
    var items = IntArray(10)

    while (true){

        print("Введите число 1..10 для элемента массива: ")
        // Вводим число 1..10 для номера элемента массива
        val numberElement = InputNumber()

        // Если не ввели соответствующее число, то выйти из цикла
        if (numberElement !in 1..10){
            println(numberElement)
            continue
        }


        print("Введите число которое присвоится элементу массива $numberElement: ")
        // Вводим число, которое внесем в массив
        val arrayNumb = InputNumber()

        // Если не ввели соответствующее число, то выйти из цикла
        if (arrayNumb == null)
            continue

        // Далее присваиваем в элемент массива
        items[numberElement!! - 1] = arrayNumb

        // Выход из цикла
        if (arrayNumb == 0)
            break

    }

    for (n in items)
        println("$n")



}

// Функция ввода числа
fun InputNumber(): Int? {

    var number = readLine()
    var res = number?.toIntOrNull()

    if (res != null)
        return res


    println("Введите число!")
    return null

}
