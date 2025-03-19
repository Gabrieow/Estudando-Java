import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        LocalDate dataAtual, dataEspecifica, dataConvertida;
        DateTimeFormatter frmtReceber, frmtExibir;
        int dia, mes, ano;
        Month objetoMes;
        String dataString;
        LocalTime horaAtual, horaFutura;


        System.out.println("Trabalhando com datas em java");

        dataAtual = LocalDate.now();
        System.out.println("Data Atual: " + dataAtual);

        dataEspecifica = LocalDate.of(2025, 03, 18);
        System.out.println("Data específica: " + dataEspecifica);

        ano = dataAtual.getYear();
        mes = dataAtual.getMonthValue();
        dia = dataAtual.getDayOfMonth();

        System.out.println("Ano: " + ano);
        System.out.println("Mês: " + mes);
        System.out.println("Dia: " + dia);

        objetoMes = dataAtual.getMonth();
        System.out.println(objetoMes.getDisplayName(TextStyle.FULL, new Locale
        ("pt", "BR")));

        System.out.println("Digite uma data (dd/MM/yyyy): ");
        dataString = entrada.nextLine();

        frmtReceber = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        frmtExibir = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");

        dataConvertida = LocalDate.parse(dataString, frmtReceber);
        System.out.println("Data convertida: " + dataConvertida);

        System.out.println("Data atual: " + dataAtual.format(frmtExibir));
        System.out.println("Data convertida: " + dataConvertida.format(frmtReceber));

        System.out.println("\n\n LocalTime \n");

        horaAtual = LocalTime.now();
        System.out.println("Hora Atual: " + horaAtual);

        horaFutura = horaAtual.plusHours(1);
        horaFutura = horaFutura.plusMinutes(30);
        horaFutura = horaFutura.plusSeconds(15);
        System.out.println("Hora Futura: " + horaFutura);

        horaFutura = horaFutura.minusHours(1);
        horaFutura = horaFutura.minusMinutes(15);
        System.out.println("Hora futura2: " + horaFutura);

    }
}
