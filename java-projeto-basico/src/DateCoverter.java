import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateCoverter {
    public static void main(String[] args) {
        LocalDateTime data = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dataHoraFormatada = data.format(formatter);


        System.out.println("Data e hora atual do sistema: " + dataHoraFormatada);
    }

}
