//2741q 
// 1부터 입력받은 N까지 출력하기 

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for(int i=1;i<=num;i++){
            System.out.println(i);
        }
    }
}