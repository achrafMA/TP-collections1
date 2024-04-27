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

        double sum=0;
        double max =0;
        double min =100000;
        for (Map.Entry<String,Double>entry: notes.entrySet()){


            if (entry.getValue()>max)
                max= entry.getValue();

            if (entry.getValue()<min)
                min= entry.getValue();
            sum += entry.getValue();

        }
        double avg=sum/notes.size();
        System.out.println("la moyenne est :"+avg );
        System.out.println("le max est :"+max );
        System.out.println("le min est :"+min );

        notes.containsValue(20);




    }
    public void iterateUsingLambda(Map<String, Double> notes) {
        notes.forEach((key, value) -> {
            System.out.println("Key=" + key + ", Value=" + value);
        });
    }
}
