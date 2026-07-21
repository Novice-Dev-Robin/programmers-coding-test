// < 문제 설명 >
// 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
// 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
// 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

// < 제한 조건 >
// x는 1 이상, 10000 이하인 정수입니다.

class 하샤드_수 {
    public boolean solution(int x) {
        boolean answer = true;
        
        int total = 0;
        
        // x를 String으로 형변환 -> 각 숫자를 파싱해서, 하샤드 수인지 판단
        String isHashad = Integer.toString(x);
        
        // String을 각 숫자별로 파싱
        String[] parseX = isHashad.split("");
        
        // 각 자리 수를 다시 수로 변환 및 자릿수 합 계산
        for(String num : parseX) {
           total += Integer.parseInt(num);
        }
        
        // 하샤드 수인지 판단, 나머지가 0이 아니라면 false로 변경
        if(x % total != 0) answer = false;
        
        return answer;
    }
}