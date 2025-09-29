import java.util.*;

public class lotto {
    public static void main(String[] args) {
        Boolean keepPlay = true;
        String menuStart = """

        Welcome to the Lotto game!

        Please select 5 numbers between 1 - 35""";
        
        String menuEnd = """ 

        Would you like to play again?

        1. Yes
        2. No
                
                """;
        
        do {     
        System.out.println(menuStart);

        int[] input = new int [5];
        int[] output = new int [5];
        int score = 0;
        
        System.out.println("");

        userNumb(input); //gathers the users 5 numbers

        systemNumb(output); //gathers 5 random numbers from a list of 35

        System.out.println("You have selected the following numbers: ");
        for (int i = 0; i < 5; i++){
            System.out.print(input[i] + ", ");
       }

        System.out.println("");
        System.out.println("And the winning numbers are: ");
        for (int i = 0; i < 5; i++){
            System.out.print(output[i] + ", ");
       }  
        
            for (int i = 0; i < 4; i++){
                if (input[i+1] == output[i+1]){
                    score = +1;
                }else{   
                }
            }
        
        System.out.println("\nYou had a total of " + score + " matches!");
        System.out.println(menuEnd);

        Scanner userScan = new Scanner(System.in);
        int userKeep = userScan.nextInt();
        switch (userKeep) {
            case 1:
                keepPlay = true;
                break;
            case 2:
                keepPlay = false;
                break;
            default:
                System.out.println("Invalid input!");
                System.out.println("Please enter a valid input:");
                break;
            }

        } while (keepPlay);
    }

    public static void userNumb(int[] array) {
        
        Scanner userScan = new Scanner(System.in);
        int userNumb;

        for (int i = 0; i < 5; i++){
            userNumb = userScan.nextInt();
            array[i] = userNumb;
       }
    }
    
    public static void systemNumb(int[] array) {
        
        List<Integer> oneTo35 = new ArrayList<>();
       
            for (int i = 1; i <= 35; i++) {
                oneTo35.add(i);
            }
      
        Collections.shuffle(oneTo35);
        
            for (int i = 0; i < array.length; i++) {
                array[i] = oneTo35.get(i);
      
        }
    }
}