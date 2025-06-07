package operator;

public class Com2 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello"); // 문자열은 리터럴로 확인
        boolean result2 = str1.equals("문자열1");
        boolean result3 = "str2".equals(str2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        System.out.println("hello" == "hello"); //이건 올바르지 못함 문자열은 무조건 .equals
    }
}
