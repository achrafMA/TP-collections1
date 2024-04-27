import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("Ahmed");
        names.add("Rachid");
        names.add("adam");
        //names.remove(0);
        System.out.println(names.get(0));
        if (names.contains("Rachid")){
            System.out.println("Existe");
        }else {
            System.out.println("N'existe pas");
        }
        names.set(0,"Asamae");
        if (names.isEmpty()){
            System.out.println("La liste est vide");
        }else {
            System.out.println("La liste n'est pas vide");
        }
        //names.clear();
    }
}