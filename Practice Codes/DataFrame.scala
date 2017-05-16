

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SQLContext

object DataFrame extends App {
  val conf = new SparkConf().setAppName("DataFrames App")
  val sc = new SparkContext(conf)
  val sqlCtx = new SQLContext(sc)
  val hiveContext = new org.apache.spark.sql.hive.HiveContext(sc)
  def readJson(){
    val jsonDF =  hiveContext.jsonFile(args(0))
    jsonDF.printSchema()
    jsonDF.show()
    
    jsonDF.select("name").show
    jsonDF.select(jsonDF("age") > 21).show
    jsonDF.groupBy("age").count().show()
    
    
    
    jsonDF.registerTempTable("people_table1")
    hiveContext.sql("select * from people_table1 where age > 21").show
    jsonDF.saveAsTable("mypeople1")
    
  }
  
  def readParquet(){
     val parquetDF =  sqlCtx.parquetFile(args(1))
    parquetDF.printSchema()
  }
  
  case class Emp(name : String, Age : Int)
  
  def readTextFile(){
    val file = sc.textFile(args(2))
    val empFile = file.map { x => Emp(name = x.split(",")(0), Age = x.split(",")(1).toInt) }
    val empDF = sqlCtx.createDataFrame(empFile)
    
    empDF.show()
    empDF.select("name").show
    empDF.printSchema()
    
  }
  readJson()
  readParquet()
  readTextFile()
  
}