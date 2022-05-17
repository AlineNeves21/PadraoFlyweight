import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Empresa {

    private List<Colaborador> colaboradores = new ArrayList<>();

    public void cadastrar(String nomeColaborador, String pais, String nomeCidade, String uf) {
        Endereco endereco = EnderecoFactory.getEndereco(pais, nomeCidade, uf);
        Colaborador colaborador = new Colaborador(nomeColaborador, endereco);
        colaboradores.add(colaborador);
    }

    public List<String> obterColaboradores() {
        List<String> saida = new ArrayList<String>();
        for (Colaborador colaborador : this.colaboradores) {
            saida.add(colaborador.obterColaborador());
        }
        return saida;
    }
}
