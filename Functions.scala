

object Functions extends App{
  
   def getSum2(a:Int = 10 , b:Int = 20) : Int = {
     a + b
   }
   
   println(getSum2()) // prints 30
   println(getSum2(50)) // prints 70
   println(getSum2(40,50)) // prints 90
   println(getSum2(b = 70))// prints 80
   
   def sayHi(){
     println("Hi")
   }
  
   sayHi
   
   //Defining a function which receives a variable number of arguments
   def getSum3(a : Int*): Int = {
     var sum = 0
     for(i <- a){
       sum +=i
     }
     sum
   }
   
   println("getSum3(2,2,2,3,5,6,8,8) = "+getSum3(2,2,2,3,5,6,8,8))
   println("getSum3() = "+getSum3())
   println("getSum3(2,2) = "+getSum3(2,2))
   
   //recursion functions
   def factorial(num:BigInt) :BigInt = {
     if (num <= 1 ) 
       1
     else
       num * factorial(num -1)
   }
   
   println(factorial(4))
   
   import scala.math._
   
   var myLogFunc = log10 _
   
   List(1000.0,10000.0,100000.0).map { myLogFunc }.foreach { println }
   
  def myMethod(lang : String) ={
    lang match {
      case "English" => (x: String) =>  println("Hello "+x)
      case "Hindi" => (x: String) => println("Namaste "+x)
    }
  }
  var englishMethod = myMethod("English")
  englishMethod("Sanjay")
  
  var hindiMethod = myMethod("Hindi")
  hindiMethod("Shinelin")
}