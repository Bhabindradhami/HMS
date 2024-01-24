
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    Dashboard() {
        setBounds(0,0,1500,1000);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        //image on full screen
        Image i2 = i1.getImage().getScaledInstance(1550,1000,Image.SCALE_DEFAULT);
        //for scaled image
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1550,1000);
        add(image);
        
        JLabel text = new JLabel("THE TAJ GROUP WELOMES YOU");
        text.setBounds(400,80,1000,50);
        text.setFont(new Font("Tahoma", Font.PLAIN,46));
        text.setForeground(Color.WHITE);
        image.add(text);
        
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0,0,1550,30);
        image.add(mb);
        
        JMenu hotel = new JMenu("HOTEL MANAGEMENT");
        hotel.setForeground(Color.RED);
        mb.add(hotel);//add Menu into Menubar
        
        JMenuItem reception = new JMenuItem("RECEPTION");//inside HOTEL MANAGEMENT MENU
        reception.addActionListener(this);
        hotel.add(reception);//add MenuItem into Menu
        
        
        
        JMenu admin = new JMenu("ADMIN");
        admin.setForeground(Color.BLUE);
        mb.add(admin);//add Menu into Menubar
        
        
        JMenuItem addemployee = new JMenuItem("ADD EMPLOYEE");//inside ADMIN MENU
        addemployee.addActionListener(this);
        admin.add(addemployee);//add MenuItem into Menu
        
        JMenuItem addrooms = new JMenuItem("ADD ROOMS");//inside ADMIN MENU
        addrooms.addActionListener(this);
        admin.add(addrooms);//add MenuItem into Menu
        
        JMenuItem adddrives = new JMenuItem("ADD DRIVERS");//inside ADMIN MENU
        adddrives.addActionListener(this);
        admin.add(adddrives);//add MenuItem into Menu
        
        
        
        setVisible(true);
    }
    
    public void actionPerformed( ActionEvent ae){
        if (ae.getActionCommand().equals("ADD EMPLOYEE")){
            new AddEmployee();   
        } else  if (ae.getActionCommand().equals("ADD ROOMS")){
            new AddRooms();
        } else  if (ae.getActionCommand().equals("ADD DRIVERS")){
            new AddDriver();
        }  else  if (ae.getActionCommand().equals("RECEPTION")){
            new Reception();
        } 
    } 

public static void main(String args []){
    new Dashboard();
}

}

