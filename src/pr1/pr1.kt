package pr1

fun main(){

    print("Введите число: ")
    var number = readLine()
    var res = number?.toIntOrNull()

    if (res != null)
        println(SumNumbers(res))
    else
        println("Вы не ввели число")
}


// определение функции hello
fun SumNumbers(number: Int) : Int {

    var sum :Int = 0
    var numb: Int = number

    while (numb > 0){

        // Получаем последнюю цифру числа
        val n = numb % 10

        // Если число четное, то суммируем
        if (EvenNumber(n) == true)
            sum += n

        numb = numb /10
    }

    return sum;
}

// Четность числа
fun EvenNumber (number: Int) : Boolean
{
    if (number % 2 == 0)
        return true

    return false
}