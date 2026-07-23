package week02;

// 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
// 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.

import java.util.*;

public class 문자열_내_마음대로_정렬하기 {
    public String[] solution(String[] strings, int n) {
        
        // 조건 설정 후, 조건에 따른 정렬 (Comparator 사용)
        Arrays.sort(strings, new Comparator<String>() {
            
            @Override
            public int compare(String o1, String o2) {
                
                // char형이기 때문에, ==로 비교 가능 (같은 글자일 경우, 단어 자체를 비교)
                if(o1.charAt(n) == o2.charAt(n)) return o1.compareTo(o2);
                
                // Comparator 반환
                return o1.charAt(n) - o2.charAt(n);
                
            }
        });
        
        return strings;
    }
}
