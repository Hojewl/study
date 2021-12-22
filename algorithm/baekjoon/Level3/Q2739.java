//구구단을 출력해라
//입력받은 숫자의 곱셉들을 전부 출력

import java.util.*;

public class Q2739{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int mul = scan.nextInt();

        for(int i=1; i < 10; i++){
            int result = mul * i;
            System.out.println(mul+" * "+i+" = "+result);
        }   
    }
}