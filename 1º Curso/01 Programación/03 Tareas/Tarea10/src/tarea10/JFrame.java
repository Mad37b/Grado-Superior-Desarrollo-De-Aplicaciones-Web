package tarea10;

import java.util.Arrays;

/**
 * Ejercicio 1
 *
 * @author Ulises III
 */
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class JFrame extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JFrame.class.getName());
    // Creando un JPanel

    /**
     * Creates new form JFrame
     */
    public JFrame() {

        initComponents();
        jLabel1.setBackground(Color.red);
        JPanel panel = new JPanel();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 500);
        setTitle("Loteria y Dados");
        setLocationRelativeTo(null);
        setResizable(false);
        panel.setBackground(new Color(230, 240, 255)); // Color personalizado (RGB)
        panel.setLayout(new BorderLayout());
        //this.setContentPane(panel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        botonGenerar = new javax.swing.JButton();
        campoNumeros = new javax.swing.JTextField();
        campoComplementario = new javax.swing.JTextField();
        campoReintegro = new javax.swing.JTextField();
        campoTirada = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lanzarDado = new javax.swing.JButton();
        textoNumero = new javax.swing.JLabel();
        textoReintegro = new javax.swing.JLabel();
        textoReitegro = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jScrollBar1.setForeground(new java.awt.Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 0, 51));

        jLabel1.setText("Combinación de la Primitiva");

        botonGenerar.setText("Generar");
        botonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarActionPerformed(evt);
            }
        });

        campoNumeros.setEditable(false);
        campoNumeros.setBackground(new java.awt.Color(255, 255, 255));
        campoNumeros.setToolTipText("");
        campoNumeros.setFocusable(false);
        campoNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNumerosActionPerformed(evt);
            }
        });

        campoComplementario.setEditable(false);
        campoComplementario.setBackground(new java.awt.Color(255, 255, 255));
        campoComplementario.setFocusable(false);
        campoComplementario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoComplementarioActionPerformed(evt);
            }
        });

        campoReintegro.setEditable(false);
        campoReintegro.setBackground(new java.awt.Color(255, 255, 255));
        campoReintegro.setFocusable(false);
        campoReintegro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoReintegroActionPerformed(evt);
            }
        });

        campoTirada.setEditable(false);
        campoTirada.setBackground(new java.awt.Color(255, 255, 255));
        campoTirada.setFocusable(false);
        campoTirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTiradaActionPerformed(evt);
            }
        });

        jLabel2.setText("Tirada");

        lanzarDado.setText("Lanzar dado");
        lanzarDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanzarDadoActionPerformed(evt);
            }
        });

        textoNumero.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        textoNumero.setText("Números");

        textoReintegro.setText("Complementario");

        textoReitegro.setText("Reintegro");

        jLabel6.setText("Lanzamiento de un dado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoNumero)
                            .addComponent(textoReintegro)
                            .addComponent(textoReitegro))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(campoReintegro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(campoComplementario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lanzarDado)
                                .addGap(83, 83, 83)
                                .addComponent(jLabel2))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonGenerar)
                            .addComponent(campoTirada, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textoNumero)
                                .addGap(44, 44, 44))
                            .addComponent(textoReintegro))
                        .addGap(18, 18, 18)
                        .addComponent(textoReitegro))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addComponent(campoComplementario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoReintegro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonGenerar))))
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lanzarDado)
                    .addComponent(campoTirada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// 1º Juego - Loteria
    private void campoNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNumerosActionPerformed

    }//GEN-LAST:event_campoNumerosActionPerformed
// 2º Juego - Dados
    private void lanzarDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanzarDadoActionPerformed
        Dado tirada = new Dado();
        int resultado = tirada.tirarDado();
        campoTirada.setText(String.valueOf(resultado));
    }//GEN-LAST:event_lanzarDadoActionPerformed

    private void campoComplementarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoComplementarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoComplementarioActionPerformed
// 2º Juego - Dados

    private void campoTiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTiradaActionPerformed


    }//GEN-LAST:event_campoTiradaActionPerformed
// 1º Juego - Loteria
    private void campoReintegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoReintegroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoReintegroActionPerformed

    private void botonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarActionPerformed
        // AQUI GENERO LOS NUMEROS DE LA LOTERIA + COMPLEMENTO + REINTEGRO

        Loteria premio = new Loteria(); // añadiendo numero de loteria en el primer campo
        int numero;

        campoNumeros.setText(premio.getCuponFormateado());

        campoComplementario.setText(String.valueOf(premio.getComplementario()));
        campoReintegro.setText(String.valueOf(premio.getReintegro()));
    }//GEN-LAST:event_botonGenerarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGenerar;
    private javax.swing.JTextField campoComplementario;
    private javax.swing.JTextField campoNumeros;
    private javax.swing.JTextField campoReintegro;
    private javax.swing.JTextField campoTirada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JButton lanzarDado;
    private javax.swing.JLabel textoNumero;
    private javax.swing.JLabel textoReintegro;
    private javax.swing.JLabel textoReitegro;
    // End of variables declaration//GEN-END:variables

}
