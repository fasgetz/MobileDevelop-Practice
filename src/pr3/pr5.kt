package pr3

/*

С клавиатуры вводится информация о студентах: фамилия, имя, оцен-
ки. Выведите на экран информацию о трех лучших студентах по сред-
нему баллу. В случае, если у нескольких студентов средний балл сов-
падает, то выведите большее число студентов (пока не будут выведе-
ны все студенты или не будут полностью исчерпаны студенты с тремя

лучшими баллами). Вывод надо осуществлять в порядке убывания
среднего балла, а для одинаковых средних баллов – в алфавитном
порядке по фамилии и имени.

 */

fun main(){

    var person1 = Person("Radyukevich", "Andrew", listOf(5, 3, 3, 4))
    var person2 = Person("Ivanov", "Sidr", listOf(5, 2, 5, 3))
    var person3 = Person("Sidorov", "Petr", listOf(2, 3, 3, 3))
    var person4 = Person("Ivanishenko", "Oleg", listOf(5, 5, 5, 4, 2, 3))
    var person5 = Person("Eremeev", "Ivan", listOf(5, 3, 3))
    var person6 = Person("Petrov", "Ivan", listOf(2, 4, 3, 3))
    var person7 = Person("Malafeev", "Ilya", listOf(5, 5, 3, 3, 4))
    var person8 = Person("Kochetov", "Test", listOf(5, 3, 3, 5, 2, 3, 4))

    var Persons: MutableList<Person> = mutableListOf(person1, person2, person3, person4, person5, person6, person7, person8)




    // Находим последнего ученика в коллекции до какого нужно выводить информацию
    val index = Persons.sortedByDescending { it.AvgMark }.distinctBy { it.AvgMark }.take(3).last()



    for (elem in Persons.sortedWith(compareByDescending<Person> {it.AvgMark}.thenBy { it.Family })) {



        println("${elem.info} - ${elem.AvgMark}")
        if (elem == index){
            break
        }

    }



}

// Сущность ученика
class Person(val Family: String, val Name: String, val Marks: List<Int>) {

    val info: String
        get() = "Name: $Name  Family: $Family"

    val AvgMark: Double
        get() = Marks.average()
}