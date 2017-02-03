package est.com;

public class App {

	public static void main(String[] args) {
		
		
		
		
		Listaestudiantes l=new Listaestudiantes();
		l.insertarInicio("Israel", 1234567);
		l.insertarInicio("asd", 1234567);
		l.insertarInicio("dafak", 123125);
        System.out.println(l.toString());
        long ci=1234567;
        if (l.existeElemento(ci)==true){System.out.println("El alumno "+ci+ " se encuentra registrado");}
        else{System.out.println("El alumno "+ci+" no se encuentra registrado");}
	
	
	
	
        Listaproductos lp= new Listaproductos();
        lp.insertarInicio("Atún", 2);
        lp.insertarInicio("arroz");
        lp.insertarInicio("azúcar",5);
        lp.insertarInicio("chocolates",0);
        System.out.println(lp.toString());
        System.out.println("Productos incompletos:\n"+lp.productoIncompleto(lp));
        
        	}

}
