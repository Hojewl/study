import java.util.*;

public class StarPrint {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        //입력받은 줄 수 만큼 반복하는 첫번째 for문
        for(int i=0;i<num;i++){
            //두번째 for문은 공백의 개수를 찍어내는 역할
            //공백은 줄이 넘어갈수록 개수가 줄어들어야 한다
            for(int j=num;j>i;j--){
                System.out.print("*");
            }
           
            System.out.println();
            
        }
    }
}
