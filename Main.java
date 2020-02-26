//Elena Voinu
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String [] array = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        System.out.println("Enter a number from 1 to 7 to get the day of the week: ");
        //read user input ans store it to number variable
        int number = sc.nextInt();

        //validation
        if(number <=0 || number >=8){
            System.out.println("Invalid value");
        }
        else{

        System.out.println("You entered: " + number + ", " + getDayOfTheWeek(array, number));}

    }

    private static String getDayOfTheWeek(String[] array, int number) {

        //initialize a string variable  that will store the days in the array
        String dayOfTheWeek = null;

        for(int i = 0; i < array.length; i++){
            //if index number equals user's input-1, store the value stored at that index into the string variable dayOfTheWeek
            if(i == number-1){
                 dayOfTheWeek = array[i];
            }
        }
        return  dayOfTheWeek;
    }
}
