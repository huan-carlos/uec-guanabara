package packegeOne;

public class UEC {
    public static void main(String[] args) {
        Lutador warrior[] = new Lutador[2];

        warrior[0] = new Lutador("Huan", "Brasileiro", 27, 15, 3, 1, 1.56, 103.5);
        warrior[1] = new Lutador("Arivane", "Argentina", 22, 21, 1, 3, 1.22, 78.2);

        Luta UEC001 = new Luta();
        UEC001.marcarLuta(warrior[0], warrior[1]);
        UEC001.lutar();
    }
}