/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class LoginForm extends javax.swing.JInternalFrame {
    
    private MainFrame mainFrame;
    
    /**
     * Creates new form LoginForm
     */
    public LoginForm(MainFrame mainFrame) {
        initComponents();
        this.mainFrame = mainFrame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Username = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        Username_txt = new javax.swing.JTextField();
        Password_txt = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();

        setTitle("LOGIN");

        Username.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Username.setText("Username");

        Password.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Password.setText("Password");

        Username_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        Password_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Password_txt.setToolTipText("");

        LoginButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LoginButton.setText("LOGIN");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Username_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(Password_txt))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Username_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Password_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        String Username = "admin";
        String Password = "admin";
        if(Username_txt.getText().equals(Username) && Password_txt.getText().equals(Password)){
            JOptionPane.showMessageDialog(null, "Login Berhasil");
            mainFrame.setMenuName("ADMIN");
            OptionMenu optionmenu = new OptionMenu();
            optionmenu.setVisible(true);
            this.getDesktopPane().add(optionmenu);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Username / Password Salah");
        }
    }//GEN-LAST:event_LoginButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField Password_txt;
    private javax.swing.JLabel Username;
    private javax.swing.JTextField Username_txt;
    // End of variables declaration//GEN-END:variables
}