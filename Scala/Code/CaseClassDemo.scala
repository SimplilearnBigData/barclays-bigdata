

object CaseClassDemo extends App{
  var list = List("1,user1,100","2,user2,120")
  
  case class EMP(id:Int,name:String,sal:Int)
  
  var empList = list.map { x => EMP(id = x.split(",")(0).toInt,name = x.split(",")(1),sal = x.split(",")(2).toInt) }
  
  empList.map { x => println(x.sal) }
}
