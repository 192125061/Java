import java.awt.*;
class awtex
{
public awtex()
{
Frame f=new Frame("FIRST");
f.setSize(400,600);
f.setVisible(true);
Panel p=new Panel();
Panel p1=new Panel();
TextField t=new TextField();
p.add(t);
TextField t1=new TextField();
p.add(t1);
TextField t2=new TextField();
p.add(t2);
Button b=new Button("yes");
p.add(b);
Button b1=new Button("No");

p.add(b1);
f.add(p1);
f.add(p);
}
}

class awtmain
{
public static void main(String args[])
{
awtex g=new awtex();
}
}
