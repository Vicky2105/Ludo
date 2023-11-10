import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


class Ludo extends JFrame implements ActionListener{
    MyPanel p;
    //JLabel x;
    JButton roll;
    Random rand= new Random();
    Font font;
    //ImageIcon rd;
    Ludo(){
        p=new MyPanel();
        font = new Font("Arial",Font.BOLD,25);
        //button
         roll = new JButton("ROLL");
         roll.setFont(font);
        roll.setBounds(340,670,100,50);
        roll.setBackground(Color.red);
        roll.addActionListener(this);
        
        //Label
        
      //d.setFont(font);
        //this.add(d);
        //this.pack();
        this.setSize(800,800);
        this.setTitle("LUDO GAME");
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(p);
        this.add(roll);
       
    }
      public void actionPerformed(ActionEvent e){
          int dice=rand.nextInt(6)
         //System.out.println(dice);
         //x.setText(""+dice);
      }
      
    public static void main(String []args){
        new Ludo();
    }
}
class MyPanel extends JPanel {
    JButton roll;
    Font f;
    JLabel d;
    MyPanel(){
      f = new Font("Arial",Font.BOLD,25);
      d=new JLabel(" ");
      d.setHorizontalAlignment(JLabel.LEFT);
      d.setVerticalAlignment(3);
      this.add(d);
      this.setBounds(100,100,540,540);
      this.setLayout(null);
      //this.setBackground(Color.green);
      
    //   b= new JLabel();
    //   b.setHorizontalAlignment(JLabel.LEFT);
    //   b.setVerticalAlignment(1);
    //   b.setFont(f);
    //   this.add(b);
    
      
    }
    public void paint(Graphics g){
    
    Graphics2D g2 = (Graphics2D) g;
    g2.setStroke(new BasicStroke(3));
    g2.drawRect(0,0,540,540);

    //lines vertical horizontal
    g2.drawLine(180,0,180,540);
    g2.drawLine(360,0,360,540);
    
    g2.drawLine(0,180,540,180);
    g2.drawLine(0,360,540,360);

    //color rectangles
    g2.setColor(Color.orange);
    g2.fillRect(1,1,179,179);

    g2.setColor(Color.green);
    g2.fillRect(361,1,179,179);

    g2.setColor(Color.blue);
    g2.fillRect(1,361,179,179);

    g2.setColor(Color.yellow);
    g2.fillRect(361,361,179,179);

    //Homes 
    //orange
    g2.setColor(Color.white);
    g2.fillRect(40,40,100,100);
    //green
    g2.fillRect(400,40,100,100);
    //blue
    g2.fillRect(40,400,100,100);
    //yellow
    g2.fillRect(400,400,100,100);
    //Top box
    //way to home
    g2.setColor(Color.green);
    g2.fillRect(240,30,60,150);
    g2.fillRect(300,30,60,30);
    g2.setColor(Color.black);
    g2.drawLine(240,0,240,180);
    g2.drawLine(300,0,300,180);
    int x=30;
    while(x<=180){
    g2.drawLine(180,x,360,x);
    x+=30;
    }
    //Way to Home Yellow right box
    g2.setColor(Color.yellow);
    g2.fillRect(360,240,150,60);
    g2.fillRect(480,300,30,
    60);
    //right Box
    g2.setColor(Color.BLACK);
    g2.drawLine(360,240,540,240);
    g2.drawLine(360,300,540,300);
    x=390;
    while(x<=540){
        g2.drawLine(x,180,x,360);
        x+=30;
    }
    //buttom box
    //way to home
    g2.setColor(Color.blue);
    g2.fillRect(240,360,60,150);
    g2.fillRect(180,480,60,30);
    g2.setColor(Color.black);
    x=240;
    while(x<=300){
        g2.drawLine(x,360,x,540);
        x+=60;
    }
    x=390;
   while(x<=540){
    g2.drawLine(180,x,360,x);
    x+=30;
    }
    //Way to Home
    g2.setColor(Color.orange);
    g2.fillRect(30,180,30,60);
    g2.fillRect(30,240,150,60);
    //left Box
    g2.setColor(Color.black);
    x=240;
    while(x<=300){
        g2.drawLine(0,x,180,x);
        x+=60;
    }
    x=30;
    while(x<=180){
        g2.drawLine(x,180,x,360);
        x+=30;
    }
    //Home lines
    //green
    int xcord[]={180,270,360};
    int ycord[]={180,270,180};
    g2.setColor(Color.green);
    g2.fillPolygon(xcord, ycord, xcord.length);
    //oragne
    g2.setColor(Color.orange);
    xcord[0]=180;
    xcord[1]=270;
    xcord[2]=180;
    ycord[0]=180;
    ycord[1]=270;
    ycord[2]=360;
    g2.fillPolygon(xcord, ycord, xcord.length);
    //Blue
    g2.setColor(Color.blue);
    xcord[0]=180;
    xcord[1]=270;
    xcord[2]=360;
    ycord[0]=360;
    ycord[1]=270;
    ycord[2]=360;
    g2.fillPolygon(xcord, ycord, xcord.length);
    //yellow
    g2.setColor(Color.yellow);
    xcord[0]=360;
    xcord[1]=270;
    xcord[2]=360;
    ycord[0]=180;
    ycord[1]=270;
    ycord[2]=360;
    g2.fillPolygon(xcord, ycord, xcord.length);
    
    
      }
      
}
