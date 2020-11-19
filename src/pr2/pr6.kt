package pr2

// Создайте функцию, которая по данным функциям с параметром ти-
//па Int и результатами типа Int возвращает новую функцию – сумму
// данных (количество исходных функций – любое).



fun test (Numb: Int = 5): Int {
    return Numb
}

fun sum(vararg fs: (Int) -> Int): (Int) -> Int? =
        { arg ->
            fs.map { it(arg) }.sum()
        }


fun main(){

    var abs = sum(::test, ::test)
    //var abs = FuncM()

    //var abg = abs(5)
    //FunctionM(action(5,5), action(1, 220))


}




