//10950q 
// A+B  A와 B를 입력받아 두 수의 합을 구하여 출력하라
// 반복되는 부분 - 두 수를 입력받고 이를 더한 값을 출력하는 부분


import java.util.*;

public class Q10950{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int total = scan.nextInt();
        
        for(int i=0;i < total;i++){
            //한줄에 있는 첫번째 수와 두번째 수를 입력받고 바로 더한 값을 출력
            int firstNum = scan.nextInt();
            int secondNum = scan.nextInt();
            System.out.println(firstNum+secondNum);
        }
    }
}