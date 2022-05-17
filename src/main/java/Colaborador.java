public class Colaborador {

    private String nome;
    private Endereco enderecoResidencia;

    public Colaborador(String nome, Endereco enderecoResidencia) {
        this.nome = nome;
        this.enderecoResidencia = enderecoResidencia;
    }

    public String obterColaborador() {
        return "Colaborador{" +
                "nome='" + this.nome + '\'' +
                ", país='" + enderecoResidencia.getPais() + '\'' +
                ", cidade='" + enderecoResidencia.getCidade() + '\'' +
                ", uf='" + enderecoResidencia.getUf() + '\'' +
                '}';
    }
}
