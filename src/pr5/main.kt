package pr5


import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream


// База данных студентов группы. Поля: фамилия, имя, отчество, пол, возраст.
// Реализуйте с использованием ООП простейшую консольную базу данных
//(без красивого интерфейса) в соответствии со своим вариантом. Функции:
//
//добавление, изменение, удаление, сортировка, поиск, вывод на экран содержимого.

var Persons: MutableList<Student> = mutableListOf<Student>()

fun main(){
    StartProgram()

}

fun StartProgram() {
    var input: Char

    // Меню
    do  {
        WriteMenu() // Вызываем отрисовку меню

        print("Выберите действие: ")
        input = readLine()!![0]
        when(input){
            '1' -> {
                AddStudent()
            }
            '3' -> println("функция редактирования")
            '2' -> DeleteStudent()
            '4' -> Sorting()
            '5' -> Search()
            '6' -> WriteStudents()
            '7' -> println("Количество студентов ${Persons.count()}")
            '8' -> Serialize()
            '9' -> Deserialize()
            '!' -> println("Завершение программы")
            else -> println("неопределенное значение")
        }


    } while (input != '!')
}

fun WriteMenu() {
    println("--- Меню ---")
    println("1. Добавить студента")
    println("2. Удалить студента")
    println("3. Редактирование студента")
    println("4. Сортировать")
    println("5. Поиск")
    println("6. Вывод студентов")
    println("7. Количество студентов")
    println("8. Сохранить")
    println("9. Загрузить")
    println("! - завершение программы\n\n")

}


fun DeleteStudent() {
    var input: Char

    // Меню
    do  {
        WriteDeleteStudent() // Вызываем отрисовку меню

        print("Выберите по какому полю удалять: ")
        input = readLine()!![0]

        if (input == '!')
            break

        print("Введите значение: ")
        var value = readLine()

        var findPersons : MutableList<Student> = mutableListOf<Student>()

        when(input) {
            '1' -> {

                findPersons = Persons.takeWhile { it.Name == value.toString() }.toMutableList()


            }
            '2' -> {
                findPersons = Persons.takeWhile { it.Family == value.toString() }.toMutableList()
            }
            '3' -> {
                findPersons = Persons.takeWhile { it.LastName == value.toString() }.toMutableList()
            }
            '!' -> println("Выход в главное меню")
            else -> println("неопределенное значение")
        }

        if (findPersons.count() != 0){
            println("${findPersons.count()} студентов успешно удалены!")
            for (person in findPersons)
                println(person.infoStudent)
            Persons.removeAll(findPersons.toList())
        }
        else {
            println("Никто не найден по значению $value")
        }


    } while (input != '!')
}

fun WriteDeleteStudent() {
    println("--- Удаление ---")
    println("1. По имени")
    println("2. По фамилии")
    println("3. По отчеству")
    println("! - выход")
}

fun Search() {
    var input: Char

    // Меню
    do  {
        WriteSearch() // Вызываем отрисовку меню

        print("Выберите по какому полю искать: ")
        input = readLine()!![0]

        if (input == '!')
            break

        print("Введите значение: ")
        var value = readLine()

        var findPersons : MutableList<Student> = mutableListOf<Student>()

        when(input) {
            '1' -> {
                findPersons = Persons.takeWhile { it.Name == value.toString() }.toMutableList()
            }
            '2' -> {
                findPersons = Persons.takeWhile { it.Family == value.toString() }.toMutableList()
            }
            '3' -> {
                findPersons = Persons.takeWhile { it.LastName == value.toString() }.toMutableList()
            }
            '!' -> println("Выход в главное меню")
            else -> println("неопределенное значение")
        }

        if (findPersons.count() != 0){
            for (person in findPersons)
                println(person.infoStudent)
        }
        else {
            println("Никто не найден по значению $value")
        }


    } while (input != '!')
}

fun WriteSearch() {
    println("--- Поиск ---")
    println("1. По имени")
    println("2. По фамилии")
    println("3. По отчеству")
    println("! - выход")
}

fun AddStudent() {

    try{
        print("Введите имя студента: ")
        var Name: String? = readLine()

        print("Введите фамилию студента: ")
        var Family: String? = readLine()

        print("Введите отчество студента: ")
        var LastName: String? = readLine()

        print("Введите возраст студента: ")
        var Age = readLine()

        print("Введите пол студента (М/Ж): ")

        val Gender = readLine()!![0]


        var student = Student(Family.toString(), Name.toString(), LastName.toString(), Age?.toInt()!!, Gender)

        Persons.add(student)
        println("${student.infoStudent} добавлен в коллекцию")
    }
    catch (ex: java.lang.Exception) {
        println(ex.message)
    }


}

fun WriteStudents() {
    if (Persons.count() != 0) {
        for (student in Persons) {
            println(student.infoStudent)
        }
    }
    else {
        println("Студентов в списке еще нет!")
    }

}

fun Sorting() {

    var input: Char

    // Меню
    do  {
        WriteSortingFunctions() // Вызываем отрисовку меню

        print("Выберите по какому полю сортировать: ")
        input = readLine()!![0]
        when(input) {
            '1' -> {
                Persons.sortBy { it.Name }
            }
            '2' -> {
                Persons.sortBy { it.Family }
            }
            '3' -> {
                Persons.sortBy { it.LastName }
            }
            '4' -> {
                Persons.sortBy { it.Age }
            }
            '5' -> {
                Persons.sortBy { it.Gender }
            }
            '!' -> println("Выход в главное меню")
            else -> println("неопределенное значение")
        }


    } while (input != '!')


}

fun WriteSortingFunctions() {
    println("--- Сортировка ---")
    println("1. По имени")
    println("2. По фамилии")
    println("3. По отчеству")
    println("4. По возрасту")
    println("5. По гендеру")
    println("! - выход")
}

// Функция сериализации коллекции Persons
fun Serialize() {
    try {
        ObjectOutputStream(FileOutputStream("students.dat")).use { oos ->

            oos.writeObject(Persons)
            println("${Persons.count()} успешно сохранены в файле students.dat!")
        }
    } catch (ex: Exception) {
        println(ex.message)
    }
}


// Функция десериализации коллекции Persons
fun Deserialize() {
    try {
        ObjectInputStream(FileInputStream("students.dat")).use { ois ->

            Persons = ois.readObject() as MutableList<Student>
            println("${Persons.count()} успешно считаны из файла students.dat!")
            for (item in Persons)
                println(item.infoStudent)
        }
    } catch (ex: java.lang.Exception) {
        println(ex.message)
    }
}


