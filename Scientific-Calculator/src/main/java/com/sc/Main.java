/**
 @author cvstunner
**/

package com.sc;

import javax.swing.UIManager;
import com.formdev.flatlaf.FlatDarkLaf;
import java.lang.Math;
import com.algorithm.Dijkstra;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents

    // Graphical Interface
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        display = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        sqrtBtn = new javax.swing.JButton();
        piBtn = new javax.swing.JButton();
        powBtn = new javax.swing.JButton();
        asinBtn = new javax.swing.JButton();
        acosBtn = new javax.swing.JButton();
        atanBtn = new javax.swing.JButton();
        logBtn = new javax.swing.JButton();
        lnBtn = new javax.swing.JButton();
        eBtn = new javax.swing.JButton();
        sinBtn = new javax.swing.JButton();
        cosBtn = new javax.swing.JButton();
        tanBtn = new javax.swing.JButton();
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
        setMinimumSize(new java.awt.Dimension(400, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 500));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setMaximumSize(new java.awt.Dimension(400, 125));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 125));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 125));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        display.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        display.setText("0");
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

        sqrtBtn.setFont(new java.awt.Font("JetBrains Mono", 0, 16)); // NOI18N
        sqrtBtn.setText("√");
        sqrtBtn.setFocusable(false);
        sqrtBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        sqrtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtBtnActionPerformed(evt);
            }
        });
        jPanel3.add(sqrtBtn);

        piBtn.setFont(new java.awt.Font("JetBrains Mono", 0, 16)); // NOI18N
        piBtn.setText("π");
        piBtn.setFocusable(false);
        piBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        piBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piBtnActionPerformed(evt);
            }
        });
        jPanel3.add(piBtn);

        powBtn.setFont(new java.awt.Font("JetBrains Mono", 0, 16)); // NOI18N
        powBtn.setText("^");
        powBtn.setFocusable(false);
        powBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        powBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powBtnActionPerformed(evt);
            }
        });
        jPanel3.add(powBtn);

        asinBtn.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        asinBtn.setText("sin-1");
        asinBtn.setFocusable(false);
        asinBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        asinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asinBtnActionPerformed(evt);
            }
        });
        jPanel3.add(asinBtn);

        acosBtn.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        acosBtn.setText("cos-1");
        acosBtn.setFocusable(false);
        acosBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        acosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acosBtnActionPerformed(evt);
            }
        });
        jPanel3.add(acosBtn);

        atanBtn.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        atanBtn.setText("tan-1");
        atanBtn.setFocusable(false);
        atanBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        atanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atanBtnActionPerformed(evt);
            }
        });
        jPanel3.add(atanBtn);

        logBtn.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        logBtn.setText("log");
        logBtn.setFocusable(false);
        logBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        logBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logBtnActionPerformed(evt);
            }
        });
        jPanel3.add(logBtn);

        lnBtn.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        lnBtn.setText("ln");
        lnBtn.setFocusable(false);
        lnBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        lnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnBtnActionPerformed(evt);
            }
        });
        jPanel3.add(lnBtn);

        eBtn.setFont(new java.awt.Font("JetBrains Mono", 0, 16)); // NOI18N
        eBtn.setText("e");
        eBtn.setFocusable(false);
        eBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        eBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eBtnActionPerformed(evt);
            }
        });
        jPanel3.add(eBtn);

        sinBtn.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        sinBtn.setText("sin");
        sinBtn.setFocusable(false);
        sinBtn.setIconTextGap(0);
        sinBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        sinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinBtnActionPerformed(evt);
            }
        });
        jPanel3.add(sinBtn);

        cosBtn.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        cosBtn.setText("cos");
        cosBtn.setFocusable(false);
        cosBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        cosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosBtnActionPerformed(evt);
            }
        });
        jPanel3.add(cosBtn);

        tanBtn.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        tanBtn.setText("tan");
        tanBtn.setFocusable(false);
        tanBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanBtnActionPerformed(evt);
            }
        });
        jPanel3.add(tanBtn);

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

    // Instance of Dijkstra class
    Dijkstra djk = new Dijkstra(100);
    String exp = "0";

    // Event Handlers    
    private void Btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn0ActionPerformed
        createExp("0", "0");
    }//GEN-LAST:event_Btn0ActionPerformed

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        createExp("1", "1");
    }//GEN-LAST:event_Btn1ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        createExp("2", "2");
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        createExp("3", "3");
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        createExp("4", "4");
    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        createExp("5", "5");
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        createExp("6", "6");
    }//GEN-LAST:event_Btn6ActionPerformed

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
        createExp("7", "7");
    }//GEN-LAST:event_Btn7ActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
        createExp("8", "8");
    }//GEN-LAST:event_Btn8ActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
        createExp("9", "9");
    }//GEN-LAST:event_Btn9ActionPerformed

    private void sumBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumBtnActionPerformed
        ifOperatorRepeated("+", "+");
    }//GEN-LAST:event_sumBtnActionPerformed

    private void subBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subBtnActionPerformed
        ifOperatorRepeated("-", "-");
    }//GEN-LAST:event_subBtnActionPerformed

    private void mulBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulBtnActionPerformed
        ifOperatorRepeated("×", "*");
    }//GEN-LAST:event_mulBtnActionPerformed

    private void divBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divBtnActionPerformed
        ifOperatorRepeated("÷", "/");
    }//GEN-LAST:event_divBtnActionPerformed

    private void dotBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotBtnActionPerformed
        ifOperatorRepeated(".", ".");
    }//GEN-LAST:event_dotBtnActionPerformed

    private void openBracBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openBracBtnActionPerformed
        createExp("(", "(");
    }//GEN-LAST:event_openBracBtnActionPerformed

    private void closeBracBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBracBtnActionPerformed
        createExp(")", ")");
    }//GEN-LAST:event_closeBracBtnActionPerformed
    
    private void sqrtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrtBtnActionPerformed
        createExp("√(", "sqrt(");
    }//GEN-LAST:event_sqrtBtnActionPerformed

    private void piBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piBtnActionPerformed
        ifConstantRepeated("π", "pi");
    }//GEN-LAST:event_piBtnActionPerformed

    private void powBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powBtnActionPerformed
        createExp("^", "^");
    }//GEN-LAST:event_powBtnActionPerformed

    private void sinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinBtnActionPerformed
        createExp("sin(", "sin(");
    }//GEN-LAST:event_sinBtnActionPerformed

    private void cosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosBtnActionPerformed
        createExp("cos(", "cos(");
    }//GEN-LAST:event_cosBtnActionPerformed

    private void tanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanBtnActionPerformed
        createExp("tan(", "tan(");
    }//GEN-LAST:event_tanBtnActionPerformed

    private void asinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asinBtnActionPerformed
        createExp("asin(", "asin(");
    }//GEN-LAST:event_asinBtnActionPerformed

    private void acosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acosBtnActionPerformed
        createExp("acos(", "acos(");
    }//GEN-LAST:event_acosBtnActionPerformed

    private void atanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atanBtnActionPerformed
        createExp("atan(", "atan(");
    }//GEN-LAST:event_atanBtnActionPerformed

    private void logBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logBtnActionPerformed
        createExp("log(", "log(");
    }//GEN-LAST:event_logBtnActionPerformed

    private void lnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnBtnActionPerformed
        createExp("ln(", "ln(");
    }//GEN-LAST:event_lnBtnActionPerformed

    private void eBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eBtnActionPerformed
        ifConstantRepeated("e", "e");
    }//GEN-LAST:event_eBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        if(display.getText().equals("0") || display.getText().length() == 1){
           display.setText("0");
           exp = "0";
        }
        else{
           display.setText(display.getText().substring(0, display.getText().length()-1));
           exp = exp.substring(0, exp.length()-1);
        }
        System.out.println(exp);
    }//GEN-LAST:event_delBtnActionPerformed

    private void ACBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                                       
        if(exp.equals("0")){
           display.setText("0");
           exp = "0";
        }
        else{
           display.setText("0");
           exp = "0";
        }
    }     

    // method to evaluate the generated algebraic expression
    private void equalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalBtnActionPerformed
        String calc = djk.calculate(exp);
        display.setText(calc);
        exp = calc;
    }//GEN-LAST:event_equalBtnActionPerformed

    // Method to create Algebraic expression on user input
    public void createExp(String displayData, String expData){
        if(exp.equals("0") || exp.equals("pi") || exp.equals("e")){
            display.setText(displayData);
            exp = expData;
        }
        else{
            display.replaceSelection(displayData);
            exp += expData;
        }
        System.out.println(exp);
    }

    public void ifOperatorRepeated(String displayData, String expData){
        if(!(exp.endsWith(expData))){
            display.replaceSelection(displayData);
            exp += expData;
        }
        else{
            return;
        }
        System.out.println(exp);
    }

    public void ifConstantRepeated(String displayData, String expData){
        if(exp.equals("0") || exp.equals("pi") || exp.equals("e") || isNum(exp)){
            if (expData.equals("pi")) {
                display.setText("π");
                exp = "pi";
            }
            else if (expData.equals("e")){  
                display.setText("e"); 
                exp = "e"; 
            }
        }
        else{
            if(!(exp.endsWith(expData))){
                display.replaceSelection(displayData);
                exp += expData;
            }
            else{
                return;
            }
        }
        System.out.println(exp);
    }

    // method to check if passed parameter is Number or not 
    public boolean isNum(String str){
        if (str == String.valueOf('\0') || str == ""){
            return false;
        }
        try{
            Double.parseDouble(String.valueOf(str));
        }
        catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel( new FlatDarkLaf());
        } 
        catch(Exception ex) {
            System.err.println("Failed to initialize LaF");
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
    private javax.swing.JButton acosBtn;
    private javax.swing.JButton asinBtn;
    private javax.swing.JButton atanBtn;
    private javax.swing.JButton closeBracBtn;
    private javax.swing.JButton cosBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JTextField display;
    private javax.swing.JButton divBtn;
    private javax.swing.JButton dotBtn;
    private javax.swing.JButton eBtn;
    private javax.swing.JButton equalBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton lnBtn;
    private javax.swing.JButton logBtn;
    private javax.swing.JButton mulBtn;
    private javax.swing.JButton openBracBtn;
    private javax.swing.JButton piBtn;
    private javax.swing.JButton powBtn;
    private javax.swing.JButton sinBtn;
    private javax.swing.JButton sqrtBtn;
    private javax.swing.JButton subBtn;
    private javax.swing.JButton sumBtn;
    private javax.swing.JButton tanBtn;
    // End of variables declaration//GEN-END:variables
}