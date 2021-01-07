package challenges;

public class NumberCharacteristicsPrinter {
    public static void main(String [] args){
        double number = 11220202;
        getNumberCharacteristics(number);
    }

    public static void getNumberCharacteristics(double number){
        if(number == 0){
            System.out.println("zero");
        } else if (number > 0 && number < 1){
            System.out.println("small"+ " " +"positive");

        } else if (number > 0 && number > 1000000){
            System.out.println("large"+ " "+"positive");

        } else {
            System.out.println("negative");
        }

    }
}
