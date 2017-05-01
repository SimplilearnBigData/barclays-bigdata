import scala.collection.mutable.ArrayBuffer
object Day2 extends App{
  
  
//ARRAY

//initialize an array of Its with max size of 20
  
val favNums = new Array[Int](20)
  
  
  
//Create an array in 1 line -fixed length array
  
val friends = Array("Bob","Tom","foo","hoo","ooo")
  
  
//To create sub array from existing array
  
val a = friends.slice(1, 4)
  
  

friends(0) = "Sue"
  
  

println("My Best Friend = "+friends(0))
 
 
  
for(x <- friends){
    
println(x)
  
}
  
  

nums.sorted.foreach(println)
 
 
  
var sortedArray = nums.sortWith(_ < _)
  
  
sortedArray.foreach(println)
 
 
  
//friends.foreach {println}
  
  

//ARRAY BUFFER
   

val nums = Array(1,4,3,2,50,6,7)
  

var a1 = for(x <- nums ) yield x*2
  
  
a1.foreach(println)
  
  

val friends2 = ArrayBuffer[String]()
  
  
friends2.insert(0,"Phil")
  
  
friends2 += "Mark"
  
  
friends2 ++= Array("Susy","Paul")
  
  
friends2.insert(1,"Mike","Sally","Sam","Mary","Sue")
  
  
friends2.remove(1,2)
  
  
friends2.foreach { 
x => println(x)
 }
  
  

//Create a multi dimensional array
  
val multTable = Array.ofDim[Int](10,10)
  
  
for(i <- 0 to 5; j <- 0 to 5){
    
multTable(i)(j) = i * j
  
}
  
for(i <- 0 to 5; j <- 0 to 5){
    
println("Values for  i = "+i+ " & j = "+j +"  "+ multTable(i)(j))
  
}
  
 
 
multTable.foreach { 
x => x.foreach(println) 
}
 
 
 
val sortedNums = nums.sortWith(_ > _ )
 
 
sortedNums.foreach(println)
 
 
println(sortedNums.deep.mkString("**"))


//MAPs

//Below is an example of immutable map where you cannot add/delete/modify elements

val employees = Map("Manager" -> "Bob", "Secretary" -> "Sue")

if(employees.contains("Manager")) {
println("Value = "+employees.get("Manager"))

//If key not present, result for the key is returned NULL

//Create mutable maps like below

var customers = collection.mutable.Map(100 -> "Paul" , 200 -> "Smith")

println("cust name = " + customers(100))

//adding a key-value pair
customers+= 300 -> "Susy"

//deleting a key-value pair by specifying key
customers-= 200 

//modify existing pairs -- "upsert"
customers(200) = "Jaymin"

//iterating over maps
for((k,v) <- customers) {
println("Key ="+k+" and value = " +v)
}

//getOrElse method
println("cust name =" + customers.getOrElse(500,"EMPTY")

//Tuple can hold values of many types but they are immutable

var tupleData = (100,"Scala Training", 10.25)

println ("Third element is " +tupleData._3)

tupleData.productIterator.foreach {println}

}



//Assignment Solution

object ArrayEx extends App{
   var a1 = Array(3,7,2,10)
   var a2 = Array(50,6,100,3,1)

   var sortedA1 = a1.sorWith(_>_)
   var sortedA2 = a2.sortWith(_>_)

   var resultArray = for(i <- 0 until 3 ; j<- 0 until 3) yield sortedA1(i) + sortedA2(j)

   println ("3rd largest sum = "+resultArray.sortWith(_>_) (2))


}
