//question 1
fun main(){
    colors("black","blue","yellow","red")
    capitalcities(arrayOf("harare","mumbai", "dodoma","jakarta"))
    num(arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62))
    var t=mynames("anena","lilian","brenda")
println(t.contentToString())
}
fun colors(e:String, f:String, g:String, h:String){
    var output= arrayOf(e,f,g,h)
    println(output.contentToString())
}
//question 2
fun capitalcities(cities:Array<String>){
    cities.forEach{t ->
        println(t.capitalize())
    }

}
//question 3
fun num(numbers:Array<Int>){
    var sum= numbers[1]+numbers[4]
    println(sum)
    var index= numbers.indexOf(158)
    println(index)
    var sorted= (numbers.sortedArray())
    println(sorted.contentToString())
}
//question 4
fun mynames(a:String, b:String, c:String):Array<String>{
    var p =arrayOf(a,b,c)
    return p
}