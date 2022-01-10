// Databricks notebook source
// MAGIC %scala
// MAGIC // Scala code for thread creation by extending
// MAGIC // the Thread class
// MAGIC class MyThread extends Thread
// MAGIC {
// MAGIC 	override def run()
// MAGIC 	{
// MAGIC 		// Displaying the thread that is running
// MAGIC 		println("Thread " + Thread.currentThread().getName() +
// MAGIC 										" is running.")
// MAGIC 	}
// MAGIC }
// MAGIC 
// MAGIC // Creating object
// MAGIC object OBJ
// MAGIC {
// MAGIC 	// Main method
// MAGIC 	def main(args: Array[String])
// MAGIC 	{
// MAGIC 		for (x <- 1 to 5)
// MAGIC 		{
// MAGIC 			var th = new MyThread()
// MAGIC 						th.setName(x.toString())
// MAGIC 							th.start()
// MAGIC 		}
// MAGIC 	}
// MAGIC }

// COMMAND ----------

class ThreadExample extends Thread{  
override def run(){  
println("Thread is running...");  
}  
}  
object MainObject{  
def main(args:Array[String]){  
var t = new ThreadExample()  
t.start()  
}  
}  

// COMMAND ----------

class ThreadExample extends Runnable{  
override def run(){  
println("Thread is running...")  
}  
}  
object MainObject{  
def main(args:Array[String]){  
var e = new ThreadExample()  
var t = new Thread(e)  
t.start()  
}  
}  

// COMMAND ----------

class ThreadExample extends Thread{  
override def run(){  
for(i<- 0 to 5){  
println(i)  
Thread.sleep(500)  
}  
}  
  
}  
  
object MainObject{  
def main(args:Array[String]){  
var t1 = new ThreadExample()  
var t2 = new ThreadExample()  
t1.start()  
t2.start()  
}  
}  

// COMMAND ----------

class ThreadExample() extends Thread{  
override def run(){  
for(i<- 0 to 5){  
println(this.getName()+" - "+i)  
Thread.sleep(500)  
}  
}  
}  
  
object MainObject{  
def main(args:Array[String]){  
var t1 = new ThreadExample()  
var t2 = new ThreadExample()  
var t3 = new ThreadExample()  
t1.setName("First Thread")  
t2.setName("Second Thread")  
t1.start()  
t2.start()  
}  
}

// COMMAND ----------


