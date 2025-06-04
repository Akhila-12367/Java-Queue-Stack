import java.util.LinkedList;
import java.util.Queue;
public class QueueExample{
    public static void main(String[]args){
        Queue<Integer>q=new LinkedList<>();
        //Enqueue elements
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println("Queue:"+q);
        //dequeue elements
        System.out.println("Dequeued:"+q.poll());
        //peek front elements
        System.out.println("Front:"+q.peek());
        System.out.println("queue after operations:" +q);
    }
}