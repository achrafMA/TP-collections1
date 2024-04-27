import java.util.PriorityQueue;
import java.util.Queue;
//LIFO
public class QueueApp {
    public static void main(String[] args) {
        Queue<Double> notes=new  PriorityQueue<>();
        notes.add(12.5);
        notes.add(18.0);
        notes.add(9.5);
        notes.clear();
        //lire un element
        //System.out.println(notes.element());
        System.out.println(notes.peek());
        //System.out.println(notes.poll());
        //System.out.println(notes.element());

    }
}
