package pr6

// Создайте функцию, которая по данным функциям с параметром лю-
//бого типа и результатами типа Int возвращает новую функцию – сум-
//му данных (количество исходных функций – любое).

fun main(){
    println("test")
    var nums: MutableList<Int> = mutableListOf<Int>()

    nums.add(8)
    nums.add(2235)
    nums.add(235)
    nums.add(555)
    nums.add(511)

    var func = SumResults<Int>(nums)

    var abs = func()

    println(abs)
}

fun <T> SumResults(vararg fs: MutableList<Int>): () -> Int? =
        {  ->
            fs.sumBy { it.sum() }
        }