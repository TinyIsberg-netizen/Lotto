import java.util.Scanner;

public class lotto {
    public static void main(String[] args) {
        
        int[] input;
        int[] output;

        userNumb();


      
    
   

    }

    public static int userNumb() {
        Scanner userScan = new Scanner(System.in);
        int userNumb;
        for (int i = 0; i < 5; i++){
            userNumb = userScan.nextInt();
            System.out.println(userNumb);
        }

        return 0;
        
    }
    
    public static int systemNumb() {
        
        return 0;
        
    }
}
