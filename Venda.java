import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Usuario usuario;
    private List<ItemVenda> itens;
    private double total;

    public Venda(Usuario usuario) {
        this.usuario = usuario;
        this.itens = new ArrayList<>();
        this.total = 0.0;
    }

    public void adicionarItem(Produto produto, int quantidade) {
        if (produto.getQuantidade() >= quantidade) {
            ItemVenda item = new ItemVenda(produto, quantidade);
            itens.add(item);
            produto.reduzirEstoque(quantidade);
            total += item.getSubtotal();
        } else {
            System.out.println("Não foi possível adicionar o produto: " + produto.getNome() + ". Estoque insuficiente.");
        }
    }

    public void exibirResumo() {
        System.out.println("Cliente: " + usuario.getNome());
        System.out.println("Itens comprados:");
        for (ItemVenda item : itens) {
            System.out.println(item);
        }
        System.out.println("Total da venda: R$ " + total);
    }
}
