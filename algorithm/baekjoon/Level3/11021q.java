//11021q
// A+B에 case #을 붙여 출력
// 출력예제: 
// Case #1: 2
// Case #2: 5
// Case #3: 7

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //테스트 케이스의 개수 T값
        int total = scan.nextInt();

        for(int i=1; i <= total; i++){
            int firstNum = scan.nextInt();
            int secondNum = scan.nextInt();
            int sum = firstNum + secondNum;
            System.out.println("Case #"+i+": "+sum);
        }   
    }
}