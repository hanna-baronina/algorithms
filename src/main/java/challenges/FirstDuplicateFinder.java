package challenges;

public class FirstDuplicateFinder {
    public static void main (String[] args){
        int[] array = {1, 2, 4, 4, 1, 3, 7, 5, 5, 2};
        System.out.println(getFirstDuplicate(array));
    }

    public static int getFirstDuplicate(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] == array[j]){
                    return array[i];
                }
            }
        }
        return -1;
    }
}
