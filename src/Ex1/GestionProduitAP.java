package Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionProduitAP {
    public static void main(String[] args) {
        List<Produit> produits=new ArrayList<>();

        //Q1

        produits.add(new Produit(1,"HP",18000));
        produits.add(new Produit(2,"MAC",28000));
        produits.add(new Produit(3,"DELL",19000));

        //Q2
        produits.remove(0);
        //Q3
        for (Produit produit:produits){
            System.out.println(produit);
        }
        //Q4
        System.out.println("*********Q4********");
        produits.get(0).setPrix(25000);
        for (Produit produit:produits){
            System.out.println(produit);
        }
        //Q5
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a keyword");
        String keyword=scanner.next();
        for (Produit p:produits){
            if (p.getNom().contains(keyword)){
                System.out.println(p);
            }
        }

    }
}
