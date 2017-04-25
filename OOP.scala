
//Creating a super class Animal with primary constructor
class Animal(var name:String, var sound:String){
  def makeSound = sound
  def makeSound_ (a:String) { sound = a}
  
  def getName() = name
  def setName (name:String) { 
    //Check if the name contains any numbers , if not then only assign the name
    if(!(name.matches(".*\\d+.*"))){
       this.name = name
    }else
       this.name = "No Name"
  }
  
  //Auxillary constructor with single input parameter and other is taken as default
  def this(name:String) {
    //this calls a primary constructor defined on the class line
    this(name,"No Sound")
  }
  //Auxillary constructor with no input parameters
  def this() {
    //this calls a primary constructor defined on the class line
    this("No Name")
  }
  //overridig any method of super class ANY
  override def toString() : String = {
    return "name = "+this.name+ " & sound = "+this.sound 
  }
}

class Dog(name:String, sound:String, growl:String) extends Animal(name,sound){
  def this(name:String,sound:String){
    this(name,sound,"No Growl")
  }
  
  def this(name:String){
    //this calls a primary constructor defined on the class line
    this(name,"No Sound","No Growl")
  }
  //Auxillary constructor with no input parameters
  def this(){
    //this calls a primary constructor defined on the class line
    this("No Name","No Sound","o Growl")  
  }
  //overridig any method of super class ANY
  override def toString() : String = {
    return "name = "+this.name+ " & sound = "+this.sound + " & Growl = s"+this.growl
  }
}

trait Flyable{
  def fly:String
}

trait BulletProof {
  def hitByBullet : String
  
  def ricochet(startSpeed:Double):String = {
    "The bullet ricochets at a speed of "+startSpeed * .75
  }
}

class SuperHero(name:String) extends Flyable with BulletProof{
  def fly = this.name +"can fly"
  def hitByBullet = "The bullet bounces off of "+this.name
}

object OOP extends App{
  val rover = new Animal
  
  var whiskers = new Animal("Whiskers","Meow")
  //rover.setName("Rover")
  //rover.makeSound_ ("woof")
  println(rover)
  println(whiskers)
  
  var spike = new Dog("Spike","Woof","Grrr")
  spike.setName("spike")
  println(spike.getName())
  println(spike)
  
  var superman = new SuperHero("Aveger")
  println(superman.fly)
  println(superman.hitByBullet)
  println(superman.ricochet(2500))
  
}