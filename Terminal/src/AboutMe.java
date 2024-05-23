import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        //Objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    
        System.out.println("Your name");
        String nome = scanner.next();

        System.out.println("Your last name");
        String sobrenome = scanner.next();

        System.out.println("Your age");
        int idade = scanner.nextInt();
        
        System.out.println("your height");
        double altura = scanner.nextDouble();

        //Imprimindo dados do usuário
        System.out.println("Hello, my name is " + nome + " " + sobrenome);
        System.out.println("I am " + idade + " years old");
        System.out.println("I am " + altura + " cm");


    }

}