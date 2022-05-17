public class Endereco {

    private String pais;
    private String cidade;
    private String uf;

    public Endereco(String pais, String cidade, String uf) {
        this.pais = pais;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getPais() {
        return pais;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }
}
