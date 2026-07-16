class 나머지가_1이_되는_수_찾기 {
    public int solution(int n) {
        int answer = 0;

        // 홀수는 가장 작은 자연수 x가 2
        if(n % 2 == 1) return 2;

        // 짝수일 경우, 직접 나머지 계산 필요
        // 시간 복잡도 : O(n)
        for(int cnt = 3; cnt < n; cnt++) {
            if(n % cnt == 1) {
                answer = cnt;
                break;
            }
        }

        return answer;
    }
}