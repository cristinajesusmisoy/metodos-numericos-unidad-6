package unidad6;

import java.util.ArrayList;
import javax.swing.JOptionPane;



public class dlgEuler extends javax.swing.JFrame {

    public dlgEuler() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabely0 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txte = new javax.swing.JTextField();
        jLabele = new javax.swing.JLabel();
        txtx = new javax.swing.JTextField();
        jLabelx = new javax.swing.JLabel();
        txty = new javax.swing.JTextField();
        txti = new javax.swing.JTextField();
        jLabelIte = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Metodo de Euler");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabely0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabely0.setForeground(new java.awt.Color(255, 255, 255));
        jLabely0.setText("y=");
        getContentPane().add(jLabely0, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Método de Euler");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 11, -1, 33));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 197, 352, 126));

        txte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteActionPerformed(evt);
            }
        });
        getContentPane().add(txte, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 82, -1));

        jLabele.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabele.setForeground(new java.awt.Color(255, 255, 255));
        jLabele.setText("h=");
        getContentPane().add(jLabele, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));
        getContentPane().add(txtx, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 82, -1));

        jLabelx.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelx.setForeground(new java.awt.Color(255, 255, 255));
        jLabelx.setText("X=");
        getContentPane().add(jLabelx, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));
        getContentPane().add(txty, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 82, -1));
        getContentPane().add(txti, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 82, -1));

        jLabelIte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelIte.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIte.setText("y(0)=");
        getContentPane().add(jLabelIte, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnCalcular.setBackground(new java.awt.Color(0, 0, 51));
        btnCalcular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular Resultado");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 350, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/unidad6/fondoA.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -13, 410, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txteActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
         try{
        double ay = Double.parseDouble(this.txty.getText().trim());
        double ax = Double.parseDouble(this.txtx.getText().trim());
        double ae = Double.parseDouble(this.txte.getText().trim());
        int iteraciones = Integer.parseInt(this.txti.getText().trim());

        MetEuler met = new MetEuler();
        ArrayList<clsEuler> o = met.MetodoEuler(ay, ax, ae, iteraciones);

        ModeloEuler m = new ModeloEuler(o);
        this.jTable1.setModel(m);
       }catch(Exception ex){
           JOptionPane.showMessageDialog(null," Error Omitido");
       }
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(dlgEuler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgEuler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgEuler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgEuler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dlgEuler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelIte;
    private javax.swing.JLabel jLabele;
    private javax.swing.JLabel jLabelx;
    private javax.swing.JLabel jLabely0;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txte;
    private javax.swing.JTextField txti;
    private javax.swing.JTextField txtx;
    private javax.swing.JTextField txty;
    // End of variables declaration//GEN-END:variables
}
