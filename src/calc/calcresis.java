/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.awt.Color;
import static java.awt.Color.getHSBColor;

/**
 *
 * @author julia
 */
public class calcresis extends javax.swing.JFrame {

    /**
     * Creates new form calcresis
     */
    public calcresis() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("CALCULADORA DE RESISTENCIAS");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGRO", "CAFE", "ROJO", "NARANJA", "AMARILLO", "VERDE", "AZUL", "VIOLETA", "GRIS", "BLANCO" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 106, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGRO", "CAFE", "ROJO", "NARANJA", "AMARILLO", "VERDE", "AZUL", "VIOLETA", "GRIS", "BLANCO" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 106, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NEGRO", "CAFE", "ROJO", "NARANJA", "AMARILLO", "VERDE", "AZUL", "VIOLETA", "GRIS", "BLANCO" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 106, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ROJO", "DORADO", "PLATA" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 106, -1));

        jButton1.setBackground(new java.awt.Color(0, 255, 204));
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 197, 36));

        jTextField1.setForeground(new java.awt.Color(0, 102, 102));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 322, 104));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 18)); // NOI18N
        jLabel2.setText("FRANJA 1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 92, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 18)); // NOI18N
        jLabel3.setText("FRANJA 3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 92, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 18)); // NOI18N
        jLabel4.setText("FRANJA 4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 92, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 18)); // NOI18N
        jLabel5.setText("FRANJA 2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 92, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel6.setText("CALCULO DE RESISTENCIAS ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, 42));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resistencia.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 92, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 255, 204));
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("VOLVER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 255, 204));
        jButton3.setForeground(new java.awt.Color(0, 102, 102));
        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, -1, -1));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 110, 50, 140));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 110, 60, 140));

        jPanel11.setBackground(new java.awt.Color(255, 0, 0));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, -1, 160));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 96, 60, 160));

        jButton4.setText("LIMPIAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Preg().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
//FRANJAS
    String F1="",F2="",F3="",F4="";
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
        switch(jComboBox1.getSelectedIndex())//FRANJA 1
        {
            case 0:
                jPanel6.setBackground(Color.BLACK);
                F1="0";
                break;
            case 1:
                jPanel6.setBackground(getHSBColor(12,250,100));
                F1="1";
                break;
            case 2:
                jPanel6.setBackground(Color.RED);
                F1="2";
                break;
            case 3:
                jPanel6.setBackground(Color.ORANGE);
                F1="3";
                break;
            case 4:
                jPanel6.setBackground(Color.YELLOW);
                F1="4";
                break;
            case 5:
                jPanel6.setBackground(Color.GREEN);
                F1="5";
                break;
            case 6:
                jPanel6.setBackground(Color.BLUE);
                F1="6";
                break;
            case 7:
                jPanel6.setBackground(Color.MAGENTA);
                F1="7";
                break;
            case 8:
                jPanel6.setBackground(Color.DARK_GRAY);
                F1="8";
                break;
            case 9:
                jPanel6.setBackground(Color.WHITE);
                F1="9";
                break;
               
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
                switch(jComboBox2.getSelectedIndex())//FRANJA 2
        {
            case 0:
                jPanel7.setBackground(Color.BLACK);
                F2="0";
                break;
            case 1:
                jPanel7.setBackground(getHSBColor(12,250,100));
                F2="1";
                break;
            case 2:
                F2="2";
                jPanel7.setBackground(Color.RED);
                break;
            case 3:
                F2="3";
                jPanel7.setBackground(Color.ORANGE);
                break;
            case 4:
                F2="4";
                jPanel7.setBackground(Color.YELLOW);
                break;
            case 5:
                F2="5";
                jPanel7.setBackground(Color.GREEN);
                break;
            case 6:
                F2="6";
                jPanel7.setBackground(Color.BLUE);
                break;
            case 7:
                F2="7";
                jPanel7.setBackground(Color.MAGENTA);
                break;
            case 8:
                F2="8";
                jPanel7.setBackground(Color.DARK_GRAY);
                break;
            case 9:
                F2="9";
                jPanel7.setBackground(Color.WHITE);
                break;
               
        }
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
              switch(jComboBox3.getSelectedIndex())//FRANJA 3
        {
            case 0:
                F3="1";
                jPanel9.setBackground(Color.BLACK);
                break;
            case 1:
                F3="10";
                jPanel9.setBackground(getHSBColor(12,250,100));
                break;
            case 2:
                F3="100";
                jPanel9.setBackground(Color.RED);
                break;
            case 3:
                F3="1000";
                jPanel9.setBackground(Color.ORANGE);
                break;
            case 4:
                F3="10000";
                jPanel9.setBackground(Color.YELLOW);
                break;
            case 5:
                F3="100000";
                jPanel9.setBackground(Color.GREEN);
                break;
            case 6:
                F3="1000000";
                jPanel9.setBackground(Color.BLUE);
                break;
            case 7:
                F3="10000000";
                jPanel9.setBackground(Color.MAGENTA);
                break;
            case 8:
                F3="100000000";
                jPanel9.setBackground(Color.DARK_GRAY);
                break;
            case 9:
                F3="1000000000";
                jPanel9.setBackground(Color.WHITE);
                break;
               
        }
        
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
         
        switch(jComboBox4.getSelectedIndex())//FRANJA 4
        {
            case 0:
                jPanel11.setBackground(Color.RED);
                F4="  ±2%";
                break;
            case 1:
                F4="  ±5%";
                jPanel11.setBackground(getHSBColor(44, 92, 65));
                break;
            case 2:
                F4="  ±10%";
                jPanel11.setBackground(Color.GRAY);
                //jPanel11.setBackground(getHSBColor(213, 10, 35));
                break;
            
               
        }
        
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String a="";
        a=Ohm(F1,F2,F3,F4);
        jTextField1.setText(a+" Ω");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField1.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed
public static String Ohm(String F1,String F2,String F3,String F4){
    double res;
    String r,PAS;
    PAS=F1+F2;
    res=Double.parseDouble(PAS)*Double.parseDouble(F3);
    r=String.valueOf(res)+F4;
    return r;
}
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
            java.util.logging.Logger.getLogger(calcresis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calcresis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calcresis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calcresis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calcresis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
