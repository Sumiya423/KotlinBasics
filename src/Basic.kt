import java.util.*

//Function -> fun


fun main(){
    val read = Scanner(System.`in`)

    println("Bite in Android")//\n er kaj kore
    print("with Kotlin")

    //var/val ei duita diye variable declare kore
     var  a:Int
     var b=10
    //diff between var and val
    var c=6
    println("the value of c is  c=$c")
    c=9  // can assign later
    println("the value of c is  c=$c")

    val d=12
    println("the value of c is  d=$d")
    //d=14 // error can't assign


    //user input

    println("enter your name: ")
    //val name= readLine()
    val name = read.nextLine()
    println("enter your age: ")
    //val age:Int= Integer.valueOf(readLine())
    val age=read.nextInt()

    print("my name id $name and age is $age")
}