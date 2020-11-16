package pr5

import java.io.Serializable

// Сущность ученика
// Поля: фамилия, имя, отчество, пол, возраст.
class Student(val Family: String, val Name: String, val LastName: String, val Age: Int, val _Gender: Char) : Serializable {

    val infoStudent: String
        get() = "Family: $Family Name: $Name LastName: $LastName - $Age лет, пол $Gender"



    val Gender: Char
        init {
            if ((_Gender == 'М') or (_Gender == 'Ж'))
                Gender = _Gender
            else {
                println("Невозможно присвоить")
                Gender = 'N'
            }
        }

}