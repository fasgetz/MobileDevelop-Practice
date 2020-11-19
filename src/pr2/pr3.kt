package pr2

// Функции, созданные в задании No1, модифицируйте таким образом, что-
//бы условие, по которому происходит отбор, можно было передавать как ар-
//гумент (один из аргументов функции должен быть lambda со значением по
//
//умолчанию – условием, что указано было в вашем варианте).

var Sum: Int = 0

fun main(){

    print("Введите число: ")
    var number = readLine()
    var res = number?.toIntOrNull()

    if (res != null) {
        println(SumNotRec(res))

        println(SumRec(res))
    }

    else
        println("Вы не ввели число")

}



fun SumNotRec(i: Int, predicate: (Int) -> Boolean = {o: Int -> o % 2 == 0}): Int {

    var sum :Int = 0
    var numb: Int = i

    while (numb > 0){

        // Получаем последнюю цифру числа
        val n = numb % 10

        // Если число четное, то суммируем
        if (predicate(n))
            sum += n


        numb = numb /10


    }
    return sum
}



tailrec fun SumRec(number: Int, predicate: (Int) -> Boolean = {o: Int -> o % 2 == 0}): Int {

    if (number == 0){
        return 0
    }



    val n = number % 10

    // Если число четное, то суммируем
    if (predicate(number))
        Sum += n


    SumRec(number / 10)

    return Sum
}

