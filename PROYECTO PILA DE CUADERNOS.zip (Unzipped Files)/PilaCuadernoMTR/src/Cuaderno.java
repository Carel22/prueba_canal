import java.util.Scanner;

public class Cuaderno {
	private String cod;
	private String color;
	private int pag;
	
	public Cuaderno()
	{
		cod="";
		color="";
		pag=0;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPag() {
		return pag;
	}

	public void setPag(int pag) {
		this.pag = pag;
	}
	
	public void mostrar()
	{
		System.out.println("COD:"+cod+"-COLOR:"+color+"-Nro.PAG:"+pag);
	}
	public void leer()
	{
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingrese Codigo:");
		cod=teclado.nextLine();
		System.out.println("Ingrese Color:");
		color=teclado.nextLine();
		System.out.println("Ingrese nro de paginas:");
		pag=teclado.nextInt();		
	}
	
	
	
	
	
}
