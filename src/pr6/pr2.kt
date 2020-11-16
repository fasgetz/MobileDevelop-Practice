package pr6

import java.lang.Exception
import java.util.*

fun main(){
    println("test")

    val test = ListN<Int>()

    test.push(5)
    test.push(6)
    test.push(7)
    test.push(8)


    test.WriteAll()

    test.removeFirst()

    test.WriteAll()

}


class ListN<T> {

    private var root: LinkedList<T>

    constructor() {
        root = LinkedList()
    }

    constructor(c: Collection<T>) {
        root = LinkedList(c)
    }

    fun push(el: T): Boolean = try {
        root.addFirst(el)
        true
    } catch (e: Exception) {
        e.printStackTrace()
        false
    }

    fun removeFirst() : Boolean {
        root.removeFirst()

        return true
    }



    fun WriteAll() {
        for (item in root)
            println(item)
    }

    fun eraseAll () {
        root = LinkedList()
    }



}