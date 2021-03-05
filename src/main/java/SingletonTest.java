public class SingletonTest {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        Singleton2 s4 = Singleton2.instance;
        Singleton2 s5 = Singleton2.instance;
        Singleton2 s6 = Singleton2.instance;

        s1.name = "Michał(Singleton)";
        s2.name = "Witek(Singleton)";
        s3.name = "Damian(Singleton)";

        s4.name = "Ania(Singleton2)";
        s5.name = "Gosia(Singleton2";
        s6.name = "Marta(Singleton2)";

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);

        System.out.println(s4.name);
        System.out.println(s5.name);
        System.out.println(s6.name);
    }
}
