import java.util.* ;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
public class Prod_Cons {
 
private static BlockingQueue<Integer>queue = new ArrayBlockingQueue<Integer>(10);
public static void main(String [] args) {
Thread t1 = new Thread(new Runnable())
{
public void run (){
try{
producer();
}
catch(Exception e){
e.printStackTrace();
}
}
}};
}
Thread t2 = new Thread(new Runnable())
{
public void run (){
try{
consumer();
}
catch(Exception e){
e.printStackTrace();
}
}
}
};

t1.start();
t2.start();

t1.join();
t2.join();
}
private static void producer  () throws Exception {
Random random = new Random () ;
while(true){
queue.put(random.nextInt(100));
}
}

private void consumer() throws Exception {
	Random random = new Random () ;

while (true) {
Thread.sleep(100);

if(random.nextInt(10) == 0) {
Integer value = queue.take() ;
System.out.println("Taken value :" + value + "; Queue size is :"+ queue.size());
}
}
}
}

























 