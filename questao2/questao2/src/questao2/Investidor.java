package questao2;

public class Investidor {
    private String nome;
    private String cpf;
    private Data data;
    private float valorAInvestir;
    private String email;
    private Compra listaDeCompras[] = new Compra[100];
    
    public void Inserir(){
        
    }
    
    public void Alterar(){
        
    }
    
    public void Excluir(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public float getValorAInvestir() {
        return valorAInvestir;
    }

    public void setValorAInvestir(float valorAInvestir) {
        this.valorAInvestir = valorAInvestir;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Compra[] getListaDeCompras() {
        return listaDeCompras;
    }

    public void setListaDeCompras(Compra[] listaDeCompras) {
        this.listaDeCompras = listaDeCompras;
    }
    
}
