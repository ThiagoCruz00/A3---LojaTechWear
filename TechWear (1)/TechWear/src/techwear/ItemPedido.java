/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package techwear;

/**
 *
 * @author macga
 */
public class ItemPedido {
    private int idProduto;
    private int quantidade;
    private float totalItem;
    private int idItemCarrinho;

    public ItemPedido(int idProduto, int quantidade, float totalItem, int idItemCarrinho) {
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.totalItem = totalItem;
        this.idItemCarrinho = idItemCarrinho;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getTotalItem() {
        return totalItem;
    }

    public int getIdItemCarrinho() {
        return idItemCarrinho;
    }
}

