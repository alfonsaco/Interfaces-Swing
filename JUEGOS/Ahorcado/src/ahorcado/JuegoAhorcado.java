/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Alfonso
 */
public class JuegoAhorcado extends javax.swing.JFrame {

    ArrayList<String> palabras=new ArrayList<>(Arrays.asList("CIELO", "BOLSA", "PERRO", "LIBRO", "NIEVE", "GOLPE", "MANGO", "SILLA", "FLACO", "TECHO", "PLAZA", "QUESO", "PASTO", "DULCE", "LECHE"));
    ArrayList<String> repetida=new ArrayList<>();
    String palabra;
    boolean jugar=false;
    int contVictoria=0;
    // Contador, para verificar que ha acertado. 
    int contHaAcertado=0;
    int contDerrota=0;
    String cadena;
    
    /**
     * Creates new form JuegoAhorcado
     */
    public JuegoAhorcado() {
        initComponents();
        
        // Borde para cada uno de los TextField de las letras
        MatteBorder bordeLetra=BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK);
        Letra1.setBorder(bordeLetra);
        Letra2.setBorder(bordeLetra);
        Letra3.setBorder(bordeLetra);
        Letra4.setBorder(bordeLetra);
        Letra5.setBorder(bordeLetra);
        
        // Borde para el jTextField de buscar letra
        MatteBorder bordeBuscar=BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY);
        BuscarLetra.setBorder(bordeBuscar);
        
        // Ponemos disabled por defecto. Cuando se pulse en jugar, se activarán
        BuscarLetra.setEnabled(false);
        
        // Logo de la aplicación
        this.setIconImage(new ImageIcon(getClass().getResource("/ahorcado/images/logo.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Contenedor = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ContenedorFigura = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        ContenedorLetras = new javax.swing.JPanel();
        Letra1 = new javax.swing.JTextField();
        Letra2 = new javax.swing.JTextField();
        Letra3 = new javax.swing.JTextField();
        Letra4 = new javax.swing.JTextField();
        Letra5 = new javax.swing.JTextField();
        BotonJugar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BuscarLetra = new javax.swing.JTextField();
        BotonBuscarLetra = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jlabelFinal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(13, 13, 13));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(246, 246, 246));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Juego del Ahorcado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addContainerGap())
        );

        ContenedorFigura.setBackground(new java.awt.Color(255, 255, 255));
        ContenedorFigura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(147, 5));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        ContenedorFigura.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 217, 160, 3));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );

        ContenedorFigura.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 3, 190));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        ContenedorFigura.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 65, 3));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        ContenedorFigura.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 30, 3, 30));

        ContenedorLetras.setBackground(new java.awt.Color(255, 255, 255));
        ContenedorLetras.setLayout(new java.awt.GridBagLayout());

        Letra1.setEditable(false);
        Letra1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        ContenedorLetras.add(Letra1, gridBagConstraints);

        Letra2.setEditable(false);
        Letra2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        ContenedorLetras.add(Letra2, gridBagConstraints);

        Letra3.setEditable(false);
        Letra3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        ContenedorLetras.add(Letra3, gridBagConstraints);

        Letra4.setEditable(false);
        Letra4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        ContenedorLetras.add(Letra4, gridBagConstraints);

        Letra5.setEditable(false);
        Letra5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.ipady = 10;
        ContenedorLetras.add(Letra5, gridBagConstraints);

        BotonJugar.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("JUGAR");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BotonJugarLayout = new javax.swing.GroupLayout(BotonJugar);
        BotonJugar.setLayout(BotonJugarLayout);
        BotonJugarLayout.setHorizontalGroup(
            BotonJugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        );
        BotonJugarLayout.setVerticalGroup(
            BotonJugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        BuscarLetra.setForeground(new java.awt.Color(153, 153, 153));
        BuscarLetra.setText("Busca una letra");
        BuscarLetra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BuscarLetraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BuscarLetraFocusLost(evt);
            }
        });

        BotonBuscarLetra.setBackground(new java.awt.Color(128, 128, 128));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BUSCAR");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BotonBuscarLetraLayout = new javax.swing.GroupLayout(BotonBuscarLetra);
        BotonBuscarLetra.setLayout(BotonBuscarLetraLayout);
        BotonBuscarLetraLayout.setHorizontalGroup(
            BotonBuscarLetraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );
        BotonBuscarLetraLayout.setVerticalGroup(
            BotonBuscarLetraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        jlabelFinal.setBackground(new java.awt.Color(204, 0, 0));
        jlabelFinal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jlabelFinal.setForeground(new java.awt.Color(204, 0, 0));
        jlabelFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(ContenedorFigura, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BuscarLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotonJugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                                .addComponent(BotonBuscarLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70))))
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ContenedorLetras, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabelFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addComponent(BotonJugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(BuscarLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonBuscarLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ContenedorLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ContenedorFigura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlabelFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // Cada vez que se pulsa, se crea una nueva palabra para jugar
        int n=(int) (Math.random()*14);
        palabra=palabras.get(n);
        
        vaciarCampos();
        // Resetear la figura
        ContenedorFigura.repaint();
        
        BuscarLetra.setEnabled(true);
        jugar=true;
        BotonBuscarLetra.setBackground(new Color(51,51,51));
        cadena="";
        jlabelFinal.setText("");
    }//GEN-LAST:event_jLabel2MouseClicked

    public void vaciarCampos() {
        // Se vacían los campos de texto
        Letra1.setText("");
        Letra2.setText("");
        Letra3.setText("");
        Letra4.setText("");
        Letra5.setText("");
    }
    
    // PLACEHOLDER PARA EL JTEXTFIELD DE BUSCAR LETRAS
    private void BuscarLetraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BuscarLetraFocusGained
        String text=BuscarLetra.getText();
        if(text.equals("Busca una letra")) {
            BuscarLetra.setText("");
            BuscarLetra.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_BuscarLetraFocusGained

    // Método para verificar que sea una letra, y no una palabra
    public boolean esLetra(String letra) {
        return letra.matches("[a-zA-Z]");
    }
    
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if(jugar == true) {
            String text = BuscarLetra.getText();
            BuscarLetra.setText("");
            contHaAcertado = 0;

            // Verificamos que sea una letra, y no una palabra.
            if (esLetra(text)) {
                char letra = text.toUpperCase().charAt(0);

                if (!repetida.contains(String.valueOf(letra))) {
                    repetida.add(String.valueOf(letra));
                    cadena += letra + " ";
                    jlabelFinal.setText(cadena);

                    for (int i = 0; i < palabra.length(); i++) {
                        if (letra == palabra.charAt(i)) {
                            rellenarLetras(i, letra);
                            contVictoria++;
                            contHaAcertado++;
                        }
                    }

                    // En el caso de que haya fallado, el contHaAcertado será 0. Por tanto, se dibujará una
                    // parte del muñeco. A la vez, se sumará el número de fallos.
                    if (contHaAcertado == 0) {
                        contDerrota++;
                        
                        Graphics g = ContenedorFigura.getGraphics();
                        g.setColor(Color.BLACK);
                        Graphics2D g2d = (Graphics2D) g;
                        g2d.setColor(Color.BLACK);

                        switch (contDerrota) {
                            // Primer fallo. Dibujamos cabeza.
                            case 1:
                                g.fillOval(97, 49, 35, 35);
                                break;
                            // Segundo fallo. Dibujamos el torso
                            case 2:
                                g.fillRect(113, 83, 4, 45);
                                break;
                            // Tercer fallo. Dibujamos una pierna
                            case 3:
                                g2d.rotate(Math.toRadians(20), 113, 128);
                                g2d.fillRect(113, 126, 4, 40);
                                break;
                            // Cuarto fallo. Dibujamos la otra pierna
                            case 4:
                                g2d.rotate(-Math.toRadians(20), 113, 128);
                                g2d.fillRect(113, 126, 4, 40);
                                break;
                            case 5:
                                g2d.rotate(Math.toRadians(20), 113, 128);
                                g2d.fillRect(95, 85, 4, 40);
                                break;
                            case 6:
                                g2d.rotate(-Math.toRadians(20), 113, 128);
                                g2d.fillRect(130, 85, 4, 40);
                                break;
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Caracter repetido");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Caracter no permitido");
            }

            // EL JUGADOR HA GANADO
            if(contVictoria == 5) {
                JOptionPane.showMessageDialog(this, "HAS GANADO");
                contVictoria=0;
                contDerrota=0;
                BotonBuscarLetra.setBackground(new Color(128,128,128));                
                BuscarLetra.setEnabled(false);
                jugar=false;
            }
            
            // EL JUGADOR HA PERDIDO
            if(contDerrota == 6) {
                jlabelFinal.setText("HAS PERDIDO. LA PALABRA ERA \""+palabra+"\"");
                BotonBuscarLetra.setBackground(new Color(128,128,128));
                BuscarLetra.setEnabled(false);
                jugar=false;
                
                contDerrota=0;
                contVictoria=0;
            }
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    // MÉTODO PARA PONER LAS LETRAS EN SU LUGAR CORRECTO
    private void rellenarLetras(int i, char letra) {
        switch (i) {
            case 0:
                Letra1.setText(String.valueOf(letra));
                break;
            case 1:
                Letra2.setText(String.valueOf(letra));
                break;
            case 2:
                Letra3.setText(String.valueOf(letra));
                break;
            case 3:
                Letra4.setText(String.valueOf(letra));
                break;
            case 4:
                Letra5.setText(String.valueOf(letra));
                break;
        }
    }
    
    private void BuscarLetraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BuscarLetraFocusLost
        String text=BuscarLetra.getText();
        if(text.equals("")) {
            BuscarLetra.setText("Busca una letra");
            BuscarLetra.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_BuscarLetraFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JuegoAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoAhorcado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonBuscarLetra;
    private javax.swing.JPanel BotonJugar;
    private javax.swing.JTextField BuscarLetra;
    private javax.swing.JPanel Contenedor;
    private javax.swing.JPanel ContenedorFigura;
    private javax.swing.JPanel ContenedorLetras;
    private javax.swing.JTextField Letra1;
    private javax.swing.JTextField Letra2;
    private javax.swing.JTextField Letra3;
    private javax.swing.JTextField Letra4;
    private javax.swing.JTextField Letra5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jlabelFinal;
    // End of variables declaration//GEN-END:variables
}
