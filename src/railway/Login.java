package railway;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.MouseEvent;
import java.util.Dictionary;
import java.util.Hashtable;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    public static int user;
    public static Dictionary station=new Hashtable();
    public static String from;
    public static String to;
    public static String date;
    public static int trainno;
    public static String trainname;
    public static int bid;

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        labLogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        butLogSub = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        labReg = new javax.swing.JLabel();
        labforg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LOGIN");
        setAlwaysOnTop(true);

        labLogin.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36)); 
        labLogin.setText("LOGIN");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        jLabel1.setText("Mail ID: ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        jLabel2.setText("Password: ");

        mail.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); 
        mail.setActionCommand("<Not Set>");

        pass.setFont(new java.awt.Font("Segoe UI Historic", 0, 18));

        butLogSub.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        butLogSub.setText("SUBMIT");
        butLogSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butLogSubActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel3.setText("New User??   ");

        labReg.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        labReg.setForeground(new java.awt.Color(51, 102, 255));
        labReg.setText("Register with us");
        labReg.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        labReg.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                dispose();
                new Register().setVisible(true);
            }
        });

        labforg.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        labforg.setForeground(new java.awt.Color(0, 102, 255));
        labforg.setText("Forgot Password??");
        labforg.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        labforg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labforgMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(butLogSub)))
                        .addGap(82, 82, 82))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labReg)
                        .addGap(33, 33, 33))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(labLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(labforg)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(butLogSub)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labReg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labforg)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void butLogSubActionPerformed(java.awt.event.ActionEvent evt) {
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/trains","root","");
            Statement stmt=con.createStatement(); 
            String ma=mail.getText();
            String pas=new String(pass.getPassword());
            ResultSet rs=stmt.executeQuery("select * from users where mail='"+ma+"' and password='"+pas+"';");  
            if(rs.next()){
                this.dispose();
                user=rs.getInt(1);
                new UserHome().setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this,"Invalid Username or password");
            }
            con.close();  
        }catch(Exception e){ System.out.println(e);}  
        
    }

    private void labforgMouseClicked(java.awt.event.MouseEvent evt) {
        dispose();
        new Forgpass().setVisible(true);
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

       
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    
    private javax.swing.JButton butLogSub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labLogin;
    public javax.swing.JLabel labReg;
    private javax.swing.JLabel labforg;
    private javax.swing.JTextField mail;
    private javax.swing.JPasswordField pass;
    

}
