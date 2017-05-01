
import scala.io.StdIn.{readLine,readInt}
import java.io.PrintWriter
import scala.io.Source

object ScalaIO extends App{
  //Read data from input stream / console
  var number = 0
  do{
    println("Guess the number !!! ")
    number = readLine.toInt
  }while(number != 13)
  
  println("Hey you got the number")
  
  //To write data into a file and save it to disk
  val writer = new PrintWriter("D://barclays.txt")
  writer.write("this is line1 \n this is line2")
  writer.close()
  
  //Read data from the file
  var file = Source.fromFile("D://barclays.txt")
  var lines= file.getLines()
  for(x <- lines){
    println(x)
  }
  
  file.close()
}
