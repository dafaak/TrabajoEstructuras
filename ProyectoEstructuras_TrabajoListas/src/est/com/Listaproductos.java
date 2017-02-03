package est.com;

public class Listaproductos {
	private Producto inicio;
	private long longitud;

	public Listaproductos(){
		inicio=null;
		this.longitud=0;
	}
	public boolean estaVacia(){
		return (inicio==null);
	}

	public void insertarInicio(String nombre, int c){
		if(estaVacia())
		{inicio=new Producto(nombre,c);this.longitud+=1;}
		
		else {if (existeElemento(nombre)==false ){inicio= new Producto(nombre,c,inicio);this.longitud+=1;}
		
		}
		
		
		}
	
	public void insertarInicio(String nombre){
		if(estaVacia())
		{inicio=new Producto(nombre);this.longitud+=1;}
		
		else {if (existeElemento(nombre)==false ){inicio= new Producto(nombre,inicio);this.longitud+=1;}
		
		}
		
		
		}

	public String verificarProducto(Producto p){
		if(p.getCantidad()==0){return " Incompleto";}
		else{return "Listo";}
		
	}
	
	public String productoIncompleto(Listaproductos l){
		Producto p= l.inicio;
		String salida="";
		while(p!=null){
		if (verificarProducto(p).equalsIgnoreCase(" Incompleto")){salida+=p.getNombre()+"\n";}
		p=p.getSiguiente();}
		return salida;
	}

	public boolean existeElemento(String nombre){
		Producto p=inicio;
		if (estaVacia()==true){return false;}
		else {
		while(p!=null){
			if(p.getNombre().equalsIgnoreCase(nombre)){return true;};
			p=p.getSiguiente();
		}
		}
		return false;
	}

	public String toString(){
		if (estaVacia()==true){return "Lista vacia!!!";}
		else{
	String salida="";
	Producto p =inicio;
	{salida+="\n\nLista de productos:\n";
	salida+=p.toString()+"  "+verificarProducto(p)+"\n";
	p=p.getSiguiente();
	while(p!=null){
		salida+=p.toString()+"  "+verificarProducto(p)+"\n";
		p=p.getSiguiente();}
		
		
	}
	salida+="\nlongitud: "+this.longitud;
		return salida;
	}
		
	}


}
