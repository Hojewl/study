//구구단을 출력해라
//
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int mul = scan.nextInt();

        for(int i=1; i < 10; i++){
            int result = mul * i;
            System.out.println(mul+" * "+i+" = "+result);
        }   
    }
}