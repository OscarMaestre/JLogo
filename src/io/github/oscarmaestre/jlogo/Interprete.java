package io.github.oscarmaestre.jlogo;

import java.util.ArrayList;

import javafx.scene.canvas.Canvas;

public class Interprete {
	Canvas canvas;
	boolean depurando=false;
	ArrayList<Command> ordenes;
	int ordenActual=0;
	public Interprete(){
		ordenes=new ArrayList<Command>();
	}
	public Canvas getCanvas() {
		return canvas;
	}
	public void setCanvas(Canvas canvas) {
		this.canvas = canvas;
	}
	public boolean isDepurando() {
		return depurando;
	}
	public void setDepurando(boolean depurando) {
		this.depurando = depurando;
	}
	
	public void addOrden (Command orden){
		ordenes.add(orden);
	}
	public void limpiarOrdenes(){
		ordenes.clear();
	}
}


