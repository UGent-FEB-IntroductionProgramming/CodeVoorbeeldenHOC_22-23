public class DemoStringEquals {
    public static void main(String[] args) {
        String tekst1 = new String("Java");
        String tekst2 = new String("Java");
        if(tekst2.equals(tekst1))
            System.out.println(true);
        if(tekst1 == tekst2){
            System.out.println(true);
        }
    }
}
