import java.util.*

fun main(){
    val read = Scanner(System.`in`)
    val a=read.nextInt()
    println(findvalue(a))
}

/*String findValue(int a){

return ""
}*/

fun findvalue(a:Int):String{
    val result=if(a%2==0){
        "$a is even"
    }
    else{
        "$a is odd"
    }

    return result
}