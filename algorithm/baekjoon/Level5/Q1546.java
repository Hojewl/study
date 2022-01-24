//입력받은 점수를 최댓값(M)을 제외한 나머지 점수들(n) n/M*100 해주고 난 후의
//평균구하기

import java.util.*;

public class Q1546 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //시험 과목 수만큼 점수 입력받기
        int sub = scan.nextInt();
        int [] score = new int[sub];
        float [] newScore = new float [sub];

        for(int i=0;i<sub;i++){
            score[i] = scan.nextInt();
        }
        //최댓값 구하기 - 오름차순으로 정렬 후 마지막 인덱스값
        Arrays.sort(score);
        int max = score[sub-1];

        //평균 구하기 - 마지막 최댓값 제외하고 배열 전체에 값 변경 후 평균 구하기
        float avg = 0;
        for(int i=0;i<sub;i++){
            newScore[i] = (float)score[i]/max*100;
        }
        for(int i=0;i<sub;i++){
            avg += newScore[i];
        }

        System.out.println(avg/sub);
    }
}
