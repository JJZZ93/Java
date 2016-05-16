package calculadora;

import javax.swing.JOptionPane;
public class calculadora {
	
	float num1;
	float num2;
	
	public calculadora(float num1,float num2) {
      	
	}

	public float getNum1()
	{
		return num1;
	}
	
	public void setNum1(float num1)
	{
		this.num1=num1;
	}
	
	public float getNum2()
	{
		return num2;
	}
	
	public void setNum2(float num2)
	{
		this.num2=num2;
	}
	
public void suma()
{
	float result=this.num1+this.num2;
	JOptionPane.showMessageDialog(null, "la suma es: "+Float.toString(result));

}

public void resta()
{
	float result=this.num1-this.num2;
	JOptionPane.showMessageDialog(null, "la resta es: "+Float.toString(result));

}

public void multiplicacion()
{
	float result=this.num1*this.num2;
	JOptionPane.showMessageDialog(null, "la multiplicacion es: "+Float.toString(result));

}


public void division()
{
	float result=this.num1/this.num2;
	JOptionPane.showMessageDialog(null, "la division es: "+Float.toString(result));

}

public void raiz(float num)
{
	float result=(float)Math.sqrt(num);
	JOptionPane.showMessageDialog(null, "la raiz cuadrada de : "+Float.toString(num)+"es ="+Float.toString(result));
	
}


}
