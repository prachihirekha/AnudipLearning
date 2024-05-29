package workspace.string;

public class StringConcatDemo {
    public static void main(String[] args) {
        String str = "hello";
        String str1="java";
        String str3= new String("hi");
        String str4 = str3.concat(str1);
        System.out.println(str4);
        String str2 = str.concat(str1);
        System.out.println(str2);
    }
}

