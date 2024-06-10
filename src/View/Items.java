/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Controller.Citems;
import Controller.CitemView;
import Controller.CitemUpdate;
import Controller.CitemDelete;

import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author thara
 */
public class Items extends javax.swing.JFrame {

    /**
     * Creates new form Items
     */
    int x,y;
    public Items() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_close = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_min = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_qty = new javax.swing.JTextField();
        txt_bprice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_sprice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        com_select = new javax.swing.JComboBox<>();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_itm = new javax.swing.JTable();
        btn_clr1 = new javax.swing.JButton();
        btn_view = new javax.swing.JButton();
        btn_tbl_clear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(239, 243, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));
        jPanel4.setForeground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 610, 860, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/logo.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 211, 61));

        lbl_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/close new.png"))); // NOI18N
        lbl_close.setText("jLabel2");
        lbl_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_closeMouseClicked(evt);
            }
        });
        jPanel2.add(lbl_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, 30, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Items");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 18, 403, 37));

        lbl_min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/minimize new.png"))); // NOI18N
        lbl_min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_minMouseClicked(evt);
            }
        });
        jPanel2.add(lbl_min, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, -1, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 70));

        jPanel5.setBackground(new java.awt.Color(0, 0, 102));
        jPanel5.setForeground(new java.awt.Color(0, 0, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 1080, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Category");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, 30));

        txt_qty.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(txt_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 400, -1));

        txt_bprice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(txt_bprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 400, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Quantity");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, 40));

        txt_sprice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(txt_sprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 400, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Sell Price");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, 30));

        txt_id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 400, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Name");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 145, -1, -1));

        txt_name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 400, -1));

        com_select.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        com_select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category", "Engine", "Light", "Body" }));
        jPanel1.add(com_select, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 400, -1));

        btn_add.setBackground(new java.awt.Color(0, 153, 51));
        btn_add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("Add");
        btn_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addMouseClicked(evt);
            }
        });
        jPanel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 100, 90, -1));

        btn_update.setBackground(new java.awt.Color(0, 0, 102));
        btn_update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Update");
        btn_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_updateMouseClicked(evt);
            }
        });
        jPanel1.add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 160, -1, -1));

        btn_delete.setBackground(new java.awt.Color(204, 0, 0));
        btn_delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("Delete");
        btn_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_deleteMouseClicked(evt);
            }
        });
        jPanel1.add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 220, 90, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("Buy Price");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, 30));

        table_itm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Category", "Buy Price", "Sell Price", "Quantity"
            }
        ));
        table_itm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_itmMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_itm);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 710, 200));

        btn_clr1.setBackground(new java.awt.Color(0, 0, 102));
        btn_clr1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_clr1.setForeground(new java.awt.Color(255, 255, 255));
        btn_clr1.setText("Clear");
        btn_clr1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clr1MouseClicked(evt);
            }
        });
        jPanel1.add(btn_clr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 280, 90, -1));

        btn_view.setBackground(new java.awt.Color(0, 153, 51));
        btn_view.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_view.setForeground(new java.awt.Color(255, 255, 255));
        btn_view.setText("view");
        btn_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_viewMouseClicked(evt);
            }
        });
        jPanel1.add(btn_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 560, -1, -1));

        btn_tbl_clear.setBackground(new java.awt.Color(0, 0, 102));
        btn_tbl_clear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_tbl_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_tbl_clear.setText("Clear");
        btn_tbl_clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tbl_clearMouseClicked(evt);
            }
        });
        jPanel1.add(btn_tbl_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 560, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/picture11.jpeg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 230, 140));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/picture8.jpeg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 230, 140));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/picture10.jpeg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 230, 140));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_closeMouseClicked
      
       dispose();
    }//GEN-LAST:event_lbl_closeMouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int xx=evt.getXOnScreen();
        int yy=evt.getYOnScreen();
        this.setLocation(xx-x, yy-y);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void btn_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMouseClicked
    try{Double Bprice,Sprice;
        String id,name,category;
        int Qty;
        
        id=txt_id.getText();
        name=txt_name.getText();
        category=com_select.getSelectedItem().toString();
        Bprice=Double.parseDouble(txt_bprice.getText());
        Sprice=Double.parseDouble(txt_sprice.getText());
        Qty=Integer.parseInt(txt_qty.getText());
        
        
       if (id.isEmpty()) 
       {
        JOptionPane.showMessageDialog(null, "Please enter ID");
       } 
       else if ( name.isEmpty()) 
        {
        JOptionPane.showMessageDialog(null, "Please enter name");
        } 
       else if (category.equals("Select Category")) 
        {
        JOptionPane.showMessageDialog(null, "Please select category");
        } 
       else if (Bprice == null || Bprice <= 0) 
        {
        JOptionPane.showMessageDialog(null, "Please enter a  valid buy price");
        } 
       else if (Sprice == null || Sprice <= 0) 
        {
        JOptionPane.showMessageDialog(null, "Please enter a valid sell price");
        } 
       else if (Qty <= 0) 
        {
        JOptionPane.showMessageDialog(null, "Please enter a valid quantity");
        } 
       else {
        
        Citems ci=new Citems();
        ci.Cadditems(id, name, category, Bprice, Sprice, Qty);
        
         txt_id.setText("");
        txt_name.setText("");
        com_select.setSelectedItem(1);
        txt_bprice.setText("");
        txt_sprice.setText("");
        txt_qty.setText("");
       }
       
    }catch (NumberFormatException ex) 
    {
    JOptionPane.showMessageDialog(null, "Please enter valid Details ( Prices & quantity numbers only!)");
    } 
    catch (Exception ex) 
    {
    JOptionPane.showMessageDialog(null, "Please try again");
    ex.printStackTrace(); // 
    }
        
      
        
    }//GEN-LAST:event_btn_addMouseClicked

    private void table_itmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_itmMouseClicked
        DefaultTableModel tmodel=(DefaultTableModel)table_itm.getModel();
        String tid=tmodel.getValueAt(table_itm.getSelectedRow(), 0).toString();
        String tname=tmodel.getValueAt(table_itm.getSelectedRow(), 1).toString();
        String tcategory=tmodel.getValueAt(table_itm.getSelectedRow(), 2).toString();
        String tbprice=tmodel.getValueAt(table_itm.getSelectedRow(), 3).toString();
        String tsprice=tmodel.getValueAt(table_itm.getSelectedRow(), 4).toString();
        String tqty=tmodel.getValueAt(table_itm.getSelectedRow(), 5).toString();
        
        txt_id.setText(tid);
        txt_name.setText(tname);
        com_select.setSelectedItem(tcategory);
        txt_bprice.setText(tbprice);
        txt_sprice.setText(tsprice);
        txt_qty.setText(tqty);
                
    }//GEN-LAST:event_table_itmMouseClicked

    private void btn_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deleteMouseClicked
         String id;
         id=txt_id.getText();
         CitemDelete di=new CitemDelete();
         di.CdeleteItem(id);
         
          txt_id.setText("");
        txt_name.setText("");
        com_select.setSelectedItem(1);
        txt_bprice.setText("");
        txt_sprice.setText("");
        txt_qty.setText("");
         
    }//GEN-LAST:event_btn_deleteMouseClicked

    private void btn_clr1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clr1MouseClicked
        txt_id.setText("");
        txt_name.setText("");
        com_select.setSelectedItem(0);
        txt_bprice.setText("");
        txt_sprice.setText("");
        txt_qty.setText("");
    }//GEN-LAST:event_btn_clr1MouseClicked

    private void btn_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_viewMouseClicked
     
        
         try{
        CitemView cv=new CitemView();
        ResultSet rst=cv.CviewItem();
        while(rst.next())
        {
           String id=rst.getString("Id");
           String name=rst.getString("Name");
           String category=rst.getString("Category");
           String bprice=rst.getString("Bprice");
            String sprice=rst.getString("Sprice");
           String qty=rst.getString("Quantity");
           
           String dbdata[]={id,name,category,bprice,sprice,qty};
            DefaultTableModel tbmod=(DefaultTableModel)table_itm.getModel();
           tbmod.addRow(dbdata);  
        }       
         }
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
    
    }//GEN-LAST:event_btn_viewMouseClicked
   
    private void btn_tbl_clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tbl_clearMouseClicked
        DefaultTableModel model=(DefaultTableModel)table_itm.getModel();
        model.setRowCount(0);
        model.setRowCount(0);
    }//GEN-LAST:event_btn_tbl_clearMouseClicked

    private void btn_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updateMouseClicked
        Double Bprice,Sprice;
        int Qty;
        String id,name,category;
        
        id=txt_id.getText();
        name=txt_name.getText();
        category=com_select.getSelectedItem().toString();
        Bprice=Double.parseDouble(txt_bprice.getText());
        Sprice=Double.parseDouble(txt_sprice.getText());
        Qty=Integer.parseInt(txt_qty.getText());
        
        CitemUpdate iu=new CitemUpdate();
        iu.CupdateItem(id,name, category, Bprice, Sprice, Qty);
        
         txt_id.setText("");
        txt_name.setText("");
        com_select.setSelectedItem(0);
        txt_bprice.setText("");
        txt_sprice.setText("");
        txt_qty.setText("");
    }//GEN-LAST:event_btn_updateMouseClicked

    private void lbl_minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_minMouseClicked
        this.setExtendedState(Items.ICONIFIED);
    }//GEN-LAST:event_lbl_minMouseClicked
    
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
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Items().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_clr1;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_tbl_clear;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_view;
    private javax.swing.JComboBox<String> com_select;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JLabel lbl_min;
    private javax.swing.JTable table_itm;
    private javax.swing.JTextField txt_bprice;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_qty;
    private javax.swing.JTextField txt_sprice;
    // End of variables declaration//GEN-END:variables
}
