public class Main {

    public static void main(String[] args) {
        try {
            String s = RzymArab.arab2rzym(Integer.parseInt(args[0]));
            System.out.println(s);
            int n = RzymArab.rzym2arab(args[1]);
            System.out.println(n);
            int k = RzymArab.rzym2arab(args[2]);
        } catch (RzymArabException e) {
            System.out.println(e.getMessage());
        }
    }
}
