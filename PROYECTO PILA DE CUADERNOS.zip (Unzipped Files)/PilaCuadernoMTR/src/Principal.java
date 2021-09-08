
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PilaC a=new PilaC();
		a.llenarPila(3);
		a.mostrarPila();
		//CONVERTIR EL COLOR DE LOS CUADERNOS EN MAYUSCULAS
		convertirmayusc(a);
		a.mostrarPila();
				
	}

	private static void convertirmayusc(PilaC a) {
		// TODO Auto-generated method stub
		PilaC aux=new PilaC();
		Cuaderno x=new Cuaderno();
		while(!a.esVacia())
		{
			x=a.popPila();
			x.setColor(x.getColor().toUpperCase());
			aux.pushPila(x);
		}
		a.vaciarPila(aux);
		
		
	}

}
