fun main(){
    val name = arrayOf("ami","tmi","she")

    /*for(i in name){
        println(i)
    }*/

    println(name.size)
    name.set(1,"akhi")
    for(i in name){
        println(i)
    }

    val info= arrayListOf("Sumiya",23,'A',2.3,true)

    for (i in info){
        println(i)
    }

}