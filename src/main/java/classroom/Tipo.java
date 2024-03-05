package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	
	public int codigo;
	public String nombre;

	Tipo(int entero, String name) {
		this.codigo = entero;
		this.nombre = name;
	}

	Tipo(int codigo) {
		this(codigo, "Sin nombre");
	}
}
