/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author CVSTUNNER
 */
import javax.swing.UIManager;
import com.formdev.flatlaf.FlatDarkLaf;
// import com.google.gson.*;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }
    Dijkstra djk = new Dijkstra(100);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        display = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Btn7 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        ACBtn = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        mulBtn = new javax.swing.JButton();
        divBtn = new javax.swing.JButton();
        Btn1 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        sumBtn = new javax.swing.JButton();
        subBtn = new javax.swing.JButton();
        Btn0 = new javax.swing.JButton();
        dotBtn = new javax.swing.JButton();
        openBracBtn = new javax.swing.JButton();
        closeBracBtn = new javax.swing.JButton();
        equalBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scientific Calculator");
        setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(400, 500));
        setMinimumSize(new java.awt.Dimension(400, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 500));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setMaximumSize(new java.awt.Dimension(400, 125));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 125));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 125));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        display.setEditable(false);
        display.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        display.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        display.setDisabledTextColor(new java.awt.Color(187, 187, 187));
        display.setFocusable(false);
        jPanel1.add(display);

        jPanel1.setBorder(new javax.swing.border.EmptyBorder(10, 10, 0, 10));

        jPanel5.add(jPanel1);

        jPanel2.setMaximumSize(new java.awt.Dimension(400, 375));
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 375));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 375));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        jPanel3.setMaximumSize(new java.awt.Dimension(400, 80));
        jPanel3.setMinimumSize(new java.awt.Dimension(400, 80));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 80));
        jPanel3.setLayout(new java.awt.GridLayout(2, 6, 10, 10));

        jButton1.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jButton1.setText("Sin");
        jButton1.setFocusable(false);
        jButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        jButton2.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jButton2.setText("Sin");
        jButton2.setFocusable(false);
        jButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jButton3.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jButton3.setText("Sin");
        jButton3.setFocusable(false);
        jButton3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);

        jButton4.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jButton4.setText("sin-1");
        jButton4.setFocusable(false);
        jButton4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);

        jButton5.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jButton5.setText("cos-1");
        jButton5.setFocusable(false);
        jButton5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);

        jButton6.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jButton6.setText("tan-1");
        jButton6.setFocusable(false);
        jButton6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);

        jButton7.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jButton7.setText("Sin");
        jButton7.setFocusable(false);
        jButton7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);

        jButton8.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jButton8.setText("Sin");
        jButton8.setFocusable(false);
        jButton8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8);

        jButton9.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jButton9.setText("Sin");
        jButton9.setFocusable(false);
        jButton9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9);

        jButton10.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jButton10.setText("sin");
        jButton10.setFocusable(false);
        jButton10.setIconTextGap(0);
        jButton10.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10);

        jButton11.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jButton11.setText("cos");
        jButton11.setFocusable(false);
        jButton11.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11);

        jButton12.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jButton12.setText("tan");
        jButton12.setFocusable(false);
        jButton12.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton12);

        jPanel3.setBorder(new javax.swing.border.EmptyBorder(10, 10, 10, 10));

        jPanel2.add(jPanel3);

        jPanel4.setMaximumSize(new java.awt.Dimension(400, 295));
        jPanel4.setMinimumSize(new java.awt.Dimension(400, 295));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 295));
        jPanel4.setLayout(new java.awt.GridLayout(4, 5, 10, 10));

        Btn7.setFont(new java.awt.Font("JetBrains Mono", 1, 32)); // NOI18N
        Btn7.setText("7");
        Btn7.setFocusable(false);
        Btn7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });
        jPanel4.add(Btn7);

        Btn8.setFont(new java.awt.Font("JetBrains Mono", 1, 32)); // NOI18N
        Btn8.setText("8");
        Btn8.setFocusable(false);
        Btn8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });
        jPanel4.add(Btn8);

        Btn9.setFont(new java.awt.Font("JetBrains Mono", 1, 32)); // NOI18N
        Btn9.setText("9");
        Btn9.setFocusable(false);
        Btn9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });
        jPanel4.add(Btn9);

        delBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 28)); // NOI18N
        delBtn.setText("DEL");
        delBtn.setFocusable(false);
        delBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        delBtn.setMaximumSize(new java.awt.Dimension(52, 40));
        delBtn.setMinimumSize(new java.awt.Dimension(52, 40));
        delBtn.setPreferredSize(new java.awt.Dimension(52, 40));
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });
        jPanel4.add(delBtn);

        ACBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 28)); // NOI18N
        ACBtn.setText("AC");
        ACBtn.setFocusable(false);
        ACBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ACBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACBtnActionPerformed(evt);
            }
        });
        jPanel4.add(ACBtn);

        Btn4.setFont(new java.awt.Font("JetBrains Mono", 1, 32)); // NOI18N
        Btn4.setText("4");
        Btn4.setFocusable(false);
        Btn4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });
        jPanel4.add(Btn4);

        Btn5.setFont(new java.awt.Font("JetBrains Mono", 1, 32)); // NOI18N
        Btn5.setText("5");
        Btn5.setFocusable(false);
        Btn5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });
        jPanel4.add(Btn5);

        Btn6.setFont(new java.awt.Font("JetBrains Mono", 1, 32)); // NOI18N
        Btn6.setText("6");
        Btn6.setFocusable(false);
        Btn6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });
        jPanel4.add(Btn6);

        mulBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 28)); // NOI18N
        mulBtn.setText("x");
        mulBtn.setFocusable(false);
        mulBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        mulBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulBtnActionPerformed(evt);
            }
        });
        jPanel4.add(mulBtn);

        divBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 32)); // NOI18N
        divBtn.setText("÷");
        divBtn.setFocusable(false);
        divBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        divBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divBtnActionPerformed(evt);
            }
        });
        jPanel4.add(divBtn);

        Btn1.setFont(new java.awt.Font("JetBrains Mono", 1, 32)); // NOI18N
        Btn1.setText("1");
        Btn1.setFocusable(false);
        Btn1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });
        jPanel4.add(Btn1);

        Btn2.setFont(new java.awt.Font("JetBrains Mono", 1, 32)); // NOI18N
        Btn2.setText("2");
        Btn2.setFocusable(false);
        Btn2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });
        jPanel4.add(Btn2);

        Btn3.setFont(new java.awt.Font("JetBrains Mono", 1, 32)); // NOI18N
        Btn3.setText("3");
        Btn3.setFocusable(false);
        Btn3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });
        jPanel4.add(Btn3);

        sumBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 32)); // NOI18N
        sumBtn.setText("+");
        sumBtn.setFocusable(false);
        sumBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        sumBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumBtnActionPerformed(evt);
            }
        });
        jPanel4.add(sumBtn);

        subBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 32)); // NOI18N
        subBtn.setText("-");
        subBtn.setFocusable(false);
        subBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        subBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subBtnActionPerformed(evt);
            }
        });
        jPanel4.add(subBtn);

        Btn0.setFont(new java.awt.Font("JetBrains Mono", 1, 32)); // NOI18N
        Btn0.setText("0");
        Btn0.setFocusable(false);
        Btn0.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn0ActionPerformed(evt);
            }
        });
        jPanel4.add(Btn0);

        dotBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 32)); // NOI18N
        dotBtn.setText(".");
        dotBtn.setFocusable(false);
        dotBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        dotBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotBtnActionPerformed(evt);
            }
        });
        jPanel4.add(dotBtn);

        openBracBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 32)); // NOI18N
        openBracBtn.setText("(");
        openBracBtn.setFocusable(false);
        openBracBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        openBracBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBracBtnActionPerformed(evt);
            }
        });
        jPanel4.add(openBracBtn);

        closeBracBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 32)); // NOI18N
        closeBracBtn.setText(")");
        closeBracBtn.setFocusable(false);
        closeBracBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        closeBracBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBracBtnActionPerformed(evt);
            }
        });
        jPanel4.add(closeBracBtn);

        equalBtn.setFont(new java.awt.Font("JetBrains Mono", 1, 32)); // NOI18N
        equalBtn.setText("=");
        equalBtn.setFocusable(false);
        equalBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        equalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalBtnActionPerformed(evt);
            }
        });
        jPanel4.add(equalBtn);

        jPanel4.setBorder(new javax.swing.border.EmptyBorder(0, 10, 20, 10));

        jPanel2.add(jPanel4);

        jPanel5.add(jPanel2);

        getContentPane().add(jPanel5);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
        if(display.getText() == "0"){
           display.setText("7");
        }
        else{
           display.replaceSelection("7");
        }
    }//GEN-LAST:event_Btn7ActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
        if(display.getText() == "0"){
           display.setText("8");
        }
        else{
           display.replaceSelection("8");
        }
    }//GEN-LAST:event_Btn8ActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
        if(display.getText() == "0"){
           display.setText("9");
        }
        else{
           display.replaceSelection("9");
        }
    }//GEN-LAST:event_Btn9ActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delBtnActionPerformed

    private void ACBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                                            
        if(display.getText() == "0"){
           display.setText("0");
        }
        else{
           display.setText("");
        }
    }                                                     
    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        if(display.getText() == "0"){
           display.setText("4");
        }
        else{
           display.replaceSelection("4");
        }
    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        if(display.getText() == "0"){
           display.setText("5");
        }
        else{
           display.replaceSelection("5");
        }
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        if(display.getText() == "0"){
           display.setText("6");
        }
        else{
           display.replaceSelection("6");
        }
    }//GEN-LAST:event_Btn6ActionPerformed

    private void mulBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulBtnActionPerformed
        if(display.getText() == "0"){
           display.setText("*");
        }
        else{
           display.replaceSelection("*");
        }
    }//GEN-LAST:event_mulBtnActionPerformed

    private void divBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divBtnActionPerformed
        if(display.getText() == "0"){
           display.setText("/");
        }
        else{
           display.replaceSelection("/");
        }
    }//GEN-LAST:event_divBtnActionPerformed

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        System.out.println(display.getText());
        if(display.getText() == "0"){
            display.setText("1");
        }
        else if(display.getText() != "0"){
            display.replaceSelection("1");
        }
    }//GEN-LAST:event_Btn1ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        if(display.getText() == "0"){
           display.setText("2");
        }
        else{
           display.replaceSelection("2");
        }
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        if(display.getText() == "0"){
           display.setText("3");
        }
        else{
           display.replaceSelection("3");
        }
    }//GEN-LAST:event_Btn3ActionPerformed

    private void sumBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumBtnActionPerformed
        if(display.getText() == "0"){
           display.setText("+");
        }
        else{
           display.replaceSelection("+");
        }
    }//GEN-LAST:event_sumBtnActionPerformed

    private void subBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subBtnActionPerformed
        if(display.getText() == "0"){
           display.setText("-");
        }
        else{
           display.replaceSelection("-");
        }
    }//GEN-LAST:event_subBtnActionPerformed

    private void Btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn0ActionPerformed
        if(display.getText() == "0"){
           display.setText("0");
        }
        else{
           display.replaceSelection("0");
        }
    }//GEN-LAST:event_Btn0ActionPerformed

    private void dotBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotBtnActionPerformed
        if(display.getText() == "0"){
           display.setText(".");
        }
        else{
            int len = (display.getText()).length();
            if(!(display.getText()).substring(len-1).equals(".")){
                display.replaceSelection(".");
            }
            else{
                return;
            }
        }
    }//GEN-LAST:event_dotBtnActionPerformed

    private void openBracBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openBracBtnActionPerformed
        if(display.getText() == "0"){
           display.setText("(");
        }
        else{
           display.replaceSelection("(");
        }
    }//GEN-LAST:event_openBracBtnActionPerformed

    private void closeBracBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBracBtnActionPerformed
        if(display.getText() == "0"){
           display.setText(")");
        }
        else{
           display.replaceSelection(")");
        }
    }//GEN-LAST:event_closeBracBtnActionPerformed

    private void equalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalBtnActionPerformed
        String calc = djk.calculate(display.getText());
        display.setText(calc);
    }//GEN-LAST:event_equalBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
    UIManager.setLookAndFeel( new FlatDarkLaf() );
} catch( Exception ex ) {
    System.err.println( "Failed to initialize LaF" );
}
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACBtn;
    private javax.swing.JButton Btn0;
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JButton closeBracBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JTextField display;
    private javax.swing.JButton divBtn;
    private javax.swing.JButton dotBtn;
    private javax.swing.JButton equalBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton mulBtn;
    private javax.swing.JButton openBracBtn;
    private javax.swing.JButton subBtn;
    private javax.swing.JButton sumBtn;
    // End of variables declaration//GEN-END:variables
}
