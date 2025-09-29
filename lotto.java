import java.util.Scanner;

public class lotto {
    public static void main(String[] args) {
        
        int[] input = new int [5];
        int[] output = new int [5];

        userNumb(input);
        systemNumb(output);


         /*for (int i = 0; i < 5; i++){
                System.out.println(input[i]);
           } */ 

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
        
        int randomNum = (int)(Math.random() * 35); // 0 to 100
        
    }
}
