
import TurtleGraphics.*;
import hsa.Console;
import java.awt.Color;
import java.util.Scanner;


public class BarChart3 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pen p = new StandardPen(new SketchPadWindow(1000,600));
        Color sky;
        int x1,x2,x3,x4;
        PenBar pb1 = new PenBar();
        PenBar pb2 = new PenBar();
        PenBar pb3 = new PenBar();
        PenBar pb4 = new PenBar();
        //PenBar pb1=null,pb2= null,pb3 = null,pb4=null;
        
        for (int i = 0; i < 4; i++) {
            System.out.format("Enter value %d from 50 - 450: ",i);
            if(i==0) { 
                try{
                x1=s.nextInt();
                }catch(Exception e){
                return  ;
                }
                        MakeBar(p,pb1,200,x1,Color.blue);

            }
            if(i==1) { 
                try{
                x2=s.nextInt();
                }catch(Exception e){
                return ;   
                }
                MakeBar(p,pb2,100,x2,Color.red);

            }
            if(i==2) { 
                try{
                x3=s.nextInt();
                }catch(Exception e){
                return ;
                }
                        MakeBar(p,pb3,0,x3,Color.green);

            }
            if(i==3) { 
                try{
                x4=s.nextInt();
                }catch(Exception e){
                return ;
                }
                        MakeBar(p,pb4,-100,x4,Color.orange);
                        

            }
            
        }

        

    }
    public static void MakeBar(Pen p, PenBar pb, int y, int w, Color c){
        pb.xloc = -500;
        pb.yloc = y;
        pb.width = w;
        pb.col = c;
        pb.draw(p);
        
    }
    
}
