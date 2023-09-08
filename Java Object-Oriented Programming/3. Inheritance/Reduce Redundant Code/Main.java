public class Main {
    
    public static void main(String[] args) {

        ModArrayList<Integer> list = new ModArrayList<>();
        
        for(int i = 0; i <= 10; i++) {
            list.add(i);
        }

        System.out.println(list.getUsingMod(3));
        System.out.println(list.getUsingMod(-3));
        System.out.println(list.getUsingMod(14));
    }
}
