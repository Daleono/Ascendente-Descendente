package Disenio_Interfaces;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Ascendente_Descendente extends JFrame{
	public int val = 0;
	private JPanel p1;
	public Ascendente_Descendente() {
		setSize(500, 500);
		setTitle("Práctica 1");	
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setMinimumSize(new Dimension(200, 200));
		
		iniciarComponentes();
	
	}

	private void iniciarComponentes() {
		setPanel();
		setLabel();
		setBoton();
	}
	
	private void setPanel() {
		p1 = new JPanel();
		p1.setLayout(null);
		getContentPane().add(p1);
	}
	
	private void setLabel() {
		JLabel etiqueta = new JLabel(); 
		etiqueta.setText("Contador Ascendente / Descendente");
		etiqueta.setBounds(20, 10, 400, 20);
		etiqueta.setFont(new Font("Arial", 1, 20));
		p1.add(etiqueta);
		
	}
	
	private void setBoton() {
		JLabel etiqueta2 = new JLabel(); 
		etiqueta2.setBounds(50, 50, 400, 50);
		etiqueta2.setFont(new Font("Arial", 1, 20));
		p1.add(etiqueta2);
		
		
		
		JButton boton1 = new JButton();
		boton1.setText("Aumentar (alt+a)");
		boton1.setBounds(50, 100, 150, 30);
		boton1.setMnemonic('a');
		p1.add(boton1);
		
		ActionListener oyente = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				val++;
				etiqueta2.setText(val + "");
			}
		};
		boton1.addActionListener(oyente);
		
		JButton boton2 = new JButton();
		boton2.setText("Disminuir (alt+d)");
		boton2.setBounds(250, 100, 150, 30);
		//boton2.setEnabled(true);
		boton2.setMnemonic('d');
		p1.add(boton2);
		
		ActionListener oyente2 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				val--;
				etiqueta2.setText(val + "");
			}
		};
		boton2.addActionListener(oyente2);
		

		JButton boton4 = new JButton();
		boton4.setText("Resetear (alt+r)");
		boton4.setBounds(250, 150, 150, 30);
		//boton2.setEnabled(true);
		boton4.setMnemonic('r');
		p1.add(boton4);
		
		ActionListener oyente3 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				val = 0;
				etiqueta2.setText(val + "");
			}
		};
		boton4.addActionListener(oyente3);
		
		JButton boton3 = new JButton();
		boton3.setText("Cargar (alt+c)");
		boton3.setBounds(50, 200, 150, 30);
		boton3.setMnemonic('c');
		p1.add(boton3);
		
		JTextField cajaTexto1 = new JTextField();
		cajaTexto1.setBounds(50, 150, 150, 30);
		p1.add(cajaTexto1);
		
		KeyListener EventoTeclado = new KeyListener(){
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				int key = e.getKeyChar();
				
				boolean numero = key >= 48 && key <=57;
				
				if(!numero || cajaTexto1.getText().length()>8)
					e.consume();
					
			}
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		
		cajaTexto1.addKeyListener(EventoTeclado);

		ActionListener oyente4 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(!cajaTexto1.getText().isEmpty())
				val = Integer.parseInt(cajaTexto1.getText());
				etiqueta2.setText(val + "");
			}
		};
		boton3.addActionListener(oyente4);
		
	}

	
	
}


	
	