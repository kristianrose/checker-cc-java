




/// By: Kristian 


// Importar o Scanner
import java.util.Scanner;

class cartao
{   

public static void main(String args [])
      }
      // 
            Scanner in= new Scanner(System.in);
            int count = 0;
            int i =0, j;
            long [] array= new long[16];
            long [] add1 = long[8]; //8 + 7 + 6 + 4 + 1 + 9 + 5 + 9 = 49
            long [] add2 = long[8]; //5 + 9 + 7 + 2 + 6 + 4 + 8 + 8 = 53
            int cn=0, cnt1=0, cnt2=0
            long val, length;
            long sum=0, sum1=0, sum2=0, x, y;
            long back;



            do
            {
            
             System.out.println("Coloque o seu cartão credito: ")  // Perguntar  sobre as credenciais do cartão
             long number = in.nextLong();
             back = number;

            for(i=0; number !=0; i++) // 
                    
                    array[i]= number%10;
                    number = number/10;
                    count++;

            }

        }while(count<17); // O numero do cartao tem que ser 17 para 16
        cnt=count;

        for(i=0; i<cnt; i++)
        {
           if(i%2!=0) // Pegar todos segundos digitos
           {
                 add1[cnt1]= array[i];
                 cnt1++;
           }
           else
           {
             
            add2[cnt2]= array[i];
            cnt2++;
           }
        }

        for(i=0; i<add1.length; i++)
        {
          
            val=add1[i];
            add1[i]=val*2; // Mutiplicar por 2
            if(add1[i]>9)
            {
              
          x=add1[i]%10  // Se o resultado dos dois digitos e.g 6*2=12=>1+=3
          y=add1[i]/10
          add1[i]= y + x;


            }
            cnt1++;
            sum1 = sum1 + add1[i]; // Adicionar todos unicos digitos (resultados)
        }

        fo(i=0; i<add2.length; i++) 
        {

            sum2 = sum2 + add2[i]; // 
        }
        sum = sum1 + sum2;
        if(sum%10==10)
        {
            System.out.println(back + "Cartão esta LIVE");
        }
        else 
        {
            System.out.println(back + "Cartão esta DEAD");
        }
    }
}

        



     

