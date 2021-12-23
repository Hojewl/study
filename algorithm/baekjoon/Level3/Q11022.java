//11022q 
// A+B를 출력
// 출력예시
// Case #1: 1 + 1 = 2
// Case #2: 2 + 3 = 5
// Case #3: 3 + 4 = 7
// Case #4: 9 + 8 = 17
// Case #5: 5 + 2 = 7

import java.util.*;

public class Q11022 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int total = scan.nextInt();
        
        for(int i=1;i<=total;i++){
            int firstNum = scan.nextInt();
            int secondNum = scan.nextInt();
            int sum = firstNum + secondNum;
            System.out.println("Case #"+i+": "+firstNum+" + "+secondNum+" = "+sum);
        }
    }
}
