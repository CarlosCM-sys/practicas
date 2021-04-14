package ventanas.paneles;

import negocio.Evento.Actividad;
import negocio.Evento.Caracter;
import ventanas.VentanaPrincipal;
import ventanas.botones.BotonPrincipal;
import ventanas.elementos.Grid;
import ventanas.elementos.PanelTexto;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.*;

public class PActividad extends PFondoStandard{
    private GridBagConstraints grid = new Grid();
    private BotonPrincipal botonRepresentacion;
    private BotonPrincipal botonExhibicion;
    private BotonPrincipal botonActuacion;
    private BotonPrincipal botonProyeccion;
    private BotonPrincipal botonCompeticion;
    private BotonPrincipal botonAudicion;
    private String texto;
    
    public PActividad(){
        colocarTexto();
        colocarBotones();
        setVisible(true);
    }

    private void colocarTexto(){
        this.setLayout(new GridBagLayout());

        texto = "DECLARACIÓN RESPONSABLE / SOLICITUD DE LICENCIA";
        PanelTexto textoTitulo = new PanelTexto(texto, 1, 22, 1150, 70);
        grid = new Grid(0, 0, 3, -200, 0);

        this.add(textoTitulo, grid);
        
        texto = "Ley  10/2017,  del  27  de  diciembre,  de  espectáculos  públicos  y  actividades"+
                "recreativas de Galicia.";
        PanelTexto textoLey = new PanelTexto(texto, 0, 18, 1150, 100);
        grid = new Grid(0, 1, 3, -50, 0);
        this.add(textoLey, grid);
    }

    private void colocarBotones(){
        botonRepresentacion = new BotonPrincipal("REPRESENTACIÓN");
        botonRepresentacion.addActionListener(this);
        grid = new Grid(0, 2, 0, 0, 100, 30, 40);
        this.add(botonRepresentacion, grid);

        botonExhibicion = new BotonPrincipal("EXHIBICIÓN");
        botonExhibicion.addActionListener(this);
        grid = new Grid(1, 2, 0, 0, 100, 106, 40);
        this.add(botonExhibicion, grid);

        botonActuacion = new BotonPrincipal("ACTUACIÓN");
        botonActuacion.addActionListener(this);
        grid = new Grid(2, 2, 0, 0, 0, 106, 40);
        this.add(botonActuacion, grid);

        botonProyeccion = new BotonPrincipal("PROYECCIÓN");
        botonProyeccion.addActionListener(this);
        grid = new Grid(0, 3, 0, 100, 100, 81, 40);
        this.add(botonProyeccion, grid);

        botonCompeticion = new BotonPrincipal("COMPETICIÓN");
        botonCompeticion.addActionListener(this);
        grid = new Grid(1, 3, 0, 100, 100, 81, 40);
        this.add(botonCompeticion, grid);

        botonAudicion = new BotonPrincipal("AUDICIÓN");
        botonAudicion.addActionListener(this);
        grid = new Grid(2, 3, 0, 100, 0, 126, 40);
        this.add(botonAudicion, grid);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
        if(e.getSource() == botonRepresentacion){
            frame.getEvento().setTipoActividad(Actividad.REPRESENTACION);
            JOptionPane.showMessageDialog(null, "Establecido el subtipo como REPRESENTACION - WIP");
        }
        if(e.getSource() == botonExhibicion){
            frame.getEvento().setTipoActividad(Actividad.EXHIBICION);
            JOptionPane.showMessageDialog(null, "Establecido el subtipo como EXHIBICION - WIP");
        }
        if(e.getSource() == botonActuacion){
            frame.getEvento().setTipoActividad(Actividad.ACTUACION);
            JOptionPane.showMessageDialog(null, "Establecido el subtipo como ACTUACION - WIP");
        }
        if(e.getSource() == botonProyeccion){
            frame.getEvento().setTipoActividad(Actividad.PROYECCION);
            JOptionPane.showMessageDialog(null, "Establecido el subtipo como PROYECCION - WIP");
        }
        if(e.getSource() == botonCompeticion){
            frame.getEvento().setTipoActividad(Actividad.COMPETICION);
            JOptionPane.showMessageDialog(null, "Establecido el subtipo como COMPETICION - WIP");
        }
        if(e.getSource() == botonAudicion){
            frame.getEvento().setTipoActividad(Actividad.AUDICION);
            JOptionPane.showMessageDialog(null, "Establecido el subtipo como AUDICION - WIP");
        }
    }
    
}