public class App {
    public static void main(String[] args) {
        Tamagushi2 meuTamagushi = new Tamagushi2("Rayquaza", 2, 3, 7, 5);

        // Testes
        System.out.println("Nome: " + meuTamagushi.retornarNome());
        System.out.println("Fome: " + meuTamagushi.retornarFome());
        System.out.println("Saúde: " + meuTamagushi.retornarSaude());
        System.out.println("Idade: " + meuTamagushi.retornarIdade());
        System.out.println("Tédio: " + meuTamagushi.retornarTedio());
        System.out.println("Humor: " + meuTamagushi.retornarHumor());

        meuTamagushi.alterarFome(8);
        meuTamagushi.alterarSaude(8);

        System.out.println("Fome: " + meuTamagushi.retornarFome());
        System.out.println("Saúde: " + meuTamagushi.retornarSaude());
        System.out.println("Humor: " + meuTamagushi.retornarHumor());

        meuTamagushi.brincar(4);
        meuTamagushi.fornecerComida(3);
        System.out.println("Fome: " + meuTamagushi.retornarFome());
        System.out.println("Tédio: " + meuTamagushi.retornarTedio());
        System.out.println("Humor: " + meuTamagushi.retornarHumor());

        int opcao = 0;
        if (opcao == 0) {
            System.out.println("\nPorta Escondida - Valores Exatos dos Atributos:\n" + meuTamagushi.toString());
        }

    }
}
