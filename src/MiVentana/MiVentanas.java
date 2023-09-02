/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiVentana;

import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class MiVentanas extends JFrame {
	MiVentanas(){
		setTitle("Mi Primer ventana");
		pack();
		setVisible(true);
                setSize(300,100);
                setLocationRelativeTo(null);
	}

	public static void main(String args[]){
		new MiVentanas();
                new MiVentanas();
                new MiVentanas();
	}
}
