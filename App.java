package exercicio.exercicio3;

import java.util.Scanner;

public class App {
    
    public App() {

    }

    public void executa() {
        ProcessaArquivosTextoEstruturados p1 = new ProcessaArquivosTextoEstruturados();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o código do cliente desejado: ");
        String code = input.nextLine();

        if(p1.verificaCliente(code)){
            
        }


    }
}
