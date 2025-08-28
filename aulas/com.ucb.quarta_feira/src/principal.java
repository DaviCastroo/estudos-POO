public class principal
{

    public static void main(String[] args)
    {
        pessoa p1 = new pessoa("Davi Castro", 19);
        pessoa p2 = new pessoa("Roberval", 95);

        p1.apresentar();
        p2.apresentar();

        carro c1 = new carro("Honda Civic", "Azul", 2000);
        carro c2 = new carro("BYD Yuan Plus", "Azul", 2025);

        c1.proprietario(p1);
        c2.proprietario(p2);
    }
}