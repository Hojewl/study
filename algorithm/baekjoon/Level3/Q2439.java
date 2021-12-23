//2439q
// 별찍기 -2 오른쪽 정렬로 별을 찍어라
// 1부터 입력받은 N까지 각 줄에는 개수에 맞게 별 찍기
import java.util.*;

public class Q2439 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        //입력받은 줄 수 만큼 반복하는 첫번째 for문
        for(int i=1;i<=num;i++){
            //두번째 for문은 공백의 개수를 찍어내는 역할
            //공백은 줄이 넘어갈수록 개수가 줄어들어야 한다
            for(int j=num;j>i;j--){
                System.out.print(" ");
            }
            //공백이 찍힌 후 해당 줄에 찍힐 별
            //별은 줄수에 맞춰 그 개수만큼 찍혀야 한다
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}