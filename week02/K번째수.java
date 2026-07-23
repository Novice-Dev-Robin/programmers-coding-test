package week02;

// 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

// 예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면

// array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
// 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
// 2에서 나온 배열의 3번째 숫자는 5입니다.
// 배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때,
// commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return.

// 문제 핵심 : 배열 자르기 -> 정렬 -> k번째 원소 뽑기

import java.util.Arrays;

class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int cnt = 0; cnt < commands.length; cnt++) {
            
            // 새 배열로 복사
            // copyOfRange는 from, to 인덱스를 받고, 각각 해당 값의 인덱스를 포함, 미포함 하는 메소드
            int[] newArr = Arrays.copyOfRange(array, commands[cnt][0] - 1, commands[cnt][1]); // from은 포함, to는 미포함
            
            // 배열 정렬
            Arrays.sort(newArr);
            
            // 원소 뽑기
            answer[cnt] = newArr[commands[cnt][2] - 1];
        }
        
        return answer;
    }
}