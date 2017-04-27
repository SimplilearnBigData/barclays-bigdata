

import java.util.Calendar

object Closure {
  def main(args: Array[String]): Unit = {
    val greetEnglish = greeting("English")
    greetEnglish("Swetha")
    
    val greetSpanish = greeting("Spanish")
    greetSpanish("Janani")
  }
  
  def greeting(lang:String) = {
    val currDate = Calendar.getInstance().getTime().toString()
    
    lang match{
      case "English" => (x:String) => println("Hello "+x+ ". It is "+currDate)
      case "Hindi" => (x:String) => println("Namaste "+x+ ". It is "+currDate)
      case "French" => (x:String) => println("Bonjour "+x+ ". It is "+currDate)
      case "Spanish" => (x:String) => println("Hola "+x+ ". It is "+currDate)
    }
  }
}