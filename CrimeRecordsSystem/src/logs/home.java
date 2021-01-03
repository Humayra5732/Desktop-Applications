/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logs;

import javax.swing.JOptionPane;

/**
 *
 * @author AR
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        setTitle("Home Page");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jfir = new javax.swing.JButton();
        jmissing = new javax.swing.JButton();
        jcriminal = new javax.swing.JButton();
        jprisoner = new javax.swing.JButton();
        junnamed = new javax.swing.JButton();
        jlogout = new javax.swing.JButton();
        jabout = new javax.swing.JButton();
        jhelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logs/hp1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 330));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 46)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Crime Record System");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("HOME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        jfir.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jfir.setForeground(new java.awt.Color(0, 153, 255));
        jfir.setText("FIR");
        jfir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfirActionPerformed(evt);
            }
        });
        jPanel1.add(jfir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 300, -1));

        jmissing.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jmissing.setForeground(new java.awt.Color(0, 153, 255));
        jmissing.setText("Missing Report");
        jmissing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmissingActionPerformed(evt);
            }
        });
        jPanel1.add(jmissing, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        jcriminal.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jcriminal.setForeground(new java.awt.Color(0, 153, 255));
        jcriminal.setText("Criminal List");
        jcriminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcriminalActionPerformed(evt);
            }
        });
        jPanel1.add(jcriminal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 300, -1));

        jprisoner.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jprisoner.setForeground(new java.awt.Color(0, 153, 255));
        jprisoner.setText("Prisoner List");
        jprisoner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jprisonerActionPerformed(evt);
            }
        });
        jPanel1.add(jprisoner, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, 300, -1));

        junnamed.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        junnamed.setForeground(new java.awt.Color(0, 153, 255));
        junnamed.setText("Unnamed Body");
        junnamed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                junnamedActionPerformed(evt);
            }
        });
        jPanel1.add(junnamed, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, -1, -1));

        jlogout.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jlogout.setForeground(new java.awt.Color(0, 153, 255));
        jlogout.setText("Log Out");
        jlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlogoutActionPerformed(evt);
            }
        });
        jPanel1.add(jlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 600, -1, -1));

        jabout.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jabout.setForeground(new java.awt.Color(51, 51, 255));
        jabout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logs/user-info-icon.png"))); // NOI18N
        jabout.setText("ABOUT");
        jabout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaboutActionPerformed(evt);
            }
        });
        jPanel1.add(jabout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, 40));

        jhelp.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jhelp.setForeground(new java.awt.Color(51, 51, 255));
        jhelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logs/Button-Help-icon.png"))); // NOI18N
        jhelp.setText("HELP");
        jPanel1.add(jhelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1051, 677));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jfirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfirActionPerformed
        // TODO add your handling code here:
         fir firform=new fir();
        firform.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jfirActionPerformed

    private void jaboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaboutActionPerformed
        // TODO add your handling code here:
        //System.out.println("hjk");
        JOptionPane.showMessageDialog(null,"A Software for the database system of Bangladesh Police!");
    }//GEN-LAST:event_jaboutActionPerformed

    private void jmissingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmissingActionPerformed
        // TODO add your handling code here:
        missing miss=new missing();
        miss.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmissingActionPerformed

    private void jcriminalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcriminalActionPerformed
        // TODO add your handling code here:
          criminal criminalform=new criminal();
        criminalform.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jcriminalActionPerformed

    private void jprisonerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jprisonerActionPerformed
        // TODO add your handling code here:
         prisoner prisonerform=new prisoner();
        prisonerform.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jprisonerActionPerformed

    private void junnamedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_junnamedActionPerformed
        // TODO add your handling code here:
         unnamed unnamedform=new unnamed();
        unnamedform.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_junnamedActionPerformed

    private void jlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlogoutActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jlogoutActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jabout;
    private javax.swing.JButton jcriminal;
    private javax.swing.JButton jfir;
    private javax.swing.JButton jhelp;
    private javax.swing.JButton jlogout;
    private javax.swing.JButton jmissing;
    private javax.swing.JButton jprisoner;
    private javax.swing.JButton junnamed;
    // End of variables declaration//GEN-END:variables
}