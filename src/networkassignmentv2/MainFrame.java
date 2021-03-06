/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networkassignmentv2;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author KRIT
 */
public class MainFrame extends javax.swing.JFrame {
    private String msg;
    private String target;
    private int port;
    private String replyMsg;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        ButtonGroup buttonGroup = new ButtonGroup();
        typeTCPRadioBtn.setSelected(true);
        buttonGroup.add(typeTCPRadioBtn);
        buttonGroup.add(typeUDPRadioBtn);
        msg = "";
        target = "";
        port = 0;
        replyMsg = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        clientPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        targetLabel = new javax.swing.JLabel();
        targetTxt = new javax.swing.JTextField();
        typeTCPRadioBtn = new javax.swing.JRadioButton();
        typeLabel = new javax.swing.JLabel();
        typeUDPRadioBtn = new javax.swing.JRadioButton();
        portLabel = new javax.swing.JLabel();
        portTxt = new javax.swing.JTextField();
        contentLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentTxtArea = new javax.swing.JTextArea();
        sendBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        statusTxtArea = new javax.swing.JTextArea();
        statusLabel = new javax.swing.JLabel();
        hostPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        hostPortLabel = new javax.swing.JLabel();
        hostPortText = new javax.swing.JTextField();
        hostRandomBtn = new javax.swing.JButton();
        hostReplyLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        hostReplyTextArea = new javax.swing.JTextArea();
        hostStartBtn = new javax.swing.JButton();
        hostTypeTCPRBtn = new javax.swing.JRadioButton();
        hostTypeUDPRBtn = new javax.swing.JRadioButton();
        hostTypeLabel = new javax.swing.JLabel();
        hostStatusLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        hostStatusTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Packet Sender & Receiver");

        targetLabel.setText("Target");

        typeTCPRadioBtn.setText("TCP");

        typeLabel.setText("Type");

        typeUDPRadioBtn.setText("UDP");

        portLabel.setText("Port");

        contentLabel.setText("Content");

