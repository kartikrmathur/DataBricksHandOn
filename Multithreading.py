#!/usr/bin/env python
# coding: utf-8

# In[1]:


import pandas as pd
import pandasql as ps
import threading


# In[2]:


# initialize data of lists.
d1 = {'Name':['Tom', 'nick', 'krish', 'jack'],
		'Age':[20, 21, 19, 18]}
d2 = {'Name':['Tom2', 'nick2', 'krish2', 'jack2'],
		'Age':[21, 22, 20, 19]}
d3 = {'Name':['Tom3', 'nick3', 'krish3', 'jack3'],
		'Age':[22, 23, 21, 20]}
d4 = {'Name':['Tom4', 'nick4', 'krish4', 'jack4'],
		'Age':[23, 24, 22, 21]}
d5 = {'Name':['Tom5', 'nick5', 'krish5', 'jack5'],
		'Age':[24, 25, 23, 22]}


# In[3]:


# Create DataFrame
df1 = pd.DataFrame(d1)
df2 = pd.DataFrame(d2)
df3 = pd.DataFrame(d3)
df4 = pd.DataFrame(d4)
df5 = pd.DataFrame(d5)


# In[4]:


# Print the output.
df1,df2,df3,df4,df5


# In[5]:


if __name__ == "__main__":
    
#creating 5 Thread
    t1 = threading.Thread(target=df1)
    t2 = threading.Thread(target=df2)
    t3 = threading.Thread(target=df3)
    t4 = threading.Thread(target=df4)
    t5 = threading.Thread(target=df5)


# In[6]:


#starting 5 thread
t1.start()
t2.start()
t3.start()
t4.start()
t5.start()


# In[7]:


#waiting till respective thread execute
t1.join()
t2.join()
t3.join()
t4.join()
t5.join()


# In[ ]:





# In[ ]:




