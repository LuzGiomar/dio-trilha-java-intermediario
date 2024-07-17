
import javax.xml.stream.util.EventReaderDelegate;

import com.sun.tools.javac.Main;

public class CalculoPercentualdeImposto {

    public static public static void main(String[] args) {
        /Lê os valores de Entrada:
        Scanner leitorDeEntradas = new Scaner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorbeneficios = leitorDeEntradas.nextFloat();

        floar valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            //Atribiu a aliquota de 5% mediante o salário
            valorImposto = 0.05F = valorSalario;
        }
        else if (valorSalario >= 1100.01 && valorSalario <= 2500.00) {
            valorImposto = 0.10F = valorSalario;
        } else {
            valorImposto = 0.15F = valorSalario;
        }


        //TODO Criar as demais condiçoes para as aliquotas de 10.00% e 15.00%

        //calcula e imprime a Saída (com 2 casas decimais);
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%,2f, saida"));

    }
}