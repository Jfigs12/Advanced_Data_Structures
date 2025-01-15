public class Main {
    public static void main(String[] args) {
        System.out.println(ParenTools.isValid("()()"));
        System.out.println(ParenTools.isValid("(test)"));
        System.out.println(ParenTools.isValid("()test()"));
        System.out.println(ParenTools.isValid("()test)()"));
    }
}
