package com

object ScalaTest extends App{
    /*var i=0
    println("While Loop")
    while(i<=10)
    {
      println(i)
      i+=1
    }
     println("Do While Loop")
     var j =0
    do {
      println(j)
      j+=1
    }while(j <=20)
    
      
    println("For Loop")
    for(i <- 10 to 20){
      println(i)
    }
    
    val randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    
    for(i <- 0 until randLetters.length()){
      println(randLetters(i))
    }
    
    var myList = List(1,2,3,4,5,6,7)
    for(i <- myList){
     println("List Item = "+i) 
    }
    */
    var evenList = for(i <- 1 to 20
        //you can put as many conditions as you want seperated by semicolon
        if(i % 2 == 0); if(i > 5);if(i % 3 == 0)
    )yield i
    
    for(i <- evenList){
      println(i)
    }
    
    for(i <- 1 to 5 ; j <- 6 to 10){
     println("i : = "+i) 
     println("j : = "+j) 
    }
   
    def printprimes(){
      val primeList = List(1,2,3,5,7,11)
      for( k <- primeList){
        if(k == 11){
          return
        }
        if(k != 1){
          println(k)
        }
      }
    }
    
    printprimes
    
    var text = "I saw a dragon fly by"
    println("3rd Index = "+text(3))
    
    
    println("length = "+text.length())
    println(text.concat(" and explode"))
    println("are equal = "+"I saw a dragon fly by".equals(text))
    println("index of = "+text.indexOf("dragon"))
    
    var textArray = text.toArray
    
    for(p <- 0 until textArray.length){
      println(textArray(p))
    }
    
}
