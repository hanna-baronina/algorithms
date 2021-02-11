package challanges2;

import java.util.*;

public class ListToSet {
    public static void main (String[] args){
        List<String> aList = new ArrayList<>();
        aList.add("a");
        aList.add("b");
        aList.add("b");

        Set<String> aSet = new HashSet<String>(aList);

        for(String str : aSet){
            System.out.println(str);
        }
        System.out.println("---");

        Set<String> bSet = new HashSet<String>(aList);
        bSet.add("a");
        bSet.add("C");
        bSet.add("D");

        for(String  letter : bSet){
            System.out.println(letter);
        }
        System.out.println("---");
        List<String> bList = new ArrayList<>(bSet);

        for(String letter2 : bList){
            System.out.println(letter2);
        }
    }
}
