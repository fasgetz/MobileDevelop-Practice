package pr3

fun main(){

    println(Fib(8))


}

// Число Фибоначи = сумме двух предыдущих чисел
fun Fib(number: Int) : Int {
    var l = 1
    var lm1 = 1


    for (i in 3..number) {
        val tmp = l
        l = l + lm1
        lm1 = tmp
    }

    //generate sequence - zip

    return l
}