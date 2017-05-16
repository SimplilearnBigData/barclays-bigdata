package com

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object MaxTxn extends App{
  var sparkConf = new SparkConf().setAppName("My Spark Program")
  var sc = new SparkContext(sparkConf)
  
  var file = sc.textFile(args(0))
  
  val txnRDD = file.map { x => (x.split(",")(4)+"_"+x.split(",")(5),x.split(",")(3).toInt)}
  
  val result =  txnRDD.reduceByKey(Math.max(_, _))
  
  result.collect().foreach(println)
}