package pr1

// ввод номер:значение
fun arr(input: String) : Boolean
{
    val exp = (Regex("([0-9]+):([1-9]+)\$"))
    return exp.matches(input)
}

fun main(){

    // Объявляем массив чисел
    var items = IntArray(10)

    while (true){

        print("Заполните массив в формате номер(0-9):значение (для выхода !) - ")

        var str = readLine()


        val exp = (Regex("([!]|([0-9]+):([1-9]+))\$"))

        if (exp.matches(str.toString()) == true) {
            println("Регулярка соответствует")
            // Выход из цикла
            if (str == "!")
                break

            val number = str.toString().substring(0, str.toString().indexOf(':'))
            val value = str.toString().substring(str.toString().indexOf(':') + 1)

            items[number.toInt()] = value.toInt()


        }
        else {
            println("Регулярка несоответствует")
        }





    }

    for (n in items)
        println("$n")



}
