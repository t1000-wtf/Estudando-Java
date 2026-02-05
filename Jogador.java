public class Jogador {
    private int id;
    private String nome;
    private int vidas;
    private int pontos;
    private final int MAX_VIDAS = 3;

    public Jogador(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.vidas = 1;
        this.pontos = 0;
        System.out.printf("Jogador %s criado com 1 vida", nome);
    }

    public void ganharVida() {
        if (this.vidas < this.MAX_VIDAS) {
            this.vidas++;
        } else {
            System.out.println("Vida maxima atingida");
        }
    }

    public void perderVida() {
        vidas--;
        if (this.vidas == 0) {
            System.out.printf("Jogador %s foi eliminado", nome);
        }
    }

    public void ganharPontos(int valor) {
        this.pontos += valor;
    }

    public void mostrarStatus() {
        System.out.printf("%nNome: %s", this.nome);
        System.out.printf("%nVidas= %d", this.vidas);
        System.out.printf("%nPontos: %d", this.pontos);
    }

    public boolean estaVivo() {
        return this.vidas > 0;
    }
}
