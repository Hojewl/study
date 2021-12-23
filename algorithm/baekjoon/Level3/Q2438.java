//2438q
//입력받은 N번째 줄까지 순차적으로 별 찍기

import java.util.*;

public class Q2438 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