        contentTxtArea.setColumns(20);
        contentTxtArea.setRows(5);
        jScrollPane1.setViewportView(contentTxtArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(targetLabel)
                        .addGap(29, 29, 29)
                        .addComponent(targetTxt))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(portLabel)
                                .addGap(41, 41, 41)
                                .addComponent(portTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(typeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(typeTCPRadioBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(typeUDPRadioBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(contentLabel)
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(targetLabel)
                    .addComponent(targetTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(portLabel)
                    .addComponent(portTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLabel)
                    .addComponent(typeTCPRadioBtn)
                    .addComponent(typeUDPRadioBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contentLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sendBtn.setText("Send");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });

        statusTxtArea.setColumns(20);
        statusTxtArea.setRows(5);
        jScrollPane2.setViewportView(statusTxtArea);

        statusLabel.setText("Status");

        javax.swing.GroupLayout clientPanelLayout = new javax.swing.GroupLayout(clientPanel);
        clientPanel.setLayout(clientPanelLayout);
        clientPanelLayout.setHorizontalGroup(
            clientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, clientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(clientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(clientPanelLayout.createSequentialGroup()
                        .addComponent(statusLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sendBtn)))
                .addContainerGap())
        );
        clientPanelLayout.setVerticalGroup(
            clientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(clientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusLabel)
                    .addComponent(sendBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Client", clientPanel);

        hostPortLabel.setText("Port");

        hostRandomBtn.setText("Random");
        hostRandomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostRandomBtnActionPerformed(evt);
            }
        });

        hostReplyLabel.setText("Reply message");

        hostReplyTextArea.setColumns(20);
        hostReplyTextArea.setRows(5);
        jScrollPane3.setViewportView(hostReplyTextArea);

        hostStartBtn.setText("Start");
        hostStartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostStartBtnActionPerformed(evt);
            }
        });

        hostTypeTCPRBtn.setText("TCP");

        hostTypeUDPRBtn.setText("UDP");

        hostTypeLabel.setText("Type");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(hostPortLabel)
                        .addGap(18, 18, 18)
                        .addComponent(hostPortText, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hostRandomBtn))
                    .addComponent(hostReplyLabel))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hostTypeTCPRBtn)
                            .addComponent(hostTypeLabel)
                            .addComponent(hostTypeUDPRBtn)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hostStartBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hostPortLabel)
                    .addComponent(hostPortText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hostRandomBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(hostReplyLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(hostTypeLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(hostTypeTCPRBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hostTypeUDPRBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hostStartBtn)))
                .addContainerGap())
        );

        hostStatusLabel.setText("Status");

        hostStatusTextArea.setColumns(20);
        hostStatusTextArea.setRows(5);
        jScrollPane4.setViewportView(hostStatusTextArea);

        javax.swing.GroupLayout hostPanelLayout = new javax.swing.GroupLayout(hostPanel);
        hostPanel.setLayout(hostPanelLayout);
        hostPanelLayout.setHorizontalGroup(
            hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hostPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hostPanelLayout.createSequentialGroup()
                        .addComponent(hostStatusLabel)
                        .addContainerGap(312, Short.MAX_VALUE))
                    .addGroup(hostPanelLayout.createSequentialGroup()
                        .addGroup(hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        hostPanelLayout.setVerticalGroup(
            hostPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hostPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hostStatusLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Host", hostPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void loadHostData(){
        try {
            this.port = Integer.parseInt(hostPortText.getText());
            this.replyMsg = hostReplyTextArea.getText();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Host data is/are invalid", "error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void loadClientData(){
        try {
            this.port = Integer.parseInt(portTxt.getText());
            this.target = targetTxt.getText();
            this.msg = contentTxtArea.getText();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Data is/are invalid", "error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void validateMsg() throws Exception{
        try{
            if(Integer.parseInt(msg) > Math.pow(2, 32) || Integer.parseInt(msg)<0){
                throw new Exception("Message is invalid");
            }
            this.msg = Integer.parseInt(msg)+"";
        }
        catch(Exception e){            
            throw new Exception("Message is invalid");
        }
    }
    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        try {
            loadClientData();
            validateMsg();
            if(typeTCPRadioBtn.isSelected()){
                clientViaTCP();
            }
            else{
                clientViaUDP();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(this, "Message is invalid", "error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_sendBtnActionPerformed

    private void hostStartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostStartBtnActionPerformed
        loadHostData();
        if(hostTypeTCPRBtn.isSelected() && hostTypeUDPRBtn.isSelected()){
            hostViaTCP();
            hostViaUDP();
        }
        else if(hostTypeTCPRBtn.isSelected()){
            hostViaTCP();
        }
        else if(hostTypeUDPRBtn.isSelected()){
            hostViaUDP();
        }
    }//GEN-LAST:event_hostStartBtnActionPerformed

    private void hostRandomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostRandomBtnActionPerformed
        int temp = (int)(Math.random()*Math.pow(2, 16))-1;
        if(temp == -1){
            temp = 0;
        }
        hostPortText.setText((temp)+"");
    }//GEN-LAST:event_hostRandomBtnActionPerformed
    private void clientViaTCP(){
        ClientTCP c = new ClientTCP(target, port, msg, this);
        Main.clientThread = new Thread( new Runnable() {

            @Override
            public void run() {
                c.send();
            }
        });
        Main.clientThread.start();
    }
    private void clientViaUDP(){
            ClientUDP c = new ClientUDP(target, port, msg, this);
            Main.clientThread2 = new Thread( new Runnable() {

            @Override
            public void run() {
                c.send();
            }
        });
        Main.clientThread2.start();
    }
    private void hostViaUDP(){
        ServerUDP s  = new ServerUDP(port,this);
        Main.hostThread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                s.setAnswer(replyMsg);
                s.run();
            }
        });
        Main.hostThread2.start();
    }
    private void hostViaTCP(){
        ServerTCP s = new ServerTCP(port,this);
        Main.hostThread = new Thread( new Runnable() {

            @Override
            public void run() {
                s.setAnswer(replyMsg);
                s.run();
            }
        });
        Main.hostThread.start();
        
    }

    public void setReplyMsg(String replyMsg) {
        this.replyMsg = replyMsg;
    }

    public String getHostStatusTextArea() {
        return hostStatusTextArea.getText();
    }

    public void setHostStatusTextArea(String t) {
        this.hostStatusTextArea.setText(t);
    }

    public String getStatusTxtArea() {
        return statusTxtArea.getText();
    }

    public void setStatusTxtArea(String t) {
        this.statusTxtArea.setText(t);
    }
    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel clientPanel;
    private javax.swing.JLabel contentLabel;
    private javax.swing.JTextArea contentTxtArea;
    private javax.swing.JPanel hostPanel;
    private javax.swing.JLabel hostPortLabel;
    private javax.swing.JTextField hostPortText;
    private javax.swing.JButton hostRandomBtn;
    private javax.swing.JLabel hostReplyLabel;
    private javax.swing.JTextArea hostReplyTextArea;
    private javax.swing.JButton hostStartBtn;
    private javax.swing.JLabel hostStatusLabel;
    private javax.swing.JTextArea hostStatusTextArea;
    private javax.swing.JLabel hostTypeLabel;
    private javax.swing.JRadioButton hostTypeTCPRBtn;
    private javax.swing.JRadioButton hostTypeUDPRBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel portLabel;
    private javax.swing.JTextField portTxt;
    private javax.swing.JButton sendBtn;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTextArea statusTxtArea;
    private javax.swing.JLabel targetLabel;
    private javax.swing.JTextField targetTxt;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JRadioButton typeTCPRadioBtn;
    private javax.swing.JRadioButton typeUDPRadioBtn;
    // End of variables declaration//GEN-END:variables
}
