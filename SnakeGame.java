import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame
{
 JPDemo jp;
 FDemo()
 {                   
  jp=new JPDemo();
  add(jp);
 }
}
class JPDemo extends JPanel implements ActionListener,KeyListener
{
 ImageIcon img1,img2,img3,img4,img5,img6;
 Image dot,head,head1,head2,head3,food;
 int x[]=new int[100];
 int y[]=new int[100];
 int dots=5;
 boolean b,b1;
 int x1=0;
 boolean start_game=false;
 boolean left=false,right=true,up=false,down=false;
 int r1=0,r2=0;
 int ar1[][]={//outer...
              {300,0,900,0},{300,00,300,280},{300,330,300,700},{300,700,900,700},{900,00,900,280},{900,330,900,700},
			  //inner1...
             {350,50,600,50},{650,50,850,50},{350,50,350,350},{350,400,350,650},
			  {350,650,600,650},{650,650,850,650},{850,50,850,400},{850,450,850,650},
			  //inner2...
			  {400,100,500,100},{550,100,800,100},
			  {400,100,400,600},{400,600,800,600},{800,100,800,300},{800,350,800,600},
			
			// inner3...
			 {450,150,750,150},{450,150,450,250},{450,300,450,550},{450,550,750,550},
		     {750,150,750,350},{750,400,750,550},
			 //inner4...
			 {500,200,600,200},{650,200,700,200},{500,200,500,500},{500,500,700,500},{700,200,700,500},
			 //inner5...
			 {550,250,650,250},{550,250,550,450},{550,450,580,450},{620,450,650,450},{650,250,650,450},
			 
			 //side line...
			 {300,230,350,230},{800,350,850,350},{570,50,570,100},{450,600,450,650},{800,500,850,500},{590,100,590,150},
			 {630,550,630,600}
			  }; 
		
