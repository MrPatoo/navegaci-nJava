package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.PanelRojo;
import vista.frmMenuPrincipal;
import vista.panelAmarillo;
import vista.panelverde;

//3- añadir los eventos
public class ctrnMenuPrincipal  implements MouseListener{
    
    //1- mandar a llamar a las capas(se tiene que importar)
    frmMenuPrincipal vista;
    
    //2-constructor (siempre se tiene que llamar igual que la clase)
    public ctrnMenuPrincipal(frmMenuPrincipal Vista){
        
        //todos los elementos
        this.vista = Vista;
        
        vista.btnVerde.addMouseListener(this);
        vista.btnAmarillo.addMouseListener(this);
        vista.btnRojo.addMouseListener(this);
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //Verde-----------------------------------------------------------------
        if(e.getSource() == vista.btnVerde){
            //creo un obj del panel que quiero mostrar(importar libreria)
            panelverde objVerde = new panelverde();
            
            //limpio el panel contendor
            vista.jpContenedor.removeAll();
            //muestro el panel
            vista.jpContenedor.add(objVerde);
            //refrescar todo
            vista.jpContenedor.revalidate();
            vista.jpContenedor.repaint();
        }
        //Amarillo--------------------------------------------------------------
        if(e.getSource() == vista.btnAmarillo){
            panelAmarillo objAmarillo = new panelAmarillo();
            
            vista.jpContenedor.removeAll();
            vista.jpContenedor.add(objAmarillo);
            vista.jpContenedor.revalidate();
            vista.jpContenedor.repaint();
        }
        
        //Rojo------------------------------------------------------------------
        if(e.getSource() == vista.btnRojo){
            PanelRojo objRojo = new PanelRojo();
            
            vista.jpContenedor.removeAll();
            vista.jpContenedor.add(objRojo);
            vista.jpContenedor.revalidate();
            vista.jpContenedor.repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
