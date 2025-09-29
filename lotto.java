import java.util.Scanner;

public class lotto {
    public static void main(String[] args) {
        
        int[] input = new int [5];
        int[] output = new int [5];

        userNumb(input);

         for (int i = 0; i < 5; i++){
                System.out.println(input[i]);
            }



    }

    public static void userNumb(int[] array) {
        
        Scanner userScan = new Scanner(System.in);
        int userNumb;

        for (int i = 0; i < 5; i++){
            userNumb = userScan.nextInt();
            array[i] = userNumb;

       }
    }
    
    public static int systemNumb() {
       
        int[] output = new int [5];

        return 0;
        
    }
}
