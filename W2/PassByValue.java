public class PassByValue {
    private int year = 2018;
    private String str = "rmit";
    private char[] ch = { 'a', 'b', 'c', 128 };
    private void change(int year, String str, char[] ch) {
        year = 10;
        str = "rmit.edu.au";
        ch[0] = 'r';
    }
    public static void main(String args[]){
        PassByValue ex = new PassByValue();
        ex.change(ex.year, ex.str, ex.ch);
        System.out.print(ex.year + " and " + ex.str + " and ");
        System.out.println(ex.ch);
    }
}
