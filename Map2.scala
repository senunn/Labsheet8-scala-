object Map2 extends App{
  val l1 = List(1,2,3,4,5,6,7,8)
  val isEven = (i:Int) => i%2 == 0
  println(l1.map(x=>x*2))
  println(l1.map(isEven))
}
