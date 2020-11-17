package algorithms;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main (String[] args){
        int[] a = {1,3,5,6,7};
        int[] b = {1,2,4,8,9};

        int[] c = new int[a.length + b.length];

        int aIndex = 0;
        int bIndex = 0;
        int cIndex = 0;

        while( aIndex  < a.length|| bIndex < b.length ){
            if (aIndex == a.length) {
                c[cIndex] = b[bIndex];
                bIndex++;
                cIndex++;
            } else if (bIndex == b.length){
                c[cIndex] = a[aIndex];
                aIndex++;
                cIndex++;
            } else if(a[aIndex] <= b[bIndex]){
                c[cIndex] = a[aIndex];
                aIndex++;
                cIndex++;
            } else {
                c[cIndex] = b[bIndex];
                bIndex++;
                cIndex++;
            }
        }
        System.out.println(Arrays.toString(c));
    }
}
