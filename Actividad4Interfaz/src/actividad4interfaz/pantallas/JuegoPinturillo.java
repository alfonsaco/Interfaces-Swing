/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad4interfaz.pantallas;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author PROGRAMACION
 */
public class JuegoPinturillo extends javax.swing.JDialog {

    Color color;
    /**
     * Creates new form JuegoPinturillo
     */
    public JuegoPinturillo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        // Estilos de ventana
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setIconImage(new ImageIcon(getClass().getResource("/actividad4interfaz/images/icono.png")).getImage());
        
        // Color 
        color=Color.BLACK;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        ContenedorGeneral = new javax.swing.JPanel();
        ContenedorColores = new javax.swing.JPanel();
        Negro = new javax.swing.JPanel();
        Rojo = new javax.swing.JPanel();
        Naranja = new javax.swing.JPanel();
        Amarillo = new javax.swing.JPanel();
        Verde = new javax.swing.JPanel();
        Cian = new javax.swing.JPanel();
        Azul = new javax.swing.JPanel();
        Morado = new javax.swing.JPanel();
        Violeta = new javax.swing.JPanel();
        Marrón = new javax.swing.JPanel();
        Blanco = new javax.swing.JPanel();
        Gris = new javax.swing.JPanel();
        BotonLimpiar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SliderTamaño = new javax.swing.JSlider();
        ContenedorPintar = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ContenedorGeneral.setBackground(new java.awt.Color(13, 13, 13));
        ContenedorGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContenedorColores.setBackground(new java.awt.Color(255, 255, 255));
        ContenedorColores.setOpaque(false);
        ContenedorColores.setLayout(new java.awt.GridLayout(2, 5, 2, 2));

