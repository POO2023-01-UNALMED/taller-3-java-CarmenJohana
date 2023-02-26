package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	private static int numTV;

	public TV(Marca marca, boolean estado) {
		numTV++;
		this.marca=marca;
		this.estado=estado;
		this.canal=1;
		this.volumen=1;
		this.precio=500;
	}

	//SETS AND GETS PRECIO

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}


	//SETS AND GETS VOLUMEN

	public int getVolumen() {
		return this.volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	//GETS AND SETS CONTROL

	public Control getControl() {
		return this.control;
	}
	public void setControl(Control control) {
		this.control = control;
	}


	//GETS AND SETS CANAL

	public int getCanal() {
		return this.canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}

	//GETS AND SETS MARCA

	public Marca getMarca() {
		return this.marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}


	public void canalUp() {
		if (this.getEstado()==true && this.canal<120 && this.canal>=1) {
			this.canal++;
			}
	}

	public void canalDown() {
		if (this.getEstado()==true && this.canal<=120 && this.canal>1) {
			this.canal--;
			}
	}

	public void volumenUp() {
		if (this.getEstado()==true && this.canal<7 && this.canal>=0) {
			this.volumen++; }
	}

	public void volumenDown() {
				if (this.getEstado()==true && this.canal<=7 && this.canal>0) {
					this.volumen--; } } public boolean getEstado() { return estado;
	}

	public static int getNumTV() {
		return numTV;
	}

	public void turnOn() {
		this.estado=true;
	}
	public void turnOff() {
			this.estado=false;
	}

	public static void setNumTV(int numTV){

		TV.numTV+=numTV;

	}

}
