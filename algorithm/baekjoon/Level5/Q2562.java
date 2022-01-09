import java.util.*;

public class Q2562 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int [] arr = new int [9];
        int max = 0;
        int maxIdx = 0;

        for(int i=0;i<9;i++){
            arr[i] = scan.nextInt();
        }
        for(int i=0;i<9;i++){
            if(arr[i] > max){
                max = arr[i];
                maxIdx = i;
            }
        }

        System.out.println(max);
        //배열의 index는 실제 n번째의 n보다 1이 작다
        System.out.println(maxIdx+1);
    }
}
