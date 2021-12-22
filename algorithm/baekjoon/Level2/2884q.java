/* 백준알고리즘 2884번 문제
시간과 분을 45분 전으로 설정하여 출력하기
*/
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int hour = scan.nextInt();
        int minute = scan.nextInt();

        //minute이 45분보다 작은경우, hour에 변화가 생김
        if(minute < 45){
            //시간이 1~23일때
            if(hour != 0){
                //시간이 -1 줄어든다
                hour = hour - 1;
                //60분 중에서 (45 - minute)분한 시간을 빼준다
                minute = 60 - (45 - minute);
                //옳은 출력방식
                System.out.println(hour+" "+minute);
            }
            //시간이 0일때
            else if(hour == 0){
                //23시로 바꿔줘야한다
                hour = 23;
                minute = 60 - (45 - minute);
                System.out.println(hour+" "+minute);
            }
        }else{//minute이 45분보다 클때, hour는 그대로
            minute = minute - 45;
            System.out.println(hour+" "+minute);
        }
    }
}
