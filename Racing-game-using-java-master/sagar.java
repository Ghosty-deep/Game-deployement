package sagar;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;



public class sagar extends Applet implements ActionListener {
    
    DiceGame sagar;
    Button rb1;
    Button rb2;



@Override
   public void init()
      {
      setBackground( Color.black );
      setLayout(new BorderLayout(2,2));
      
   sagar = new DiceGame();             
    add(sagar);//, BorderLayout.CENTER);*/
      
      
      rb1= new Button("player1!");
      rb1.addActionListener(this);  
      rb1.setBackground(Color.lightGray);
      rb1.setBounds(500,500,20,20);
      rb1.setVisible(true);
      add(rb1,BorderLayout.LINE_START);
    

      
      

  
      rb2 = new Button("player2!");
      rb2.addActionListener(this);  
      rb2.setBackground(Color.lightGray);
      rb2.setBounds(600,600,20,20);
      rb2.setVisible(true);
      add(rb2,BorderLayout.LINE_END);
      
     
      
      
     
     
      }
              
   
    @Override
   public void actionPerformed(ActionEvent event ) {
             // FOR Respond
                // String str=event.getActionCommand();
                 if(event.getActionCommand().equals("player1!"))//str.equals("player1!"))
                     {
                         System.out.println("button 1 pressed ");
                        sagar.roll( rb1,rb2);
                        rb2.setVisible(false);
                        for (int i = 0; i < 100; i++) {
            System.out.println("[ " + (i + 1) + " ] Inside Primary Process");}
                        rb2.setVisible(true);
                        rb1.setVisible(false);
                     }
                   else if(event.getActionCommand().equals("player2!"))//str.equals("player2!"))
                   {
                       System.out.println("button 2 pressed ");
                        sagar.roll1(rb2,rb1);
                        rb1.setVisible(false);
                       // rb1.setEnabled(false);
                        for (int i = 0; i < 100; i++) {
            System.out.println("[ " + (i + 1) + " ] Inside Secondary Process");}
                 
                        rb1.setVisible(true);
                        rb2.setVisible(false);
                        
                   }
                        
                       
   
    
}
}

class  DiceGame extends Canvas
{
    static int val = 0;static int val3=0;static int y=10;static int x=10;int user1=0;int user2=0;
    
    DiceGame()
           {
           setBackground(Color.black);
           }
    

    @Override
   public void paint( Graphics g )
       {
        drawDie(g,user1,user2,y,x);
       drawDie1(g,user2,y,x);
      // winner(g,user1,user2);
        
      
        }
   
  /* void winner( Graphics g,int val1,int val3)
      {
           if(val3>=27)
           {
               g.setColor(Color.magenta);
                g.drawString("player 2 winner!",500,300);
             
           }
           else if(val>=27)
           {
               g.setColor(Color.magenta);
               g.drawString("player 1 winner!",500,300); 
               
           }
      }*/
   
   
   
   
   
   
   void drawDie(Graphics g, int val1,int val2,int y,int x)
          {  
             // roll:
          g.setColor(Color.white);
          g.fillRoundRect(50,300,100,100,20,20);
           /// g.fillRoundRect(1020,300,100,100,20,20);
          g.setColor(Color.red);
          g.drawRoundRect(50,300,100,100,20,20);
            //g.drawRoundRect(1020,300,100,100,20,20);
           

          
          if (val1 > 1 )  // upper left dot
             g.fillOval(59,307,20,20);
                //if(val2>1)
                //g.fillOval(1029,307,20,20);
          if (val1 > 3 )  // upper right dot
             g.fillOval(120,307,20,20);
               //if(val2>3)
                //g.fillOval(1090,307,20,20);
          if (val1 == 6 ) // middle left dot
             g.fillOval(59,340,20,20);
               //if(val2==6)
                //g.fillOval(1029,340,20,20);
          if (val1 % 2 == 1 ) // middle dot 
             g.fillOval(85,340,20,20);
              // if(val2%2==1)
               // g.fillOval(1059,340,20,20);
          if (val1 == 6) // middle right dot
             g.fillOval(120,340,20,20);
              // if(val2==6)
                //g.fillOval(1090,340,20,20);
          if (val1 > 3 )  // bottom left dot
             g.fillOval(59,375,20,20);
              //if(val2>3)
               // g.fillOval(1029,375,20,20);
          if (val1 > 1)  // bottom right dot
             g.fillOval(120,375,20,20);
               //if(val2>1)
                //g.fillOval(1090,375,20,20);
                
                
         g.drawRect(570,0,20,1500);
         g.fillRect(570,0,20,1500);
         g.setColor(Color.green);
         g.drawLine(573, 10, 576, 1500);
         g.setColor(Color.yellow);
         g.drawLine(586, 10, 586, 1500);
         
                
         
         g.setColor(Color.red);
          g.drawRect(0, 5, 1500, 10);
          g.fillRect(0, 5, 1500, 10);
          g.setColor(Color.white);
          g.setFont (new Font("serif", Font.BOLD, 15)); 
          g.drawString("F I N I S H   L I N E", 500,15);
          
   
          g.drawString("START POINT -->" ,120,660);
          g.drawString("START POINT -->" ,720,660);
          
          for(int i=0;i<val;i++)
          {
              
              y=y+25;
              g.setColor(Color.green);
              g.drawOval(300,680-y,15,15);
              g.fillOval(300,680-y,15,15);
              g.setColor(Color.white);
              g.setFont (new Font("any thing", Font.BOLD, 15));
              g.drawString(" "+ (i+1),280,690-y);
              //repaint();
          }

          
         
          
           if(val>=30)
          {
             g.setColor(Color.cyan);
             g.drawRoundRect(350,300,500,100,20,20);
             g.fillRoundRect(350,300,500,100,20,20);
             g.setColor(Color.black);
             g.setFont (new Font("serif", Font.BOLD, 30));
             g.drawString("PLAYER 1  WINNER.!.", 450, 350);
  
          }
           
          
          
           
        
           g.drawString("PLAYER 1 :"+val1, 30, 10);
           
          
           if(val>26)
          {
          for(int i=26;i<val;i++)
          {
 
              x=x+25;
              g.setColor(Color.green);
              g.drawOval(285+x,25,15,15);
              g.fillOval(285+x,25,15,15);
              g.setColor(Color.white);
              g.setFont (new Font("any thing", Font.BOLD, 15));
              g.drawString(" "+ (i+1),285+x,28); 
          }}
          
          
          
 
       
         
        g.setColor(Color.red);
          g.drawRect(0, 0, 580, 10);
          g.fillRect(0, 0, 580, 10);
          g.setColor(Color.white);
          g.setFont (new Font("serif", Font.BOLD, 15)); 
          g.drawString("F I N I S H   P O I N T", 500,15);
          
           g.drawString("PLAYER 1 :"+val1, 20, 10); 
         
          
          
          

          }
   
   
  
   
   
   
   
