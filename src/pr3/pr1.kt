package pr3

import pr1.SumNumbers

fun main(){

    print("Введите число: ")
    var number = readLine()
    var res = number?.toIntOrNull()

    if (res != null)
    {
        val abs = res.toString().toCharArray().map { it.getNumericValue() }.filter { it % 2 == 0 }.sum()



        println(abs)
    }
    else
        println("Вы не ввели число")



}

fun Char.getNumericValue(): Int {
    if (this !in '0'..'9') {
        throw NumberFormatException()
    }
    return this.toInt() - '0'.toInt()
}

