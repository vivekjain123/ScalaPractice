import org.apache.spark.sql.SparkSession

//create or get an existing spark session
//application name and number of cores to use can also be declared.
val ss = SparkSession.builder().getOrCreate()
//to indicate first line is header --> option("header","true")
//to infer schema --> option("inferSchema","true")
val df = ss.read.option("header","true").option("inferSchema","true").csv("CitiGroup2006_2008")
//df.head(5)

//Print rows

for(row<-df.head(5)){
  println(row)
}

//to display columns

df.columns

//to describe same as pandas in python

df.describe().show()

//to select a columns

df.select("Volume").show()

//to select multiple columns

df.select($"Date",$"Close").show()

//to create new columns

val df2 = df.withColumn("HighPlusLow",df("High")+df("Low"))
df2.printSchema()

//rename a columns

df2.select(df2("HighPlusLow").as("HPL")).show()
