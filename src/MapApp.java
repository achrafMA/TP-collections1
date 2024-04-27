import java.util.HashMap;
import java.util.Map;

public class MapApp {
    public static void main(String[] args) {
        Map<String,Integer> prix=new HashMap<>();
        prix.put("HP",12000);
        prix.put("MAC",20000);
        prix.put("DELL",25000);
        prix.put("HP",17000);

        prix.remove("HP");
        System.out.println(prix.get("DELL"));
        //afficher tous les elements
        for (String k:prix.keySet()){
            System.out.println(k+""+prix.get(k));
        }
    }
}
