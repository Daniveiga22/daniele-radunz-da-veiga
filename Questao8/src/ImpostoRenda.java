public class ImpostoRenda {

    private String nome;
    private String cpf;
    private String uf;
    private double rendaAnual;

    public ImpostoRenda(String nome, String cpf, String uf, double rendaAnual) {
        setNome(nome);
        setCpf(cpf);
        setUf(uf);
        setRendaAnual(rendaAnual);
    }

    @Override
    public String toString() {
        return "ImpostoRenda{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", uf='" + uf + '\'' +
                ", rendaAnual=" + rendaAnual +
                '}';
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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public double calcularAliquota(){
        if (rendaAnual >=0 || rendaAnual<= 4000){
            return rendaAnual;
            System.out.println(rendaAnual);
        } else if (rendaAnual >= 4001 || rendaAnual <=9000) {
            return rendaAnual;

        }
    }
}
