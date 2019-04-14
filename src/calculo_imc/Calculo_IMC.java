package calculo_imc;
import java.util.Scanner;
import java.lang.Math;
        
public class Calculo_IMC {
    
    Scanner sc = new Scanner(System.in);// Declaração do Scanner
    
    int menu(){
         
        System.out.println("1 = calcule seu IMC." +"\n"+"2 = Sair.");
        System.out.print("Informe a opçao:");
        
        int opcao =sc.nextInt(); //variavel para receber a escolha da opçao
        
        if (opcao == 1 ) {	 
           Calculo();//chama a função para calcular o imc
        }
    		
     return opcao;//retorna a opção para trarar ela no main
    }
    
    
    
    void Calculo() {
    	
    	System.out.println("---Calculo de IMC---");
        
    	
    	//pede as informaçoes ao usuario
        System.out.print("Infome seu peso(kg):");
        float peso = sc.nextFloat();
        
        System.out.print("Informe sua altura(Metro):");
        float altura=sc.nextFloat();
        

        
        Double imc= peso/(Math.pow(altura,2));//formula do imc
        
        System.out.printf("Seu IMC é:%.2f %n",imc);//imprimi o imc delimitando em 2 casas decimais
        
        System.out.println("---Resultado da Situação---");
        
        
        //trata o resultado mostrando ao usuario o seu status
        if (imc < 20){
            System.out.println("Abaixo do peso");
        }
        	else if(imc>=20 && imc<25){
            System.out.println("Normal");
        }
        	else if(imc>= 25 && imc < 30){
            System.out.println("Excesso de peso");
        }
        	else if (imc >= 30 && imc < 35){
            System.out.println("Obesidade");
        }
        else{
            System.out.println("Obesidade Mórbida");
        }
        System.out.println("-----------");
           	
    }
    
}








//Augusto Savi/20/03/19/00:59/
//Arthur Hassan Souki/20/03/19/19:19/
//Arthur Neto Bem/20/03/19/19:20/