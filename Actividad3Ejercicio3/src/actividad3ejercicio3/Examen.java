/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3ejercicio3;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Alfonso
 */
public class Examen extends javax.swing.JDialog {

    /**
     * Creates new form Examen
     */
    public Examen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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

        buttonGroupCirculo = new javax.swing.ButtonGroup();
        buttonGroupRombo = new javax.swing.ButtonGroup();
        buttonGroupTriangulo = new javax.swing.ButtonGroup();
        buttonGroupCuadrado = new javax.swing.ButtonGroup();
        jTabbedPane = new javax.swing.JTabbedPane();
        Pregunta1 = new javax.swing.JPanel();
        IrAPregunta2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ContainerPregunta1 = new javax.swing.JPanel();
        jRadioButtonCuadrado1 = new javax.swing.JRadioButton();
        jRadioButtonCirculo1 = new javax.swing.JRadioButton();
        jRadioButtonTriangulo1 = new javax.swing.JRadioButton();
        jRadioButtonRombo1 = new javax.swing.JRadioButton();
        jLabelCirculo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Pregunta2 = new javax.swing.JPanel();
        IrAPregunta3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ContainerPregunta2 = new javax.swing.JPanel();
        jRadioButtonCuadrado2 = new javax.swing.JRadioButton();
        jRadioButtonCirculo2 = new javax.swing.JRadioButton();
        jRadioButtonTriangulo2 = new javax.swing.JRadioButton();
        jRadioButtonRombo2 = new javax.swing.JRadioButton();
        Pregunta3 = new javax.swing.JPanel();
        IrAPregunta4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ContainerPregunta3 = new javax.swing.JPanel();
        jRadioButtonCuadrado3 = new javax.swing.JRadioButton();
        jRadioButtonCirculo3 = new javax.swing.JRadioButton();
        jRadioButtonTriangulo3 = new javax.swing.JRadioButton();
        jRadioButtonRombo3 = new javax.swing.JRadioButton();
        jLabelTriangulo = new javax.swing.JLabel();
        Pregunta4 = new javax.swing.JPanel();
        IrAResultado = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ContainerPregunta4 = new javax.swing.JPanel();
        jRadioButtonCuadrado4 = new javax.swing.JRadioButton();
        jRadioButtonCirculo4 = new javax.swing.JRadioButton();
        jRadioButtonTriangulo4 = new javax.swing.JRadioButton();
        jRadioButtonRombo4 = new javax.swing.JRadioButton();
        jLabelCuadrado = new javax.swing.JLabel();
        Resultado = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabelResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jTabbedPane.setBackground(new java.awt.Color(255, 255, 255));

        Pregunta1.setBackground(new java.awt.Color(255, 255, 255));
        Pregunta1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IrAPregunta2.setBackground(new java.awt.Color(153, 0, 0));
        IrAPregunta2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIGUIENTE");
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

        javax.swing.GroupLayout IrAPregunta2Layout = new javax.swing.GroupLayout(IrAPregunta2);
        IrAPregunta2.setLayout(IrAPregunta2Layout);
        IrAPregunta2Layout.setHorizontalGroup(
            IrAPregunta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );
        IrAPregunta2Layout.setVerticalGroup(
            IrAPregunta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        Pregunta1.add(IrAPregunta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        ContainerPregunta1.setBackground(new java.awt.Color(255, 255, 255));
        ContainerPregunta1.setLayout(new java.awt.GridBagLayout());

        buttonGroupCirculo.add(jRadioButtonCuadrado1);
        jRadioButtonCuadrado1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButtonCuadrado1.setText("Cuadrado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 18);
        ContainerPregunta1.add(jRadioButtonCuadrado1, gridBagConstraints);

        buttonGroupCirculo.add(jRadioButtonCirculo1);
        jRadioButtonCirculo1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButtonCirculo1.setText("Círculo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 58;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 22);
        ContainerPregunta1.add(jRadioButtonCirculo1, gridBagConstraints);

        buttonGroupCirculo.add(jRadioButtonTriangulo1);
        jRadioButtonTriangulo1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButtonTriangulo1.setText("Triángulo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 11;
        ContainerPregunta1.add(jRadioButtonTriangulo1, gridBagConstraints);

        buttonGroupCirculo.add(jRadioButtonRombo1);
        jRadioButtonRombo1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButtonRombo1.setText("Rombo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 11;
        ContainerPregunta1.add(jRadioButtonRombo1, gridBagConstraints);

        Pregunta1.add(ContainerPregunta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 200, 130));

        jLabelCirculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCirculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/actividad3ejercicio3/images/Circulo.png"))); // NOI18N
        Pregunta1.add(jLabelCirculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 148, 148));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("¿Cómo se llama esta figura?");
        Pregunta1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 450, 50));

        jTabbedPane.addTab("Pregunta 1", Pregunta1);

        Pregunta2.setBackground(new java.awt.Color(255, 255, 255));
        Pregunta2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IrAPregunta3.setBackground(new java.awt.Color(153, 0, 0));
        IrAPregunta3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SIGUIENTE");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout IrAPregunta3Layout = new javax.swing.GroupLayout(IrAPregunta3);
        IrAPregunta3.setLayout(IrAPregunta3Layout);
        IrAPregunta3Layout.setHorizontalGroup(
            IrAPregunta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );
        IrAPregunta3Layout.setVerticalGroup(
            IrAPregunta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        Pregunta2.add(IrAPregunta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("¿Cómo se llama esta figura?");
        Pregunta2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 450, 50));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/actividad3ejercicio3/images/Rombo.png"))); // NOI18N
        Pregunta2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 148, 148));

