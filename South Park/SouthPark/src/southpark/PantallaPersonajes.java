/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package southpark;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

/**
 *
 * @author PROGRAMACION
 */
public class PantallaPersonajes extends javax.swing.JDialog {

    private MatteBorder bordeNuevo;
    /**
     * Creates new form PantallaPersonajes
     */
    public PantallaPersonajes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        bordeNuevo=BorderFactory.createMatteBorder(6,6,6,6,new Color(255,255,255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelImagen2 = new jpanelimagen.JPanelImagen();
        ContenedorPersonajes = new javax.swing.JPanel();
        EricCartman = new jpanelimagen.JPanelImagen();
        StanMars = new jpanelimagen.JPanelImagen();
        KyleBroflovski = new jpanelimagen.JPanelImagen();
        Kenny = new jpanelimagen.JPanelImagen();
        ButtersStotch = new jpanelimagen.JPanelImagen();
        Timmy = new jpanelimagen.JPanelImagen();
        Token = new jpanelimagen.JPanelImagen();
        Jimmy = new jpanelimagen.JPanelImagen();
        Randy = new jpanelimagen.JPanelImagen();
        DonMojon = new jpanelimagen.JPanelImagen();
        jLabelNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanelImagen2.setImagen(new jpanelimagen.ImagenFondo(new java.io.File("C:/Users/PROGRAMACION/Desktop/Interfaces-Swing/South Park/SouthPark/src/southpark/images/background-calle.png"), 1.0f));

        ContenedorPersonajes.setLayout(new java.awt.GridLayout(2, 0));

        EricCartman.setBackground(new java.awt.Color(204, 0, 0));
        EricCartman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EricCartman.setImagen(new jpanelimagen.ImagenFondo(new java.io.File("C:/Users/PROGRAMACION/Desktop/Interfaces-Swing/South Park/SouthPark/src/southpark/images/eric_1.jpg"), 1.0f));
        EricCartman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EricCartmanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EricCartmanMouseExited(evt);
            }
        });

        javax.swing.GroupLayout EricCartmanLayout = new javax.swing.GroupLayout(EricCartman);
        EricCartman.setLayout(EricCartmanLayout);
        EricCartmanLayout.setHorizontalGroup(
            EricCartmanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        EricCartmanLayout.setVerticalGroup(
            EricCartmanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        ContenedorPersonajes.add(EricCartman);

        StanMars.setBackground(new java.awt.Color(204, 0, 0));
        StanMars.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StanMars.setImagen(new jpanelimagen.ImagenFondo(new java.io.File("C:/Users/PROGRAMACION/Desktop/Interfaces-Swing/South Park/SouthPark/src/southpark/images/stans2.png"), 1.0f));
        StanMars.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StanMarsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StanMarsMouseExited(evt);
            }
        });

        javax.swing.GroupLayout StanMarsLayout = new javax.swing.GroupLayout(StanMars);
        StanMars.setLayout(StanMarsLayout);
        StanMarsLayout.setHorizontalGroup(
            StanMarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        StanMarsLayout.setVerticalGroup(
            StanMarsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        ContenedorPersonajes.add(StanMars);

        KyleBroflovski.setBackground(new java.awt.Color(204, 0, 0));
        KyleBroflovski.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        KyleBroflovski.setImagen(new jpanelimagen.ImagenFondo(new java.io.File("C:/Users/PROGRAMACION/Desktop/Interfaces-Swing/South Park/SouthPark/src/southpark/images/kyle.png"), 1.0f));
        KyleBroflovski.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                KyleBroflovskiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                KyleBroflovskiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout KyleBroflovskiLayout = new javax.swing.GroupLayout(KyleBroflovski);
        KyleBroflovski.setLayout(KyleBroflovskiLayout);
        KyleBroflovskiLayout.setHorizontalGroup(
            KyleBroflovskiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        KyleBroflovskiLayout.setVerticalGroup(
            KyleBroflovskiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        ContenedorPersonajes.add(KyleBroflovski);

        Kenny.setBackground(new java.awt.Color(204, 0, 0));
        Kenny.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Kenny.setImagen(new jpanelimagen.ImagenFondo(new java.io.File("C:/Users/PROGRAMACION/Desktop/Interfaces-Swing/South Park/SouthPark/src/southpark/images/kenny.png"), 1.0f));
        Kenny.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                KennyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                KennyMouseExited(evt);
            }
        });

        javax.swing.GroupLayout KennyLayout = new javax.swing.GroupLayout(Kenny);
        Kenny.setLayout(KennyLayout);
        KennyLayout.setHorizontalGroup(
            KennyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        KennyLayout.setVerticalGroup(
            KennyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        ContenedorPersonajes.add(Kenny);

        ButtersStotch.setBackground(new java.awt.Color(204, 0, 0));
        ButtersStotch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtersStotch.setImagen(new jpanelimagen.ImagenFondo(new java.io.File("C:/Users/PROGRAMACION/Desktop/Interfaces-Swing/South Park/SouthPark/src/southpark/images/butters.png"), 1.0f));
        ButtersStotch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtersStotchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtersStotchMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ButtersStotchLayout = new javax.swing.GroupLayout(ButtersStotch);
        ButtersStotch.setLayout(ButtersStotchLayout);
        ButtersStotchLayout.setHorizontalGroup(
            ButtersStotchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        ButtersStotchLayout.setVerticalGroup(
            ButtersStotchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        ContenedorPersonajes.add(ButtersStotch);

        Timmy.setBackground(new java.awt.Color(204, 0, 0));
        Timmy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Timmy.setImagen(new jpanelimagen.ImagenFondo(new java.io.File("C:/Users/PROGRAMACION/Desktop/Interfaces-Swing/South Park/SouthPark/src/southpark/images/timmy.jpg"), 1.0f));
        Timmy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TimmyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TimmyMouseExited(evt);
            }
        });

        javax.swing.GroupLayout TimmyLayout = new javax.swing.GroupLayout(Timmy);
        Timmy.setLayout(TimmyLayout);
        TimmyLayout.setHorizontalGroup(
            TimmyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        TimmyLayout.setVerticalGroup(
            TimmyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        ContenedorPersonajes.add(Timmy);

        Token.setBackground(new java.awt.Color(204, 0, 0));
        Token.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Token.setImagen(new jpanelimagen.ImagenFondo(new java.io.File("C:/Users/PROGRAMACION/Desktop/Interfaces-Swing/South Park/SouthPark/src/southpark/images/token.png"), 1.0f));
        Token.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TokenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TokenMouseExited(evt);
            }
        });

        javax.swing.GroupLayout TokenLayout = new javax.swing.GroupLayout(Token);
        Token.setLayout(TokenLayout);
        TokenLayout.setHorizontalGroup(
            TokenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        TokenLayout.setVerticalGroup(
            TokenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        ContenedorPersonajes.add(Token);

        Jimmy.setBackground(new java.awt.Color(204, 0, 0));
        Jimmy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jimmy.setImagen(new jpanelimagen.ImagenFondo(new java.io.File("C:/Users/PROGRAMACION/Desktop/Interfaces-Swing/South Park/SouthPark/src/southpark/images/jimmy.png"), 1.0f));
        Jimmy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JimmyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JimmyMouseExited(evt);
            }
        });

        javax.swing.GroupLayout JimmyLayout = new javax.swing.GroupLayout(Jimmy);
        Jimmy.setLayout(JimmyLayout);
        JimmyLayout.setHorizontalGroup(
            JimmyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        JimmyLayout.setVerticalGroup(
            JimmyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        ContenedorPersonajes.add(Jimmy);

        Randy.setBackground(new java.awt.Color(204, 0, 0));
        Randy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Randy.setImagen(new jpanelimagen.ImagenFondo(new java.io.File("C:/Users/PROGRAMACION/Desktop/Interfaces-Swing/South Park/SouthPark/src/southpark/images/randy.jpg"), 1.0f));
        Randy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RandyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RandyMouseExited(evt);
            }
        });

        javax.swing.GroupLayout RandyLayout = new javax.swing.GroupLayout(Randy);
        Randy.setLayout(RandyLayout);
        RandyLayout.setHorizontalGroup(
            RandyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        RandyLayout.setVerticalGroup(
            RandyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        ContenedorPersonajes.add(Randy);

        DonMojon.setBackground(new java.awt.Color(204, 0, 0));
        DonMojon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DonMojon.setImagen(new jpanelimagen.ImagenFondo(new java.io.File("C:/Users/PROGRAMACION/Desktop/Interfaces-Swing/South Park/SouthPark/src/southpark/images/mojon.png"), 1.0f));
        DonMojon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DonMojonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DonMojonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout DonMojonLayout = new javax.swing.GroupLayout(DonMojon);
        DonMojon.setLayout(DonMojonLayout);
        DonMojonLayout.setHorizontalGroup(
            DonMojonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        DonMojonLayout.setVerticalGroup(
            DonMojonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        ContenedorPersonajes.add(DonMojon);

        jLabelNombre.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelImagen2Layout = new javax.swing.GroupLayout(jPanelImagen2);
        jPanelImagen2.setLayout(jPanelImagen2Layout);
        jPanelImagen2Layout.setHorizontalGroup(
            jPanelImagen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImagen2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(ContenedorPersonajes, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(jPanelImagen2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelImagen2Layout.setVerticalGroup(
            jPanelImagen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImagen2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(ContenedorPersonajes, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelImagen2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelImagen2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // HOVER DE LAS IMÁGENES
    private void EricCartmanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EricCartmanMouseEntered
        jLabelNombre.setText("Eric Cartman");
        EricCartman.setBorder(bordeNuevo);
    }//GEN-LAST:event_EricCartmanMouseEntered

    private void EricCartmanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EricCartmanMouseExited
        jLabelNombre.setText("");
        EricCartman.setBorder(null);
    }//GEN-LAST:event_EricCartmanMouseExited

    private void StanMarsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StanMarsMouseEntered
        jLabelNombre.setText("Stan Marsh");
        StanMars.setBorder(bordeNuevo);
    }//GEN-LAST:event_StanMarsMouseEntered

    private void StanMarsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StanMarsMouseExited
        jLabelNombre.setText("");
        StanMars.setBorder(null);
    }//GEN-LAST:event_StanMarsMouseExited

    private void KyleBroflovskiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KyleBroflovskiMouseEntered
        jLabelNombre.setText("Kyle Broflovski");
        KyleBroflovski.setBorder(bordeNuevo);
    }//GEN-LAST:event_KyleBroflovskiMouseEntered

    private void KyleBroflovskiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KyleBroflovskiMouseExited
        jLabelNombre.setText("");
        KyleBroflovski.setBorder(null);
    }//GEN-LAST:event_KyleBroflovskiMouseExited

    private void KennyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KennyMouseEntered
        jLabelNombre.setText("Kenny McCormick");
        Kenny.setBorder(bordeNuevo);
    }//GEN-LAST:event_KennyMouseEntered

    private void KennyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KennyMouseExited
        jLabelNombre.setText("");
        Kenny.setBorder(null);
    }//GEN-LAST:event_KennyMouseExited

    private void ButtersStotchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtersStotchMouseEntered
        jLabelNombre.setText("Butters Stotch");
        ButtersStotch.setBorder(bordeNuevo);
    }//GEN-LAST:event_ButtersStotchMouseEntered

    private void ButtersStotchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtersStotchMouseExited
        jLabelNombre.setText("");
        ButtersStotch.setBorder(null);
    }//GEN-LAST:event_ButtersStotchMouseExited

    private void TimmyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimmyMouseEntered
        jLabelNombre.setText("Timmy");
        Timmy.setBorder(bordeNuevo);
    }//GEN-LAST:event_TimmyMouseEntered

    private void TimmyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimmyMouseExited
        jLabelNombre.setText("");
        Timmy.setBorder(null);
    }//GEN-LAST:event_TimmyMouseExited

    private void TokenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TokenMouseEntered
        jLabelNombre.setText("Tolkien Black");
        Token.setBorder(bordeNuevo);
    }//GEN-LAST:event_TokenMouseEntered

    private void TokenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TokenMouseExited
        jLabelNombre.setText("");
        Token.setBorder(null);
    }//GEN-LAST:event_TokenMouseExited

    private void JimmyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JimmyMouseEntered
        jLabelNombre.setText("Jimmy");
        Jimmy.setBorder(bordeNuevo);
    }//GEN-LAST:event_JimmyMouseEntered

    private void JimmyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JimmyMouseExited
        jLabelNombre.setText("");
        Jimmy.setBorder(null);
    }//GEN-LAST:event_JimmyMouseExited

    private void RandyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RandyMouseEntered
        jLabelNombre.setText("Randy Marsh");
        Randy.setBorder(bordeNuevo);
    }//GEN-LAST:event_RandyMouseEntered

    private void RandyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RandyMouseExited
        jLabelNombre.setText("");
        Randy.setBorder(null);
    }//GEN-LAST:event_RandyMouseExited

    private void DonMojonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DonMojonMouseEntered
        jLabelNombre.setText("Señor Mojón");
        DonMojon.setBorder(bordeNuevo);
    }//GEN-LAST:event_DonMojonMouseEntered

    private void DonMojonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DonMojonMouseExited
        jLabelNombre.setText("");
        DonMojon.setBorder(null);
    }//GEN-LAST:event_DonMojonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jpanelimagen.JPanelImagen ButtersStotch;
    private javax.swing.JPanel ContenedorPersonajes;
    private jpanelimagen.JPanelImagen DonMojon;
    private jpanelimagen.JPanelImagen EricCartman;
    private jpanelimagen.JPanelImagen Jimmy;
    private jpanelimagen.JPanelImagen Kenny;
    private jpanelimagen.JPanelImagen KyleBroflovski;
    private jpanelimagen.JPanelImagen Randy;
    private jpanelimagen.JPanelImagen StanMars;
    private jpanelimagen.JPanelImagen Timmy;
    private jpanelimagen.JPanelImagen Token;
    private javax.swing.JLabel jLabelNombre;
    private jpanelimagen.JPanelImagen jPanelImagen2;
    // End of variables declaration//GEN-END:variables
}