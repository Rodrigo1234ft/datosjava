public class LlamaEjem7 {
    public static void main(String[] args) {
        Ejem7<String, String> ejemplo1 = new Ejem7<>("Hola", "Mundo");
        ejemplo1.verificatipo();

        Ejem7<Integer, Integer> ejemplo2 = new Ejem7<>(5, 10);
        ejemplo2.verificatipo();

        Ejem7<Double, Double> ejemplo3 = new Ejem7<>(5.5, 10.5);
        ejemplo3.verificatipo();

        Ejem7<Boolean, Boolean> ejemplo4 = new Ejem7<>(true, false);
        ejemplo4.verificatipo();

        Ejem7<Character, Character> ejemplo5 = new Ejem7<>('A', 'B');
        ejemplo5.verificatipo();

        Ejem7<Float, Float> ejemplo6 = new Ejem7<>(5.5f, 10.5f);
        ejemplo6.verificatipo();

        Ejem7<String, Integer> ejemplo7 = new Ejem7<>("Hola", 10);
        ejemplo7.verificatipo();
    }
}
