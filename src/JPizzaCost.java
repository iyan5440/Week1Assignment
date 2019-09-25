
import java.awt.Color;
import javax.swing.JOptionPane;


public class JPizzaCost extends javax.swing.JFrame {

    int inch, tops;
    double total;
    final double base = 2.25, toppings = .75, bing =.5;
    int muck,peck,tock,pick,beck,chck,sack,hack;
    public JPizzaCost() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        inchbox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pepbox = new javax.swing.JCheckBox();
        mushbox = new javax.swing.JCheckBox();
        tombox = new javax.swing.JCheckBox();
        pinbox = new javax.swing.JCheckBox();
        beefbox = new javax.swing.JCheckBox();
        chebox = new javax.swing.JCheckBox();
        saubox = new javax.swing.JCheckBox();
        hambox = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        hungrybox = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pilbl = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setText("Welcome to Pizza Pizza!");

        inchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inchboxActionPerformed(evt);
            }
        });

        jLabel2.setText("Type your pizza size. (INCHES ONLY) ");

        jLabel3.setText("Select the Toppings that you want.");

        pepbox.setText("Pepperoni");
        pepbox.setBorderPainted(true);
        pepbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pepboxActionPerformed(evt);
            }
        });

        mushbox.setText("Mushrooms");
        mushbox.setBorderPainted(true);
        mushbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mushboxActionPerformed(evt);
            }
        });

        tombox.setText("Tomatoes");
        tombox.setBorderPainted(true);
        tombox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomboxActionPerformed(evt);
            }
        });

        pinbox.setText("Pineapple");
        pinbox.setBorderPainted(true);
        pinbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinboxActionPerformed(evt);
            }
        });

        beefbox.setText("Ground Beef");
        beefbox.setBorderPainted(true);
        beefbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beefboxActionPerformed(evt);
            }
        });

        chebox.setText("Extra Cheese");
        chebox.setBorderPainted(true);
        chebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheboxActionPerformed(evt);
            }
        });

        saubox.setText("Sausage");
        saubox.setBorderPainted(true);
        saubox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sauboxActionPerformed(evt);
            }
        });

        hambox.setText("Ham");
        hambox.setBorderPainted(true);
        hambox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hamboxActionPerformed(evt);
            }
        });

        jLabel4.setText("Once you have completed the steps above, press the button below for your total.");

        hungrybox.setText(">>>>");
        hungrybox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hungryboxActionPerformed(evt);
            }
        });

        pilbl.setBackground(new java.awt.Color(181, 81, 24));
        pilbl.setColumns(20);
        pilbl.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        pilbl.setRows(5);
        jScrollPane1.setViewportView(pilbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pepbox)
                            .addComponent(beefbox))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mushbox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pinbox)
                                .addGap(10, 10, 10)
                                .addComponent(tombox))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chebox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(saubox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hambox))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(hungrybox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inchbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pepbox)
                    .addComponent(mushbox)
                    .addComponent(pinbox)
                    .addComponent(tombox))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beefbox)
                    .addComponent(chebox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saubox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hambox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hungrybox, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inchboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inchboxActionPerformed

    private void pepboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pepboxActionPerformed
        peck+=1;
        if(peck==1){
            tops+=1;
            
        }
        if(peck==2){
            tops-=1;
            peck=0;
        }
        
        
        
    }//GEN-LAST:event_pepboxActionPerformed


    
    private void mushboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mushboxActionPerformed
        muck+=1;
        if(muck==1){
            tops+=1;
            
        }
        if(muck==2){
            tops-=1;
            muck=0;
        }
        
        
    }//GEN-LAST:event_mushboxActionPerformed

    private void tomboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomboxActionPerformed
        tock+=1;
        if(tock==1){
            tops+=1;
            
        }
        if(tock==2){
            tops-=1;
            tock=0;
        }
    }//GEN-LAST:event_tomboxActionPerformed

    private void pinboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinboxActionPerformed
        pick+=1;
        if(pick==1){
            tops+=1;
            
        }
        if(pick==2){
            tops-=1;
            pick=0;
        }
    }//GEN-LAST:event_pinboxActionPerformed

    private void beefboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beefboxActionPerformed
        beck+=1;
        if(beck==1){
            tops+=1;
            
        }
        if(beck==2){
            tops-=1;
            beck=0;
        }
    }//GEN-LAST:event_beefboxActionPerformed

    private void cheboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheboxActionPerformed
        chck+=1;
        if(chck==1){
            tops+=1;
            
        }
        if(chck==2){
            tops-=1;
            chck=0;
        }
    }//GEN-LAST:event_cheboxActionPerformed

    private void sauboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sauboxActionPerformed
        sack+=1;
        if(sack==1){
            tops+=1;
            
        }
        if(sack==2){
            tops-=1;
            sack=0;
        }
    }//GEN-LAST:event_sauboxActionPerformed

    private void hamboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hamboxActionPerformed
        hack+=1;
        if(hack==1){
            tops+=1;
            
        }
        if(hack==2){
            tops-=1;
            hack=0;
        }
    }//GEN-LAST:event_hamboxActionPerformed

    private void hungryboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hungryboxActionPerformed
        //get info from inchbox and the check boxes and then calc
        try{
        inch = Integer.parseInt(inchbox.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "ERROR - MUST ENTER AN INTEGER");
            return;
        }
        if(inch<=0){
            JOptionPane.showMessageDialog(this, "ERROR - MUST ENTER A POSITIVE INTEGER");
            return;
        }
        total = (toppings*tops) + (inch*bing) + base;
        pilbl.setText(String.format("Adding in utilities and base ingridients,\n The cost of your pizza is $%.2f",total));
        System.out.println(peck);
        System.out.println(muck);
        System.out.println(tock);
        System.out.println(pick);
        System.out.println(beck);
        System.out.println(chck);
        System.out.println(sack);
        System.out.println(hack);
    }//GEN-LAST:event_hungryboxActionPerformed


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
            java.util.logging.Logger.getLogger(JPizzaCost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JPizzaCost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JPizzaCost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JPizzaCost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JPizzaCost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox beefbox;
    private javax.swing.JCheckBox chebox;
    private javax.swing.JCheckBox hambox;
    private javax.swing.JButton hungrybox;
    private javax.swing.JTextField inchbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox mushbox;
    private javax.swing.JCheckBox pepbox;
    private javax.swing.JTextArea pilbl;
    private javax.swing.JCheckBox pinbox;
    private javax.swing.JCheckBox saubox;
    private javax.swing.JCheckBox tombox;
    // End of variables declaration//GEN-END:variables
}
