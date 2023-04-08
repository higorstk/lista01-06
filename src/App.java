import java.util.Scanner;
class Main{
public static void main(String[] args){
//Passo1:Mostrar variável
double raio;
  double area;

//Passo2:Entrada de dados
  
Scanner teclado = new Scanner(System.in);
  System.out.println("Digite o raio");
raio = teclado.nextDouble();
  area = Math.PI * Math.pow(raio, 2);
  
//Passo3:Mostrar resultado
  
System.out.println("A sua área é:" + area);
 }
}
