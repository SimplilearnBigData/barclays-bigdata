

import scala.io.Source

object MaxProductCityTxn extends App{
   //change path to the transactions file accordingly. 
   var txnFile = Source.fromFile("D://transactions.txt","UTF-8")
   
   case class TXN(id:Int,txn_date:String,user_id:Int,amount:Int,product:String,city:String,payment_mode:String)
   
   val lines = txnFile.getLines()
   
   val linesArray = lines.map { x => x.split(",") }
   
   val txnList = linesArray.map { x => 
     TXN(id = x(0).toInt,txn_date = x(1),user_id = x(2).toInt, 
         amount = x(3).toInt,product = x(4), city = x(5), payment_mode = x(6))
   }
   
   var maxMap = collection.mutable.Map.empty[String,TXN]
   
   for(i <- txnList){
     var key = i.product +"_"+ i.city
     if(maxMap.contains(key)){
       var value = maxMap(key)
       if(value.product == i.product && value.city == i.city){
         if(value.amount  < i.amount){
           maxMap(key) = i
         }
       }
     }else{
       maxMap(key) = i
     }
   }
   
   for((k,v) <- maxMap){
     println("key = "+k + " & max Amount = "+v.amount)
   }
}
