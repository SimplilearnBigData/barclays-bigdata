package com.hive;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class HiveUDF extends UDF{

	public Text evaluate(Text input){
		Text result = new Text();
		
		if(input == null){
			return null;
		}
		
		result.set(input.toString().toUpperCase());
		
		return result;
	}

}
