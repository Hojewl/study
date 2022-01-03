import java.util.*;

public class Q10951 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int sum =1;

        while(scan.hasNext()){
            int a = scan.nextInt();
            int b = scan.nextInt();
            sum = a+b;
            System.out.println(sum);
        }
    }
}
