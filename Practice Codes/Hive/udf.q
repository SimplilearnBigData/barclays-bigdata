ADD JAR /home/cloudera/udf.jar;
CREATE TEMPORARY FUNCTION toUpper AS 'com.hive.UdfDemo';
use glvc;
select toUpper(product) from txn;