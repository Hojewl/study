import java.util.*;

public class Q10818 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int [] numArray = new int[num];
        //입력값으로 배열 채우기
        for(int i=0;i<num;i++){
            numArray[i] = scan.nextInt();
        }
        //오름차순 정렬
        Arrays.sort(numArray);

        System.out.println(numArray[0]+" "+numArray[num-1]);
    }
}
