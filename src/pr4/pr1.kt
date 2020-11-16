package pr4

// Массив 3х типов integer | char | real

// nameArray : array [1..10] of real;


fun main()
{
    var input : String?
    do {
        println("\nВведите массив Pascal: ")
        input = readLine()
        if (input != null) {
            println(arr(input))
        } else {
            println("Неверный ввод")
        }

    } while (true)
}



fun arr(input: String) : Boolean
{
    val exp = (Regex("[\\s\\t]*([A-Za-z\\d_]+\\s*:)\\s+(\\barray)\\s*(\\[\\d+.{2}\\d+\\])\\s+(\\bof)\\s+(\\binteger|\\bchar|\\breal);"))
    return exp.matches(input)
}