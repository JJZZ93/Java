package suma_cuatro;

import javax.swing.JOptionPane;

public class suma {
    
	 String a;
	 String b;
	 String c;
	 String d;
	 
	public suma()
	{
	}
		public String getA()
		{
			return a;
		}
		
		public void setA(String a)
		{
			this.a=a;
		}
		
		public String getB()
		{
			return b;
		}
		
		public void setB(String b)
		{
			this.b=b;
		}
		
		public String getC()
		{
			return c;
		}
		
		public void setC(String c)
		{
			this.c=c;
		}
		
		public String getD()
		{
			return d;
		}
		
		public void setD(String d)
		{
			this.d=d;
		}
		

	public void sumar(String a,String b,String c,String d)
	{
		int result=0;
		if(!a.equals(b)&&(!a.equals(c)&&(!a.equals(d))))
		{   
			result=result+Integer.parseInt(a);
			
		}
		if(!b.equals(c)&&(!b.equals(d)&&(!b.equals(a))))
		{   
			result=result+Integer.parseInt(b);
		}
		
		if(!c.equals(a)&&(!c.equals(b)&&(!c.equals(d))))
		{   
			result=result+Integer.parseInt(c);
		}
		if(!d.equals(a)&&(!d.equals(b)&&(!d.equals(c))))
		{   
			result=result+Integer.parseInt(d);
		}
			JOptionPane.showMessageDialog(null, "la suma es: "+Integer.toString(result));
	}
}
