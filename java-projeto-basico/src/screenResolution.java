import java.awt.Dimension;
import java.awt.Toolkit;


public class screenResolution {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        
        int larguraTela = screenSize.width;
        int alturaTela = screenSize.height;

        System.out.println("Resolução da Tela: " + larguraTela + "x" + alturaTela);
    }
}
