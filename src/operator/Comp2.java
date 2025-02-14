package operator;

public class Comp2 {

    public static void main(String[] args) {
        String str1 = "문자열";
        String str2 = "문자열";

        /* 문자열 비교 에서는 "=="을 쓰지 않는다
        특정한 조건에서는 정답이라 생각하는것이 정답으로 안나오기때문에
        .equals()를 사용하자
         */
        boolean result1 = "hello".equals("hello");
        boolean result2 = str1.equals("문자열");
        boolean result3 = str1.equals(str2);

        //세미콜론 커멘트 쉬프트 엔터
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
