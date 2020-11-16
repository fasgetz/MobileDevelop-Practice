package pr5


import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream


// База данных студентов группы. Поля: фамилия, имя, отчество, пол, возраст.

fun main(){
    var person = Student("Radyukevich", "Andrew", "Sergeevich", 21, 'М')



    Deserialize()


}



fun Deserialize() {
    try {
        ObjectInputStream(FileInputStream("person.dat")).use { ois ->
            val p = ois.readObject() as Student
            println(p.infoStudent)
        }
    } catch (ex: java.lang.Exception) {
        println(ex.message)
    }
}

