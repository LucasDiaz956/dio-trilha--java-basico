import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class AboutMe {
    public static void main(String[] args) {

        try{
        //Criando o objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();


        //Imprimindo os dados do usuário
        System.out.println("Hello, my name is " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("I am " + idade + " years old");
        System.out.println("I am " + altura + " cm");
        scanner.close();
        }
        catch (InputMismatchException e){
            System.out.println("Os campo de idade e altura precisam ser numéricos");
        }

    }
}
    