 // int r[][]={{}}
 JPDemo()
 {
  x[0]=120;
  y[0]=100;
  x[1]=100;
  y[1]=100;
  x[2]=80;
  y[2]=100;
  x[3]=60;
  y[3]=100;
  x[4]=40;
  y[4]=100;
  
  setBackground(Color.black);
  img1=new ImageIcon("dot5.png");
  dot=img1.getImage();
  img2=new ImageIcon("head1.png");
  head=img2.getImage();
  img4=new ImageIcon("head2.png");
  head1=img4.getImage();
  img5=new ImageIcon("head3.png");
  head2=img5.getImage();
  img6=new ImageIcon("head4.png");
  head3=img6.getImage();
  img3=new ImageIcon("food2.png");
  food=img3.getImage();
  
  Timer t=new Timer(300,this);
  t.start();
  addKeyListener(this);
  setFocusable(true);

  randomDemo();
 }
 void randomDemo()
 { 
  r1=(int)Math.round(Math.random()*45+1);
  r1=r1*20;
  r2=(int)Math.round(Math.random()*45+1);
  r2=r2*20;
 }
 public void paintComponent(Graphics g)
 {
  super.paintComponent(g);
           
		   
		
	   //outer...
        g.setColor(Color.green);
        g.drawLine(ar1[0][0],ar1[0][1],ar1[0][2],ar1[0][3]);
		g.drawLine(ar1[1][0],ar1[1][1],ar1[1][2],ar1[1][3]);
		g.drawLine(ar1[2][0],ar1[2][1],ar1[2][2],ar1[2][3]);
		g.drawLine(ar1[3][0],ar1[3][1],ar1[3][2],ar1[3][3]);
		g.drawLine(ar1[4][0],ar1[4][1],ar1[4][2],ar1[4][3]);
		g.drawLine(ar1[5][0],ar1[5][1],ar1[5][2],ar1[5][3]);
      // g.setColor(Color.white);
		
		//inner...1
		g.setColor(Color.white);
		g.drawLine(ar1[6][0],ar1[6][1],ar1[6][2],ar1[6][3]);
		g.drawLine(ar1[7][0],ar1[7][1],ar1[7][2],ar1[7][3]);
		g.drawLine(ar1[8][0],ar1[8][1],ar1[8][2],ar1[8][3]);
		g.drawLine(ar1[9][0],ar1[9][1],ar1[9][2],ar1[9][3]);
		g.drawLine(ar1[10][0],ar1[10][1],ar1[10][2],ar1[10][3]);
		g.drawLine(ar1[11][0],ar1[11][1],ar1[11][2],ar1[11][3]);
		g.drawLine(ar1[12][0],ar1[12][1],ar1[12][2],ar1[12][3]);
		g.drawLine(ar1[13][0],ar1[13][1],ar1[13][2],ar1[13][3]);
		g.drawLine(ar1[14][0],ar1[14][1],ar1[14][2],ar1[14][3]);
		g.drawLine(ar1[15][0],ar1[15][1],ar1[15][2],ar1[15][3]);
		
		//inner...2
		g.drawLine(ar1[16][0],ar1[16][1],ar1[16][2],ar1[16][3]);
		g.drawLine(ar1[17][0],ar1[17][1],ar1[17][2],ar1[17][3]);
		g.drawLine(ar1[18][0],ar1[18][1],ar1[18][2],ar1[18][3]);
		g.drawLine(ar1[19][0],ar1[19][1],ar1[19][2],ar1[19][3]);
		g.drawLine(ar1[20][0],ar1[20][1],ar1[20][2],ar1[20][3]);
		g.drawLine(ar1[21][0],ar1[21][1],ar1[21][2],ar1[21][3]);
		g.drawLine(ar1[22][0],ar1[22][1],ar1[22][2],ar1[22][3]);
		g.drawLine(ar1[23][0],ar1[23][1],ar1[23][2],ar1[23][3]);
		g.drawLine(ar1[24][0],ar1[24][1],ar1[24][2],ar1[24][3]);
		g.drawLine(ar1[25][0],ar1[25][1],ar1[25][2],ar1[25][3]);
		
		//inner...3
		g.drawLine(ar1[26][0],ar1[26][1],ar1[26][2],ar1[26][3]);
		g.drawLine(ar1[27][0],ar1[27][1],ar1[27][2],ar1[27][3]);
		g.drawLine(ar1[28][0],ar1[28][1],ar1[28][2],ar1[28][3]);
		g.drawLine(ar1[29][0],ar1[29][1],ar1[29][2],ar1[29][3]);
		g.drawLine(ar1[30][0],ar1[30][1],ar1[30][2],ar1[30][3]);
		g.drawLine(ar1[31][0],ar1[31][1],ar1[31][2],ar1[31][3]);
		g.drawLine(ar1[32][0],ar1[32][1],ar1[32][2],ar1[32][3]);
		g.drawLine(ar1[33][0],ar1[33][1],ar1[33][2],ar1[33][3]);
		
		//inter...4
		g.drawLine(ar1[34][0],ar1[34][1],ar1[34][2],ar1[34][3]);
		g.drawLine(ar1[35][0],ar1[35][1],ar1[35][2],ar1[35][3]);
		g.drawLine(ar1[36][0],ar1[36][1],ar1[36][2],ar1[36][3]);
		g.drawLine(ar1[37][0],ar1[37][1],ar1[37][2],ar1[37][3]);
		g.drawLine(ar1[38][0],ar1[38][1],ar1[38][2],ar1[38][3]);
		
		//inter...5
		g.drawLine(ar1[39][0],ar1[39][1],ar1[39][2],ar1[39][3]);
		g.drawLine(ar1[40][0],ar1[40][1],ar1[40][2],ar1[40][3]);
		g.drawLine(ar1[41][0],ar1[41][1],ar1[41][2],ar1[41][3]);
		g.drawLine(ar1[42][0],ar1[42][1],ar1[42][2],ar1[42][3]);
		//g.drawLine(ar1[43][0],ar1[43][1],ar1[43][2],ar1[43][3]);
		
		
	  
  
  g.drawImage(food,r1,r2,this);
  for(int i=0;i<dots;i++)
  {
   if(i==0)
   {
	   if(down)
	   {
        g.drawImage(head,x[i],y[i],this);
	   }
	   if(left)
	   {
        g.drawImage(head3,x[i],y[i],this);
	   }
	   if(right)
	   {
        g.drawImage(head1,x[i],y[i],this);
	   }
	   if(up)
	   {
        g.drawImage(head2,x[i],y[i],this);
	   }
   }
   else
   {
    g.drawImage(dot,x[i],y[i],this);
   }
   
  }
  if(b)
  {
   Font f1=new Font("algerian",Font.BOLD,50);
  g.setFont(f1);
  g.drawString("GAME OVER",450,300);
  
  }
  if(b1)
  {
   Font f1=new Font("algerian",Font.BOLD,50);
  g.setFont(f1);
  g.drawString("you win",500,300);
  
  }
 }
 public void actionPerformed(ActionEvent e)
 {
  if(x[0]==r1 && y[0]==r2)
  {
   dots++;
   randomDemo();
  }
   if(x[0]==ar1[1][0]-20 && y[0]>ar1[1][1] && y[0]<ar1[1][3]  || x[0]==ar1[2][0]-20 && y[0]>ar1[2][1] && y[0]<ar1[2][3]  ||
     x[0]==ar1[4][0]-20 && y[0]>ar1[4][1] && y[0]<ar1[4][3]  || x[0]==ar1[5][0]-20 && y[0]>ar1[5][1] && y[0]<ar1[5][3]  ||
	 
	 x[0]==ar1[8][0]-10 && y[0]>ar1[8][1] && y[0]<ar1[8][3]  || x[0]==ar1[9][0]-10 && y[0]>ar1[9][1] && y[0]<ar1[9][3]  ||
	 x[0]==ar1[12][0]-10 && y[0]>ar1[12][1] && y[0]<ar1[12][3] || x[0]==ar1[13][0]-10 && y[0]>ar1[13][1] && y[0]<ar1[13][3] 
	 
  || x[0]==ar1[16][0]-20 && y[0]>ar1[16][1] && y[0]<ar1[16][3] || x[0]==ar1[18][0]-20 && y[0]>ar1[18][1] && y[0]<ar1[18][3]
  || x[0]==ar1[19][0]-20 && y[0]>ar1[19][1] && y[0]<ar1[19][3] 
  
  || x[0]==ar1[21][0]-10 && y[0]>ar1[21][1] && y[0]<ar1[21][3] || x[0]==ar1[22][0]-20 && y[0]>ar1[22][1] && y[0]<ar1[22][3] 
  || x[0]==ar1[24][0]-10 && y[0]>ar1[24][1] && y[0]<ar1[24][3] || x[0]==ar1[25][0]-10 && y[0]>ar1[25][1] && y[0]<ar1[25][3]
 
  || x[0]==ar1[28][0]-20 && y[0]>ar1[28][1] && y[0]<ar1[28][3] || x[0]==ar1[30][0]-20 && y[0]>ar1[30][1] && y[0]<ar1[30][3] 
  
  || x[0]==ar1[32][0]-10 && y[0]>ar1[32][1] && y[0]<ar1[32][3] || x[0]==ar1[35][0]-10 && y[0]>ar1[35][1] && y[0]<ar1[35][3]  )
  {
	  start_game=false;
	  b=true;
  }

 if(y[0]==ar1[0][1] && x[0]>ar1[0][0] && x[0] < ar1[0][2] || y[0]==ar1[3][1]-20 && x[0]>ar1[3][0] && x[0] < ar1[3][2] ||
 
    y[0]==ar1[6][1]-10 && x[0]>ar1[6][0] && x[0] < ar1[6][2] || y[0]==ar1[7][1]-10 && x[0]>ar1[7][0] && x[0] < ar1[7][2] ||
    y[0]==ar1[10][1]-10 && x[0]>ar1[10][0] && x[0] < ar1[10][2] || y[0]==ar1[11][1]-10 && x[0]>ar1[11][0] && x[0] < ar1[11][2]

 ||	y[0]==ar1[14][1] && x[0]>ar1[14][0] && x[0] < ar1[14][2] || y[0]==ar1[15][1] && x[0]>ar1[15][0] && x[0] < ar1[15][2] ||
    y[0]==ar1[17][1] && x[0]>ar1[17][0] && x[0] < ar1[17][2] ||

  	y[0]==ar1[20][1]-10 && x[0]>ar1[20][0] && x[0] < ar1[20][2] || y[0]==ar1[23][1]-10 && x[0]>ar1[23][0] && x[0] < ar1[23][2]
 
 || y[0]==ar1[26][1] && x[0]>ar1[26][0] && x[0] < ar1[26][2] || y[0]==ar1[27][1] && x[0]>ar1[27][0] && x[0] < ar1[27][2] ||
    y[0]==ar1[29][1] && x[0]>ar1[29][0] && x[0] < ar1[29][2] 
	
 ||	y[0]==ar1[31][1]-10 && x[0]>ar1[31][0] && x[0] < ar1[31][2] || y[0]==ar1[33][1]-10 && x[0]>ar1[33][0] && x[0] < ar1[33][2]
 || y[0]==ar1[34][1]-10 && x[0]>ar1[34][0] && x[0] < ar1[34][2] )
  {
	  start_game=false;
	  b=true;
  }
  if(x[0]==ar1[38][0]-10 && y[0]>ar1[38][1] && y[0]<ar1[38][3] || x[0]==ar1[39][0]-10 && y[0]>ar1[39][1] && y[0]<ar1[39][3] ||
     x[0]==ar1[41][0]-10 && y[0]>ar1[41][1] && y[0]<ar1[41][3] || x[0]==ar1[42][0]-10 && y[0]>ar1[42][1] && y[0]<ar1[42][3] ||
    
   	 y[0]==ar1[36][1]-10 && x[0]>ar1[36][0] && x[0]<ar1[36][2] || y[0]==ar1[37][1]-10 && x[0]>ar1[37][0] && x[0] < ar1[37][2]
  || y[0]==ar1[40][1]-20 && x[0]>ar1[40][0] && x[0] < ar1[40][2])
  {
   start_game=false;
   b=true;
  }
  if(x[0]>ar1[4][0])
  {
	  b1=true;
  }
  
 // for(int i=0;i<=ar1.length;i++)
 // {
	 // for(int j=i;j<=3;j++)
	 // { 	 
     // if(x[0]==ar1[i][0]-20 && ( y[0]>ar1[i][1] && y[0]<ar1[i][3] ))
	  // {
		 // start_game=false;
	  // }
	 // if(y[0]==ar1[i][1]-20 && x[0]>ar1[i][0] && x[0] < ar1[i][2])
   	 // {
			// start_game=false; 
	 // }
	 // }
 // }
 
  if(start_game)
  {
   for(int i=dots;i>0;i--)
   {
    x[i]=x[i-1];
    y[i]=y[i-1];
   }
   if(right)
   {
    x[0]=x[0]+20;
   }
   if(left)
   {
    x[0]=x[0]-20;
   }
   if(up)
   {
    y[0]=y[0]-20;
   }
   if(down)
   {
    y[0]=y[0]+20;
   }
  }
  if(x[0]>=1480)
		{
			x[0]=0;
		}
		else if(y[0]>=840)
		{
			y[0]=0;
			
		}
		else if(x[0]<=10)
		{
			x[0]=1480;
			
		}
		else if(y[0]<=10)
		{
			y[0]=840;
			
		}
		
   repaint();
 }
  public void keyReleased(KeyEvent e){}
  public void keyPressed(KeyEvent e)
  {
   start_game=true;
   if(e.getKeyCode()==KeyEvent.VK_LEFT)
   {
    left=true;
    right=false;
    up=false;
    down=false;
   }
   if(e.getKeyCode()==KeyEvent.VK_RIGHT)
   {
    left=false;
    right=true;
    up=false;
    down=false;
   }
   if(e.getKeyCode()==KeyEvent.VK_UP)
   {
    left=false;
    right=false;
    up=true;
    down=false;
   }
   if(e.getKeyCode()==KeyEvent.VK_DOWN)
   {
    left=false;
    right=false;
    up=false;
    down=true;
   }
  }
  public void keyTyped(KeyEvent e){}
}
class SnakeGame
{
 public static void main(String args[])
 {
  FDemo f=new FDemo();
  f.setVisible(true);
  f.setSize(1000,1000);
  f.setLocation(200,50);
  f.setDefaultCloseOperation(f.EXIT_ON_CLOSE); 
 }
}