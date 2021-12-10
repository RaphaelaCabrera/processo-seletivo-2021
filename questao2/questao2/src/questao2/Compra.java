package questao2;

public class Compra {
    private DataHora dataHoraDaCompra;
    private float precoUnitario;
    private int quantidade;
    private float valorTotal;
    private Investidor investidor;
    private Produto produto;
    private Corretora corretora;
    
    public void Comprar(){
        
    }

    public DataHora getDataHoraDaCompra() {
        return dataHoraDaCompra;
    }

    public void setDataHoraDaCompra(DataHora dataHoraDaCompra) {
        this.dataHoraDaCompra = dataHoraDaCompra;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Investidor getInvestidor() {
        return investidor;
    }

    public void setInvestidor(Investidor investidor) {
        this.investidor = investidor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * @return the corretora
     */
    public Corretora getCorretora() {
        return corretora;
    }

    /**
     * @param corretora the corretora to set
     */
    public void setCorretora(Corretora corretora) {
        this.corretora = corretora;
    }
    
}
