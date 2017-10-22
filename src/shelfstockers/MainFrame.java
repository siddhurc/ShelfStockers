/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shelfstockers;

/**
 *
 * @author siddharthachoudhary
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        DesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        BillingMenu = new javax.swing.JMenu();
        NewBillingMenu = new javax.swing.JMenuItem();
        StockMenu = new javax.swing.JMenu();
        DisplayMenu = new javax.swing.JMenuItem();
        ModifyMenu = new javax.swing.JMenuItem();
        DeleteMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DesktopPane.setBounds(new java.awt.Rectangle(0, 0, 650, 500));

        BillingMenu.setText("Billing");

        NewBillingMenu.setText("New Billing");
        NewBillingMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBillingMenuActionPerformed(evt);
            }
        });
        BillingMenu.add(NewBillingMenu);

        jMenuBar1.add(BillingMenu);

        StockMenu.setText("Stock");

        DisplayMenu.setText("Display Stock");
        DisplayMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayMenuActionPerformed(evt);
            }
        });
        StockMenu.add(DisplayMenu);

        ModifyMenu.setText("Add/Modify");
        ModifyMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyMenuActionPerformed(evt);
            }
        });
        StockMenu.add(ModifyMenu);

        DeleteMenu.setText("Delete stock");
        DeleteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteMenuActionPerformed(evt);
            }
        });
        StockMenu.add(DeleteMenu);

        jMenuBar1.add(StockMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DisplayMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayMenuActionPerformed
        // TODO add your handling code here:
        DispForm dis=new DispForm();
        DesktopPane.add(dis);
                dis.setVisible(true);
    }//GEN-LAST:event_DisplayMenuActionPerformed

    private void ModifyMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyMenuActionPerformed
        // TODO add your handling code here:
        ModifyForm ms=new ModifyForm();
        DesktopPane.add(ms);
        ms.setVisible(true);
    }//GEN-LAST:event_ModifyMenuActionPerformed

    private void DeleteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteMenuActionPerformed
       DeleteForm df=new DeleteForm();
       DesktopPane.add(df);
       df.setVisible(true);
        // TODO add your handling code here:
        
    }//GEN-LAST:event_DeleteMenuActionPerformed

    private void NewBillingMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBillingMenuActionPerformed
        // TODO add your handling code here:
        BillingForm bf=new BillingForm();
        DesktopPane.add(bf);
        bf.setVisible(true);        
    }//GEN-LAST:event_NewBillingMenuActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu BillingMenu;
    private javax.swing.JMenuItem DeleteMenu;
    private javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JMenuItem DisplayMenu;
    private javax.swing.JMenuItem ModifyMenu;
    private javax.swing.JMenuItem NewBillingMenu;
    private javax.swing.JMenu StockMenu;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
