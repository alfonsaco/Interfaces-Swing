/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad4interfaz.pantallas;

import actividad4interfaz.pantallas.Fuente;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author Alfonso
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    CompoundBorder bordeCompuesto;
    CompoundBorder bordeCompuestoFinal;
    MatteBorder bordeExteriorFinal;
    MatteBorder bordeExterior;
    MatteBorder bordeInterno;
    AudioClip change;
    AudioClip audio;
    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
        initComponents();
        
        // Configuración para la pantalla principal
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setSize(550, 410);
        this.setIconImage(new ImageIcon(getClass().getResource("/actividad4interfaz/images/icono.png")).getImage());
        
        // Borde de los botones
        bordeInterno=BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(255, 25, 0));
        bordeExterior=BorderFactory.createMatteBorder(2, 0, 2, 0, new Color(255, 25, 0, 70));
        bordeExteriorFinal=BorderFactory.createMatteBorder(4, 0, 4, 0, new Color(255, 25, 0, 15));
        // Borde compuesto, para poder dar un efecto de degradado
        bordeCompuesto=new CompoundBorder(bordeExterior, bordeInterno);
        bordeCompuestoFinal=new CompoundBorder(bordeExteriorFinal, bordeCompuesto);
        
        // Fuente
        Fuente cambiarFuente=new Fuente();
        Font fuente=cambiarFuente.cargarFuente("/actividad4interfaz/fonts/Roboto-Thin.ttf", 30f);
        if(fuente != null){
            LabelBotonJugar.setFont(fuente);
            LabelBotonSalir.setFont(fuente);
        }
        
        // Estilos de los botones
        Color transparente=new Color(0,0,0,0);
        BotonJugar.setBackground(transparente);      
        BotonJugar.setOpaque(false);
        BotonSalir.setBackground(transparente);
        BotonSalir.setOpaque(false);
        
        // Audio
        change=java.applet.Applet.newAudioClip(getClass().getResource("/actividad4interfaz/audio/change.wav"));
        audio=java.applet.Applet.newAudioClip(getClass().getResource("/actividad4interfaz/audio/play.wav"));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContenedorFondo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotonJugar = new javax.swing.JPanel();
        LabelBotonJugar = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JPanel();
        LabelBotonSalir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ContenedorFondo.setBackground(new java.awt.Color(0, 0, 0));
        ContenedorFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/actividad4interfaz/images/logoRojo.png"))); // NOI18N
        ContenedorFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 530, 190));

        BotonJugar.setBackground(new java.awt.Color(13, 13, 13));

        LabelBotonJugar.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LabelBotonJugar.setForeground(new java.awt.Color(255, 25, 0));
        LabelBotonJugar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelBotonJugar.setText("JUGAR");
        LabelBotonJugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LabelBotonJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelBotonJugarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelBotonJugarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelBotonJugarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BotonJugarLayout = new javax.swing.GroupLayout(BotonJugar);
        BotonJugar.setLayout(BotonJugarLayout);
        BotonJugarLayout.setHorizontalGroup(
            BotonJugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelBotonJugar, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        BotonJugarLayout.setVerticalGroup(
            BotonJugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelBotonJugar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        ContenedorFondo.add(BotonJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 230, 60));

        BotonSalir.setBackground(new java.awt.Color(13, 13, 13));

        LabelBotonSalir.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LabelBotonSalir.setForeground(new java.awt.Color(255, 25, 0));
        LabelBotonSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelBotonSalir.setText("SALIR");
        LabelBotonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LabelBotonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelBotonSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelBotonSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelBotonSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BotonSalirLayout = new javax.swing.GroupLayout(BotonSalir);
        BotonSalir.setLayout(BotonSalirLayout);
        BotonSalirLayout.setHorizontalGroup(
            BotonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelBotonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        BotonSalirLayout.setVerticalGroup(
            BotonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelBotonSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        ContenedorFondo.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 230, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/actividad4interfaz/images/fondo1.png"))); // NOI18N
        ContenedorFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContenedorFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContenedorFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Botón salir del juego
    private void LabelBotonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelBotonSalirMouseClicked
        dispose();
    }//GEN-LAST:event_LabelBotonSalirMouseClicked

    private void LabelBotonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelBotonSalirMouseEntered
        change.play();
        // Volvemos a pintar el contenedor, porque da errores visuales. 
        ContenedorFondo.repaint();
        ContenedorFondo.revalidate();
        BotonSalir.setBorder(bordeCompuestoFinal);        
    }//GEN-LAST:event_LabelBotonSalirMouseEntered

    private void LabelBotonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelBotonSalirMouseExited
        ContenedorFondo.repaint();
        ContenedorFondo.revalidate();
        // Quitamos el borde al salir
        BotonSalir.setBorder(null);
    }//GEN-LAST:event_LabelBotonSalirMouseExited

    private void LabelBotonJugarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelBotonJugarMouseEntered
        change.play();
        ContenedorFondo.repaint();
        ContenedorFondo.revalidate();
        BotonJugar.setBorder(bordeCompuestoFinal);     
    }//GEN-LAST:event_LabelBotonJugarMouseEntered

    private void LabelBotonJugarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelBotonJugarMouseExited
        ContenedorFondo.repaint();
        ContenedorFondo.revalidate();
        BotonJugar.setBorder(null);
    }//GEN-LAST:event_LabelBotonJugarMouseExited

    // Botón de jugar
    private void LabelBotonJugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelBotonJugarMouseClicked
        // Se reproduce un sonido al pulsar en JUGAR
        audio.play();
        // Abrimos la pantalla de registro
        PantallaRegistro p=new PantallaRegistro();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_LabelBotonJugarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonJugar;
    private javax.swing.JPanel BotonSalir;
    private javax.swing.JPanel ContenedorFondo;
    private javax.swing.JLabel LabelBotonJugar;
    private javax.swing.JLabel LabelBotonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
