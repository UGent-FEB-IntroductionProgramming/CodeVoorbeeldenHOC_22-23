public class DemoLijst {
    public static void main(String[] args) {
        Lijst list = new Lijst();

        list.addItem("Kamer opruimen");
        list.addItem("studeren");

        list.isOnLijst("studeren");
        list.eraseList();
    }
}
