package packegeOne;

import java.util.Random;

public class Luta {
    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovado;

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            setAprovado(true);
            setDesafiado(l1);
            setDesafiante(l2);
        } else {
            setAprovado(false);
            setDesafiado(null);
            setDesafiante(null);
        }
    }

    private void nowStatus() {
        desafiado.status();
        desafiante.status();
    }

    public void lutar() {
        if (getAprovado()) {
            desafiado.apresentar();
            desafiante.apresentar();
            nowStatus();
            Random aux = new Random();
            int vencedor = aux.nextInt(3);
            System.out.println("\n======####RESULTADO####======");
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vendedor: " + desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Vendedor: " + desafiante.getNome());
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }
            System.out.println("=============================");
            nowStatus();
        } else {
            System.out.println("Luta não pode acontecer!");
        }
    }

    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return this.aprovado;
    }

    public boolean getAprovado() {
        return this.aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

}