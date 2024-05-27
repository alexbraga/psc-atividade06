package model;

public class Trabalhador {
    private String nome;
    private double salarioBruto;
    private double descontoINSS;
    private int dependentes;
    private double totalDescontosIRRF;
    private String cpf;
    private String cep;
    private String endereco;

    public Trabalhador(
            String nome,
            double salarioBruto,
            double descontoINSS,
            int dependentes,
            double totalDescontosIRRF,
            String cpf,
            String cep
    ) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.descontoINSS = descontoINSS;
        this.dependentes = dependentes;
        this.totalDescontosIRRF = totalDescontosIRRF;
        this.cpf = cpf;
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getDescontoINSS() {
        return descontoINSS;
    }

    public void setDescontoINSS(double descontoINSS) {
        this.descontoINSS = descontoINSS;
    }

    public int getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }

    public double getTotalDescontosIRRF() {
        return totalDescontosIRRF;
    }

    public void setTotalDescontosIRRF(double totalDescontosIRRF) {
        this.totalDescontosIRRF = totalDescontosIRRF;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
