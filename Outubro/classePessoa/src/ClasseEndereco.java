public class ClasseEndereco {

    private String uf;
    private String cidade;
    private String cep;
    private String logradouro;
    private String numeroResidencia;

    public ClasseEndereco(String uf, String cidade, String cep, String logradouro, String numeroResidencia) {
        setUf(uf);
        setCidade(cidade);
        setCep(cep);
        setLogradouro(logradouro);
        setNumeroResidencia(numeroResidencia);
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        if (uf == null || uf.isBlank() || uf.length() != 2){
            throw new IllegalArgumentException("UF informada é Inválida");
        }
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if (cidade == null || cidade.isBlank()){
            throw new IllegalArgumentException("Cidade Informada Inválida");
        }

        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if (cep == null || cep.isBlank() || cep.length() !=8){
            throw new IllegalArgumentException("CEP Informado Inválido!");
        }
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        if (logradouro == null || logradouro.isBlank()){
            throw new IllegalArgumentException("Logradoura informado esta Inválido!");
        }
        this.logradouro = logradouro;
    }

    public String getNumeroResidencia() {
        return numeroResidencia;
    }

    public void setNumeroResidencia(String numeroResidencia) {
        if (numeroResidencia == null || numeroResidencia.isBlank()){
            throw new IllegalArgumentException("Numero informado esta Inválido!");
        }
        this.numeroResidencia = numeroResidencia;
    }

    @Override
    public String toString() {
        return "ClasseEndereco{" +
                "uf='" + uf + '\'' +
                ", cidade='" + cidade + '\'' +
                ", cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numeroResidencia='" + numeroResidencia + '\'' +
                '}';
    }
}
