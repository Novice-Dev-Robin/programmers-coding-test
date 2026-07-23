package week02;

//  수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

// 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, ..., 1, 2, 3, 4, 5, ...
// 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, ..., 2, 1, 2, 3, 2, 4, 2, 5, ...
// 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ..., 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

// 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때
// 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

import java.util.*;

public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        
        int[] supo1 = {1, 2, 3, 4, 5}; // 1번 수포자가 찍는 방식
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5}; // 2번 수포자가 찍는 방식
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 3번 수포자가 찍는 방식
        
        int cnt = 0;
        int cor1 = 0; // 1번 수포자가 맞춘 횟수
        int cor2 = 0; // 2번 수포자가 맞춘 횟수
        int cor3 = 0; // 3번 수포자가 맞춘 횟수
        
        while(cnt < answers.length) { // 정답 길이까지 탐색
            if(supo1[cnt % 5] == answers[cnt]) cor1++;
            if(supo2[cnt % 8] == answers[cnt]) cor2++;
            if(supo3[cnt % 10] == answers[cnt]) cor3++;
            
            cnt++;
        }
        
        int idx = 0;
        
        if(cor1 >= cor2 && cor1 >= cor3) answer[idx++] = 1;
        if(cor2 >= cor3 && cor2 >= cor1) answer[idx++] = 2;
        if(cor3 >= cor2 && cor3 >= cor1) answer[idx++] = 3;
        
        // 반환부 핵심 : [1], [1,2] 형태로 맞춰야 함. [1,0,0] 안됨.
        return Arrays.copyOf(answer, idx);
    }
}

