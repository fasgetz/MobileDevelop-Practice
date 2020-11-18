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
    val exp = (Regex("(^[_a-zA-Z][a-zA-Z0-9]*\\s*:)\\s*(\\barray)\\s*(\\[\\s*(\\s*(-?\\d+\\.\\.-?\\d+|[_a-zA-Z]+[a-zA-Z0-9])(\\s*([,]\\s*?(-?\\d+\\.\\.-?\\d+\\s*|[_a-zA-Z]+[a-zA-Z0-9]\\s*))*?)\\s*\\]))\\s+(\\bof)\\s+(\\binteger|\\bchar|\\breal|\\b[_a-zA-Z][a-zA-Z0-9]+)\\s*?;\$"))
    return exp.matches(input)
}
// nameArray : array [1..10] of real;
// nameArray : array [1..10] of userTypes;
// test : array [1..10] of real;
// _NameArray : array [ 1..10 , 15..20 , asdf ,fds ] of realgg;
// отрицательные числа, индексы по любому названию, название типа базового может быть любым