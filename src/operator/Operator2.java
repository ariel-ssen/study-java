package operator;

public class Operator2 {
    public static void main(String[] args) {

        String result1 = "hello" + "world";
        System.out.println("result1 = " + result1);

        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 +s2;

        System.out.println("result2 = " + result2);

        String result3 = "a + b = " +10;
        System.out.println("result3 = " + result3);

        // 문자와 숫자를 더하면 숫자를 문자열로 변경한 다음에 서로 더한다.
        // 문자열에 뭘 더하든 문자열이 된다!!
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println("result4 = " + result4);


    }
}
