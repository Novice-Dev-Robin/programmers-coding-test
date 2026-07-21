package week02;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int total = 0; // 총합 중간 계산용
        
        for(int cnt = 1; cnt < n; cnt++) {
            
            total = 0; // 총합 초기화
            
            for(int cnt2 = cnt; cnt2 < n; cnt2++) {
                total += cnt2;
                
                if(total == n) {
                    answer++;
                    break;
                }
                
                else if(total > n) break;
            }
        }
        
        answer += 1; // 자기 자신 포함
        return answer;
    }
}
