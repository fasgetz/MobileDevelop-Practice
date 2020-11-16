package pr2

fun main(){




    val my = {number: Int -> SumNumbers(number) }

    Lambda(24, my)

}



fun Lambda (number: Int,function: (m: Int) -> Int) {
    val res = function(number)
    println(res)
}

