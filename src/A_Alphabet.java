
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author komal
 */
public class A_Alphabet extends javax.swing.JFrame {

    /**
     * Creates new form A_form
     */
    public A_Alphabet() {
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

        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jRadioButton1.setText("jRadioButton1");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/download (1).jpg"))); // NOI18N
        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 24)); // NOI18N
        jLabel1.setText("ENTER WORD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 246, 183, -1));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 24)); // NOI18N
        jLabel2.setText("ENTER MEANING");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 297, 214, -1));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 246, 260, 30));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 297, 260, 30));

        jButton1.setBackground(new java.awt.Color(255, 204, 102));
        jButton1.setFont(new java.awt.Font("Segoe Script", 1, 30)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 160, 70));

        jButton2.setBackground(new java.awt.Color(255, 204, 102));
        jButton2.setFont(new java.awt.Font("Segoe Script", 1, 30)); // NOI18N
        jButton2.setText("Insert");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 161, 70));

        jButton4.setBackground(new java.awt.Color(255, 204, 102));
        jButton4.setFont(new java.awt.Font("Segoe Script", 1, 30)); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 168, 70));

        jButton5.setBackground(new java.awt.Color(255, 204, 102));
        jButton5.setFont(new java.awt.Font("Segoe Script", 1, 34)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 160, 70));

        jButton6.setBackground(new java.awt.Color(255, 204, 102));
        jButton6.setFont(new java.awt.Font("Segoe Script", 1, 30)); // NOI18N
        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 160, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/download (1).jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 220, 230));

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 190, 110));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/AA.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://:3306/datadictionary", "root", "Ahumza@1234");
            Statement stmt = con.createStatement();
            String wrd = t1.getText();
            String mean = t2.getText();
            if (wrd.charAt(0) == 'A' || wrd.charAt(0) == 'a') {
                String query = "insert into tdata values('" + wrd + "','" + mean + "');";
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "RECORD SUCCESSFULLY INSERTED");
                t1.setText(null);
                t2.setText(null);
            } else {
                JOptionPane.showMessageDialog(null, "YOU MUST HAVE TO ENTER WORD STARTING FROM A");
            }
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "ERROR IN CONNECTIVITY" + E);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://:3306/datadictionary", "root", "Ahumza@1234");
            Statement stmt = con.createStatement();
            String wrd = t1.getText();
            if (wrd.charAt(0) == 'A' || wrd.charAt(0) == 'a') {
                String query = "delete from tdata where word='" + wrd + "';";
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "RECORD SUCCESSFULLY DELETED");
                t1.setText(null);
                t2.setText(null);
            } else {

                JOptionPane.showMessageDialog(null, "YOU MUST HAVE TO ENTER WORD STARTING FROM A");
            }
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "ERROR IN CONNECTIVITY" + E);
        }


    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://:3306/datadictionary", "root", "Ahumza@1234");
            Statement stmt = con.createStatement();
            String wrd = t1.getText();
            String mean = t2.getText();
            if (wrd.charAt(0) == 'A' || wrd.charAt(0) == 'a') {
                String query = "update tdata set word='" + wrd + "',meaning='" + mean + "';";
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "RECORD SUCCESSFULLY UPDATED");
                t2.setText(null);
            } else {
                JOptionPane.showMessageDialog(null, "YOU MUST HAVE TO ENTER WORD STARTING FROM A");
            }
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "ERROR IN CONNECTIVITY" + E);
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://:3306/datadictionary", "root", "Ahumza@1234");
            Statement stmt = con.createStatement();
            String search = t1.getText();

            if (search.charAt(0) == 'A' || search.charAt(0) == 'a') {
                String query = "select * from tdata where word='" + (search) + "';";
                ResultSet rs = stmt.executeQuery(query);
                if (rs.next()) {
                    String wrd = rs.getString("word");
                    String Vmeaning = rs.getString("meaning");
                    t2.setText(" " + Vmeaning);
                    JOptionPane.showMessageDialog(null, "MEANING IS SUCCESSFULLY SEARCHED");

                } else {
                    JOptionPane.showMessageDialog(null, "MEANING NOT AVAILABLE");
                }
            } else {

                JOptionPane.showMessageDialog(null, "YOU MUST HAVE TO ENTER WORD STARTING FROM A");
            }
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "ERROR IN CONNECTIVITY" + E);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new Select_Alphabet().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(A_Alphabet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A_Alphabet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A_Alphabet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A_Alphabet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A_Alphabet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