        ContainerPregunta2.setBackground(new java.awt.Color(255, 255, 255));
        ContainerPregunta2.setLayout(new java.awt.GridBagLayout());

        buttonGroupRombo.add(jRadioButtonCuadrado2);
        jRadioButtonCuadrado2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButtonCuadrado2.setText("Cuadrado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 18);
        ContainerPregunta2.add(jRadioButtonCuadrado2, gridBagConstraints);

        buttonGroupRombo.add(jRadioButtonCirculo2);
        jRadioButtonCirculo2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButtonCirculo2.setText("Círculo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 58;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 22);
        ContainerPregunta2.add(jRadioButtonCirculo2, gridBagConstraints);

        buttonGroupRombo.add(jRadioButtonTriangulo2);
        jRadioButtonTriangulo2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButtonTriangulo2.setText("Triángulo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 11;
        ContainerPregunta2.add(jRadioButtonTriangulo2, gridBagConstraints);

        buttonGroupRombo.add(jRadioButtonRombo2);
        jRadioButtonRombo2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButtonRombo2.setText("Rombo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 11;
        ContainerPregunta2.add(jRadioButtonRombo2, gridBagConstraints);

        Pregunta2.add(ContainerPregunta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 200, 130));

        jTabbedPane.addTab("Pregunta 2", Pregunta2);

        Pregunta3.setBackground(new java.awt.Color(255, 255, 255));
        Pregunta3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IrAPregunta4.setBackground(new java.awt.Color(153, 0, 0));
        IrAPregunta4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SIGUIENTE");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout IrAPregunta4Layout = new javax.swing.GroupLayout(IrAPregunta4);
        IrAPregunta4.setLayout(IrAPregunta4Layout);
        IrAPregunta4Layout.setHorizontalGroup(
            IrAPregunta4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );
        IrAPregunta4Layout.setVerticalGroup(
            IrAPregunta4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        Pregunta3.add(IrAPregunta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("¿Cómo se llama esta figura?");
        Pregunta3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 450, 50));

        ContainerPregunta3.setBackground(new java.awt.Color(255, 255, 255));
        ContainerPregunta3.setLayout(new java.awt.GridBagLayout());

        buttonGroupTriangulo.add(jRadioButtonCuadrado3);
        jRadioButtonCuadrado3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButtonCuadrado3.setText("Cuadrado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 18);
        ContainerPregunta3.add(jRadioButtonCuadrado3, gridBagConstraints);

        buttonGroupTriangulo.add(jRadioButtonCirculo3);
        jRadioButtonCirculo3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButtonCirculo3.setText("Círculo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 58;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 22);
        ContainerPregunta3.add(jRadioButtonCirculo3, gridBagConstraints);

        buttonGroupTriangulo.add(jRadioButtonTriangulo3);
        jRadioButtonTriangulo3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButtonTriangulo3.setText("Triángulo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 11;
        ContainerPregunta3.add(jRadioButtonTriangulo3, gridBagConstraints);

        buttonGroupTriangulo.add(jRadioButtonRombo3);
        jRadioButtonRombo3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButtonRombo3.setText("Rombo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 11;
        ContainerPregunta3.add(jRadioButtonRombo3, gridBagConstraints);

        Pregunta3.add(ContainerPregunta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 200, 130));

        jLabelTriangulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTriangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/actividad3ejercicio3/images/Triangulo.png"))); // NOI18N
        Pregunta3.add(jLabelTriangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 148, 148));

        jTabbedPane.addTab("Pregunta 3", Pregunta3);

        Pregunta4.setBackground(new java.awt.Color(255, 255, 255));
        Pregunta4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IrAResultado.setBackground(new java.awt.Color(153, 0, 0));
        IrAResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("RESULTADO");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout IrAResultadoLayout = new javax.swing.GroupLayout(IrAResultado);
        IrAResultado.setLayout(IrAResultadoLayout);
        IrAResultadoLayout.setHorizontalGroup(
            IrAResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );
        IrAResultadoLayout.setVerticalGroup(
            IrAResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        Pregunta4.add(IrAResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("¿Cómo se llama esta figura?");
        Pregunta4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 450, 50));

        ContainerPregunta4.setBackground(new java.awt.Color(255, 255, 255));
        ContainerPregunta4.setLayout(new java.awt.GridBagLayout());

        buttonGroupCuadrado.add(jRadioButtonCuadrado4);
        jRadioButtonCuadrado4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButtonCuadrado4.setText("Cuadrado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 18);
        ContainerPregunta4.add(jRadioButtonCuadrado4, gridBagConstraints);

        buttonGroupCuadrado.add(jRadioButtonCirculo4);
        jRadioButtonCirculo4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButtonCirculo4.setText("Círculo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 58;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 22);
        ContainerPregunta4.add(jRadioButtonCirculo4, gridBagConstraints);

        buttonGroupCuadrado.add(jRadioButtonTriangulo4);
        jRadioButtonTriangulo4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButtonTriangulo4.setText("Triángulo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 11;
        ContainerPregunta4.add(jRadioButtonTriangulo4, gridBagConstraints);

        buttonGroupCuadrado.add(jRadioButtonRombo4);
        jRadioButtonRombo4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButtonRombo4.setText("Rombo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 11;
        ContainerPregunta4.add(jRadioButtonRombo4, gridBagConstraints);

        Pregunta4.add(ContainerPregunta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 200, 130));

        jLabelCuadrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCuadrado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/actividad3ejercicio3/images/Cuadrado.png"))); // NOI18N
        Pregunta4.add(jLabelCuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 148, 148));

        jTabbedPane.addTab("Pregunta 4", Pregunta4);

        Resultado.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("RESULTADO");

        jLabelResultado.setFont(new java.awt.Font("Dialog", 1, 45)); // NOI18N
        jLabelResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout ResultadoLayout = new javax.swing.GroupLayout(Resultado);
        Resultado.setLayout(ResultadoLayout);
        ResultadoLayout.setHorizontalGroup(
            ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ResultadoLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        ResultadoLayout.setVerticalGroup(
            ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResultadoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Resultado", Resultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // MOVERNOS DE UNA PESTAÑA A OTRA
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        jTabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        jTabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        jTabbedPane.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel3MouseClicked

    public void deshabilitarBotones() {
        jRadioButtonCirculo1.setEnabled(false);
        jRadioButtonCirculo2.setEnabled(false);
        jRadioButtonCirculo3.setEnabled(false);
        jRadioButtonCirculo4.setEnabled(false);
        jRadioButtonCuadrado1.setEnabled(false);
        jRadioButtonCuadrado2.setEnabled(false);
        jRadioButtonCuadrado3.setEnabled(false);
        jRadioButtonCuadrado4.setEnabled(false);
        jRadioButtonRombo1.setEnabled(false);
        jRadioButtonRombo2.setEnabled(false);
        jRadioButtonRombo3.setEnabled(false);
        jRadioButtonRombo4.setEnabled(false);        
        jRadioButtonTriangulo1.setEnabled(false);
        jRadioButtonTriangulo2.setEnabled(false);
        jRadioButtonTriangulo3.setEnabled(false);
        jRadioButtonTriangulo4.setEnabled(false);
    }
    
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        int cont=0;
        int contCorrectas=0;
        
        // Primera pregunta
        if(jRadioButtonCirculo1.isSelected() || jRadioButtonCuadrado1.isSelected() || jRadioButtonRombo1.isSelected() || jRadioButtonTriangulo1.isSelected()) {
            cont++;
            if(jRadioButtonCirculo1.isSelected()) {
                contCorrectas++;
            }
        }
        
        // Segunda pregunta
        if(jRadioButtonCirculo2.isSelected() || jRadioButtonCuadrado2.isSelected() || jRadioButtonRombo2.isSelected() || jRadioButtonTriangulo2.isSelected()) {
            cont++;
            if(jRadioButtonRombo2.isSelected()) {
                contCorrectas++;
            }
        }
        
        // Tercera pregunta
        if(jRadioButtonCirculo3.isSelected() || jRadioButtonCuadrado3.isSelected() || jRadioButtonRombo3.isSelected() || jRadioButtonTriangulo3.isSelected()) {
            cont++;
            if(jRadioButtonTriangulo3.isSelected()) {
                contCorrectas++;
            }
        }
        
        // Cuarda pregunta
        if(jRadioButtonCirculo4.isSelected() || jRadioButtonCuadrado4.isSelected() || jRadioButtonRombo4.isSelected() || jRadioButtonTriangulo4.isSelected()) {
            cont++;
            if(jRadioButtonCuadrado4.isSelected()) {
                contCorrectas++;
            }
        }
        
        // Condicional para verificar que se respondan todas las preguntas
        if(cont == 4) {
            jTabbedPane.setSelectedIndex(4);   
   
            jLabelResultado.setText(contCorrectas+"/4");
            if(contCorrectas > 2) {
                jLabelResultado.setForeground(Color.GREEN);
            } else {
                jLabelResultado.setForeground(Color.RED);
            }
            
            deshabilitarBotones();
        } else {
            JOptionPane.showMessageDialog(this, "Hay preguntas sin responder");
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    // EVENTOS DEL HOVER DEL BOTÓN
    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        IrAPregunta2.setBackground(new Color(196, 14, 14));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        IrAPregunta2.setBackground(new Color(153,0,0));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        IrAPregunta3.setBackground(new Color(196, 14, 14));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        IrAPregunta3.setBackground(new Color(153,0,0));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        IrAPregunta4.setBackground(new Color(196, 14, 14));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        IrAPregunta4.setBackground(new Color(153,0,0));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        IrAResultado.setBackground(new Color(196, 14, 14));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        IrAResultado.setBackground(new Color(153,0,0));
    }//GEN-LAST:event_jLabel4MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContainerPregunta1;
    private javax.swing.JPanel ContainerPregunta2;
    private javax.swing.JPanel ContainerPregunta3;
    private javax.swing.JPanel ContainerPregunta4;
    private javax.swing.JPanel IrAPregunta2;
    private javax.swing.JPanel IrAPregunta3;
    private javax.swing.JPanel IrAPregunta4;
    private javax.swing.JPanel IrAResultado;
    private javax.swing.JPanel Pregunta1;
    private javax.swing.JPanel Pregunta2;
    private javax.swing.JPanel Pregunta3;
    private javax.swing.JPanel Pregunta4;
    private javax.swing.JPanel Resultado;
    private javax.swing.ButtonGroup buttonGroupCirculo;
    private javax.swing.ButtonGroup buttonGroupCuadrado;
    private javax.swing.ButtonGroup buttonGroupRombo;
    private javax.swing.ButtonGroup buttonGroupTriangulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCirculo;
    private javax.swing.JLabel jLabelCuadrado;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelTriangulo;
    private javax.swing.JRadioButton jRadioButtonCirculo1;
    private javax.swing.JRadioButton jRadioButtonCirculo2;
    private javax.swing.JRadioButton jRadioButtonCirculo3;
    private javax.swing.JRadioButton jRadioButtonCirculo4;
    private javax.swing.JRadioButton jRadioButtonCuadrado1;
    private javax.swing.JRadioButton jRadioButtonCuadrado2;
    private javax.swing.JRadioButton jRadioButtonCuadrado3;
    private javax.swing.JRadioButton jRadioButtonCuadrado4;
    private javax.swing.JRadioButton jRadioButtonRombo1;
    private javax.swing.JRadioButton jRadioButtonRombo2;
    private javax.swing.JRadioButton jRadioButtonRombo3;
    private javax.swing.JRadioButton jRadioButtonRombo4;
    private javax.swing.JRadioButton jRadioButtonTriangulo1;
    private javax.swing.JRadioButton jRadioButtonTriangulo2;
    private javax.swing.JRadioButton jRadioButtonTriangulo3;
    private javax.swing.JRadioButton jRadioButtonTriangulo4;
    private javax.swing.JTabbedPane jTabbedPane;
    // End of variables declaration//GEN-END:variables
}
