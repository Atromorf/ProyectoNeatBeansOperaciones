/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiVentana;

/**
 *
 * @author Usuario
 */
public class PruebaMiVentana {	
    private static MiVentanas unicaInstancia;

	public static MiVentanas getInstancia() {
		if(unicaInstancia == null) {
		unicaInstancia = new MiVentanas();
	}
	return unicaInstancia;
	}	
    public static void main(String[] args){
        new MiVentanas();
        new MiVentanas();
        new MiVentanas();
    }
}
