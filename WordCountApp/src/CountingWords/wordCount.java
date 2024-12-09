/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CountingWords;

import CountingWords.WordCount_1;
import CountingWords.WordTool;

/**
 *
 * @author ACER
 */
public class wordCount extends javax.swing.JFrame {

    /**
     * Creates new form wordCount
     */
    public wordCount() {
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

        wrdCountPanel = new javax.swing.JPanel();
        wrdLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        wrdTextArea = new javax.swing.JTextArea();
        wrdCountButton = new javax.swing.JButton();
        totalCountTextField = new javax.swing.JTextField();
        totalWrsLabel = new javax.swing.JLabel();
        clearBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        wrdCountPanel.setBackground(new java.awt.Color(255, 232, 147));

        wrdLabel.setFont(new java.awt.Font("Mungil", 0, 18)); // NOI18N
        wrdLabel.setText("Type your words");

        wrdTextArea.setColumns(20);
        wrdTextArea.setRows(5);
        jScrollPane1.setViewportView(wrdTextArea);

        wrdCountButton.setBackground(new java.awt.Color(255, 153, 153));
        wrdCountButton.setFont(new java.awt.Font("Mungil", 0, 24)); // NOI18N
        wrdCountButton.setText("Count your words");
        wrdCountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wrdCountButtonActionPerformed(evt);
            }
        });

        totalWrsLabel.setFont(new java.awt.Font("Mungil", 0, 18)); // NOI18N
        totalWrsLabel.setText("Total words");

        clearBtn.setBackground(new java.awt.Color(251, 180, 165));
        clearBtn.setFont(new java.awt.Font("Mungil", 0, 24)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(251, 158, 198));
        exitBtn.setFont(new java.awt.Font("Mungil", 0, 24)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Mungil", 0, 48)); // NOI18N
        titleLabel.setText("Word Count Tool");

        javax.swing.GroupLayout wrdCountPanelLayout = new javax.swing.GroupLayout(wrdCountPanel);
        wrdCountPanel.setLayout(wrdCountPanelLayout);
        wrdCountPanelLayout.setHorizontalGroup(
            wrdCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wrdCountPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(wrdCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(wrdLabel)
                    .addComponent(totalWrsLabel))
                .addGap(18, 18, 18)
                .addGroup(wrdCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(wrdCountPanelLayout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 70, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wrdCountPanelLayout.createSequentialGroup()
                        .addGroup(wrdCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(wrdCountButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(32, 32, 32))
                    .addGroup(wrdCountPanelLayout.createSequentialGroup()
                        .addGroup(wrdCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(totalCountTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        wrdCountPanelLayout.setVerticalGroup(
            wrdCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wrdCountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(wrdCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wrdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(wrdCountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(wrdCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalWrsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalCountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(wrdCountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wrdCountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wrdCountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void wrdCountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wrdCountButtonActionPerformed
       String text = wrdTextArea.getText();
        
        if (!WordCount_1.isValidInput(text)) {
            totalCountTextField.setText("Invalid input!");
            return;
        }
        
        WordTool wordTool = new WordCount_1(text);
        int totalWords = wordTool.countWords();
        totalCountTextField.setText(String.valueOf(totalWords));

    }//GEN-LAST:event_wrdCountButtonActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        wrdTextArea.setText("");
        totalCountTextField.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

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
            java.util.logging.Logger.getLogger(wordCount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(wordCount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(wordCount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(wordCount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wordCount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField totalCountTextField;
    private javax.swing.JLabel totalWrsLabel;
    private javax.swing.JButton wrdCountButton;
    private javax.swing.JPanel wrdCountPanel;
    private javax.swing.JLabel wrdLabel;
    private javax.swing.JTextArea wrdTextArea;
    // End of variables declaration//GEN-END:variables
}