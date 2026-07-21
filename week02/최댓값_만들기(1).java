package week02;

// 정수 배열 numbers가 매개변수로 주어집니다.
// numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.

import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        // 프리미티브 타입 배열을 래퍼클래스로 박싱(Object 타입 배열만 Collections를 사용할 수 있기 때문에)
        Integer[] newArray = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        
        // Integer 타입 : 래퍼클래스
        // 따라서, Collections 사용 가능
        Arrays.sort(newArray, Collections.reverseOrder());
        answer = newArray[0] * newArray[1];
        
        return answer;
    }
}