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
        if (nome == null || nome.isBlank()){ //is.Blank elimina todos os espaços em branco, para fazer a validação
            System.out.println("Erro, nome inválido!");
        } else {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isBlank() || cpf.length() != 11){//cpf.lenght != 11 é para validar a quantidade de numeros do cpf
            System.out.println("CPF inválido!");
        } else {
            this.cpf = cpf;
        }
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if( uf == null || uf.isBlank() || uf.length() != 2){
            System.out.println("Erro, uf inválida!");
        }else {
            this.uf = uf;
        }

    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        if (rendaAnual < 0){
            System.out.println("Erro, Renda Anual Inválida!");
        }else {
            this.rendaAnual = rendaAnual;
        }

    }
    public double calcularImposto(){
        return rendaAnual * calcularAliquota();
    }

    public double calcularAliquota() {
        if (rendaAnual <= 4000) {
            return 0;

        } else if (rendaAnual <= 9000) {
            return 0.058;
        } else if (rendaAnual <= 25000) {
            return 0.15;
        } else if (rendaAnual <= 35000) {
            return  0.275;
        }
            return rendaAnual * 0.3;

    }
}
