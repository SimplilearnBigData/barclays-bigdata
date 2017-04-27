
import scala.math._
object Currying extends App{
  
  case class Person(x:Double,y:Double,range:Double)
  case class Item(x:Double,y:Double)
  
  val inSight = (person: Person,item:Item) => {
    pow( person.x-item.x, 2 ) + pow( person.y-item.y, 2 ) <= pow(person.range,2)
  }
  
  val p1 = new Person(0,1,2)
  
  val i1 = new Item(1,1)
  val i2 = new Item(3,1)
  val i3 = new Item(1,2)
  
  println(inSight(p1,i1))
  println(inSight(p1,i2))
  println(inSight(p1,i3))
  
  val inSightCurried = (person:Person) => (item:Item) => inSight(person,item)
  val inSightForP1 = inSightCurried(p1)
  
  println("After currying applied")
  
  println(inSightForP1(i1))
  println(inSightForP1(i2))
  println(inSightForP1(i3))
  
}