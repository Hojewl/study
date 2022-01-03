//Q1110
// 주어진 수의 자리수를 더한 값과 일의 자리수를 합쳐서 새로운 수를 만든다
// 새로운 수를 계속 만들어 내다가 원래의 수로 돌아오게 되는 회차를 구하라

import java.util.*;
public class Q1110 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int originNum = scan.nextInt();
        

        int newNum = originNum;
        int count = 0;
        // String mixedNumString = "";
        //int mixedNumInt = 0;

        //while문 조건이 while(mixedNumInt != originNum)으로 했을 때 답이 틀림
        while(true){
            //입력받은 수의 일의 자리수를 구함
            int digit2 = newNum % 10;
            //입력받은 수의 십의 자리수를 구함
            int digit1 = newNum / 10;

            int sum = digit1 + digit2;

            // mixedNumString = Integer.toString(digit2) + Integer.toString(sum % 10);
            // mixedNumInt = Integer.parseInt(mixedNumString);
            newNum = (digit2 * 10) + (sum % 10);
            count++;
            if(newNum == originNum){
                break;
            }
        }
        System.out.println(count);
    }
}
