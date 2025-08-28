public class pessoa
{
'    private String nome;
    private int idade;
    private String[] cpf = new String[11];
    private double altura;

    public pessoa(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
        this.cpf = null;

    }

    public void apresentar(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    // Método de retorno para o nome (tipo private)

    public String getNome() {
        return nome;
    }
'}
