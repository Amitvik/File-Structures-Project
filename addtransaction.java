/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fspack;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author amitv
 */
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
class record
{
    public String name,accid,cryptname,price,bsamt,type;
}
public class addtransaction extends javax.swing.JFrame {
    int count=0;
record rec[]=new record[30];
    int no = 0;

    public addtransaction() {
        initComponents();
         try {
            Scanner reader=new Scanner(new File("C:\\Users\\amitv\\Documents\\NetBeansProjects\\fsminiproject\\journal.txt"));
            reader.useDelimiter("\r\n");
            while(reader.hasNext())
            {
                String buff=reader.next();
                count++;
            }
            reader.close();
            System.out.println("Count: "+count);
                    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(searchtransactions.class.getName()).log(Level.SEVERE, null, ex);
        }
       /* Scanner reader;
        String buffer;
        try {
            reader = new Scanner(new File("journal.txt"));
            reader.useDelimiter(",");
            while (reader.hasNext()) {
                buffer = reader.next();
                if (buffer.equals("|")) {
                    no++;
                }

            }
        } catch (Exception e) {
            System.out.println(e);
        }*/

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        idTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cryptTxt = new javax.swing.JTextField();
        priceTxt = new javax.swing.JTextField();
        bsTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        typeTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 157, 25));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Acc id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 157, 25));

        nameTxt.setBackground(new java.awt.Color(0, 0, 0));
        nameTxt.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        nameTxt.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 157, 30));

        idTxt.setBackground(new java.awt.Color(0, 0, 0));
        idTxt.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        idTxt.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 160, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Crypt name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 157, 29));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Price");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 157, 32));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BS amount");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 157, 29));

        cryptTxt.setBackground(new java.awt.Color(0, 0, 0));
        cryptTxt.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        cryptTxt.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cryptTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 160, 29));

        priceTxt.setBackground(new java.awt.Color(0, 0, 0));
        priceTxt.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        priceTxt.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(priceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 157, 30));

        bsTxt.setBackground(new java.awt.Color(0, 0, 0));
        bsTxt.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        bsTxt.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(bsTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 157, 29));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Type");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 157, 32));

        typeTxt.setBackground(new java.awt.Color(0, 0, 0));
        typeTxt.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        typeTxt.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(typeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 157, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fspack/submit.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 140, 130));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fspack/back1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 140, 120));

        jLabel7.setBackground(new java.awt.Color(0, 0, 204));
        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Transaction Entry");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 70));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 204, 0));
        jButton3.setText("SUBMIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 140, 30));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 204, 0));
        jButton4.setText("GO BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 140, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fspack/addtransactionbitcoin.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new homepagenew().setVisible(true);
        this.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        for(int i=0;i<30;i++)
        {
            rec[i]=new record();
        }
        String name = nameTxt.getText();
        String accid = idTxt.getText();
        String cryptname = cryptTxt.getText();
        String price = priceTxt.getText();
        String bsamount = bsTxt.getText();
        String type = typeTxt.getText();

        try {
            FileWriter writer = new FileWriter("C:\\Users\\amitv\\Documents\\NetBeansProjects\\fsminiproject\\journal.txt", true);

            writer.write(name);
            writer.write(",");
            writer.write(accid);
            writer.write(",");
            writer.write(cryptname);
            writer.write(",");
            writer.write(price);
            writer.write(",");
            writer.write(bsamount);
            writer.write(",");
            writer.write(type);
           
            writer.write(",");
            writer.write("\r\n");
            writer.close();
            count++;
            JOptionPane.showMessageDialog(null, "Inserted");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error");
        }
        System.out.println("Count: "+count);
        /*try {
            Scanner reader2=new Scanner(new File("C:\\Users\\amitv\\Documents\\NetBeansProjects\\fsminiproject\\journal.txt"));
            reader2.useDelimiter("\r\n");
            while(reader2.hasNext())
            {
                String buff=reader2.next();
                count++;
            }
            reader2.close();
            System.out.println("Count: "+count);
                    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(searchtransactions.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        Scanner reader1;
        try {
            String str;
            reader1 = new Scanner(new File("C:\\Users\\amitv\\Documents\\NetBeansProjects\\fsminiproject\\journal.txt"));
            reader1.useDelimiter("\r\n");
            for(int i=0;i<count;i++)
            {
                str=reader1.next();
                Scanner scan=new Scanner(str).useDelimiter(",");
                rec[i].name=scan.next();
                rec[i].accid=scan.next();
                rec[i].cryptname=scan.next();
                rec[i].price=scan.next();
                rec[i].bsamt=scan.next();
                rec[i].type=scan.next();
                scan.close();
            }
            reader1.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(addtransaction.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Before Sorting: ");
        for(int i=0;i<count;i++)
            {
               System.out.println(rec[i].name+"  "+rec[i].accid+"  "+rec[i].cryptname+"  "+rec[i].price+"  "+rec[i].bsamt+"  "+rec[i].type);
                //System.out.println("iD: "+rec[i].accid);
            }
        
        record temp=new record();
        for(int i=0;i<count-1;i++)
        {
            for(int j=0;j<count-i-1;j++)
            {
                if(rec[j].accid.compareTo(rec[j+1].accid)>0)
                {
                    temp=rec[j];
                    rec[j]=rec[j+1];
                    rec[j+1]=temp;
                }
            }
        }
         System.out.println("After Sorting: ");
        for(int i=0;i<count;i++)
            {
               System.out.println(rec[i].name+"  "+rec[i].accid+"  "+rec[i].cryptname+"  "+rec[i].price+"  "+rec[i].bsamt+"  "+rec[i].type);
                //System.out.println("iD: "+rec[i].accid);
            }
        
        
        try {
            FileWriter writer = new FileWriter("C:\\Users\\amitv\\Documents\\NetBeansProjects\\fsminiproject\\journal.txt");
            for(int i=0;i<count;i++)
            {

            writer.write(rec[i].name);
            writer.write(",");
            writer.write(rec[i].accid);
            writer.write(",");
            writer.write(rec[i].cryptname);
            writer.write(",");
            writer.write(rec[i].price);
            writer.write(",");
            writer.write(rec[i].bsamt);
            writer.write(",");
            writer.write(rec[i].type);
           
            writer.write(",");
            writer.write("\r\n");
            }
            writer.close();
            JOptionPane.showMessageDialog(null, "Inserted");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error");
        }
           
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 for(int i=0;i<30;i++)
        {
            rec[i]=new record();
        }
        String name = nameTxt.getText();
        String accid = idTxt.getText();
        String cryptname = cryptTxt.getText();
        String price = priceTxt.getText();
        String bsamount = bsTxt.getText();
        String type = typeTxt.getText();

        try {
            FileWriter writer = new FileWriter("C:\\Users\\amitv\\Documents\\NetBeansProjects\\fsminiproject\\journal.txt", true);

            writer.write(name);
            writer.write(",");
            writer.write(accid);
            writer.write(",");
            writer.write(cryptname);
            writer.write(",");
            writer.write(price);
            writer.write(",");
            writer.write(bsamount);
            writer.write(",");
            writer.write(type);
           
            writer.write(",");
            writer.write("\r\n");
            writer.close();
            count++;
            JOptionPane.showMessageDialog(null, "Inserted");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error");
        }
        System.out.println("Count: "+count);
        /*try {
            Scanner reader2=new Scanner(new File("C:\\Users\\amitv\\Documents\\NetBeansProjects\\fsminiproject\\journal.txt"));
            reader2.useDelimiter("\r\n");
            while(reader2.hasNext())
            {
                String buff=reader2.next();
                count++;
            }
            reader2.close();
            System.out.println("Count: "+count);
                    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(searchtransactions.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        Scanner reader1;
        try {
            String str;
            reader1 = new Scanner(new File("C:\\Users\\amitv\\Documents\\NetBeansProjects\\fsminiproject\\journal.txt"));
            reader1.useDelimiter("\r\n");
            for(int i=0;i<count;i++)
            {
                str=reader1.next();
                Scanner scan=new Scanner(str).useDelimiter(",");
                rec[i].name=scan.next();
                rec[i].accid=scan.next();
                rec[i].cryptname=scan.next();
                rec[i].price=scan.next();
                rec[i].bsamt=scan.next();
                rec[i].type=scan.next();
                scan.close();
            }
            reader1.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(addtransaction.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Before Sorting: ");
        for(int i=0;i<count;i++)
            {
               System.out.println(rec[i].name+"  "+rec[i].accid+"  "+rec[i].cryptname+"  "+rec[i].price+"  "+rec[i].bsamt+"  "+rec[i].type);
                //System.out.println("iD: "+rec[i].accid);
            }
        
        record temp=new record();
        for(int i=0;i<count-1;i++)
        {
            for(int j=0;j<count-i-1;j++)
            {
                if(rec[j].accid.compareTo(rec[j+1].accid)>0)
                {
                    temp=rec[j];
                    rec[j]=rec[j+1];
                    rec[j+1]=temp;
                }
            }
        }
         System.out.println("After Sorting: ");
        for(int i=0;i<count;i++)
            {
               System.out.println(rec[i].name+"  "+rec[i].accid+"  "+rec[i].cryptname+"  "+rec[i].price+"  "+rec[i].bsamt+"  "+rec[i].type);
                //System.out.println("iD: "+rec[i].accid);
            }
        
        
        try {
            FileWriter writer = new FileWriter("C:\\Users\\amitv\\Documents\\NetBeansProjects\\fsminiproject\\journal.txt");
            for(int i=0;i<count;i++)
            {

            writer.write(rec[i].name);
            writer.write(",");
            writer.write(rec[i].accid);
            writer.write(",");
            writer.write(rec[i].cryptname);
            writer.write(",");
            writer.write(rec[i].price);
            writer.write(",");
            writer.write(rec[i].bsamt);
            writer.write(",");
            writer.write(rec[i].type);
           
            writer.write(",");
            writer.write("\r\n");
            }
            writer.close();
            JOptionPane.showMessageDialog(null, "Inserted");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error");
        }
                   // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 new homepagenew().setVisible(true);
        this.setVisible(false);      // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(addtransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addtransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addtransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addtransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addtransaction().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bsTxt;
    private javax.swing.JTextField cryptTxt;
    private javax.swing.JTextField idTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JTextField typeTxt;
    // End of variables declaration//GEN-END:variables
}
