public class carro {
    private String modelo;
    private String cor;
    private int ano;

    /*
    Método construtor
     */
    public carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public void proprietario(pessoa p) {
        System.out.println("Proprietário do carro " + modelo + cor + ano + " é: " + p.getNome());
    }
}
