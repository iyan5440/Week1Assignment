
import TurtleGraphics.*;
import hsa.Console;
import java.awt.Color;
import java.util.Scanner;


public class PenBar {
    int xloc,width,yloc;
    Color col;
    public void draw(Pen p){
        if(width >400 || width <50) {
            System.out.println("ERROR - MUST BE FROM 50 - 400");
            return;
        }
        p.setColor(col);
        p.setWidth(50);
        //p.setDirection(90);
        p.up();
        p.move(xloc,yloc);
        p.down();
        p.move(width,yloc);
        //p.drawString((String.format"Value: ", width, xloc-10,yloc));
        p.drawString(String.format("         Value: %d ",width));
        //p.drawString("Value: " + width ,100,100);
        
        
    }

    
}
