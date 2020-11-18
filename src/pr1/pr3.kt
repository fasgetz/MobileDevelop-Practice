package pr1

fun main(){
    val char = "У лукоморья дуб зеленый, златая цеьп на дубе том"
            .split(" ") // Разбить по разделителю пробела
            .sortedByDescending { it.length } // Отсортировать по длине
            .first { it.count()% 2 == 0 } // Выбрать первый символ с нечетным количеством символов в слове
            .first() // Первый символ в CHAR

    println("Символ: $char")


    println(FirstCharOnWor("У лукоморья дуб зеленый, златая цеьп на дубе том"))
}

// исправить


fun FirstCharOnWor(A: String):Char
{
    var count = 1
    var count2 = 0
    var fst: Char? = null
    var symbols: Char? = null

    var i = 0
    var a: Char? = null
    do
    {
        a = A[i]
        if (a != ' ') {
            if (symbols == ' ')
            {
                symbols = a
            }
            count2++
        }
        else if (count2 != 0)
        {
            if (((count < count2) || (count == 1)) && (count2 % 2 == 0))
            {
                fst = symbols
                count = count2
            }

            count2 = 0
            symbols = ' '

        }
        i++
    }
    while (A.length >= i+1)

    if(count2 != 0)
    {
        if (((count < count2) || (count == 1)) && (count2 % 2 == 0))
        {
            fst = symbols
        }
    }

    return if (fst != ' ') {
        fst!!
    }
    else
    {
        ' '
    }
}