   void drawDie1(Graphics g,int val2,int y,int x)
          {  

          g.setColor(Color.white);
           g.fillRoundRect(1020,300,100,100,20,20);
          g.setColor(Color.red);
            g.drawRoundRect(1020,300,100,100,20,20);
            
            
           if(val2>1)
                g.fillOval(1029,307,20,20);
         if(val2>3)
                g.fillOval(1090,307,20,20);
         if(val2==6)
                g.fillOval(1029,340,20,20);
          if(val2%2==1)
                g.fillOval(1059,340,20,20);
          if(val2==6)
                g.fillOval(1090,340,20,20);
          if(val2>3)
                g.fillOval(1029,375,20,20);
          if(val2>1)
                g.fillOval(1090,375,20,20);  
           
           for(int i=0;i<val3;i++)
          {
              
              y=y+25;
              g.setColor(Color.yellow);
              g.drawOval(900,680-y,15,15);
              g.fillOval(900,680-y,15,15);
              g.setColor(Color.white);
              g.drawString(" "+ (i+1),880,690-y);
              //repaint();
          }
          
           
            // g.drawString("PLAYER 2 :"+val2, 1130, 10);
             
             
              if(val3>26)
          {
          for(int i=26;i<val3;i++)
          {
 
              x=x+25;
              g.setColor(Color.yellow);
              g.drawOval(890-x,25,15,15);
              g.fillOval(890-x,25,15,15);
              g.setColor(Color.white);
              g.setFont (new Font("any thing", Font.BOLD, 15));
              g.drawString(" "+ (i+1),880-x,28); 
          }}
             

          if(val3>=30)
          {
             g.setColor(Color.cyan);
             g.drawRoundRect(350,300,500,100,20,20);
             g.fillRoundRect(350,300,500,100,20,20);
             g.setColor(Color.black);
              g.setFont (new Font("serif", Font.BOLD, 30)); 
              g.drawString("PLAYER 2  WINNER.!.", 450, 350);

          }
          
                  g.setColor(Color.red);
          g.drawRect(580, 0, 700, 10);
          g.fillRect(580, 0, 700, 10);
          g.setColor(Color.white);
          g.setFont (new Font("serif", Font.BOLD, 15)); 
          g.drawString("F I N I S H   P O I N T", 500,15);
          
          g.drawString("PLAYER 2 :"+val2, 1130, 10);
          
          
          g.setColor(Color.darkGray);
          //g.drawRect(415, 20, 360, 80);
          g.fillRect(415, 20, 360, 80);
          int p[] = {415,440, 745, 775};
         int q[] = {20, 0, 0, 20}; 

         g.setColor(Color.orange);
         g.fillPolygon(p, q, 4); 
         g.setColor(Color.white);
         g.fillRect(417,45,15,52);
         g.fillRect(756,45,15,52);
          g.setFont (new Font("serif", Font.BOLD, 30)); 
         g.drawString("HOME",545 ,65);
                 

          }
   
   
    
  
   
   
   
   
   
   

  void roll(Button rb1,Button rb2) { 
      
      user1=0;
    
      if(val<30 ){
         
          user1 = (int)(Math.random()*6)+1;
          val+=user1;
          //user=user+val;
         
          System.out.println("user1 point is:"+user1);
          
          
          repaint();
          
      }
      
               }
  
  void roll1(Button rb2,Button rb1) {  
      
      user2=0;
     
      if(val3<30 ){
          user2 = (int)(Math.random()*6)+1;
          val3+=user2;
          System.out.println("user2 pointis:"+user2);
          repaint();
      }

      
      
               }
  
   

}