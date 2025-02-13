package operator;

public class OperatorAdd1 {
    public static void main(String[] args) {
        int a = 0;

        a = a + 1; //1
        System.out.println(a);

        a = a +1; //2
        System.out.println(a);

        ++a;
        System.out.println("a = " + a);
        ++a;
        System.out.println("a = " + a);

        // ++a; 전위 증강자
        // a++; 후위 증강자


    }
}
