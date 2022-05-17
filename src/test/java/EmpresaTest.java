import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class EmpresaTest {
    @Test
    void deveRetornarColaboradores() {
        Empresa empresa = new Empresa();
        empresa.cadastrar("Aline", "Brasil", "Juiz de Fora", "MG");
        empresa.cadastrar("Sara", "Brasil","Juiz de Fora", "MG");
        empresa.cadastrar("Pureza", "Brasil","Rio de Janeiro", "RJ");
        empresa.cadastrar("Brian", "México","Cidade do méxico", "ME");

        List<String> saida = Arrays.asList(
                "Colaborador{nome='Aline', país='Brasil', cidade='Juiz de Fora', uf='MG'}",
                "Colaborador{nome='Sara', país='Brasil', cidade='Juiz de Fora', uf='MG'}",
                "Colaborador{nome='Pureza', país='Brasil', cidade='Rio de Janeiro', uf='RJ'}",
                "Colaborador{nome='Brian', país='México', cidade='Cidade do méxico', uf='ME'}");

        assertEquals(saida, empresa.obterColaboradores());
    }

    @Test
    void deveRetornarTotalEnderecos() {
        Empresa empresa = new Empresa();
        empresa.cadastrar("Aline", "Brasil", "Juiz de Fora", "MG");
        empresa.cadastrar("Sara", "Brasil","Juiz de Fora", "MG");
        empresa.cadastrar("Pureza", "Brasil","Rio de Janeiro", "RJ");
        empresa.cadastrar("Brian", "México","Cidade do méxico", "ME");

        assertEquals(3, EnderecoFactory.getTotalEnderecos());
    }
}
