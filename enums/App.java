import java.util.Scanner;

import model.DiasDaSemana;
import model.Planetas;
import model.Meses;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        for (DiasDaSemana dia : DiasDaSemana.values()) {
            if (dia.isEhUtil()) {
                System.out.println(dia);
            }
        }

    // -------------------------------------------------------------------- //

        System.out.print("Digite o nome de um planeta: ");
        String nomePlaneta = in.nextLine().toUpperCase();

        Planetas escolhido = Planetas.valueOf(nomePlaneta);

        System.out.println("Planeta escolhido: " + escolhido);
        System.out.println("Raio: " + escolhido.getRaio() + " km");
        System.out.println("Massa: " + escolhido.getMassa() + " x10^24 kg");

        System.out.println("\nPlanetas com massa **maior** que " + escolhido.name() + ":");
        for (Planetas planeta : Planetas.values()) {
            if (planeta.getMassa() > escolhido.getMassa()) {
                System.out.println("- " + planeta.name());
            }
        }

        System.out.println("\nPlanetas com massa **menor** que " + escolhido.name() + ":");
        for (Planetas planeta : Planetas.values()) {
            if (planeta.getMassa() < escolhido.getMassa()) {
                System.out.println("- " + planeta.name());
            }
        }

    // -------------------------------------------------------------------- //

        System.out.println("Insira o número de um mês: ");
        int numeroMes = in.nextInt();

        Meses mesEscolhido = Meses.values()[numeroMes - 1];

        for (Meses mes : Meses.values()) {
            if (mes.getEstacao().equals(mesEscolhido.getEstacao())) {
                if(mes == mesEscolhido){
                    System.out.println(mesEscolhido.name() + "**: " + mesEscolhido.getEstacao().getEstacao());
                } else{
                    System.out.println(mes.name() + ": " + mes.getEstacao().getEstacao());
                }
            }
        }

    // ---------------------------------------------------------------- //

        System.out.println("Insira o número de um mês: ");
        int numeroMes2 = in.nextInt();

        Meses mesEscolhido2 = Meses.values()[numeroMes2 - 1];        

        for (Meses mes : Meses.values()) {
            if (mes.getQntDias() == mesEscolhido2.getQntDias()) {
                if (mes == mesEscolhido2) {
                    System.out.println(mes.name() + "**: " + mes.getQntDias() + " dias");
                } else {
                    System.out.println(mes.name() + ": " + mes.getQntDias() + " dias");
                }
            }
        }
        
        for (Meses mes : Meses.values()) {
            System.out.println(mes.name() + ": " + mes.getQntDias() + " dias");
        }

        in.close();
    }
}
