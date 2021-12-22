//사분면 고르기
//좌표의 음,양수 구분에 따라 사분면 중 어느 사분면에 해당하는지를 구하는 문제

//입력: 
//정수 x
//정수 y

//출력: 사분면 중 하나(1~4)

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        if(x>0 && y>0){
            System.out.println(1);
        }else if(x<0 && y>0){
            System.out.println(2);
        }else if(x<0 && y<0){
            System.out.println(3);
        }else{
            System.out.println(4);
        }
    }
}