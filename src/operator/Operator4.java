package operator;

public class Operator4 {
    public static void main(String[] args) {
        int sum3 = 2 *2 + 3*3;
        System.out.println("sum3 = " + sum3);

        // sum3 +sum4는 결과 같지만, 명시적으로 괄호를 넣어주는 관례가 있다.
        // 코드가 모호해 지는것보다  조금더 길어지더라도 명시적으로 읽히는것이 좋다.
        int sum4 =(2 *2 ) + (3*3);
        System.out.println("sum4 = " + sum4);

        // 나만 알고 특별한 코드 보다
        // 모두다 알수 있는 코드가 좋다.
    }
}
