import java.util.HashMap;
import java.util.Map;

public class EnderecoFactory {

    private static Map<String, Endereco> enderecos = new HashMap<>();

    public static Endereco getEndereco(String pais, String cidade, String uf) {
        Endereco endereco = enderecos.get(cidade);
        if (endereco == null) {
            endereco = new Endereco(pais, cidade, uf);
            enderecos.put(cidade, endereco);
        }
        return endereco;
    }

    public static int getTotalEnderecos() {
        return enderecos.size();
    }
}
