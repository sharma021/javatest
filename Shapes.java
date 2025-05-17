import java.applet.*;
import java.awt.*;
public class Shapes extends Applet{
int x=300,y=100,r=50;
public void paint(Graphics g){
g.setColor(Color.red);
g.drawLine(30,300,200,10);
g.setColor(Color.pink);
g.drawRect(400,50,200,100);
g.setColor(Color.blue);
g.drawRoundRect(10,10,50,100,10,10);
g.setColor(Color.green);
g.fillRoundRect(200,20,50,100,10,10);
}}