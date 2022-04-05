package calculadoradesconto;
import java.io.*;

public class CalculadoraDescontoo {
    public static void main(String[] args) {
    float desconto, produto, valorDesconto, produtoDesconto;
    BufferedReader dado;
    String s;
   
    
    try{
        System.out.println("Informe o valor do produto");
         dado = new BufferedReader(new InputStreamReader(System.in));
          s = dado.readLine();
          produto = Float.parseFloat(s);
          
          System.out.println("Informe o %  do desconto");
         dado = new BufferedReader(new InputStreamReader(System.in));
          s = dado.readLine();
          desconto = Float.parseFloat(s);
          
          valorDesconto = produto * desconto /100;
          produtoDesconto = produto - valorDesconto;
          
          System.out.println("Esse foi o desconto concedido : " +valorDesconto);
          System.out.println("E esse é o valor do produto já com desconto: " +produtoDesconto);
   }catch (IOException erro){
            System.out.println("Houve erro na entrada de dados" + erro.toString());
    }catch (NumberFormatException erro){
            System.out.println("Houve erro na conversão, digite apenas caracteres numéricos"
                      + erro.toString());
   
    }
    
    }
    
}
