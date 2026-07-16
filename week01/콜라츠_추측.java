class 콜라츠_추측 {
    public int solution(int num) {

        // 횟수 카운트용 정수형 변수 count
        int count;

        for(count = 0; count < 500; count++) {
            if(num == 1) return count;

            if(num % 2 == 0) num = num / 2;
            else if(num % 2 == 1) num = num * 3 + 1;
        }

        if(num == 1) return count;
        else return -1;
    }
}

