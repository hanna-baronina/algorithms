package challenges;

public class LongestUniqueSubArrayFinder2 {
    public static int getLongestUniqueSubArray(int[] array) {
        int startIndex = 0;
        int maxLength = 1;
        for (int investIndex = 1; investIndex < array.length; investIndex++) {
            while(hasDuplicate(startIndex, investIndex, array)){
                startIndex++;
            }

            int length = investIndex - startIndex + 1;
            if(length > maxLength){
                maxLength = length;
            }
        }
        return maxLength;
    }


    public static boolean hasDuplicate(int startIndex, int investigatorIndex, int[] array){
        for(int i = startIndex; i < investigatorIndex; i++){
            if(array[investigatorIndex] == array[i]){
                return true;
            }
        }
        return false;
    }
}


