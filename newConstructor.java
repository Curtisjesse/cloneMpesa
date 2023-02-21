
//package our_second_project;

import javax.swing.JOptionPane;


public class newConstructor 
{
 static String name;
 static String regNo;
    static staff myStaff=new staff();
    static triangle myTriangle = new triangle();

    public static void main(String[] args) 
    {
        getData();
        display();
        myStaff.getData();
        myStaff.display();
        myTriangle.area();
        myTriangle.display();
        
        
    }
    static void getData()
    {
        name = JOptionPane.showInputDialog("enter your name: ");
        regNo = JOptionPane.showInputDialog("enter your RegNo: ");
    }
    static void display()
    {
        JOptionPane.showMessageDialog(null,"name: " + name);
        JOptionPane.showMessageDialog(null, "RegNo: " + regNO);
        
   }
    
}
class staff
{

    String staffName;
    String staffNumber;
    staff()
           {
               
           }
    
    

   public void getData()
    {
        staffName=JOptionPane.showInputDialog(staffName);
        staffNumber=JOptionPane.showInputDialog(staffNumber);
    }
    public void display()
    {
        JOptionPane.showMessageDialog(null, staffName);
        JOptionPane.showMessageDialog(null, staffNumber);
        
   }
}
class triangle
{
    Double length;
    Double height;
    Double result;
    
    void area()
    {
    result=(length*height)/2;
   }
    void display()
    {
        JOptionPane.showMessageDialog(null, result);
    }
}
class rectangle
{
    Double length;
    Double width;
    Double result;
    
    void area()
    {
    result=length*width;
   }
}
 