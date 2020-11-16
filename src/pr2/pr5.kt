package pr2

fun main(){




}

/*
Создайте функцию, которая реализует алгоритм второго задания первой
практической работы, в которую все числа, слова или пары (в зависимости
от варианта) передаются в аргументах функции. Например: f(123,25,222);
f("dfd "dd "ddd"); d (Pair(2,3),Pair(3,5),Pair(4,1)).
 */

fun ss(vararg numbers: Int): () -> Int {
    return {
        var result=0
        for(n in numbers)
            result += n

        result
    }
}