    import java.util.Scanner;
    public class SenhaTeste {
public static void main(String[] args) {




    Scanner scnSenha = new Scanner(System.in);
    
    

      try {  for(int a = 1; a <= 3;) {
        
            int senha = 12345;
        
            int tentativasRestantes = 3 - a;

          System.out.println("Ponha sua senha:");

            int inputSenha = scnSenha.nextInt();

            if (inputSenha == senha) {

                System.out.println("Voce acertou a senha");
            
                break;

            }else if (a == 3) {

               System.out.println("vc excedeu o numero de tentativas, morra");
            
            break;
            
            } else {

                System.out.println("vc errou a senha tente novamente, voce ainda tem " + tentativasRestantes + " tentativas restantes");

                a++;

            }
            
         
        
        }
        scnSenha.close();    
   

    }
    catch (java.util.InputMismatchException e) {


        System.out.println("A senha precisa ser numerica");

           
    }
   
   
   
    
    
    
    }

   
}
 /* //FOR ARRAY
        String Alunos [] = {"lucas" , "neto" , "roberto" , "gabriel"};



                System.out.println(Alunos) ;

        }





































}
*/



