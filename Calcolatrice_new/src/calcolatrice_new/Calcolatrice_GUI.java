/**
 * Classe di gestione di una calcolatrice
 * Lato grafico
 * 
 * @author Giovanni Rizza 4AI
 * @version 07/02/2018
*/

package calcolatrice_new;

import static calcolatrice_new.Calcolo.destroy;
import javax.swing.JOptionPane;

public class Calcolatrice_GUI extends javax.swing.JFrame {
    private Calcolo c;
     /**
     * Costruttore
     * Inizializza i vari elementi grafici e crea un oggetto di Calcolo
     */
    public Calcolatrice_GUI() {
        initComponents();
        c = new Calcolo('+');
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtOutput = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPiu = new javax.swing.JButton();
        btnMeno = new javax.swing.JButton();
        btnPer = new javax.swing.JButton();
        btnDiviso = new javax.swing.JButton();
        btnUguale = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btnCanc = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calcolatrice");
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Calcolatrice");

        txtOutput.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtOutput.setText("0");
        txtOutput.setEnabled(false);

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnPiu.setText("+");
        btnPiu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiuActionPerformed(evt);
            }
        });

        btnMeno.setText("-");
        btnMeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenoActionPerformed(evt);
            }
        });

        btnPer.setText("x");
        btnPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerActionPerformed(evt);
            }
        });

        btnDiviso.setText("/");
        btnDiviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisoActionPerformed(evt);
            }
        });

        btnUguale.setText("=");
        btnUguale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUgualeActionPerformed(evt);
            }
        });

        btnClear.setText("CLEAR / RESET");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDot.setText(",");
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });

        btnCanc.setText("C");
        btnCanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancActionPerformed(evt);
            }
        });

        btnMinus.setText("+ / -");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtOutput))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMinus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(118, 118, 118)
                                .addComponent(btnPiu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPer, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDiviso, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(btnMeno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn7)
                            .addComponent(btnCanc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn0)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUguale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3)
                    .addComponent(btnPiu)
                    .addComponent(btnMeno)
                    .addComponent(btnMinus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4)
                    .addComponent(btn5)
                    .addComponent(btn6)
                    .addComponent(btnPer)
                    .addComponent(btnDiviso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn9)
                        .addComponent(btn8)
                        .addComponent(btnUguale)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn0)
                        .addComponent(btnDot)
                        .addComponent(btnCanc))
                    .addComponent(btnClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Comportamento all'azione di premere il pulsante
     * @param evt 
     */
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        c.pushNumber("1");
        txtOutput.setText(c.getNumbers());
    }//GEN-LAST:event_btn1ActionPerformed
    /**
     * Comportamento all'azione di premere il pulsante
     * @param evt 
     */
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        c.pushNumber("2");
        txtOutput.setText(c.getNumbers());
    }//GEN-LAST:event_btn2ActionPerformed
    /**
     * Comportamento all'azione di premere il pulsante
     * @param evt 
     */
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        c.pushNumber("3");
        txtOutput.setText(c.getNumbers());
    }//GEN-LAST:event_btn3ActionPerformed
    /**
     * Comportamento all'azione di premere il pulsante
     * @param evt 
     */
    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        c.pushNumber("4");
        txtOutput.setText(c.getNumbers());
    }//GEN-LAST:event_btn4ActionPerformed
    /**
     * Comportamento all'azione di premere il pulsante
     * @param evt 
     */
    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        c.pushNumber("5");
        txtOutput.setText(c.getNumbers());
    }//GEN-LAST:event_btn5ActionPerformed
    /**
     * Comportamento all'azione di premere il pulsante
     * @param evt 
     */
    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        c.pushNumber("6");
        txtOutput.setText(c.getNumbers());
    }//GEN-LAST:event_btn6ActionPerformed
    /**
     * Comportamento all'azione di premere il pulsante
     * @param evt 
     */
    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        c.pushNumber("7");
        txtOutput.setText(c.getNumbers());
    }//GEN-LAST:event_btn7ActionPerformed
    /**
     * Comportamento all'azione di premere il pulsante
     * @param evt 
     */
    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        c.pushNumber("9");
        txtOutput.setText(c.getNumbers());
    }//GEN-LAST:event_btn9ActionPerformed
    /**
     * Comportamento all'azione di premere il pulsante
     * @param evt 
     */
    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        c.pushNumber("8");
        txtOutput.setText(c.getNumbers());
    }//GEN-LAST:event_btn8ActionPerformed
    /**
     * Comportamento all'azione di premere il pulsante
     * @param evt 
     */
    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        c.pushNumber("0");
        txtOutput.setText(c.getNumbers());
    }//GEN-LAST:event_btn0ActionPerformed
    /**
     * Comportamento all'azione di premere il pulsante
     * @param evt 
     */
    private void btnMenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenoActionPerformed
        try {
            //imposta la futura modalita' di calcolo
            c.setCalcolo('-');
            //se n1 non e' gia' stato inserito
            if (!c.getIfIs_n1_set()){

                //prende n1 dalla txt
                double n1 = Double.parseDouble(txtOutput.getText());

                //lo setta come attributo nella classe
                c.setN1(n1);

                //imposta la stringa input a vuota
                //pronta per un nuovo inserimento
                c.setNumbers("");
                c.setIs_n1_set(true);
            }
            else {
                /*double n_ins = Double.parseDouble(txtOutput.getText());
                c.setN1(c.getN1()-n_ins);
                c.setNumbers("");*/
                JOptionPane.showMessageDialog(null, "Errore:\nImpossibile eseguire piu' operazioni di fila!\nRiesegui i calcoli, premendo man mano l'uguale.");
                c = destroy(c);
            }

            //pulisce la textbox
            txtOutput.setText("0");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Errore di inserimento");
        }
    }//GEN-LAST:event_btnMenoActionPerformed
    /**
     * Comportamento all'azione di premere il pulsante
     * @param evt 
     */
    private void btnPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerActionPerformed
        try {
            //imposta la futura modalita' di calcolo
            c.setCalcolo('x');
            //se n1 non e' gia' stato inserito
            if (!c.getIfIs_n1_set()){

                //prende n1 dalla txt
                double n1 = Double.parseDouble(txtOutput.getText());

                //lo setta come attributo nella classe
                c.setN1(n1);

                //imposta la stringa input a vuota
                //pronta per un nuovo inserimento
                c.setNumbers("");
                c.setIs_n1_set(true);
            }
            else {
                JOptionPane.showMessageDialog(null, "Errore:\nImpossibile eseguire piu' operazioni di fila!\nRiesegui i calcoli, premendo man mano l'uguale.");
                c = destroy(c);
            }

            //pulisce la textbox
            txtOutput.setText("0");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Errore di inserimento");
        }
    }//GEN-LAST:event_btnPerActionPerformed
    /**
     * Comportamento all'azione di premere il pulsante
     * @param evt 
     */
    private void btnDivisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisoActionPerformed
        try {
            //imposta la futura modalita' di calcolo
            c.setCalcolo('/');
            //se n1 non e' gia' stato inserito
            if (!c.getIfIs_n1_set()){

                //prende n1 dalla txt
                double n1 = Double.parseDouble(txtOutput.getText());

                //lo setta come attributo nella classe
                c.setN1(n1);

                //imposta la stringa input a vuota
                //pronta per un nuovo inserimento
                c.setNumbers("");
                c.setIs_n1_set(true);
            }
            else {
                JOptionPane.showMessageDialog(null, "Errore:\nImpossibile eseguire piu' operazioni di fila!\nRiesegui i calcoli, premendo man mano l'uguale.");
                c = destroy(c);
            }

            //pulisce la textbox
            txtOutput.setText("0");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Errore di inserimento");
        }
    }//GEN-LAST:event_btnDivisoActionPerformed
    /**
     * Comportamento all'azione di premere il pulsante
     * @param evt 
     */
    private void btnPiuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiuActionPerformed
        try {
            //imposta la futura modalita' di calcolo
            c.setCalcolo('+');
            //se n1 non e' gia' stato inserito
            if (!c.getIfIs_n1_set()){

                //prende n1 dalla txt
                double n1 = Double.parseDouble(txtOutput.getText());

                //lo setta come attributo nella classe
                c.setN1(n1);

                //imposta la stringa input a vuota
                //pronta per un nuovo inserimento
                c.setNumbers("");
                c.setIs_n1_set(true);
            }
            else {
                /*double n_ins = Double.parseDouble(txtOutput.getText());
                c.setN1(c.getN1()+n_ins);
                c.setNumbers("");*/
                JOptionPane.showMessageDialog(null, "Errore:\nImpossibile eseguire piu' operazioni di fila!\nRiesegui i calcoli, premendo man mano l'uguale.");
                c = destroy(c);
            }

            //pulisce la textbox
            txtOutput.setText("0");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Errore di inserimento");
        }
    }//GEN-LAST:event_btnPiuActionPerformed
    /**
     * Comportamento all'azione di premere il pulsante
     * @param evt 
     */
    private void btnUgualeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUgualeActionPerformed
        try {
            //se l'utente ha premuto il tasto uguale,
            //significa che ha inserito il secondo numero.
            //Quindi viene prelevato e inserito come attributo nella classe
            double n2 = Double.parseDouble(txtOutput.getText());
            c.setN2(n2);
            c.setNumbers("");
            c.setIs_n2_set(true);

            //se il secondo numero e' stato preso e se risulta diverso da zero, calcola 
            if (c.getIfIs_n2_set() && c.getN2() != 0){
                    txtOutput.setText(Double.toString(c.calcolo()));
                }
                else {
                    JOptionPane.showMessageDialog(null, "Errore:\nTentata divisione per zero o mancanza di valori inseriti.");
                    c = destroy(c);
                }
            //ri-inizializza tutto l'oggetto
            c = destroy(c);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Errore di inserimento");
        }
        
    }//GEN-LAST:event_btnUgualeActionPerformed
    /**
     * Comportamento all'azione di premere il pulsante
     * @param evt 
     */
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        c = destroy(c);
        txtOutput.setText("0");
    }//GEN-LAST:event_btnClearActionPerformed
    /**
     * Comportamento all'azione di premere il pulsante
     * @param evt 
     */
    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotActionPerformed
        if (txtOutput.getText().indexOf(".") >= 0){
            //se c'e' gia' un punto...
            //non inserisce il punto
        }
        else {
            c.pushNumber(".");
        }
        txtOutput.setText(c.getNumbers());
    }//GEN-LAST:event_btnDotActionPerformed

    private void btnCancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancActionPerformed
        if (txtOutput.getText().length() > 0){
            String rem = txtOutput.getText().substring(0, txtOutput.getText().length() - 1);
            txtOutput.setText(rem);
            c.setNumbers(rem);
        }
    }//GEN-LAST:event_btnCancActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        if (txtOutput.getText().indexOf("-") >= 0){
            String rep = txtOutput.getText().replace('-', '+');
            txtOutput.setText(rep);
        }
        else {
            txtOutput.setText("-"+c.getNumbers());
            //c.setNumbers(min);
        }
    }//GEN-LAST:event_btnMinusActionPerformed

    /**
     * Main
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
            java.util.logging.Logger.getLogger(Calcolatrice_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calcolatrice_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calcolatrice_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calcolatrice_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calcolatrice_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnCanc;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDiviso;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnMeno;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnPer;
    private javax.swing.JButton btnPiu;
    private javax.swing.JButton btnUguale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtOutput;
    // End of variables declaration//GEN-END:variables

}
