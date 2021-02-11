package challanges2;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoLists {
    public static void main (String[] args){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int list1Index = 0;
        int list2Index = 0;

        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);

        list2.add(2);
        list2.add(3);
        list2.add(4);

        List<Integer> list3 = new ArrayList<>();
        int writeIndex = 0;

        while(list1Index < list1.size() || list2Index < list2.size()){
            if(list1Index < list1.size() && list2Index < list2.size()){
                if(list1.get(list1Index) <= list2.get(list2Index)){
                    list3.add(writeIndex, list1.get(list1Index));
                    list1Index++;
                    writeIndex++;
                } else {
                    list3.add(writeIndex,list2.get(list2Index));
                    list2Index++;
                    writeIndex++;
                }
            } else if (list1Index == list1.size()){
                list3.add(writeIndex,list2.get(list2Index));
                list2Index++;
                writeIndex++;
            } else {
                list3.add(writeIndex,list1.get(list1Index));
                list1Index++;
                writeIndex++;
            }
        }

        System.out.println(list3.get(0));

        for(Integer digit : list3){
            System.out.print(digit);
        }
    }
}
