//8393q 
//1부터 입력받은 N까지의 총 합

import java.util.*;

public class Q8393{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int result = 0;

        //1부터 입력받은 값까지 반복문으로 더하기
        for(int i=1;i <= num;i++){
            result += i;
        }
        
        System.out.println(result);
    }
}