        Negro.setBackground(new java.awt.Color(0, 0, 0));
        Negro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NegroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout NegroLayout = new javax.swing.GroupLayout(Negro);
        Negro.setLayout(NegroLayout);
        NegroLayout.setHorizontalGroup(
            NegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );
        NegroLayout.setVerticalGroup(
            NegroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        ContenedorColores.add(Negro);

        Rojo.setBackground(new java.awt.Color(204, 0, 0));
        Rojo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Rojo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RojoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout RojoLayout = new javax.swing.GroupLayout(Rojo);
        Rojo.setLayout(RojoLayout);
        RojoLayout.setHorizontalGroup(
            RojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        RojoLayout.setVerticalGroup(
            RojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        ContenedorColores.add(Rojo);

        Naranja.setBackground(new java.awt.Color(255, 153, 0));
        Naranja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Naranja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NaranjaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout NaranjaLayout = new javax.swing.GroupLayout(Naranja);
        Naranja.setLayout(NaranjaLayout);
        NaranjaLayout.setHorizontalGroup(
            NaranjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        NaranjaLayout.setVerticalGroup(
            NaranjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        ContenedorColores.add(Naranja);

        Amarillo.setBackground(new java.awt.Color(255, 255, 0));
        Amarillo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Amarillo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AmarilloMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AmarilloLayout = new javax.swing.GroupLayout(Amarillo);
        Amarillo.setLayout(AmarilloLayout);
        AmarilloLayout.setHorizontalGroup(
            AmarilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        AmarilloLayout.setVerticalGroup(
            AmarilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        ContenedorColores.add(Amarillo);

        Verde.setBackground(new java.awt.Color(0, 204, 0));
        Verde.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Verde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerdeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout VerdeLayout = new javax.swing.GroupLayout(Verde);
        Verde.setLayout(VerdeLayout);
        VerdeLayout.setHorizontalGroup(
            VerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        VerdeLayout.setVerticalGroup(
            VerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        ContenedorColores.add(Verde);

        Cian.setBackground(new java.awt.Color(0, 204, 204));
        Cian.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Cian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CianMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CianLayout = new javax.swing.GroupLayout(Cian);
        Cian.setLayout(CianLayout);
        CianLayout.setHorizontalGroup(
            CianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        CianLayout.setVerticalGroup(
            CianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        ContenedorColores.add(Cian);

        Azul.setBackground(new java.awt.Color(0, 51, 153));
        Azul.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Azul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AzulMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AzulLayout = new javax.swing.GroupLayout(Azul);
        Azul.setLayout(AzulLayout);
        AzulLayout.setHorizontalGroup(
            AzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        AzulLayout.setVerticalGroup(
            AzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        ContenedorColores.add(Azul);

        Morado.setBackground(new java.awt.Color(102, 0, 153));
        Morado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Morado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MoradoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MoradoLayout = new javax.swing.GroupLayout(Morado);
        Morado.setLayout(MoradoLayout);
        MoradoLayout.setHorizontalGroup(
            MoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        MoradoLayout.setVerticalGroup(
            MoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        ContenedorColores.add(Morado);

        Violeta.setBackground(new java.awt.Color(255, 0, 204));
        Violeta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Violeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VioletaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout VioletaLayout = new javax.swing.GroupLayout(Violeta);
        Violeta.setLayout(VioletaLayout);
        VioletaLayout.setHorizontalGroup(
            VioletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        VioletaLayout.setVerticalGroup(
            VioletaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        ContenedorColores.add(Violeta);

        Marrón.setBackground(new java.awt.Color(153, 51, 0));
        Marrón.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Marrón.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MarrónMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MarrónLayout = new javax.swing.GroupLayout(Marrón);
        Marrón.setLayout(MarrónLayout);
        MarrónLayout.setHorizontalGroup(
            MarrónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        MarrónLayout.setVerticalGroup(
            MarrónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        ContenedorColores.add(Marrón);

        Blanco.setBackground(new java.awt.Color(255, 255, 255));
        Blanco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Blanco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BlancoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BlancoLayout = new javax.swing.GroupLayout(Blanco);
        Blanco.setLayout(BlancoLayout);
        BlancoLayout.setHorizontalGroup(
            BlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        BlancoLayout.setVerticalGroup(
            BlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        ContenedorColores.add(Blanco);

        Gris.setBackground(new java.awt.Color(153, 153, 153));
        Gris.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Gris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GrisMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout GrisLayout = new javax.swing.GroupLayout(Gris);
        Gris.setLayout(GrisLayout);
        GrisLayout.setHorizontalGroup(
            GrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );
        GrisLayout.setVerticalGroup(
            GrisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        ContenedorColores.add(Gris);

        ContenedorGeneral.add(ContenedorColores, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 210, 40));

        BotonLimpiar.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(243, 243, 243));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LIMPIAR");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout BotonLimpiarLayout = new javax.swing.GroupLayout(BotonLimpiar);
        BotonLimpiar.setLayout(BotonLimpiarLayout);
        BotonLimpiarLayout.setHorizontalGroup(
            BotonLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        BotonLimpiarLayout.setVerticalGroup(
            BotonLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        ContenedorGeneral.add(BotonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 90, -1));

        SliderTamaño.setBackground(new java.awt.Color(204, 0, 153));
        SliderTamaño.setForeground(new java.awt.Color(255, 255, 255));
        SliderTamaño.setMaximum(50);
        SliderTamaño.setValue(5);
        SliderTamaño.setOpaque(false);
        ContenedorGeneral.add(SliderTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 242, -1));

        ContenedorPintar.setBackground(new java.awt.Color(204, 204, 204));
        ContenedorPintar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        ContenedorPintar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ContenedorPintarMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout ContenedorPintarLayout = new javax.swing.GroupLayout(ContenedorPintar);
        ContenedorPintar.setLayout(ContenedorPintarLayout);
        ContenedorPintarLayout.setHorizontalGroup(
            ContenedorPintarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );
        ContenedorPintarLayout.setVerticalGroup(
            ContenedorPintarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );

        ContenedorGeneral.add(ContenedorPintar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 320, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContenedorGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContenedorGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContenedorPintarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContenedorPintarMouseDragged
        Graphics dibujo=ContenedorPintar.getGraphics();
        dibujo.setColor(color);
        dibujo.fillOval(evt.getX()-SliderTamaño.getValue()/2, evt.getY()-SliderTamaño.getValue()/2, SliderTamaño.getValue(), SliderTamaño.getValue());
    }//GEN-LAST:event_ContenedorPintarMouseDragged

    // HOVER DEL BOTÓN LIMPIAR
    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        BotonLimpiar.setBackground(new Color(176, 23, 23));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        BotonLimpiar.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        ContenedorPintar.revalidate();        
        ContenedorPintar.repaint();
    }//GEN-LAST:event_jLabel1MouseClicked

    // CAMBIAR EL COLOR DEL DIBUJO
    private void NegroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NegroMouseClicked
        color=Color.BLACK;
    }//GEN-LAST:event_NegroMouseClicked

    private void RojoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RojoMouseClicked
        color=new Color(204,0,0);
    }//GEN-LAST:event_RojoMouseClicked

    private void NaranjaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NaranjaMouseClicked
        color=new Color(255,153,0);
    }//GEN-LAST:event_NaranjaMouseClicked

    private void AmarilloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AmarilloMouseClicked
        color=new Color(255,255,0);
    }//GEN-LAST:event_AmarilloMouseClicked

    private void VerdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerdeMouseClicked
        color=new Color(0,204,0);
    }//GEN-LAST:event_VerdeMouseClicked

    private void CianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CianMouseClicked
        color=new Color(0,204,204);
    }//GEN-LAST:event_CianMouseClicked

    private void AzulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AzulMouseClicked
        color=new Color(0,51,153);
    }//GEN-LAST:event_AzulMouseClicked

    private void MoradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoradoMouseClicked
        color=new Color(102,0,153);
    }//GEN-LAST:event_MoradoMouseClicked

    private void VioletaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VioletaMouseClicked
        color=new Color(255,0,204);
    }//GEN-LAST:event_VioletaMouseClicked

    private void MarrónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MarrónMouseClicked
        color=new Color(153,51,0);
    }//GEN-LAST:event_MarrónMouseClicked

    private void BlancoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BlancoMouseClicked
        color=Color.WHITE;
    }//GEN-LAST:event_BlancoMouseClicked

    private void GrisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GrisMouseClicked
        color=new Color(153,153,153);
    }//GEN-LAST:event_GrisMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Amarillo;
    private javax.swing.JPanel Azul;
    private javax.swing.JPanel Blanco;
    private javax.swing.JPanel BotonLimpiar;
    private javax.swing.JPanel Cian;
    private javax.swing.JPanel ContenedorColores;
    private javax.swing.JPanel ContenedorGeneral;
    private javax.swing.JPanel ContenedorPintar;
    private javax.swing.JPanel Gris;
    private javax.swing.JPanel Marrón;
    private javax.swing.JPanel Morado;
    private javax.swing.JPanel Naranja;
    private javax.swing.JPanel Negro;
    private javax.swing.JPanel Rojo;
    private javax.swing.JSlider SliderTamaño;
    private javax.swing.JPanel Verde;
    private javax.swing.JPanel Violeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
