import java.util.*

fun main(){


    val read = Scanner(System.`in`)

    //check vowel or con
    println("Enter a character:")
    val ch=read.next().single()

    val res= when(ch){
        'a'->"vowel"
        'e'->"vowel"
        'i'->"vowel"
        'o'->"vowel"
        'u'->"vowel"
        'A'->"vowel"
        'E'->"vowel"
        'I'->"vowel"
        'O'->"vowel"
        'U'->"vowel"

        else-> "Consonant"
    }
    println(res)

    println("Enter a character:")
    val n=read.nextInt()
    when(n){
        in 1..5-> println("between 1 and 5")
        in 10..50-> println("between 10 and 50")
        else-> println("not between")
    }






//    //check odd even

//    println("Enter a number:")
//    val a = read.nextInt()
//    println(if(a%2==0)"$a is even" else "$a is odd")



//    //character
//
//    println("Enter a character:")
//    val ch=read.next().single()
//
//    val result=if(ch in 'a'..'z'){
//        "$ch is small letter"
//    }
//    else if (ch in 'A'..'Z'){
//        "$ch is capital letter"
//    }
//    else{
//        "$ch is not a small letter or a capital letter"
//    }
//    println(result)

}