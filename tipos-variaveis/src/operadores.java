public class operadores {
    
    public static void main(String[] args){
 
        //Classe Operadores Java
        //Texto
        String meuNome = "Lucas Diaz";
        //Número Inteiro
        int idade = 18; 
        //Número Decimal
        double peso = 77.5;
        //Caracter
        char sexo = 'M';
        //Booleano (Sim ou Não)
        boolean doadorOrgao = false;

        //Operador Aritméticos
        double soma = 10.5 + 15.7;
        int subtração = 113 - 24;
        int multiplicação = 20 * 6;
        int divisão = 15/3;
        int modulo = 18 % 3;
        double resultado = (10*7)+(20/4);

        String nomeCompleto = "LUCAS" + "DIAZ";

        
        //Operadores Unários

        // (+) Positivo
        // (-) Negativo
        // (++) Incremento de valor
        // (--) Decremento de valor
        // (!) Negação


        int numero = +5;
    
        numero = - numero;

        numero = numero * -1;


        // Repetição

        int num = 5;
        num ++;
        // num = num + 1;

        //Booleano
        boolean variavel = true;
        //System.out.println(!variavel);

        variavel = !variavel;

        // Ternário

        int a,b;

        a = 5;
        b = 5;
        String valor = a==b ?"verdadeiro" : "falso";
    
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        
        if(numero1<numero2){
            System.out.println("é verdade");
        }


    }

}
