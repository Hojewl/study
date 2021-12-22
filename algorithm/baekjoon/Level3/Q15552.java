//15552q
// 빠른 A + B를 구해라
// >> 속도를 높이려면 입출력에서 Scanner나 System.out.println 대신 
// >> bufferReader와 Writer를 사용한다


import java.util.*;
import java.io.*;

public class Q15552{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
            //제일 처음 입력값으로 들어오는 테스트 케이스 수 
            int total = Integer.parseInt(br.readLine());
    
            //1부터 입력받은 값까지 반복문으로 더하기
            for(int i=1;i <= total;i++){
                //buffer는 문자로 값을 읽음(줄 단위)
                String s = br.readLine();
                //받은 문자열 공백 단위로 끊기 
                String arr [] = s.split(" ");
                //배열안에 저장된 값들을 모두 int로 변형시키고,
                int firstNum = Integer.parseInt(arr[0]);
                int secondNum = Integer.parseInt(arr[1]);

                //첫번째 수와 두번째 수를 모두 더한 값을 바로 bufferwrite으로 출력해준다
                bw.write(firstNum+secondNum+"\n");
    
            }
            //버퍼에 남아있는 값을 다 내보낸다
            bw.flush();
            //버퍼를 닫아준다
            bw.close();
        }
        //반드시 예외처리를 해줘야 한다. 안그러면 컴파일 에러가 난다.
        catch(IOException e){
        }
       
        
    }
}