

import scala.util.matching.Regex

object PatternMatching extends App{
  
  def matchTest(x:Int):String = x match {
    case 1 => "one"
    case 2 => "one"
    case _ => "many"  
  }
 
  println(matchTest(1))
  
  def matchTest(x:Any):Any = x match {
    case 1 => "one"
    case "two" => 2
    case _ => "many"
    case y:Int => "Scala.Int"
  }
  
  println(matchTest(1))
  println(matchTest("two"))
  println(matchTest("test"))
  
  case class Person(name:String,age:Int)
  
  def caseClassPatternMatching(){
    val alice = new Person("Alice",25)
    val bob = new Person("Bob",32)
    val charlie = new Person("Charlie",32)
    
    for(person <- List(alice,bob,charlie)){
      person match{
        case Person("Alice",25) => println("Hi Alice")
        case Person("Bob",32) => println("Hi Bob")
        case Person(name,age) => println("Age : "+age+" & name : "+name)
      }
    }
  }
  
  caseClassPatternMatching()
  
  def regex(){
    //First pattern
    val pattern = "Scala".r
    val str = "Scalable and cool"
    
    println(pattern findFirstIn str)
    
    //Second pattern
    val pattern2 = new Regex("(S|s)cala")
    val str2 = " Scala Scalable and cool"
    
    println((pattern2 findAllIn str2).mkString(","))
    
    //Third Pattern
    val pattern3 = "(S|s)cala".r
    val str3 = " Scala Scalable and cool"
    
    println(pattern3 replaceFirstIn (str3,"Java"))
    
    //Fourth Pattern
    val pattern4 = new Regex("abl[ae]\\d+")
    val str4 = " abla4w is able2 and cool"
    
    println((pattern4 findAllIn str4).mkString(","))
  }
  
  regex()
}