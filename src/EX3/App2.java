package EX3;

import java.util.HashSet;

public class App2 {
    public static void main(String[] args) {
        HashSet<String> groupeA=new HashSet<>();
        groupeA.add("hassan");
        groupeA.add("mohammed");
        groupeA.add("hamid");
        groupeA.add("saaid");

        HashSet<String> groupeB=new HashSet<>();
        groupeB.add("hassan");
        groupeB.add("karim");
        groupeB.add("morad");
        groupeB.add("saaid");

        HashSet<String> intersection = new HashSet<>(groupeA);
        intersection.retainAll(groupeB);
        System.out.println("Hashset groupe A: " + groupeA);
        System.out.println("Hashset groupe B: " + groupeB);
        System.out.println("Intersection Hashset is: "+ intersection);

        HashSet<String> union =new HashSet<>(groupeA);
        union.addAll(groupeB);
        System.out.println("Union Hashset is: "+ union);
    }
}
