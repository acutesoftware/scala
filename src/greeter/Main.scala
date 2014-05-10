package greeter

object Main extends App {

	println("hi there - these are random test Scala functions")
    val x = 1                                       //> x  : Int = 1
	def increase(i: Int) = i + 1                    //> increase: (i: Int)Int
	increase(x)                                     //> res0: Int = 2
	val l = List(22,33,44,55,67)                    //> l  : List[Int] = List(22, 33, 44, 55, 67)
	print(x)
	
	
}