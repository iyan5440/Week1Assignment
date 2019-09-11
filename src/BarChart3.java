
import java.util.Scanner;


public class BarChart3 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x1=0,x2=0,x3=0,x4=0;
        for (int i = 0; i < 4; i++) {
            System.out.format("Enter value %d",i);
            if(i==0) { 
                try{
                x1=s.nextInt();
                }catch(Exception e){
                return ;
                }
            }
            if(i==1) { 
                try{
                x2=s.nextInt();
                }catch(Exception e){
                return ;
                }
            }
            if(i==2) { 
                try{
                x3=s.nextInt();
                }catch(Exception e){
                return ;
                }
            }
            if(i==3) { 
                try{
                x4=s.nextInt();
                }catch(Exception e){
                return ;
                }
            }
        }
    }
    
}
