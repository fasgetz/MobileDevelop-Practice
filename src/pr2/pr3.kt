package pr2

// Функции, созданные в задании No1, модифицируйте таким образом, что-
//бы условие, по которому происходит отбор, можно было передавать как ар-
//гумент (один из аргументов функции должен быть lambda со значением по
//
//умолчанию – условием, что указано было в вашем варианте).


fun main(){




    val my = {number: Int -> SumNumbers(number) }

    Lambda(24, my)

}



fun Lambda (number: Int, function: (m: Int) -> Int) {
    val res = function(number)
    // int -> bool


    println(res)
}

