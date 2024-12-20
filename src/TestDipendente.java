import java.util.Scanner;
public class TestDipendente {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        double percentualeAumento;
        Dipendente dipendente=new Dipendente("Vittorio",3000);
        System.out.print("Inserisci la percentuale di aumento del salario: ");
        percentualeAumento= input.nextDouble();
        System.out.println("Stipendio dopo l'aumento: "+dipendente.incrementaSalario(percentualeAumento));
    }
}
