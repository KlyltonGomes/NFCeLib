package br.com.nfcelib.core.dto;

import java.math.BigDecimal;

public class ItemDto {

    private String codigoProduto; // Código do Produto (Código de barras ou código interno)
    private String descricaoProduto; // Descrição do Produto
    private int quantidade; // Quantidade do Produto
    private BigDecimal valorUnitario; // Valor Unitário do Produto
    private BigDecimal valorTotal; // Valor Total do Produto (Quantidade * Valor Unitário)
    private ImpostoDto imposto; // Imposto do item (agora com a lógica de Strategy)


    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ImpostoDto getImposto() {
        return imposto;
    }

    public void setImposto(ImpostoDto imposto) {
        this.imposto = imposto;
    }
}
