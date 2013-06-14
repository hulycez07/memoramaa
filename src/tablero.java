import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class tablero extends ventana implements Runnable{
	
	private Button boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,boton10,boton11,boton12,boton13,boton14,boton15,boton16,boton17,boton18,boton19,boton20,boton21,boton22,boton23,boton24,boton25,boton26,boton27,boton28,boton29,boton30,boton31,boton32,boton33,boton34,boton35,boton36;
	private JButton nivel1, nivel2, nivel3; 
	Button icono1,icono2;
	Icon img;
	int contador=0;
	JLabel lblReloj;
	Thread crono2;
ImageIcon fondo;
	boolean cart=false, elim=false;
	
	private Icon imagen;
	
	JLabel img2;
	
	public tablero(){
		this.setLayout(null);
		
		lblReloj= new JLabel();
		lblReloj.setBounds(800, 20, 120, 120);
		Font fp1=new Font("Arial", Font.BOLD,30);
		lblReloj.setFont(fp1);
		this.setBackground(Color.WHITE);
		lblReloj.setForeground(Color.WHITE);
		this.add(lblReloj);
		crono2=new Thread(this);
		
		imagen= new ImageIcon(getClass().getResource("imagenes/soccer.jpg"));
		img2= new JLabel(imagen);
		img2.setBounds(0, 0, 900, 800);
		
		
		nivel1= new JButton("Nivel Dificil");
		nivel1.setBounds(750,350,150,90);
		nivel1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

				crono2.start();
				
				img=new ImageIcon(getClass().getResource("imagenes/cubierta.jpg"));
				
				boton1 = new Button(1);
				boton1.setIcon(img);
				
				boton1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/ajax1.jpg"));
							boton1.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton1;
							}
							else
							{
								if(boton1!=icono1)
								{
								contador++;
								icono2 = boton1;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
									
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
					}
				});
				
				
				
				boton1.setBounds(0,10, 100, 100);
				tablero.this.add(boton1);
				
				
				
				boton2=new Button(2);
				boton2.setIcon(img);
		boton2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/arsenal1.png"));
							boton2.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton2;
							}
							else
							{
								if(boton2!=icono1)
								{
								contador++;
								icono2 = boton2;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}

						
					}
				});
				boton2.setBounds(120,10, 100, 100);
				tablero.this.add(boton2);
				
				
				
				boton3=new Button(1);
				boton3.setIcon(img);
		boton3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/ajax1.jpg"));
							boton3.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton3;
							}
							else
							{
								if(boton3!=icono1)
								{
								contador++;
								icono2 = boton3;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
					}
				});
				boton3.setBounds(240,10, 100, 100);
				tablero.this.add(boton3);
				
				
				boton4=new Button(3);
				boton4.setIcon(img);
		boton4.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/barcelona1.png"));
							boton4.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton4;
							}
							else
							{
								if(boton4!=icono1)
								{
								contador++;
								icono2 = boton4;
								;
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
				
				boton4.setBounds(360,10, 100, 100);
				tablero.this.add(boton4);
				
				boton5=new Button(4);
				boton5.setIcon(img);
		boton5.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/bayern1.png"));
							boton5.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton5;
							}
							else
							{
								if(boton5!=icono1)
								{
								contador++;
								icono2 = boton5;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
				
				boton5.setBounds(480,10, 100, 100);
				tablero.this.add(boton5);
				boton6=new Button(5);
				boton6.setIcon(img);
		boton6.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/dortmund1.jpg"));
							boton6.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton6;
							}
							else
							{
								if(boton6!=icono1)
								{
								contador++;
								icono2 = boton6;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
						
					}
				});
				
				boton6.setBounds(600,10, 100, 100);
				tablero.this.add(boton6);
				boton7=new Button(6);
				boton7.setIcon(img);
		boton7.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/inter1.jpg"));
							boton7.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton7;
							}
							else
							{
								if(boton7!=icono1)
								{
								contador++;
								icono2 = boton7;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
						
					}
				});
				
				boton7.setBounds(0,120, 100, 100);
				tablero.this.add(boton7);
				boton8=new Button(7);
				boton8.setIcon(img);
		boton8.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/juve1.jpg"));
							boton8.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton8;
							}
							else
							{
								if(boton8!=icono1)
								{
								contador++;
								icono2 = boton8;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
				
				boton8.setBounds(120,120, 100, 100);
				tablero.this.add(boton8);
				boton9=new Button(8);
				boton9.setIcon(img);
		boton9.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/leverkusen.jpg"));
							boton9.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton9;
							}
							else
							{
								if(boton9!=icono1)
								{
								contador++;
								icono2 = boton9;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
				
				boton9.setBounds(240,120, 100, 100);
				tablero.this.add(boton9);
				boton10=new Button(9);
				boton10.setIcon(img);
		boton10.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/liverpool1.png"));
							boton10.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton10;
							}
							else
							{
								if(boton10!=icono1)
								{
								contador++;
								icono2 = boton10;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
				
				boton10.setBounds(360,120, 100, 100);
				tablero.this.add(boton10);
				boton11=new Button(10);
				boton11.setIcon(img);
		boton11.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/manchesterCity1.jpg"));
							boton11.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton11;
							}
							else
							{
								if(boton11!=icono1)
								{
								contador++;
								icono2 = boton11;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
				
				boton11.setBounds(480,120, 100, 100);
				tablero.this.add(boton11);
				boton12=new Button(11);
				boton12.setIcon(img);
		boton12.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/manchesterUnited1.jpg"));
							boton12.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton12;
							}
							else
							{
								if(boton12!=icono1)
								{
								contador++;
								icono2 = boton12;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
					}
				});
				
				boton12.setBounds(600,120, 100, 100);
				tablero.this.add(boton12);
				boton13=new Button(12);
				boton13.setIcon(img);
		boton13.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/marsella1.png"));
							boton13.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton13;
							}
							else
							{
								if(boton13!=icono1)
								{
								contador++;
								icono2 = boton13;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
				
				boton13.setBounds(0,240, 100, 100);
				tablero.this.add(boton13);
				boton14=new Button(13);
				boton14.setIcon(img);
		boton14.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/milan1.gif"));
							boton14.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton14;
							}
							else
							{
								if(boton14!=icono1)
								{
								contador++;
								icono2 = boton14;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
				
				boton14.setBounds(120,240, 100, 100);
				tablero.this.add(boton14);
				boton15=new Button(14);
				boton15.setIcon(img);
		boton15.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/paris1.jpg"));
							boton15.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton15;
							}
							else
							{
								if(boton15!=icono1)
								{
								contador++;
								icono2 = boton15;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
				
				boton15.setBounds(240,240, 100, 100);
				tablero.this.add(boton15);
				boton16=new Button(15);
				boton16.setIcon(img);
		boton16.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/psv1.gif"));
							boton16.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton16;
							}
							else
							{
								if(boton16!=icono1)
								{
								contador++;
								icono2 = boton16;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
				
				boton16.setBounds(360,240, 100, 100);
				tablero.this.add(boton16);
				boton17=new Button(16);
				boton17.setIcon(img);
		boton17.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/Real1.png"));
							boton17.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton17;
							}
							else
							{
								if(boton17!=icono1)
								{
								contador++;
								icono2 = boton17;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
					}
				});
				
				boton17.setBounds(480,240, 100, 100);
				tablero.this.add(boton17);
				boton18=new Button(17);
				boton18.setIcon(img);
		boton18.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/roma1.jpg"));
							boton18.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton18;
							}
							else
							{
								if(boton18!=icono1)
								{
								contador++;
								icono2 = boton18;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
		tablero.this.add(boton18);
				boton18.setBounds(600,240, 100, 100);
				
				boton19=new Button(16);
				boton19.setIcon(img);
		boton19.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/Real1.png"));
							boton19.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton19;
							}
							else
							{
								if(boton19!=icono1)
								{
								contador++;
								icono2 = boton19;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
		tablero.this.add(boton19);
				boton19.setBounds(0,360, 100, 100);
				
				boton20=new Button(17);
				boton20.setIcon(img);
		boton20.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/roma1.jpg"));
							boton20.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton20;
							}
							else
							{
								if(boton20!=icono1)
								{
								contador++;
								icono2 = boton20;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
					}
				});
		tablero.this.add(boton20);
				boton20.setBounds(120,360, 100, 100);
				
				boton21=new Button(3);
				boton21.setIcon(img);
		boton21.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/barcelona1.png"));
							boton21.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton21;
							}
							else
							{
								if(boton21!=icono1)
								{
								contador++;
								icono2 = boton21;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
		tablero.this.add(boton21);
				boton21.setBounds(240,360, 100, 100);
				
				boton22=new Button(5);
				boton22.setIcon(img);
		boton22.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/dortmund1.jpg"));
							boton22.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton22;
							}
							else
							{
								if(boton22!=icono1)
								{
								contador++;
								icono2 = boton22;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
		tablero.this.add(boton22);
				boton22.setBounds(360,360, 100, 100);
				
				boton23=new Button(14);
				boton23.setIcon(img);
		boton23.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/paris1.jpg"));
							boton23.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton23;
							}
							else
							{
								if(boton23!=icono1)
								{
								contador++;
								icono2 = boton23;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
		tablero.this.add(boton23);
				boton23.setBounds(480,360, 100, 100);
				
				boton24=new Button(4);
				boton24.setIcon(img);
		boton24.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/bayern1.png"));
							boton24.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton24;
							}
							else
							{
								if(boton24!=icono1)
								{
								contador++;
								icono2 = boton24;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
		tablero.this.add(boton24);
				boton24.setBounds(600,360, 100, 100);
				
				boton25=new Button(12);
				boton25.setIcon(img);
		boton25.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/marsella1.png"));
							boton25.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton25;
							}
							else
							{
								if(boton25!=icono1)
								{
								contador++;
								icono2 = boton25;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
					}
				});
		tablero.this.add(boton25);
				boton25.setBounds(0,480, 100, 100);
				
				boton26=new Button(10);
				boton26.setIcon(img);
		boton26.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/manchesterCity1.jpg"));
							boton26.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton26;
							}
							else
							{
								if(boton26!=icono1)
								{
								contador++;
								icono2 = boton26;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
					}
				});
		tablero.this.add(boton26);
				boton26.setBounds(120,480, 100, 100);
				
				boton27=new Button(9);
				boton27.setIcon(img);
		boton27.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/liverpool1.png"));
							boton27.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton27;
							}
							else
							{
								if(boton27!=icono1)
								{
								contador++;
								icono2 = boton27;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
					}
				});
		tablero.this.add(boton27);
				boton27.setBounds(240,480, 100, 100);
				
				boton28=new Button(11);
				boton28.setIcon(img);
		boton28.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/manchesterUnited1.jpg"));
							boton28.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton28;
							}
							else
							{
								if(boton28!=icono1)
								{
								contador++;
								icono2 = boton28;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
		tablero.this.add(boton28);
				boton28.setBounds(360,480, 100, 100);
				
				boton29=new Button(8);
				boton29.setIcon(img);
		boton29.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/leverkusen.jpg"));
							boton29.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton29;
							}
							else
							{
								if(boton29!=icono1)
								{
								contador++;
								icono2 = boton29;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
							}
						}
						
					}
				});
		tablero.this.add(boton29);
				boton29.setBounds(480,480, 100, 100);
				
				boton30=new Button(7);
				boton30.setIcon(img);
		boton30.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/juve1.jpg"));
							boton30.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton30;
							}
							else
							{
								if(boton30!=icono1)
								{
								contador++;
								icono2 = boton30;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
					}
				});
		tablero.this.add(boton30);
				boton30.setBounds(600,480, 100, 100);
				
				boton31=new Button(2);
				boton31.setIcon(img);
		boton31.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/arsenal1.png"));
							boton31.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton31;
							}
							else
							{
								if(boton31!=icono1)
								{
								contador++;
								icono2 = boton31;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
					}
				});
		tablero.this.add(boton31);
				boton31.setBounds(0,600, 100, 100);
				
				boton32=new Button(6);
				boton32.setIcon(img);
		boton32.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/inter1.jpg"));
							boton32.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton32;
							}
							else
							{
								if(boton32!=icono1)
								{
								contador++;
								icono2 = boton32;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
							
							}
						}
						
					}
				});
		tablero.this.add(boton32);
				boton32.setBounds(120,600, 100, 100);
				
				boton33=new Button(13);
				boton33.setIcon(img);
		boton33.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/milan1.gif"));
							boton33.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton33;
							}
							else
							{
								if(boton33!=icono1)
								{
								contador++;
								icono2 = boton33;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
		tablero.this.add(boton33);
				boton33.setBounds(240,600, 100, 100);
				
				boton34=new Button(18);
				boton34.setIcon(img);
		boton34.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/atletico1.jpg"));
							boton34.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton34;
							}
							else
							{
								if(boton34!=icono1)
								{
								contador++;
								icono2 = boton34;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
		tablero.this.add(boton34);
				boton34.setBounds(360,600, 100, 100);
				
				boton35=new Button(18);
				boton35.setIcon(img);
		boton35.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/atletico1.jpg"));
							boton35.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton35;
							}
							else
							{
								if(boton36!=icono1)
								{
								contador++;
								icono2 = boton35;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
		tablero.this.add(boton35);
				boton35.setBounds(480,600, 100, 100);
				
				boton36=new Button(15);
				boton36.setIcon(img);
		boton36.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/psv1.gif"));
							boton36.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton36;
							}
							else
							{
								if(boton36!=icono1)
								{
								contador++;
								icono2 = boton36;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
				tablero.this.add(boton36);
				boton36.setBounds(600,600, 100, 100);
				
				nivel1.setVisible(false);
				nivel3.setVisible(false);
				nivel2.setVisible(false);
				
				tablero.this.repaint();
				tablero.this.add(img2);
			}
		});
		this.add(nivel1);
		
		nivel2= new JButton("Nivel Facil");
		nivel2.setBounds(750,170,150,90);
		nivel2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				crono2.start();
				
				img=new ImageIcon(getClass().getResource("imagenes/cubierta.jpg"));
				
				boton1 = new Button(1);
				boton1.setIcon(img);
				
				boton1.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/barcelona1.png"));
							boton1.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton1;
							}
							else
							{
								if(boton36!=icono1)
								{
								contador++;
								icono2 = boton1;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
				
				
				
				boton1.setBounds(0,10, 100, 100);
				tablero.this.add(boton1);
				
				
				
				boton2=new Button(2);
				boton2.setIcon(img);
		boton2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/Real1.png"));
							boton2.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton2;
							}
							else
							{
								if(boton2!=icono1)
								{
								contador++;
								icono2 = boton2;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}

						
					}
				});
				boton2.setBounds(120,10, 100, 100);
				tablero.this.add(boton2);
				
				
				
				boton3=new Button(2);
				boton3.setIcon(img);
		boton3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/Real1.png"));
							boton3.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton3;
							}
							else
							{
								if(boton3!=icono1)
								{
								contador++;
								icono2 = boton3;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
					}
				});
				boton3.setBounds(240,10, 100, 100);
				tablero.this.add(boton3);
				
				
				boton4=new Button(1);
				boton4.setIcon(img);
		boton4.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/barcelona1.png"));
							boton4.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton4;
							}		
							else
							{
								if(boton4!=icono1)
								{
								contador++;
								icono2 = boton4;
								;
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
				
				boton4.setBounds(360,10, 100, 100);
				tablero.this.add(boton4);
				
				boton5=new Button(2);
				boton5.setIcon(img);
		boton5.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/Real1.png"));
							boton5.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton5;
							}
							else
							{
								if(boton5!=icono1)
								{
								contador++;
								icono2 = boton5;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
				
				boton5.setBounds(480,10, 100, 100);
				tablero.this.add(boton5);
				boton6=new Button(1);
				boton6.setIcon(img);
		boton6.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/barcelona1.png"));
							boton6.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton6;
							}
							else
							{
								if(boton6!=icono1)
								{
								contador++;
								icono2 = boton6;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
						
					}
				});
				
				boton6.setBounds(600,10, 100, 100);
				tablero.this.add(boton6);
				boton7=new Button(2);
				boton7.setIcon(img);
		boton7.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/Real1.png"));
							boton7.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton7;
							}
							else
							{
								if(boton7!=icono1)
								{
								contador++;
								icono2 = boton7;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
						
					}
				});
				
				boton7.setBounds(0,120, 100, 100);
				tablero.this.add(boton7);
				boton8=new Button(2);
				boton8.setIcon(img);
		boton8.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/Real1.png"));
							boton8.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton8;
							}
							else
							{
								if(boton8!=icono1)
								{
								contador++;
								icono2 = boton8;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
					}
				});
				
				boton8.setBounds(120,120, 100, 100);
				tablero.this.add(boton8);
				boton9=new Button(1);
				boton9.setIcon(img);
		boton9.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/barcelona1.png"));
							boton9.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton9;
							}
							else
							{
								if(boton9!=icono1)
								{
								contador++;
								icono2 = boton9;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
					}
				});
				
				boton9.setBounds(240,120, 100, 100);
				tablero.this.add(boton9);
				boton10=new Button(1);
				boton10.setIcon(img);
		boton10.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/barcelona1.png"));
							boton10.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton10;
							}
							else
							{
								if(boton10!=icono1)
								{
								contador++;
								icono2 = boton10;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
				
				boton10.setBounds(360,120, 100, 100);
				tablero.this.add(boton10);
				boton11=new Button(2);
				boton11.setIcon(img);
		boton11.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/Real1.png"));
							boton11.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton11;
							}
							else
							{
								if(boton11!=icono1)
								{
								contador++;
								icono2 = boton11;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
					}
				});
				
				boton11.setBounds(480,120, 100, 100);
				tablero.this.add(boton11);
				boton12=new Button(1);
				boton12.setIcon(img);
		boton12.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/barcelona1.png"));
							boton12.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton12;
							}
							else
							{
								if(boton12!=icono1)
								{
								contador++;
								icono2 = boton12;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
					}
				});
				
				boton12.setBounds(600,120, 100, 100);
				tablero.this.add(boton12);
				boton13=new Button(1);
				boton13.setIcon(img);
		boton13.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/barcelona1.png"));
							boton13.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton13;
							}
							else
							{
								if(boton13!=icono1)
								{
								contador++;
								icono2 = boton13;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
					}
				});
				
				boton13.setBounds(0,240, 100, 100);
				tablero.this.add(boton13);
				boton14=new Button(2);
				boton14.setIcon(img);
		boton14.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/Real1.png"));
							boton14.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton14;
							}
							else
							{
								if(boton14!=icono1)
								{
								contador++;
								icono2 = boton14;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
					}
				});
				
				boton14.setBounds(120,240, 100, 100);
				tablero.this.add(boton14);
				boton15=new Button(1);
				boton15.setIcon(img);
		boton15.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/barcelona1.png"));
							boton15.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton15;
							}
							else
							{
								if(boton15!=icono1)
								{
								contador++;
								icono2 = boton15;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
				
				boton15.setBounds(240,240, 100, 100);
				tablero.this.add(boton15);
				boton16=new Button(1);
				boton16.setIcon(img);
		boton16.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/barcelona1.png"));
							boton16.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton16;
							}
							else
							{
								if(boton16!=icono1)
								{
								contador++;
								icono2 = boton16;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
				
				boton16.setBounds(360,240, 100, 100);
				tablero.this.add(boton16);
				boton17=new Button(2);
				boton17.setIcon(img);
		boton17.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/Real1.png"));
							boton17.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton17;
							}
							else
							{
								if(boton17!=icono1)
								{
								contador++;
								icono2 = boton17;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
				
				boton17.setBounds(480,240, 100, 100);
				tablero.this.add(boton17);
				boton18=new Button(1);
				boton18.setIcon(img);
		boton18.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/barcelona1.png"));
							boton18.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton18;
							}
							else
							{
								if(boton18!=icono1)
								{
								contador++;
								icono2 = boton18;
								
								if(icono1.getId() == icono2.getId())
								{
									
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
					}
				});
		tablero.this.add(boton18);
				boton18.setBounds(600,240, 100, 100);
				tablero.this.repaint();
			
				boton19=new Button(2);
				boton19.setIcon(img);
		boton19.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/Real1.png"));
							boton19.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton19;
							}
							else
							{
								if(boton19!=icono1)
								{
								contador++;
								icono2 = boton19;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
					}
				});
		tablero.this.add(boton19);
				boton19.setBounds(0,360, 100, 100);
				
				boton20=new Button(2);
				boton20.setIcon(img);
		boton20.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/Real1.png"));
							boton20.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton20;
							}
							else
							{
								if(boton20!=icono1)
								{
								contador++;
								icono2 = boton20;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
					}
				});
		tablero.this.add(boton20);
				boton20.setBounds(120,360, 100, 100);
				
				boton21=new Button(1);
				boton21.setIcon(img);
		boton21.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/barcelona1.png"));
							boton21.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton21;
							}
							else
							{
								if(boton21!=icono1)
								{
								contador++;
								icono2 = boton21;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
					}
				});
		tablero.this.add(boton21);
				boton21.setBounds(240,360, 100, 100);
				
				boton22=new Button(1);
				boton22.setIcon(img);
		boton22.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/barcelona1.png"));
							boton22.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton22;
							}
							else
							{
								if(boton22!=icono1)
								{
								contador++;
								icono2 = boton22;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
		tablero.this.add(boton22);
				boton22.setBounds(360,360, 100, 100);
				
				boton23=new Button(2);
				boton23.setIcon(img);
		boton23.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/Real1.png"));
							boton23.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton23;
							}
							else
							{
								if(boton23!=icono1)
								{
								contador++;
								icono2 = boton23;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
					}
				});
		tablero.this.add(boton23);
				boton23.setBounds(480,360, 100, 100);
				
				boton24=new Button(2);
				boton24.setIcon(img);
		boton24.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/Real1.png"));
							boton24.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton24;
							}
							else
							{
								if(boton24!=icono1)
								{
								contador++;
								icono2 = boton24;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
		tablero.this.add(boton24);
				boton24.setBounds(600,360, 100, 100);
				
				boton25=new Button(1);
				boton25.setIcon(img);
		boton25.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/barcelona1.png"));
							boton25.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton25;
							}
							else
							{
								if(boton25!=icono1)
								{
								contador++;
								icono2 = boton25;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
		tablero.this.add(boton25);
				boton25.setBounds(0,480, 100, 100);
				
				boton26=new Button(1);
				boton26.setIcon(img);
		boton26.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/barcelona1.png"));
							boton26.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton26;
							}
							else
							{
								if(boton26!=icono1)
								{
								contador++;
								icono2 = boton26;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
		tablero.this.add(boton26);
				boton26.setBounds(120,480, 100, 100);
				
				boton27=new Button(2);
				boton27.setIcon(img);
		boton27.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/Real1.png"));
							boton27.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton27;
							}
							else
							{
								if(boton27!=icono1)
								{
								contador++;
								icono2 = boton27;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
		tablero.this.add(boton27);
				boton27.setBounds(240,480, 100, 100);
				
				boton28=new Button(1);
				boton28.setIcon(img);
		boton28.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/barcelona1.png"));
							boton28.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton28;
							}
							else
							{
								if(boton28!=icono1)
								{
								contador++;
								icono2 = boton28;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
		tablero.this.add(boton28);
				boton28.setBounds(360,480, 100, 100);
				
				boton29=new Button(2);
				boton29.setIcon(img);
		boton29.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/Real1.png"));
							boton29.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton29;
							}
							else
							{
								if(boton29!=icono1)
								{
								contador++;
								icono2 = boton29;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
							}
						}
						
					}
				});
		tablero.this.add(boton29);
				boton29.setBounds(480,480, 100, 100);
				
				boton30=new Button(2);
				boton30.setIcon(img);
		boton30.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/Real1.png"));
							boton30.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton30;
							}
							else
							{
								if(boton30!=icono1)
								{
								contador++;
								icono2 = boton30;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
					}
				});
		tablero.this.add(boton30);
				boton30.setBounds(600,480, 100, 100);
				
				boton31=new Button(2);
				boton31.setIcon(img);
		boton31.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/Real1.png"));
							boton31.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton31;
							}
							else
							{
								if(boton31!=icono1)
								{
								contador++;
								icono2 = boton31;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
					}
				});
		tablero.this.add(boton31);
				boton31.setBounds(0,600, 100, 100);
				
				boton32=new Button(1);
				boton32.setIcon(img);
		boton32.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/barcelona1.png"));
							boton32.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton32;
							}
							else
							{
								if(boton32!=icono1)
								{
								contador++;
								icono2 = boton32;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
							
							}
						}
						
					}
				});
		tablero.this.add(boton32);
				boton32.setBounds(120,600, 100, 100);
				
				boton33=new Button(1);
				boton33.setIcon(img);
		boton33.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/barcelona1.png"));
							boton33.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton33;
							}
							else
							{
								if(boton33!=icono1)
								{
								contador++;
								icono2 = boton33;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
		tablero.this.add(boton33);
				boton33.setBounds(240,600, 100, 100);
				
				boton34=new Button(2);
				boton34.setIcon(img);
		boton34.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/Real1.png"));
							boton34.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton34;
							}
							else
							{
								if(boton34!=icono1)
								{
								contador++;
								icono2 = boton34;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								
								}
							}
						}
						
					}
				});
		tablero.this.add(boton34);
				boton34.setBounds(360,600, 100, 100);
				
				boton35=new Button(1);
				boton35.setIcon(img);
		boton35.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/barcelona1.png"));
							boton35.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton35;
							}
							else
							{
								if(boton35!=icono1)
								{
								contador++;
								icono2 = boton35;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
		tablero.this.add(boton35);
				boton35.setBounds(480,600, 100, 100);
				
				boton36=new Button(2);
				boton36.setIcon(img);
		boton36.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(contador<2){
							img=new ImageIcon(getClass().getResource("imagenes/Real1.png"));
							boton36.setIcon(img);
							
							if(contador == 0)
							{
								contador++;
								icono1 = boton36;
							}
							else
							{
								if(boton36!=icono1)
								{
								contador++;
								icono2 = boton36;
								
								if(icono1.getId() == icono2.getId())
								{
									elim=true;
								}
								else
								{
									cart=true;
								}
								}
								
							}
						}
						
					}
				});
				tablero.this.add(boton36);
				boton36.setBounds(600,600, 100, 100);
				
				nivel1.setVisible(false);
				nivel3.setVisible(false);
				nivel2.setVisible(false);
				
				tablero.this.repaint();
				tablero.this.add(img2);
			}
			
		});
		
		
		
		
		
		
		this.add(nivel2);
		
		this.repaint();
		
		nivel3= new JButton("Nivel Medio");
		nivel3.setBounds(750,260,150,90);
		nivel3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			
					crono2.start();
					
					img=new ImageIcon(getClass().getResource("imagenes/cubierta.jpg"));
					
					boton1 = new Button(1);
					boton1.setIcon(img);
					
					boton1.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							
							
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/ajax1.jpg"));
								boton1.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton1;
								}
								else
								{
									if(boton1!=icono1)
									{
									contador++;
									icono2 = boton1;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									
									}
								}
							}
							
						}
					});
					
					
					
					boton1.setBounds(0,10, 100, 100);
					tablero.this.add(boton1);
					
					
					
					boton2=new Button(2);
					boton2.setIcon(img);
			boton2.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/arsenal1.png"));
								boton2.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton2;
								}
								else
								{
									if(boton2!=icono1)
									{
									contador++;
									icono2 = boton2;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									}
									
								}
							}

							
						}
					});
					boton2.setBounds(120,10, 100, 100);
					tablero.this.add(boton2);
					
					
					
					boton3=new Button(3);
					boton3.setIcon(img);
			boton3.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/inter1.jpg"));
								boton3.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton3;
								}
								else
								{
									if(boton3!=icono1)
									{
									contador++;
									icono2 = boton3;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									
									}
								}
							}
							
						}
					});
					boton3.setBounds(240,10, 100, 100);
					tablero.this.add(boton3);
					
					
					boton4=new Button(1);
					boton4.setIcon(img);
			boton4.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/ajax1.jpg"));
								boton4.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton4;
								}		
								else
								{
									if(boton4!=icono1)
									{
									contador++;
									icono2 = boton4;
									;
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									
									}
								}
							}
							
						}
					});
					
					boton4.setBounds(360,10, 100, 100);
					tablero.this.add(boton4);
					
					boton5=new Button(4);
					boton5.setIcon(img);
			boton5.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/bayern1.png"));
								boton5.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton5;
								}
								else
								{
									if(boton5!=icono1)
									{
									contador++;
									icono2 = boton5;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									}
									
								}
							}
							
						}
					});
					
					boton5.setBounds(480,10, 100, 100);
					tablero.this.add(boton5);
					boton6=new Button(1);
					boton6.setIcon(img);
			boton6.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/ajax1.jpg"));
								boton6.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton6;
								}
								else
								{
									if(boton6!=icono1)
									{
									contador++;
									icono2 = boton6;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									
									}
								}
							}
							
							
						}
					});
					
					boton6.setBounds(600,10, 100, 100);
					tablero.this.add(boton6);
					boton7=new Button(3);
					boton7.setIcon(img);
			boton7.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/inter1.jpg"));
								boton7.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton7;
								}
								else
								{
									if(boton7!=icono1)
									{
									contador++;
									icono2 = boton7;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									}
									
								}
							}
							
							
						}
					});
					
					boton7.setBounds(0,120, 100, 100);
					tablero.this.add(boton7);
					boton8=new Button(4);
					boton8.setIcon(img);
			boton8.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/bayern1.png"));
								boton8.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton8;
								}
								else
								{
									if(boton8!=icono1)
									{
									contador++;
									icono2 = boton8;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									}
									
								}
							}
							
						}
					});
					
					boton8.setBounds(120,120, 100, 100);
					tablero.this.add(boton8);
					boton9=new Button(3);
					boton9.setIcon(img);
			boton9.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/inter1.jpg"));
								boton9.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton9;
								}
								else
								{
									if(boton9!=icono1)
									{
									contador++;
									icono2 = boton9;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									
									}
								}
							}
							
						}
					});
					
					boton9.setBounds(240,120, 100, 100);
					tablero.this.add(boton9);
					boton10=new Button(4);
					boton10.setIcon(img);
			boton10.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/bayern1.png"));
								boton10.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton10;
								}
								else
								{
									if(boton10!=icono1)
									{
									contador++;
									icono2 = boton10;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									}
									
								}
							}
							
						}
					});
					
					boton10.setBounds(360,120, 100, 100);
					tablero.this.add(boton10);
					boton11=new Button(1);
					boton11.setIcon(img);
			boton11.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/ajax1.jpg"));
								boton11.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton11;
								}
								else
								{
									if(boton11!=icono1)
									{
									contador++;
									icono2 = boton11;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									
									}
								}
							}
							
						}
					});
					
					boton11.setBounds(480,120, 100, 100);
					tablero.this.add(boton11);
					boton12=new Button(2);
					boton12.setIcon(img);
			boton12.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/arsenal1.png"));
								boton12.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton12;
								}
								else
								{
									if(boton12!=icono1)
									{
									contador++;
									icono2 = boton12;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									}
									
								}
							}
							
						}
					});
					
					boton12.setBounds(600,120, 100, 100);
					tablero.this.add(boton12);
					boton13=new Button(3);
					boton13.setIcon(img);
			boton13.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/inter1.jpg"));
								boton13.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton13;
								}
								else
								{
									if(boton13!=icono1)
									{
									contador++;
									icono2 = boton13;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									
									}
								}
							}
							
						}
					});
					
					boton13.setBounds(0,240, 100, 100);
					tablero.this.add(boton13);
					boton14=new Button(4);
					boton14.setIcon(img);
			boton14.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/bayern1.png"));
								boton14.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton14;
								}
								else
								{
									if(boton14!=icono1)
									{
									contador++;
									icono2 = boton14;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									}
									
								}
							}
							
						}
					});
					
					boton14.setBounds(120,240, 100, 100);
					tablero.this.add(boton14);
					boton15=new Button(3);
					boton15.setIcon(img);
			boton15.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/inter1.jpg"));
								boton15.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton15;
								}
								else
								{
									if(boton15!=icono1)
									{
									contador++;
									icono2 = boton15;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									}
									
								}
							}
							
						}
					});
					
					boton15.setBounds(240,240, 100, 100);
					tablero.this.add(boton15);
					boton16=new Button(4);
					boton16.setIcon(img);
			boton16.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/bayern1.png"));
								boton16.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton16;
								}
								else
								{
									if(boton16!=icono1)
									{
									contador++;
									icono2 = boton16;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									
									}
								}
							}
							
						}
					});
					
					boton16.setBounds(360,240, 100, 100);
					tablero.this.add(boton16);
					boton17=new Button(3);
					boton17.setIcon(img);
			boton17.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/inter1.jpg"));
								boton17.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton17;
								}
								else
								{
									if(boton17!=icono1)
									{
									contador++;
									icono2 = boton17;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									
									}
								}
							}
							
						}
					});
					
					boton17.setBounds(480,240, 100, 100);
					tablero.this.add(boton17);
					boton18=new Button(1);
					boton18.setIcon(img);
			boton18.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/ajax1.jpg"));
								boton18.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton18;
								}
								else
								{
									if(boton18!=icono1)
									{
									contador++;
									icono2 = boton18;
									
									if(icono1.getId() == icono2.getId())
									{
										
										elim=true;
									}
									else
									{
										cart=true;
									}
									}
									
								}
							}
							
						}
					});
			tablero.this.add(boton18);
					boton18.setBounds(600,240, 100, 100);
					tablero.this.repaint();
				
					boton19=new Button(2);
					boton19.setIcon(img);
			boton19.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/arsenal1.png"));
								boton19.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton19;
								}
								else
								{
									if(boton19!=icono1)
									{
									contador++;
									icono2 = boton19;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									}
									
								}
							}
							
						}
					});
			tablero.this.add(boton19);
					boton19.setBounds(0,360, 100, 100);
					
					boton20=new Button(4);
					boton20.setIcon(img);
			boton20.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/bayern1.png"));
								boton20.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton20;
								}
								else
								{
									if(boton20!=icono1)
									{
									contador++;
									icono2 = boton20;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									}
									
								}
							}
							
						}
					});
			tablero.this.add(boton20);
					boton20.setBounds(120,360, 100, 100);
					
					boton21=new Button(3);
					boton21.setIcon(img);
			boton21.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/inter1.jpg"));
								boton21.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton21;
								}
								else
								{
									if(boton21!=icono1)
									{
									contador++;
									icono2 = boton21;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									
									}
								}
							}
							
						}
					});
			tablero.this.add(boton21);
					boton21.setBounds(240,360, 100, 100);
					
					boton22=new Button(2);
					boton22.setIcon(img);
			boton22.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/arsenal1.png"));
								boton22.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton22;
								}
								else
								{
									if(boton22!=icono1)
									{
									contador++;
									icono2 = boton22;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									}
									
								}
							}
							
						}
					});
			tablero.this.add(boton22);
					boton22.setBounds(360,360, 100, 100);
					
					boton23=new Button(4);
					boton23.setIcon(img);
			boton23.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/bayern1.png"));
								boton23.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton23;
								}
								else
								{
									if(boton23!=icono1)
									{
									contador++;
									icono2 = boton23;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									
									}
								}
							}
							
						}
					});
			tablero.this.add(boton23);
					boton23.setBounds(480,360, 100, 100);
					
					boton24=new Button(2);
					boton24.setIcon(img);
			boton24.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/arsenal1.png"));
								boton24.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton24;
								}
								else
								{
									if(boton24!=icono1)
									{
									contador++;
									icono2 = boton24;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									
									}
								}
							}
							
						}
					});
			tablero.this.add(boton24);
					boton24.setBounds(600,360, 100, 100);
					
					boton25=new Button(1);
					boton25.setIcon(img);
			boton25.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/ajax1.jpg"));
								boton25.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton25;
								}
								else
								{
									if(boton25!=icono1)
									{
									contador++;
									icono2 = boton25;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									}
									
								}
							}
							
						}
					});
			tablero.this.add(boton25);
					boton25.setBounds(0,480, 100, 100);
					
					boton26=new Button(1);
					boton26.setIcon(img);
			boton26.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/ajax1.jpg"));
								boton26.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton26;
								}
								else
								{
									if(boton26!=icono1)
									{
									contador++;
									icono2 = boton26;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									}
									
								}
							}
							
						}
					});
			tablero.this.add(boton26);
					boton26.setBounds(120,480, 100, 100);
					
					boton27=new Button(4);
					boton27.setIcon(img);
			boton27.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/bayern1.png"));
								boton27.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton27;
								}
								else
								{
									if(boton27!=icono1)
									{
									contador++;
									icono2 = boton27;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									}
									
								}
							}
							
						}
					});
			tablero.this.add(boton27);
					boton27.setBounds(240,480, 100, 100);
					
					boton28=new Button(3);
					boton28.setIcon(img);
			boton28.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/inter1.jpg"));
								boton28.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton28;
								}
								else
								{
									if(boton28!=icono1)
									{
									contador++;
									icono2 = boton28;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									}
									
								}
							}
							
						}
					});
			tablero.this.add(boton28);
					boton28.setBounds(360,480, 100, 100);
					
					boton29=new Button(3);
					boton29.setIcon(img);
			boton29.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/inter1.jpg"));
								boton29.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton29;
								}
								else
								{
									if(boton29!=icono1)
									{
									contador++;
									icono2 = boton29;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									}
								}
							}
							
						}
					});
			tablero.this.add(boton29);
					boton29.setBounds(480,480, 100, 100);
					
					boton30=new Button(3);
					boton30.setIcon(img);
			boton30.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/inter1.jpg"));
								boton30.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton30;
								}
								else
								{
									if(boton30!=icono1)
									{
									contador++;
									icono2 = boton30;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									}
									
								}
							}
							
						}
					});
			tablero.this.add(boton30);
					boton30.setBounds(600,480, 100, 100);
					
					boton31=new Button(2);
					boton31.setIcon(img);
			boton31.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/arsenal1.png"));
								boton31.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton31;
								}
								else
								{
									if(boton31!=icono1)
									{
									contador++;
									icono2 = boton31;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									}
									
								}
							}
							
						}
					});
			tablero.this.add(boton31);
					boton31.setBounds(0,600, 100, 100);
					
					boton32=new Button(1);
					boton32.setIcon(img);
			boton32.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/ajax1.jpg"));
								boton32.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton32;
								}
								else
								{
									if(boton32!=icono1)
									{
									contador++;
									icono2 = boton32;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									}
									
								
								}
							}
							
						}
					});
			tablero.this.add(boton32);
					boton32.setBounds(120,600, 100, 100);
					
					boton33=new Button(1);
					boton33.setIcon(img);
			boton33.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/ajax1.jpg"));
								boton33.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton33;
								}
								else
								{
									if(boton33!=icono1)
									{
									contador++;
									icono2 = boton33;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									}
									
								}
							}
							
						}
					});
			tablero.this.add(boton33);
					boton33.setBounds(240,600, 100, 100);
					
					boton34=new Button(3);
					boton34.setIcon(img);
			boton34.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/inter1.jpg"));
								boton34.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton34;
								}
								else
								{
									if(boton34!=icono1)
									{
									contador++;
									icono2 = boton34;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									}
									
								}
							}
							
						}
					});
			tablero.this.add(boton34);
					boton34.setBounds(360,600, 100, 100);
					
					boton35=new Button(3);
					boton35.setIcon(img);
			boton35.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/inter1.jpg"));
								boton35.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton35;
								}
								else
								{
									if(boton35!=icono1)
									{
									contador++;
									icono2 = boton35;
									
									if(icono1.getId() == icono2.getId())
									{
										elim=true;
									}
									else
									{
										cart=true;
									}
									}
									
									
								}
							}
							
						}
					});
			tablero.this.add(boton35);
					boton35.setBounds(480,600, 100, 100);
					
					boton36=new Button(4);
					boton36.setIcon(img);
			boton36.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							if(contador<2){
								img=new ImageIcon(getClass().getResource("imagenes/bayern1.png"));
								boton36.setIcon(img);
								
								if(contador == 0)
								{
									contador++;
									icono1 = boton36;
								}
								else
								{
									if(boton36!=icono1)
									{
										contador++;
										icono2 = boton36;
										
										if(icono1.getId() == icono2.getId())
										{
											elim=true;
										}
										else
										{
											cart=true;
										}
									}
									
									
								}
							}
							
						}
					});
					tablero.this.add(boton36);
					boton36.setBounds(600,600, 100, 100);
					
					nivel1.setVisible(false);
					nivel3.setVisible(false);
					nivel2.setVisible(false);
					
					tablero.this.add(img2);
				}
			
		});
		this.add(nivel3);
		
		this.repaint();
		tablero.this.add(img2);
		
		
	}
	
	public void voltearCarta(){
		img=new ImageIcon(getClass().getResource("imagenes/cubierta.jpg"));
		
		icono1.setIcon(img);
		icono2.setIcon(img);
	}
	
	public void eliminarPar(){
		icono1.setEnabled(false);
		icono2.setEnabled(false);
	}
	
	int minutos = 0, segundos=0,horas=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try{
			for(;;){
				
				if(segundos==59){segundos=0;minutos++;}
				if(minutos==59){minutos=0;horas++;}
				segundos++;
				this.lblReloj.setText(horas+":"+minutos+":"+segundos);
				crono2.sleep(1000);
				if(minutos==1&&segundos==1){
					JFrame frame=new JFrame();
					JOptionPane.showMessageDialog(frame, "Termino el Tiempo :( ");
					
				}
				if(contador==2)
				{
					if(cart)
					{
						crono2.sleep(1000);
						voltearCarta();
						cart=false;
						contador=0;
					}
					else
					{
						if(elim)
						{
							crono2.sleep(1000);
							eliminarPar();
							elim=false;
							contador=0;
						}
					}
				}
				
			}
			
			
			
		}catch(InterruptedException e){
			System.out.println();
		}
		
	}
	
	
}
