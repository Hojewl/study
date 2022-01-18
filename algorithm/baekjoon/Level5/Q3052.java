//입력받은 수를 42로 나누고,
//나눈 나머지 값들이 서로 다른 경우 count++ 한다.


import java.util.*;

public class Q3052 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //10개짜리 배열 선언
        int [] numArr = new int [10];
        ArrayList<Integer> leftArr = new ArrayList<Integer>();

        for(int i=0;i<10;i++){
            //입력받은 수의 나머지값을 배열에 넣기
            numArr[i] = scan.nextInt();
        }
        for(int i=0;i<10;i++){
            if(!leftArr.contains(numArr[i]%42)){
                leftArr.add(numArr[i]%42);
            }
        }
        System.out.println(leftArr.size());

    }

}
