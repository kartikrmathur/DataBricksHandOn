#!/usr/bin/env python
# coding: utf-8

# In[1]:


from pyspark.sql import SparkSession

# Create SparkSession
spark = SparkSession.builder                .appName('TimestampConversion')                .getOrCreate()


# In[2]:


from pyspark.sql.functions import *


# In[3]:


df=spark.createDataFrame([["1"]],["id"])


# In[45]:


df.select(current_date().alias("current_date"),          date_format(current_date(),"yyyy/ MM /dd").alias("yyyy MM dd"), 
         ).show()


# In[46]:


#convert into spark sql
spark.sql("select current_date() as current_date, "+
         "date_format(current_timestamp(),'yyyy/ MM/ dd') as yyyy_MM_dd").show()


# In[38]:


#sql Function for date formate conversion
from pyspark.sql.functions import *
df=spark.createDataFrame([["04/05/2021"],["10/05/2021"]],["input"])
df.select(col("input"),to_date(col("input"),"MM/dd/yyyy").alias("date"))   .show()


# In[ ]:




