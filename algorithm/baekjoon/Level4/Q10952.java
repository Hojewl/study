//10952q
// A+B를 while문으로 출력하라

import java.util.*;

public class Q10952 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int result = 1;
        
        
        while(result != 0){
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            result = num1 + num2;
            if(result != 0){
                System.out.println(result);
            }
        }
        
    }
}
