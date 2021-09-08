import java.util.Scanner;

public class PilaC {
	
	private int max;
	private int tope;
	private Cuaderno p[];
	
	public PilaC()
	{
		max=50;
		tope=0;
		p=new Cuaderno[max];
		
	}
	
	public boolean esVacia()
	{
		if(tope==0)
			return true;
		else
			return false;
	}
	
	public boolean esLlena()
	{
		if(tope==max-1)
			return true;
		else
			return false;
	}
	
	public int nroelem()
	{
		return tope;
	}
	
	public void pushPila(Cuaderno x)
	{
		if(esLlena())
		{
			System.out.print("Pila llena");
		}
		else
		{
			tope++;
			p[tope]=x;
		}
	}
	
	public Cuaderno popPila()
	{
		Cuaderno x=new Cuaderno();
		if(!esVacia())
		{
			x=p[tope];
			tope--;
		}
		else
		{
			System.out.print("Pila Vacia");
		}
		return x;
	}
	
	public void mostrarPila()
	{
		Cuaderno x=new Cuaderno();
		if(esVacia())
		{
			System.out.print("Pila Vacia");
		}
		else
		{
			PilaC aux=new PilaC();
			while(!esVacia())
			{
				x=popPila();
				aux.pushPila(x);
				x.mostrar();						
			}
			while(!aux.esVacia())
			{
				pushPila(aux.popPila());
			}
		}
	}
	
	
	public void llenarPila(int n)
	{
		for(int i=1;i<=n;i++)
		{
			Cuaderno x=new Cuaderno();
			x.leer();
			pushPila(x);
		}
	}
	public void vaciarPila(PilaC a)
	{
		while(!a.esVacia())
		{
			pushPila(a.popPila());
		}
	}
	
	
	

}
