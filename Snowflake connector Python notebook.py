# Databricks notebook source
# snowflake connection options
options = {
  "sfUrl": "https://WI98076.japan-east.azure.snowflakecomputing.com",
  "sfUser": "KARTIK",
  "sfPassword": "Kartik123",
  "sfDatabase": "DEMO_DB",
  "sfSchema": "PUBLIC",
  "sfWarehouse": "COMPUTE_WH"
}
SNOWFLAKE_SOURCE_NAME = "net.snowflake.spark.snowflake"

# COMMAND ----------

# Generate a simple dataset containing five values and write the dataset to Snowflake.
spark.range(5).write \
  .format("snowflake") \
  .options(**options) \
  .option("dbtable", "DEMO_DB") \
  .save()

# COMMAND ----------

# Read the data written by the previous cell back.
df = spark.read \
  .format("snowflake") \
  .options(**options) \
  .option("dbtable", "DEMO_DB") \
  .load()

display(df)

# COMMAND ----------

df = spark.read \
  .format("snowflake") \
  .options(**options) \
  .option("query",  "select 1 as my_num union all select 2 as my_num") \
  .load()

df.show()

# COMMAND ----------


