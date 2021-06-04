public class Example {
    public static void main(String[] args) {
        String a = "иван иванов";
        String b = "Иван Иванов";
        Example p = new Example();
        Example v = new Example();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(p.hashCode());
        System.out.println(v.hashCode());
    }
}