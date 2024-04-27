package EX2;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String,Double> notes=new HashMap<>();
        notes.put("Ahmed",17.0);
        notes.put("Said",12.5);
        notes.put("Amine",16.5);
        notes.put("Hassan",8.5);

        double noteHassan=notes.get("Hassan");
        notes.replace("Hassan",noteHassan+1);
        System.out.println(notes.get("Hassan"));

        notes.remove(2);
        System.out.println(notes.size());
        /*
        for (notes note:notes){
            double sum=0;
            sum += notes.get();
            double avg=sum/notes.size();
            System.out.println("la moyenne est :"+avg );
        }
        */
        notes.containsValue(20);

    }
}
