public class Kakdela {
    public static void main(String[] args) {
        noReturn();
        System.out.println(sum(2,3, "k"));
    }

    public static void noReturn(){
        System.out.println("kak");
    }
    private static int sum(int a,int b, String name){
        return a+b;
    }
}
