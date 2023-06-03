
package tareaprograiipoo;
import java.awt.Color;
public class CalculadoraInterfazGrafica extends javax.swing.JFrame {
    CalculadoraEspecial ce = new CalculadoraEspecial("CASIO", "CIAN", 12, "qw12", "LAMI");
    public CalculadoraInterfazGrafica() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sumabtn = new javax.swing.JButton();
        multiplicarbtn = new javax.swing.JButton();
        raiz = new javax.swing.JButton();
        potenciabtn = new javax.swing.JButton();
        restabtn = new javax.swing.JButton();
        divisionbtn = new javax.swing.JButton();
        limpiarbtn = new javax.swing.JButton();
        resultadotxt = new javax.swing.JTextField();
        numero1 = new javax.swing.JTextField();
        numero2 = new javax.swing.JTextField();
        logaritmobtn = new javax.swing.JButton();
        numeroaleartoriobtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setToolTipText("");

        sumabtn.setText("suma");
        sumabtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sumabtnMousePressed(evt);
            }
        });
        sumabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumabtnActionPerformed(evt);
            }
        });

        multiplicarbtn.setText("multiplicacion");
        multiplicarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                multiplicarbtnMousePressed(evt);
            }
        });

        raiz.setText("raiz cuadrada");
        raiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                raizMousePressed(evt);
            }
        });
        raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizActionPerformed(evt);
            }
        });

        potenciabtn.setText("potencia");
        potenciabtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                potenciabtnMousePressed(evt);
            }
        });

        restabtn.setText("resta");
        restabtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                restabtnMousePressed(evt);
            }
        });
        restabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restabtnActionPerformed(evt);
            }
        });

        divisionbtn.setText("division");
        divisionbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                divisionbtnMousePressed(evt);
            }
        });

        limpiarbtn.setText("CE");
        limpiarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                limpiarbtnMousePressed(evt);
            }
        });

        resultadotxt.setEditable(false);
        resultadotxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        resultadotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadotxtActionPerformed(evt);
            }
        });

        numero1.setForeground(java.awt.Color.lightGray);
        numero1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numero1.setText("Primer Numero");
        numero1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                numero1MousePressed(evt);
            }
        });
        numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero1ActionPerformed(evt);
            }
        });

        numero2.setForeground(java.awt.Color.lightGray);
        numero2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numero2.setText("Segundo Numero");
        numero2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                numero2MousePressed(evt);
            }
        });

        logaritmobtn.setText("logaritmo");
        logaritmobtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logaritmobtnMousePressed(evt);
            }
        });
        logaritmobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logaritmobtnActionPerformed(evt);
            }
        });

        numeroaleartoriobtn.setText("numero aleartorio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(numero2)
                    .addComponent(numero1)
                    .addComponent(resultadotxt)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(sumabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(multiplicarbtn)
                                                .addGap(3, 3, 3)))
                                        .addGap(80, 80, 80))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(logaritmobtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(86, 86, 86)))
                                .addComponent(limpiarbtn))
                            .addComponent(raiz))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(potenciabtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(divisionbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(restabtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numeroaleartoriobtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(resultadotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sumabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(limpiarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logaritmobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroaleartoriobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(multiplicarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(divisionbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(potenciabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raizActionPerformed

    private void restabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restabtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restabtnActionPerformed

    private void limpiarbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarbtnMousePressed
        numero1.setText("");
        numero2.setText("");
        resultadotxt.setText("");
    }//GEN-LAST:event_limpiarbtnMousePressed

    private void resultadotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadotxtActionPerformed

    private void numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero1ActionPerformed

    private void sumabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumabtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sumabtnActionPerformed

    private void sumabtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumabtnMousePressed
       double num1 = Double.parseDouble(numero1.getText());
       double num2 = Double.parseDouble(numero2.getText());
       double resultado = ce.sumar(num1,num2);
      resultadotxt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_sumabtnMousePressed

    private void restabtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restabtnMousePressed
       double num1 = Double.parseDouble(numero1.getText());
       double num2 = Double.parseDouble(numero2.getText());
       double resultado = ce.restar(num1,num2);
      resultadotxt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_restabtnMousePressed

    private void multiplicarbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplicarbtnMousePressed
    double num1 = Double.parseDouble(numero1.getText());
       double num2 = Double.parseDouble(numero2.getText());
       double resultado = ce.multiplicar(num1,num2);
      resultadotxt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_multiplicarbtnMousePressed

    private void divisionbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divisionbtnMousePressed
       double num1 = Double.parseDouble(numero1.getText());
       double num2 = Double.parseDouble(numero2.getText());
       double resultado = ce.dividir(num1,num2);
      resultadotxt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_divisionbtnMousePressed

    private void raizMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_raizMousePressed
        double num1 = Double.parseDouble(numero1.getText());
      double resultado = ce.raizCuadrada(num1);
      resultadotxt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_raizMousePressed

    private void potenciabtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_potenciabtnMousePressed
       double num1 = Double.parseDouble(numero1.getText());
      double num2 = Double.parseDouble(numero2.getText());
      double resultado = ce.calcularPotencia(num1,num2);
      resultadotxt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_potenciabtnMousePressed

    private void logaritmobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logaritmobtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logaritmobtnActionPerformed

    private void logaritmobtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logaritmobtnMousePressed
       double num1 = Double.parseDouble(numero1.getText());
      double resultado = ce.calcularLogaritmo( num1);
      resultadotxt.setText(String.valueOf(resultado));
    }//GEN-LAST:event_logaritmobtnMousePressed

    private void numero1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numero1MousePressed
        if(numero1.getText().equals("Primer Numero")){
         numero1.setText("");
         numero1.setForeground(Color.black);
      }
      if(numero2.getText().equals("Segundo Numero")){
         numero2.setText("Segundo Numero");
         numero2.setForeground(Color.lightGray);
      }
    }//GEN-LAST:event_numero1MousePressed

    private void numero2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numero2MousePressed
      if(numero2.getText().equals("Segundo Numero")){
         numero2.setText("");
         numero2.setForeground(Color.black);
      }
      if(numero1.getText().equals("Primer Numero")){
         numero1.setText("Primer Numero");
         numero1.setForeground(Color.lightGray);
      }    }//GEN-LAST:event_numero2MousePressed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton divisionbtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiarbtn;
    private javax.swing.JButton logaritmobtn;
    private javax.swing.JButton multiplicarbtn;
    private javax.swing.JTextField numero1;
    private javax.swing.JTextField numero2;
    private javax.swing.JButton numeroaleartoriobtn;
    private javax.swing.JButton potenciabtn;
    private javax.swing.JButton raiz;
    private javax.swing.JButton restabtn;
    private javax.swing.JTextField resultadotxt;
    private javax.swing.JButton sumabtn;
    // End of variables declaration//GEN-END:variables
}
