package exercicio.exercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ProcessaArquivosTextoEstruturados implements Serializable {
    String cliente;

    public ProcessaArquivosTextoEstruturados() {
        
    }

    public boolean verificaCliente(String codigo) {
        Path path1 = Paths.get("./exercicio/resources/CLIENTES.TXT");
        try (BufferedReader reader = Files.newBufferedReader(path1, Charset.defaultCharset())) {
            String line = null;
            String[] textoSeparado;

            while ((line = reader.readLine()) != null) {
                textoSeparado = line.split(":");

                if(textoSeparado[0].equals(textoSeparado)){
                    cliente = textoSeparado[0];
                    return true;
                } 
                
            }
            return false;
        }
        catch (IOException e) {
            System.err.format("Erro de E/S: %s%n", e);
            return false;
        }

    }

    public boolean processaVendasCliente() {
        if(!cliente.equals("")) {
            Path path1 = Paths.get("./exercicio/resources/VENDAS.TXT");
            try (BufferedReader reader = Files.newBufferedReader(path1, Charset.defaultCharset())) {
                String line = null;
                String[] textoSeparado;
                Double somatorio = 0.0;
    
                while ((line = reader.readLine()) != null) {
                    textoSeparado = line.split(":");
    
                    if(textoSeparado[2].equals(cliente)){
                        somatorio += (double) textoSeparado[3]
                        return true;
                    } 
                    
                }
                return false;
            }
            catch (IOException e) {
                System.err.format("Erro de E/S: %s%n", e);
                return false;
            }
    
        }
        
    }
}
