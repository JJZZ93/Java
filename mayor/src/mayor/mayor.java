package mayor;

import javax.swing.JOptionPane;

public class mayor {

	 int a;
	 int b;
	 int c;
	 
	public mayor(int a ,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
		public int getA()
		{
			return a;
		}
		
		public void setA(int a)
		{
			this.a=a;
		}
		
		public int getB()
		{
			return b;
		}
		
		public void setB(int b)
		{
			this.b=b;
		}
		
		public int getC()
		{
			return c;
		}
		
		public void setC(int c)
		{
			this.c=c;
		}
		
		

	public void hallar_mayor()
	{
		if((this.a>this.b)&&(this.a>this.c))
		{   
			JOptionPane.showMessageDialog(null, "el mayor es: "+Integer.toString(a));
		}
		else
		if((this.b>this.c)&&(this.b>this.a))
		{   
			JOptionPane.showMessageDialog(null, "el mayor es: "+Integer.toString(b));
		}
		else
			JOptionPane.showMessageDialog(null, "el mayor es: "+Integer.toString(c));
			
	}
}
