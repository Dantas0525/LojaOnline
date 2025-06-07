import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando usuários
        Usuario usuario1 = new Usuario("Douglas Silva", "123.456.789-00", "douglas@email.com");

        // Criando produtos
        Produto produto1 = new Produto("Notebook", 3500.00, 10);
        Produto produto2 = new Produto("Mouse Gamer", 150.00, 20);
        Produto produto3 = new Produto("Teclado Mecânico", 250.00, 15);

        // Criando lista de produtos disponíveis (simulando um banco de dados)
        List<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        // Simulando uma venda
        Venda venda1 = new Venda(usuario1);
        venda1.adicionarItem(produto1, 1);
        venda1.adicionarItem(produto2, 2);

        // Exibindo resumo da venda
        System.out.println("===== Resumo da Venda =====");
        venda1.exibirResumo();

        // Exibindo produtos após venda
        System.out.println("\n===== Produtos Disponíveis Após Venda =====");
        for (Produto p : listaProdutos) {
            System.out.println(p);
        }
    }
}
