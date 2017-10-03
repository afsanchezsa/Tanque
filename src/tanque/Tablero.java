/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tanque;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Estudiante
 * JPanel dado que voy a pintar en el Canvas
 * ActionListener:Para poder ejecutar el escenario cada ciertos milisegundos
 */
public class Tablero extends JPanel implements ActionListener{
 
    private Timer timer;
    public Tablero(){
    this.timer=new Timer(25,this);
    setFocusable(true);
    addKeyListener(new EventosTeclado());
    
    this.timer.start();
    
    }
    
    @Override
    public void paintComponent(Graphics g){
      super.paintComponent(g);
 
 }
   
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();  
    }
    private class EventosTeclado extends KeyAdapter{
    public void keyReleased(KeyEvent e){
    int key=e.getKeyCode();
    if(key==KeyEvent.VK_SPACE){
        System.out.println("vk_space");
        
    }
    }
    public void KeyPressed(KeyEvent e){
    
    
    }
    
    
    }
     public Image loadImage(String ruta){
    ImageIcon img=new ImageIcon(ruta);
    Image imagen=img.getImage();
    return imagen;
    }
    
}
