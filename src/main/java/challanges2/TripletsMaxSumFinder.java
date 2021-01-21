package challanges2;


public class TripletsMaxSumFinder {
    public static void main (String[] args){
        int[] array = {1,2,5,-3,4};
        System.out.println(getMaxTripletsSum(array));
    }

    public static int getMaxTripletsSum(int[] array){
        int maxSum = 0;
        for(int i = 0; i <= array.length - 3; i++){
            for(int j = i + 1; j <= array.length - 2; j++){
                int sum = 0;
                for(int k = j + 1; k < array.length; k++){
                    sum =  array[i]+ array[j] + array[k];
                    System.out.println(array[i] +""+ array[j]+""+ array[k] + "="+ sum);
                    if(sum > maxSum){
                        maxSum = sum;
                    }
                }
            }
        }
        return maxSum;
    }
}
