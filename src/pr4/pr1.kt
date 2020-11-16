package pr4

// Массив 3х типов integer | char | real

// nameArray : array [1..10] of real;


fun main()
{
    var input : String?
    do {
        println("\nМассив Pascal: ")
        input = readLine()
        if (input != null) {
            println(arr(input))
        } else {
            println("Неверный ввод")
        }

    } while (true)
}


// \s - любой символ кроме пробельного
// \t табуляция
// [A-Za-z\d_] - любые символы в верхнем и нижнем регистре с цифрами
// := присваивание в паскале
// array обязательное для объявления массива
// в квадратнымх скобках перечисляется нумерация массива паскаля
// обязательное слово of
// один из трех типов паскаля integer | char | real

fun arr(input: String) : Boolean
{
    val exp = (Regex("[\\s\\t]*([A-Za-z\\d_]+\\s*:)\\s+(\\barray)\\s*(\\[\\d+.{2}\\d+\\])\\s+(\\bof)\\s+(\\binteger|\\bchar|\\breal);"))
    return exp.matches(input)
}