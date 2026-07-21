// 콜라를 받기 위해 마트에 주어야 하는 병 수 a, ex) 3
// 빈 병 a개를 가져다 주면 마트가 주는 콜라 병 수 b, ex) 2
// 상빈이가 가지고 있는 빈 병의 개수 n이 매개변수로 주어집니다. ex) 20
// 상빈이가 받을 수 있는 콜라의 병 수를 return 하도록 solution 함수를 작성해주세요.

class 콜라_문제 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int new_coke = 0; // 새로 받은 콜라
        
        // 빈 병을 가져갔을 때 (n이 무조건 a보다 커야 함)
        while(n >= a) {
            new_coke = b * (n / a); // 새로 받은 콜라 = 마트가 주는 콜라 * 병을 준 횟수
            
            answer += new_coke; // 새로 받은 콜라를 결과값에 추가
            
            n = new_coke + n % a; // 전체 빈 병 = 새로 받은 콜라 + 마트에 주고 남은 빈 병(으로 초기화)
        }
    
        return answer;
    }
}