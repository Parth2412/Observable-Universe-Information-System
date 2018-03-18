package OUIS;
import java.util.*;
import java.lang.*;
public class LoginCheck 
{
    Scanner choice=new Scanner(System.in);
    public String adminusername,adminpassword,scientistusername,scientistpassword,astronomerusername,astronomerpassword,userusername,userpassword;
    public String adminUser="",adminPass="",scientistUser="",scientistPass="",astronomerUser="",astronomerPass="",userUser="",userPass="";
    void AdminLogin()
    {
        System.out.print("Enter your Username: ");
        adminusername=choice.next();
        System.out.print("Enter your password: ");
        adminpassword=choice.next();
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("select a_email,a_password from ouisystem.admin");
            coc.rs=coc.ps.executeQuery();
            while(coc.rs.next())
            {
                adminUser=coc.rs.getString("a_email");
                adminPass=coc.rs.getString("a_password");
            }   
            if((adminUser.equals(adminusername))&&(adminPass.equals(adminpassword)))
            {
                System.out.println("Welcome Admin");
            }
            else
            {
                System.out.println("Access Denied");
                System.exit(0);
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    void ScientistLogin()
    {
        System.out.print("Enter your Username: ");
        scientistusername=choice.next();
        System.out.print("Enter your password: ");
        scientistpassword=choice.next();
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("select s_email,s_password from ouisystem.scientist where s_email='"+scientistusername+"'");
            coc.rs=coc.ps.executeQuery();
            while(coc.rs.next())
            {
                scientistUser=coc.rs.getString("s_email");
                scientistPass=coc.rs.getString("s_password");  
            if((scientistUser.equals(scientistusername))&&(scientistPass.equals(scientistpassword)))
            {
                System.out.println("Welcome Scientist");
            }
            else
            {
                System.out.println("Access Denied");
                System.exit(0);
            }
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    void AstronomerLogin()
    {
        System.out.print("Enter your Username: ");
        astronomerusername=choice.next();
        System.out.print("Enter your password: ");
        astronomerpassword=choice.next();
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("select a_email,a_password from ouisystem.astronomer where a_email='"+astronomerusername+"'");
            coc.rs=coc.ps.executeQuery();
            while(coc.rs.next())
            {
                astronomerUser=coc.rs.getString("a_email");
                astronomerPass=coc.rs.getString("a_password");
            }   
            if((astronomerUser.equals(astronomerusername))&&(astronomerPass.equals(astronomerpassword)))
            {
                System.out.println("Welcome Astronomer");
            }
            else
            {
                System.out.println("Access Denied");
                System.exit(0);
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    void UserLogin()
    {
        System.out.print("Enter your Username: ");
        userusername=choice.next();
        System.out.print("Enter your password: ");
        userpassword=choice.next();
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("select nu_email,n_password from ouisystem.normal_user where nu_email='"+userusername+"'");
            coc.rs=coc.ps.executeQuery();
            while(coc.rs.next())
            {
                userUser=coc.rs.getString("nu_email");
                userPass=coc.rs.getString("n_password");
            }   
            if((userUser.equals(userusername))&&(userPass.equals(userpassword)))
            {
                System.out.println("Welcome User");
            }
            else
            {
                System.out.println("Access Denied");
                System.exit(0);
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
