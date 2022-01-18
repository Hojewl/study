//0부터 9까지 총 10개짜리 배열을 만든다
//곱한 값을 문자열로 쪼개서 하나씩 배열의 index와 비교후 counting 한다.
import java.util.*;

public class Q2577 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int total = num1 * num2 * num3;
        //총 값을 문자열로 저장
        String totalStr = Integer.toString(total);
        
        //각 숫자의 개수를 알려줄 10개짜리 배열 생성 (0~9)
        int [] numArr = new int[10];

        for(int i=0;i<10;i++){
            //numArr 도는 for문
            int count = 0;
            for(int j=0;j<totalStr.length();j++){
                //totalStr 도는 for문
                if(i == totalStr.charAt(j)-48){
                    //numArr index값과 totalStr.charAt(j)의 숫자가 같으면
                    count++;
                    numArr[i] = count;
                }else{
                    numArr[i] = count;
                }
            }
        }
        for(int i=0;i<10;i++){
            System.out.println(numArr[i]);
        }
        

    }
}

