object HigherFunc extends App {

    val add = (x:Int,y:Int) => x+y
    val sub = (x:Int,y:Int) => x-y
    val mul = (x:Int,y:Int) => x*y

  println(add(3,4))

    val f = (op:(Int,Int)=> Int, x: Int, y:Int) => op(x,y)

    println(f(add,3,4))
    println(f(sub,5,4))
    println(f(mul,3,4))

    val finalPrice = (p:Double)=>(vat:Double)=>(s:Double)=> p+p*vat+p*s
    println(finalPrice(100,0.1,0.1))
}