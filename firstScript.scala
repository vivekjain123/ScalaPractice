import org.apache.spark.sql.SparkSession

//create or get an existing spark session
//application name and number of cores to use can also be declared.
val ss = SparkSession.builder().getOrCreate() 
