package data

fun String.lastChar():Char=this.get(length-1)
val String.lastChar:Char
get()=get(length-1)

var count=0;
fun test(){
    count++;
    println("test $count")
}
data class User(val name: String, val age: Int) {
}