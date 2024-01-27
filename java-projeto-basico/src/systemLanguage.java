import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

public class systemLanguage {
    public static void main(String[] args) {
        Map<String, String> formataLinguagem = new HashMap<>();
        formataLinguagem.put("pt", "Português");
        formataLinguagem.put("en", "Inglês");

        String idiomaEncontrado = Locale.getDefault().getLanguage();

        String idiomaDoSistema = formataLinguagem.getOrDefault(idiomaEncontrado, "Desconhecido");

        System.out.println("Idioma do Sistema: " + idiomaDoSistema);
    }
}
