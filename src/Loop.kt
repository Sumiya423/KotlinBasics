import java.util.*

fun  main(){

    for(i in 1..10){ //inclue 1..10
        println(i)
    }

    for (j in 10 downTo 1){
        println(j)
    }



    val read = Scanner(System.`in`)
    val a=read.nextInt()
    for(i in 1 until a){ //10 k bad diye
        println(i)
    }



    for(i in 1 until a step 2){ //10 k bad diye 2 ghor por por barbe
        println(i)
    }

    for(i in a downTo  1 step 2){ //1 k bad diye 2 ghor por por kombe
        println(i)
    }
}