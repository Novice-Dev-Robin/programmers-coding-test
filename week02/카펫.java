package week02;

// 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때,
// 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.

public class 카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int i = 3; i < brown/2; i++) { // brown은 8 이상, yellow는 1 이상이므로, 최소 격자 크기는 9.
            for(int j = 3; j <= i; j++) { // 카펫의 가로 길이는 세로 길이와 같거나 길다.
                if(i * j == brown + yellow && (2*i + 2*(j-2) == brown)) {
                    answer[0] = i; // 가로
                    answer[1] = j; // 세로
                    break;
                }
            }
        }
        
        return answer;
    }
}