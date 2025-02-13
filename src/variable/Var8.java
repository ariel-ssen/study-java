package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
        byte b = 127; // -128~ 127 //2에8제곱
        short s = 32767; // -32,758 ~ 32,767 //2에16제곱
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 20 억) //2에32제곱

        // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 //2에64제곱
        long l = 9223372036854775807L;

        // 실수
        float f = 10.0f; // 4byte 2에 32
        double d = 10.0; // 8byte 2에 64

    }
}
