
import hsa.Console;
import java.awt.Color;


public class PenBar {
    int xloc,width,yloc;
    Color col;
    public void draw(Console c){
        if(width >450 || width <50) {
            System.out.println("ERROR - MUST BE FROM 50 - 450");
            return;
        }
        c.setColor(col);
        xloc = 400-width;
        c.fillRect(xloc, yloc, 50, width);
        c.drawString("Value: "+  width, xloc-10,yloc);
    }
}
