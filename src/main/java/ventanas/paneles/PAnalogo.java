package ventanas.paneles;

import negocio.Evento.SubtipoEvento;
import ventanas.VentanaPrincipal;
import ventanas.botones.BotonPrincipal;
import ventanas.elementos.Grid;
import ventanas.elementos.PanelTexto;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.*;

public class PAnalogo extends JPanel implements ActionListener {
    private static final long serialVersionUID = 1L;
    private GridBagConstraints grid = new Grid();
    private BotonPrincipal botonPirotecnico;
    private BotonPrincipal botonTaurino;
    private BotonPrincipal botonCircence;
    private String texto;

    public PAnalogo(){
        colocarTextoAnalogo();
        colocarBotones();
        setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        ImageIcon img = new ImageIcon("src/main/java/imagenes/fondo.jpg");
        g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
    }

    private void colocarTextoAnalogo(){
        this.setLayout(new GridBagLayout());

        texto = "DECLARACIÓN RESPONSABLE / SOLICITUD DE LICENCIA";
        PanelTexto textoTitulo = new PanelTexto(texto, 1, 22, 1150, 70);
        grid = new Grid(0, 0, 2, 0, 0);
        grid.fill = GridBagConstraints.HORIZONTAL;
        this.add(textoTitulo, grid);

        texto = "Aquellos en que se produce la ejecución o representación en público de obras o composiciones"+
                " de efectos visuales, sonoros, y fumígenos con una finalidad lúdica, mediante el uso de artificios de "+
                "pirotecnia, conjunta o aisladamente con composiciones audiovisuales, de instrumentos musicales oo voz humana,"+
                " a cargo de intérpretes musicales, cantantes o artistas, profesionales o personas aficionadas, en espacios"+
                " abiertos al público debidamente";
        PanelTexto textoPirotecnico = new PanelTexto(texto, 0, 16, 500, 150);
        textoPirotecnico.setMinimumSize(new Dimension(500, 150));
        grid = new Grid(0, 1, 0, 0, 100);
        this.add(textoPirotecnico, grid);

        texto = "Aquellos en que intervienen reses de ganado bovino bravo para ser lidiadas en plazas "+
                "de toros con público, por profesionales o personas aficionadas, de acuerdo con la normativa "+
                " específica. La clasificación y características de los recintos serán las establecidas en la normativa "+
                "específica aplicable";
        PanelTexto textoTaurino = new PanelTexto(texto, 0, 16, 500, 150);
        textoTaurino.setMinimumSize(new Dimension(500, 150));
        grid = new Grid(1, 1, 0, 0, 0);
        this.add(textoTaurino, grid);

        texto = "La ejecución o representación en público de ejercicios físicos, de acrobacia o habilidad, actuacinoes de"+
                " payasos, malabaristas, prestidigitadores, animales amaestrados o no, "+
                "y otras semejantes, realizadas por artistas, intérpretes o ejecutantes, profesionales"+
                " o personas aficionadas, en establecimientos cerrados o al aire libre, debidamente "+
                "acondicionados y habilitados para eso, sin prejuizo de lo dispuesto en el artículo 9.I) de la Ley 4/2017, "+
                "del 3 de octubre, de protección y bienestar de los animales de compañía.";
        PanelTexto textoCircence = new PanelTexto(texto, 0, 16, 900, 100);
        textoCircence.setMinimumSize(new Dimension(600, 100));
        grid = new Grid(0, 3, 2, 30, 0);
        this.add(textoCircence, grid);

        texto = "Decreto  124/2019,  del  5  de  sepitembre,  por el que se  aprueba  el  Catálogo  de espectáculos  públicos,"+
                " actividades  recreativas  y  establecementos  abiertos  al público  de la  Comunidad  Autónoma  de  Galicia"+
                " y  se  establecen  determinadas disposiciones geraless de aplicación en la materia.";
        PanelTexto textoLey = new PanelTexto(texto, 0, 18, 1250, 50);
        textoLey.setMinimumSize(new Dimension(1250, 50));
        textoLey.setBackground(new Color(213, 156, 71));
        grid.fill = GridBagConstraints.HORIZONTAL;
        textoLey.setOpaque(true);
        grid = new Grid(0, 5, 2, 50, 0);
        this.add(textoLey, grid);
    }

    private void colocarBotones(){
        botonPirotecnico = new BotonPrincipal("PIROTÉCNICO");
        botonPirotecnico.addActionListener(this);
        grid = new Grid(0, 2, 0, 0, 110, 30, 30);
        this.add(botonPirotecnico, grid);

        botonTaurino = new BotonPrincipal("TAURINO");
        botonTaurino.addActionListener(this);
        grid = new Grid(1, 2, 0, 0, 0, 80, 30);
        this.add(botonTaurino, grid);

        botonCircence = new BotonPrincipal("CIRCENSE");
        botonCircence.addActionListener(this);
        grid = new Grid(0, 4, 2, 0, 0, 75, 30);
        this.add(botonCircence, grid);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
        if(e.getSource() == botonPirotecnico){
            frame.getEvento().setSubtipo(SubtipoEvento.PIROTECNICO);
            JOptionPane.showMessageDialog(null, "Establecido el subtipo como PIROTECNICO - WIP");
        }else if(e.getSource() == botonTaurino){
            frame.getEvento().setSubtipo(SubtipoEvento.TAURINO);
            JOptionPane.showMessageDialog(null, "Establecido el subtipo como TAURINO - WIP");
        }else if(e.getSource() == botonCircence){
            frame.getEvento().setSubtipo(SubtipoEvento.CIRCENCE);
            JOptionPane.showMessageDialog(null, "Establecido el subtipo como CIRCENSE - WIP");
        }
    }
    
}