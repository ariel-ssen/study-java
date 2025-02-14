package operator;

public class Logical1 {
    public static void main(String[] args) {
        System.out.println("&&: AND 연산");
        // 커멘트 쉬프트 엔터 다음줄 시작으로 갈수 있는 단축키
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("||: OR 연산");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("! 연산");
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);
    }
}
