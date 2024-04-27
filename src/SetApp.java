import java.util.HashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        Set<Integer> nombres=new HashSet<>();
        nombres.add(12);nombres.add(14);nombres.add(16);
        nombres.add(18);nombres.add(22);nombres.add(28);
        for(Integer n:nombres){
            System.out.println(n);
        }
    }
}
