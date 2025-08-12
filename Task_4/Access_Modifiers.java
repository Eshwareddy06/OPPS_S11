package Task_4;
public class Access_Modifiers {
    private int a = 1;
    int b = 2;
    protected int c = 30;
    public int d = 40;

    public static void main(String[] args) {
        Access_Modifiers obj = new Access_Modifiers();
        System.out.println(obj.a);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}