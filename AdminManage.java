package OUIS;
import java.util.*;
import java.lang.*;

public class AdminManage {
    public int id;
    public String name,email,birthdate,gender;
    void AstronomerFetch()
    {
        System.out.println("List of all Astronomers");
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("select * from ouisystem.astronomer");
            coc.rs=coc.ps.executeQuery();
            while(coc.rs.next())
            {
                System.out.println(coc.rs.getInt(1)+"\t"+coc.rs.getString(2)+"\t"+coc.rs.getString(3)+"\t"+coc.rs.getString(5)+"\t"+coc.rs.getString(6));
            }   
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    void ScientistFetch()
    {
        System.out.println("List of all Scientist");
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("select * from ouisystem.scientist");
            coc.rs=coc.ps.executeQuery();
            while(coc.rs.next())
            {
                System.out.println(coc.rs.getInt(1)+"\t"+coc.rs.getString(2)+"\t"+coc.rs.getString(3)+"\t"+coc.rs.getString(5)+"\t"+coc.rs.getString(6));
            }   
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    void UserFetch()
    {
        System.out.println("List of all Users");
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("select * from ouisystem.normal_user");
            coc.rs=coc.ps.executeQuery();
            while(coc.rs.next())
            {
                System.out.println(coc.rs.getInt(1)+"\t"+coc.rs.getString(2)+"\t"+coc.rs.getString(3)+"\t"+coc.rs.getString(5)+"\t"+coc.rs.getString(6));
            }   
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public int AstronomerRemove(String name)
    {
        int affectedRows=0;
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("delete from ouisystem.astronomer where a_name=?");
            coc.ps.setString(1,name);
            affectedRows=coc.ps.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return affectedRows;   
    }
    public int ScientistRemove(String name)
    {
        int affectedRows=0;
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("delete from ouisystem.scientist where s_name=?");
            coc.ps.setString(1,name);
            affectedRows=coc.ps.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return affectedRows;   
    }
    public int UserRemove(String name)
    {
        int affectedRows=0;
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("delete from ouisystem.normal_user where nu_name=?");
            coc.ps.setString(1,name);
            affectedRows=coc.ps.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return affectedRows;   
    }
}
