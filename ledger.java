/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fspack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author amitv
 */
class record3 {

    public String name, accid, cryptname, price, bsamt, type;
}

public class ledger extends javax.swing.JFrame {

    int count = 0;
    record3 rec3[] = new record3[30];

    /**
     * Creates new form ledger
     */
    public ledger() {
        initComponents();

        for (int i = 0; i < 30; i++) {
            rec3[i] = new record3();
        }
        try {
            Scanner reader = new Scanner(new File("C:\\Users\\amitv\\Documents\\NetBeansProjects\\fsminiproject\\journal.txt"));
            reader.useDelimiter("\r\n");
            while (reader.hasNext()) {
                String buff = reader.next();
                count++;
            }
            reader.close();
            System.out.println("Count: " + count);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(searchtransactions.class.getName()).log(Level.SEVERE, null, ex);
        }
        // ArrayList al=new ArrayList();

        // Iterator it=al.iterator();
        Scanner reader1;
        try {
            String str, id;
            reader1 = new Scanner(new File("C:\\Users\\amitv\\Documents\\NetBeansProjects\\fsminiproject\\journal.txt"));
            reader1.useDelimiter("\r\n");
            for (int i = 0; i < count; i++) {
                str = reader1.next();
                Scanner scan = new Scanner(str).useDelimiter(",");
                rec3[i].name = scan.next();
                rec3[i].accid = scan.next();
                rec3[i].cryptname = scan.next();
                rec3[i].price = scan.next();
                rec3[i].bsamt = scan.next();
                rec3[i].type = scan.next();
                //while(it.hasNext())
                //{
                //if(! rec3[i].accid.equals(it.next()))
                //al.add(id.toString());
                //}
                scan.close();
            }
            reader1.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(addtransaction.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("\n\n");
        for (int i = 0; i < count; i++) {
            System.out.println(rec3[i].name + "  " + rec3[i].accid + "  " + rec3[i].cryptname + "  " + rec3[i].price + "  " + rec3[i].bsamt + "  " + rec3[i].type);
            //System.out.println("iD: "+rec3[i].accid);
        }

        /* while(it.hasNext())
                {
                    System.out.println(it.next().toString());
                }*/
        try {

            FileWriter writer1 = new FileWriter("C:\\Users\\amitv\\Documents\\NetBeansProjects\\fsminiproject\\ledger.txt");
            // writer1.write("Not Working!!!");

            String tempid = "0", scur;
            int balance = 10000, cur;
            // writer1.write("\nCount "+count);
            for (int i = 0; i < count; i++) {
                //writer1.write("\nI "+i);
                if (tempid.equals(rec3[i].accid)) {
                    //writer1.write("   If ");
                    System.out.println("Crypt Type: " + rec3[i].cryptname + "   Price: " + rec3[i].price + "   Buy Sell Amount: " + rec3[i].bsamt + "   Balance: " + balance);
                    writer1.write("\t\t");
                    writer1.write("Crypt Type: " + rec3[i].cryptname);
                    writer1.write("\t\t");
                    writer1.write("Price: " + rec3[i].price);
                    writer1.write("\t\t");
                    writer1.write("Buy Sell Amount: " + rec3[i].bsamt);
                    scur = rec3[i].bsamt;
                    cur = Integer.parseInt(scur);
                    balance += cur;
                    System.out.println("String Cur: " + scur + "Int Cur: " + cur + "  Balance: " + balance);
                    writer1.write("\t\t");
                    writer1.write("Balance: " + balance);
                    writer1.write("\r\n");

                } else {
                    //writer1.write("   else ");
                    tempid = rec3[i].accid;

                    balance = 10000;

                    System.out.println("\n\niD: " + tempid);
                    System.out.println("Crypt Type: " + rec3[i].cryptname + "   Price: " + rec3[i].price + "   Buy Sell Amount: " + rec3[i].bsamt + "   Balance: " + balance);
                    writer1.write("Account Id: " + tempid);
                    writer1.write("\r\n");
                    writer1.write("\t\t");
                    writer1.write("Crypt Type: " + rec3[i].cryptname);
                    writer1.write("\t\t");
                    writer1.write("Price: " + rec3[i].price);
                    writer1.write("\t\t");
                    writer1.write("Buy Sell Amount: " + rec3[i].bsamt);
                    scur = rec3[i].bsamt;
                    cur = Integer.parseInt(scur);
                    balance += cur;
                    System.out.println("String Cur: " + scur + "Int Cur: " + cur + "  Balance: " + balance);
                    writer1.write("\t\t");
                    writer1.write("Balance: " + balance);
                    writer1.write("\r\n");

                }
            }
            writer1.close();
            //writer1.close();
            //JOptionPane.showMessageDialog(null, "Inserted");
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(rootPane, "Error");
        }

        try {
            FileReader reader = new FileReader("C:\\Users\\amitv\\Documents\\NetBeansProjects\\fsminiproject\\ledger.txt");
            try (BufferedReader br = new BufferedReader(reader)) {
                jTextArea1.read(br, null);

            } catch (IOException ex) {
                //jLabel2.setText("Load Unsuccesful");

                //Logger.getLogger(firstPage.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            //Logger.getLogger(firstPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 183, 1060, 347));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ledger File");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 125, 215, 52));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fspack/back1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 620, 130, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fspack/ledger.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new homepagenew().setVisible(true);
        this.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ledger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ledger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ledger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ledger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ledger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
