package OUIS;
import java.util.*;
import java.lang.*;

public class Functionalities {
    void SolarSystemFetch()
    {
        System.out.println("Solar Sytem");
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("select ss_id,ss_system_mass,ss_distance,ss_age,ss_year,g_name from ouisystem.solar_system ss,ouisystem.galaxy g where g.g_id=ss.g_id");
            coc.rs=coc.ps.executeQuery();
            while(coc.rs.next())
            {
                System.out.println(coc.rs.getInt(1)+"\t"+coc.rs.getString(2)+"\t"+coc.rs.getString(3)+"\t"+coc.rs.getString(4)+"\t"+coc.rs.getInt(5)+"\t"+coc.rs.getString(6));
            }   
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }
    void ClusterFetch()
    {
        System.out.println("List of all Clusters");
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("select * from ouisystem.cluster");
            coc.rs=coc.ps.executeQuery();
            while(coc.rs.next())
            {
                System.out.println(coc.rs.getInt(1)+"\t"+coc.rs.getString(2)+"\t"+coc.rs.getString(3)+"\t"+coc.rs.getString(4)+"\t"+coc.rs.getInt(5)+"\t"+coc.rs.getString(6));
            }   
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }
    void PlanetsFetch()
    {
        System.out.println("List of all Planets");
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("select * from ouisystem.planet");
            coc.rs=coc.ps.executeQuery();
            while(coc.rs.next())
            {
                System.out.println(coc.rs.getInt(1)+"\t"+coc.rs.getString(2)+"\t"+coc.rs.getString(3)+"\t"+coc.rs.getString(4)+"\t"+coc.rs.getString(5)+"\t"+coc.rs.getInt(6)+"\t"+coc.rs.getInt(7)+"\t"+coc.rs.getInt(8)+"\t"+coc.rs.getString(9)+"\t"+coc.rs.getString(10));
            }   
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }
    void GalaxyFetch()
    {
        System.out.println("List of all Galaxies");
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("select g_id,g_name,g_description,g_year,c_name from ouisystem.galaxy g , ouisystem.cluster c where c.c_id=g.c_id");
            coc.rs=coc.ps.executeQuery();
            while(coc.rs.next())
            {
                System.out.println(coc.rs.getInt(1)+"\t"+coc.rs.getString(2)+"\t"+coc.rs.getString(3)+"\t"+coc.rs.getInt(4)+"\t"+coc.rs.getString(5));
            }   
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }
    void SunFetch()
    {
        System.out.println("Sun");
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("select sun_id,sun_description,ss_system_mass,ss_distance from ouisystem.sun s,ouisystem.solar_system ss where ss.ss_id=s.ss_id");
            coc.rs=coc.ps.executeQuery();
            while(coc.rs.next())
            {
                System.out.println(coc.rs.getInt(1)+"\t"+coc.rs.getString(2)+"\t"+coc.rs.getString(3)+"\t"+coc.rs.getString(4));
            }   
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }
    void MoonsFetch()
    {
        System.out.println("Moons of the Planets");
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("select m_id,m_name,m_distance,m_description,p_name from ouisystem.moons m, ouisystem.planet p where p.p_id=m.p_id");
            coc.rs=coc.ps.executeQuery();
            while(coc.rs.next())
            {
                System.out.println(coc.rs.getInt(1)+"\t"+coc.rs.getString(2)+"\t"+coc.rs.getString(3)+"\t"+coc.rs.getString(4)+"\t"+coc.rs.getString(5));
            }   
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    void RingsFetch()
    {
        System.out.println("Rings of the Planets");
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("select r_id,r_name,r_description,p_name from ouisystem.rings r,ouisystem.planet p where p.p_id=r.p_id");
            coc.rs=coc.ps.executeQuery();
            while(coc.rs.next())
            {
                System.out.println(coc.rs.getInt(1)+"\t"+coc.rs.getString(2)+"\t"+coc.rs.getString(3));
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
            coc.ps=coc.cn.prepareStatement("select s_id,s_name,s_email,s_gender,ci_name from ouisystem.scientist a,ouisystem.city c where c.ci_id=a.ci_id");
            coc.rs=coc.ps.executeQuery();
            while(coc.rs.next())
            {
                System.out.println(coc.rs.getInt(1)+"\t"+coc.rs.getString(2)+"\t"+coc.rs.getString(3)+"\t"+coc.rs.getString(4)+"\t"+coc.rs.getString(5));
            }   
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }
    void AstronomerFetch()
    {
         System.out.println("List of all Astronomers");
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("select a_id,a_name,a_email,a_gender,ci_name from ouisystem.astronomer a,ouisystem.city c where c.ci_id=a.ci_id");
            coc.rs=coc.ps.executeQuery();
            while(coc.rs.next())
            {
                System.out.println(coc.rs.getInt(1)+"\t"+coc.rs.getString(2)+"\t"+coc.rs.getString(3)+"\t"+coc.rs.getString(4));
            }   
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }
    public int ClusterSearch(String name)
    {
        int affectedRows=0;
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("select * from ouisystem.cluster ac,ouisystem.cluster_property acp where ac.c_id=acp.c_id and ac.c_name=? ");
            coc.ps.setString(1,name);
            affectedRows=coc.ps.executeUpdate();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return affectedRows;   
    }
    public int GalaxySearch(String name)
    {
        int affectedRows=0;
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("delete from ouisystem.galaxy where g_name=?");
            coc.ps.setString(1,name);
             coc.rs=coc.ps.executeQuery();
            while(coc.rs.next())
            {
                System.out.println(coc.rs.getInt(1)+"\t"+coc.rs.getString(2)+"\t"+coc.rs.getString(3)+"\t"+coc.rs.getInt(5));
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return affectedRows;   
    }
    public int PlanetSearch(String name)
    {
        int affectedRows=0;
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("select p_name,p_diameter,p_orbital_period,p_rotation_period,p_type,r_name,m_name,m_description from ouisystem.planet p,ouisystem.moons m,ouisystem.rings r where p_name=?");
            coc.ps.setString(1,name);
            coc.rs=coc.ps.executeQuery();
            while(coc.rs.next())
            {
                System.out.println(coc.rs.getString(1)+"\t"+coc.rs.getString(2)+"\t"+coc.rs.getString(3)+"\t"+coc.rs.getString(4)+"\t"+coc.rs.getString(5)+"\t"+coc.rs.getString(6)+"\t"+coc.rs.getString(7)+"\t"+coc.rs.getString(8));
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return affectedRows;   
    }
    public int AstronomerSearch(String name)
    {
        int affectedRows=0;
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("select * from ouisystem.astronomer where a_name=?");
            coc.ps.setString(1,name);
            coc.rs=coc.ps.executeQuery();
            while(coc.rs.next())
            {
                System.out.println(coc.rs.getInt(1)+"\t"+coc.rs.getString(2)+"\t"+coc.rs.getString(3)+"\t"+coc.rs.getString(5)+"\t"+coc.rs.getString(6));
            }   
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return affectedRows;   
    }
    public int ScientistSearch(String name)
    {
        int affectedRows=0;
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("select * from ouisystem.scientist where s_name=?");
            coc.ps.setString(1,name);
            coc.rs=coc.ps.executeQuery();
            while(coc.rs.next())
            {
                System.out.println(coc.rs.getInt(1)+"\t"+coc.rs.getString(2)+"\t"+coc.rs.getString(3)+"\t"+coc.rs.getString(5)+"\t"+coc.rs.getString(6));
            }   
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return affectedRows;   
    }
    public int clusterInsert(int id,String name,String mass,String description,int totalgalaxy,String type)
    {
        int affectedRows=0;
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("insert into ouisystem.cluster values(?,?,?,?,?,?)");
            coc.ps.setInt(1,id);
            coc.ps.setString(2,name);
            coc.ps.setString(3,mass);
            coc.ps.setString(4,description);
            coc.ps.setInt(5,totalgalaxy);
            coc.ps.setString(6,type);
            affectedRows=coc.ps.executeUpdate(); 
            System.out.println("Your record has been successfully inserted");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return affectedRows; 
    }
    public int galaxyInsert(int id,String name,String description,int cid,int year)
    {
        int affectedRows=0;
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("insert into ouisystem.galaxy values(?,?,?,?,?)");
            coc.ps.setInt(1,id);
            coc.ps.setString(2,name);
            coc.ps.setString(3,description);
            coc.ps.setInt(4,cid);
            coc.ps.setInt(5,year);
            affectedRows=coc.ps.executeUpdate(); 
            System.out.println("Your record has been successfully inserted");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return affectedRows; 
    }
    public int solarsystemInsert(int id,String mass,String distance,int gid,String age,int year)
    {
        int affectedRows=0;
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("insert into ouisystem.solar_system values(?,?,?,?,?,?)");
            coc.ps.setInt(1,id);
            coc.ps.setString(2,mass);
            coc.ps.setString(3,distance);
            coc.ps.setInt(4,gid);
            coc.ps.setString(5,age);
            coc.ps.setInt(6,year);
            affectedRows=coc.ps.executeUpdate(); 
            System.out.println("Your record has been successfully inserted");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return affectedRows; 
    }
    public int sunInsert(int id,String description,int sid)
    {
        int affectedRows=0;
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("insert into ouisystem.sun values(?,?,?)");
            coc.ps.setInt(1,id);
            coc.ps.setString(2,description);
            coc.ps.setInt(3,sid);
            affectedRows=coc.ps.executeUpdate(); 
            System.out.println("Your record has been successfully inserted");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return affectedRows; 
    }
    public int planetInsert(int id,String name,String diameter,String orbital,String rotation,int moon,int rings,int sid,String type)
    {
        int affectedRows=0;
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("insert into ouisystem.planet values(?,?,?,?,?,?,?,?,?)");
            coc.ps.setInt(1,id);
            coc.ps.setString(2,name);
            coc.ps.setString(3,diameter);
            coc.ps.setString(4,orbital);
            coc.ps.setString(5,rotation);
            coc.ps.setInt(6,moon);
            coc.ps.setInt(7,rings);
            coc.ps.setInt(8,sid);
            coc.ps.setString(9,type);
            affectedRows=coc.ps.executeUpdate(); 
            System.out.println("Your record has been successfully inserted");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return affectedRows; 
    }
    public int ringInsert(int id,String name,String description,int pid)
    {
        int affectedRows=0;
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("insert into ouisystem.rings values(?,?,?,?)");
            coc.ps.setInt(1,id);
            coc.ps.setString(2,name);
            coc.ps.setString(3,description);
            coc.ps.setInt(4,pid);
            affectedRows=coc.ps.executeUpdate(); 
            System.out.println("Your record has been successfully inserted");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return affectedRows; 
    }
    public int moonInsert(int id,String name,String distance,String description,int pid)
    {
        int affectedRows=0;
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("insert into ouisystem.moons values(?,?,?,?,?)");
            coc.ps.setInt(1,id);
            coc.ps.setString(2,name);
            coc.ps.setString(3,distance);
            coc.ps.setString(4,description);
            coc.ps.setInt(5,pid);
            affectedRows=coc.ps.executeUpdate(); 
            System.out.println("Your record has been successfully inserted");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return affectedRows; 
    }
    public int clusterUpdate(int id,String name,String mass,String description,int total,String type)
    {
        int affectedRows=0;
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("update ouisystem.cluster set c_name='"+name+"',c_mass='"+mass+"',c_description='"+description+"',c_totalgalaxy='"+total+"',c_type='"+type+"' where c_id="+id);
            affectedRows=coc.ps.executeUpdate(); 
            System.out.println("Your record has been successfully updated");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return affectedRows; 
    }
    public int galaxyUpdate(int id,String gname,String gdescription,int cid,int gyear)
    {
        int affectedRows=0;
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("update ouisystem.galaxy set g_name='"+gname+"',g_description='"+gdescription+"',c_id='"+cid+"',g_year='"+gyear+"' where c_id="+id);
            affectedRows=coc.ps.executeUpdate(); 
            System.out.println("Your record has been successfully updated");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return affectedRows; 
    }
    public int solarsystemUpdate(int id,String smass,String sdistance,int gid,String sage,int syear)
    {
        int affectedRows=0;
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("update ouisystem.solar_system set ss_system_mass='"+smass+"',ss_distance='"+sdistance+"',g_id='"+gid+"',ss_age='"+sage+"',ss_year='"+syear+"' where ss_id="+id);
            affectedRows=coc.ps.executeUpdate(); 
            System.out.println("Your record has been successfully updated");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return affectedRows; 
    }
    public int sunUpdate(int id,String sdescription,int sid)
    {
        int affectedRows=0;
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("update ouisystem.sun set sun_description='"+sdescription+"',ss_id='"+sid+"' where sun_id="+id);
            affectedRows=coc.ps.executeUpdate(); 
            System.out.println("Your record has been successfully updated");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return affectedRows; 
    }
     public int planetUpdate(int id,String name,String diameter,String orbital,String rotation,int moon,int rings,int sid,String type)
    {
        int affectedRows=0;
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("update ouisystem.planet set p_name='"+name+"',p_diameter='"+diameter+"',p_orbital_period='"+orbital+"',p_rotation_period='"+rotation+"',p_moons='"+moon+"',p_rings='"+rings+"',ss_id='"+sid+"',p_type='"+type+"' where p_id="+id);
            affectedRows=coc.ps.executeUpdate(); 
            System.out.println("Your record has been successfully updated");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return affectedRows; 
    }
    public int ringUpdate(int id,String name,String description,int pid)
    {
        int affectedRows=0;
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("update ouisystem.rings set r_name='"+name+"',r_description='"+description+"',p_id='"+pid+"' where r_id="+id);
            System.out.println("Your record has been successfully updated");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return affectedRows; 
    }
    public int moonUpdate(int id,String name,String distance,String description,int pid)
    {
        int affectedRows=0;
        try{
            ConnectionClass coc=new ConnectionClass();
            coc.ps=coc.cn.prepareStatement("update ouisystem.moons set m_name='"+name+"',m_distance='"+distance+"',m_description='"+description+"',p_id='"+pid+"' where m_id="+id);
            affectedRows=coc.ps.executeUpdate(); 
            System.out.println("Your record has been successfully updated");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return affectedRows; 
    }
}

