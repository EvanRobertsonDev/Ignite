/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ignite;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author evrob0095
 */
public class Ignite extends javax.swing.JFrame {

    /**
     * Creates new form Ignite
     */
    public Ignite() {
        initComponents();
        Strats.setVisible(false);
        Tips.setVisible(false);
        Start.setVisible(true);
        CSGO.setVisible(false);
        csgoStratMaker.setVisible(false);
        customArea.setLineWrap(true);
        customArea.setWrapStyleWord(true);
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
        backButton.setVisible(true);
        homeButton.setVisible(true);
    }
    int page = 0;
    int press = 2;
    boolean isT = true;
    int csCount = 10;
    String Title;
    String Strat;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        Start = new javax.swing.JPanel();
        stratsButton = new javax.swing.JButton();
        ignite = new javax.swing.JLabel();
        tipsButton = new javax.swing.JButton();
        adspace = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        nightMode = new javax.swing.JButton();
        Tips = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        games1 = new javax.swing.JLabel();
        CSGO = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        Strats = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        games2 = new javax.swing.JLabel();
        csgoStratMaker = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        customText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        customArea = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();

        jButton7.setText("jButton7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 40, 40));

        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        Start.setBackground(new java.awt.Color(255, 255, 255));
        Start.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stratsButton.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 24)); // NOI18N
        stratsButton.setText("Strats");
        stratsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stratsButtonActionPerformed(evt);
            }
        });
        Start.add(stratsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 130, 40));

        ignite.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 36)); // NOI18N
        ignite.setText("Ignite");
        Start.add(ignite, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        tipsButton.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 24)); // NOI18N
        tipsButton.setText("Tips");
        tipsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipsButtonActionPerformed(evt);
            }
        });
        Start.add(tipsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 130, 40));

        adspace.setVisible(true);
        adspace.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 18)); // NOI18N
        jLabel1.setText("OPEN ADSPACE AVAILABLE");
        adspace.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 14));

        Start.add(adspace, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 280, 80));

        nightMode.setText("Dark/Day");
        nightMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nightModeActionPerformed(evt);
            }
        });
        Start.add(nightMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        getContentPane().add(Start, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Tips.setBackground(new java.awt.Color(255, 255, 255));
        Tips.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Don't Starve");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Tips.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 180, 40));

        jButton5.setText("CS:GO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Tips.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 180, 40));

        jButton6.setText("Rainbow Six: Seige");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Tips.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 180, 40));

        jButton8.setText("PUBG");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Tips.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 180, 40));

        jButton9.setText("Terraria");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        Tips.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 180, 40));

        jButton10.setText("Stardew Valley");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        Tips.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 180, 40));

        games1.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 36)); // NOI18N
        games1.setText("Games");
        Tips.add(games1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        getContentPane().add(Tips, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 420));

        CSGO.setBackground(new java.awt.Color(255, 255, 255));
        CSGO.setForeground(new java.awt.Color(255, 255, 255));
        CSGO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "T", "CT" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        CSGO.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 80, -1));

        jLabel3.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 24)); // NOI18N
        jLabel3.setText("Counter Strike");
        CSGO.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        CSGO.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 120, 30));

        jLabel5.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 18)); // NOI18N
        jLabel5.setText("Team");
        CSGO.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 18)); // NOI18N
        jLabel6.setText("Default");
        CSGO.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 180, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Click Generate to get a strat");
        jTextArea1.setToolTipText("");
        jTextArea1.setBorder(null);
        jTextArea1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        CSGO.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 100));

        jButton3.setText("Create own strat");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        CSGO.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 320, 120, 30));

        getContentPane().add(CSGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 420));

        Strats.setBackground(new java.awt.Color(255, 255, 255));
        Strats.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton11.setText("Don't Starve");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        Strats.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 180, 40));

        jButton12.setText("CS:GO");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        Strats.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 180, 40));

        jButton13.setText("Rainbow Six: Seige");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        Strats.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 180, 40));

        jButton14.setText("PUBG");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        Strats.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 180, 40));

        jButton15.setText("Terraria");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        Strats.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 180, 40));

        jButton16.setText("Stardew Valley");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        Strats.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 180, 40));

        games2.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 36)); // NOI18N
        games2.setText("Games");
        Strats.add(games2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        getContentPane().add(Strats, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 420));

        csgoStratMaker.setBackground(new java.awt.Color(255, 255, 255));
        csgoStratMaker.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 18)); // NOI18N
        jLabel2.setText("Enter a strat");
        csgoStratMaker.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 24)); // NOI18N
        jLabel4.setText("Strat Maker");
        csgoStratMaker.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));
        csgoStratMaker.add(customText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 170, -1));

        jLabel7.setFont(new java.awt.Font("Myriad Web Pro Condensed", 0, 18)); // NOI18N
        jLabel7.setText("Enter a title");
        csgoStratMaker.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setHorizontalScrollBar(null);

        customArea.setColumns(20);
        customArea.setRows(5);
        jScrollPane2.setViewportView(customArea);

        csgoStratMaker.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 170, 110));

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        csgoStratMaker.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        jButton17.setText("Create");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        csgoStratMaker.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        getContentPane().add(csgoStratMaker, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipsButtonActionPerformed
        Start.setVisible(false);
        Tips.setVisible(true);
        page = page +1;
    }//GEN-LAST:event_tipsButtonActionPerformed

    private void nightModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nightModeActionPerformed
        if (press == 1){
            Start.setBackground(Color.BLACK);
            ignite.setForeground(Color.white);
            press = 2;
        }
        else if (press == 2){
            Start.setBackground(Color.WHITE);
            ignite.setForeground(Color.black);
            press = 1;
        }

    }//GEN-LAST:event_nightModeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (isT = true) {
            int stratInt = (int)Math.round(Math.random()*csCount+1);
            if (stratInt == 1) {
                jLabel6.setText("Nerf Glock");
                jTextArea1.setText("5 Terrorists, 5 Glocks"
                        + " \n (Glock Only)");
            }
            if (stratInt == 2) {
                jLabel6.setText("True Auto Sniper");
                jTextArea1.setText("All players must buy auto shotguns");
            }
            if (stratInt == 3) {
                jLabel6.setText("Rush A all day");
                jTextArea1.setText("Rush the A bombsite until you lose");
            }
            if (stratInt == 4) {
                jLabel6.setText("Laser Show");
                jTextArea1.setText("All 5 players must buy a negev and"
                        + "\n move together in a group. When "
                        + "\n an enemy is spotted everyone"
                        + "\n must fire their negev at the enemy "
                        + "\n whilst trying not to shoot teammates");
            }
            if (stratInt == 5) {
                jLabel6.setText("Reverse");
                jTextArea1.setText("Can only move backwards");
            }
            if (stratInt == 6) {
                jLabel6.setText("Left Handed");
                jTextArea1.setText("Change yor move keys to I J K L "
                        + "\n and use your mouse with "
                        + "\n your left hand");
            }
            if (stratInt == 7) {
                jLabel6.setText("Aimlessly Shooting");
                jTextArea1.setText("Open console and type "
                        + "\n cl_crosshairsize 0 Click enter"
                        + "\n and play a round without a "
                        + "\n crosshair.");
            }
            if (stratInt == 8) {
                jLabel6.setText("Blind");
                jTextArea1.setText("Turn off your monitor and "
                        + "\n have a friend attempt to "
                        + "\n guide you around");
            }
            if (stratInt == 9) {
                jLabel6.setText("Sneaky Beaky Like");
                jTextArea1.setText("Bomb goes alone to B site"
                        + "\n while the rest all go to A site"
                        + "\n as a distraction.");
            }
            if (stratInt == 10) {
                jLabel6.setText("Soviet Tactics");
                jTextArea1.setText("Rush B");
            }
            if (stratInt > 10) {
                jLabel6.setText(Title);
                jTextArea1.setText(Strat);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        Strats.setVisible(false);
        Tips.setVisible(false);
        Start.setVisible(false);
        CSGO.setVisible(true);
        page = page +1;
    }//GEN-LAST:event_jButton12ActionPerformed

    private void stratsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stratsButtonActionPerformed
       Start.setVisible(false);
       Strats.setVisible(true);
       page = page +1;
    }//GEN-LAST:event_stratsButtonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedIndex() == 0) {
            isT = true;
        }
        else {
            isT = false;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        csgoStratMaker.setVisible(true);
        CSGO.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        csgoStratMaker.setVisible(false);
        CSGO.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        Title = customText.getText();
        Strat = customArea.getText();
        csCount = csCount + 1;
        csgoStratMaker.setVisible(false);
        CSGO.setVisible(true);
        
        
    }//GEN-LAST:event_jButton17ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        if (page >= 0) {
            page = page -1;
        }
        else {
        
        }
        if (page == 0) {
            Strats.setVisible(false);
            Tips.setVisible(false);
            Start.setVisible(true);
            CSGO.setVisible(false);
            csgoStratMaker.setVisible(false);
        }
        if (page == 1) {
            Strats.setVisible(true);
            Tips.setVisible(false);
            Start.setVisible(false);
            CSGO.setVisible(false);
            csgoStratMaker.setVisible(false);
        }
       
    }//GEN-LAST:event_backButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        page = 0;
        Strats.setVisible(false);
        Tips.setVisible(false);
        Start.setVisible(true);
        CSGO.setVisible(false);
        csgoStratMaker.setVisible(false);
    }//GEN-LAST:event_homeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Ignite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ignite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ignite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ignite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ignite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CSGO;
    private javax.swing.JPanel Start;
    private javax.swing.JPanel Strats;
    private javax.swing.JPanel Tips;
    private javax.swing.JInternalFrame adspace;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel csgoStratMaker;
    private javax.swing.JTextArea customArea;
    private javax.swing.JTextField customText;
    private javax.swing.JLabel games1;
    private javax.swing.JLabel games2;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel ignite;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton nightMode;
    private javax.swing.JButton stratsButton;
    private javax.swing.JButton tipsButton;
    // End of variables declaration//GEN-END:variables
}
