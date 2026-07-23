package week02;

// 모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다.
// 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기를 return 하도록 solution 함수를 완성해주세요.

import java.util.Arrays;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int row = 0, col = 0;
        
        for(int cnt = 0; cnt < sizes.length; cnt++) {
            Arrays.sort(sizes[cnt]);
            
            row = (row > sizes[cnt][0]) ? row : sizes[cnt][0];
            col = (col > sizes[cnt][1]) ? col : sizes[cnt][1];
        }        
        
        answer = row * col;
        return answer;
    }
}