package railway;

import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Forgpass extends javax.swing.JFrame {

    
    public Forgpass() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        chmail = new javax.swing.JTextField();
        chpass = new javax.swing.JPasswordField();
        chpassc = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Change Password");

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36)); 
        jLabel1.setText("CHANGE PASSWORD");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        jLabel2.setText("Mail ID:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        jLabel3.setText("New Password:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        jLabel4.setText("Confirm Password: ");

        chmail.setFont(new java.awt.Font("Segoe UI Historic", 0, 18));

        chpass.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); 

        chpassc.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); 

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        jButton1.setText("SUBMIT");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chmail)
                    .addComponent(chpass)
                    .addComponent(chpassc, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(280, 280, 280))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(chmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(chpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(chpassc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
         String mail=chmail.getText();
         String pass=new String(chpass.getPassword());
        String passc=new String(chpassc.getPassword());
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        if((mail.equals("")) || (pass.equals("")) || (passc.equals(""))){
            JOptionPane.showMessageDialog(this,"Enter all values");
        }
        else if (!pass.equals(passc)){
            JOptionPane.showMessageDialog(this,"Passwords does not match!!!");
            chpass.setText("");
            chpassc.setText("");
        }
        else if (pass.length()<8){
            JOptionPane.showMessageDialog(this,"Password should be atleast 8 charecters long");
            chpass.setText("");
            chpassc.setText("");
        }
        else if(!mail.matches(EMAIL_PATTERN)){
            JOptionPane.showMessageDialog(this,"Invalid Email");
            chmail.setText("");
        }
        else{
            //Database
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        String mail=chmail.getText();
        String pass=new String(chpass.getPassword());
        String passc=new String(chpassc.getPassword());
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        if((mail.equals("")) || (pass.equals("")) || (passc.equals(""))){
            JOptionPane.showMessageDialog(this,"Enter all values");
        }
        else if (!pass.equals(passc)){
            JOptionPane.showMessageDialog(this,"Passwords does not match!!!");
            chpass.setText("");
            chpassc.setText("");
        }
        else if (pass.length()<8){
            JOptionPane.showMessageDialog(this,"Password should be atleast 8 charecters long");
            chpass.setText("");
            chpassc.setText("");
        }
        else if(!mail.matches(EMAIL_PATTERN)){
            JOptionPane.showMessageDialog(this,"Invalid Email");
            chmail.setText("");
        }
        else{
            try{  
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/trains","root","");
            Statement stmt=con.createStatement(); 
            stmt.executeUpdate("update users set password='"+pass+"' where mail='"+mail+"'");
            con.close();  
        }catch(Exception e){ System.out.println(e);}
            dispose();
            new Login().setVisible(true);
        }

    }

    public static void main(String args[]) {
        
        
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Forgpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forgpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forgpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forgpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forgpass().setVisible(true);
            }
        });
    }

    
    private javax.swing.JTextField chmail;
    private javax.swing.JPasswordField chpass;
    private javax.swing.JPasswordField chpassc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    
}
