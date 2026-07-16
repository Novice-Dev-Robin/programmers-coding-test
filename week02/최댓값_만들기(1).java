package week02;

import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        // 프리미티브 타입 배열을 래퍼클래스로 박싱(Object 타입 배열만 Collections를 사용할 수 있기 때문에)
        Integer[] newArray = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        
        // Integer 타입 : 래퍼클래스
        // 따라서, Collections 사용 가능
        Arrays.sort(newArray,Collections.reverseOrder());
        answer = newArray[0] * newArray[1];
        
        return answer;
    }
}
