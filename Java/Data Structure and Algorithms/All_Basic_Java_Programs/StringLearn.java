package All_Basic_Java_Programs;

public class StringLearn {
    public static void main(String[] args) {
        String s = "Prathamesh";
        int print_length_String = s.length();
        System.out.println(print_length_String);
        String newName = s.substring(0,3)+'T'+s.substring(4);
        System.out.println(newName);
        System.out.println(s.charAt(9));
    }
}
