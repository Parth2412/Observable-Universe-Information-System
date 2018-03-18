package OUIS;
import java.util.*;
import java.lang.*;

public class OUIS_Main {
    public static void main(String args[])
    {
        LoginCheck log=new LoginCheck();
        AdminManage am=new AdminManage();
        Functionalities uf = new Functionalities();
     //   ScientistFunctionalities sf=new ScientistFunctionalities();
      //  AstronomerFunctionalities af=new AstronomerFunctionalities();
        Scanner choice=new Scanner(System.in);
        int choiceinput;
        do{
            
          //Choices 
            System.out.print("0. Terminate the Program\n");
            System.out.print("1. Admin Login\n");
            System.out.print("2. Scientist Login\n");
            System.out.print("3. Astronomer Login\n");
            System.out.print("4. User Login\n");
            System.out.print("Enter your choice: ");
            choiceinput=choice.nextInt();
          //Choices end
          //case 1
            if(choiceinput==1)
            {
                System.out.println("Hello Admin");
                log.AdminLogin();
                do{
                    System.out.println("0. Main Menu");
                    System.out.println("1. Manage Astronomer");
                    System.out.println("2. Manage Scientist");
                    System.out.println("3. Manage User");
                    System.out.println("4. System");
                    System.out.print("Enter your choice: ");
                    choiceinput=choice.nextInt();
                    if(choiceinput==1)
                    {
                        am.AstronomerFetch();
                        String ch;
                        System.out.println("Do you want to delete an Astronomer account?(yes/no)");
                        ch=choice.next();
                        if(ch.equals("yes")||ch.equals("YES"))
                        {
                            String nameSearch;
                            System.out.print("Enter the astronomer name you want to delete: ");
                            nameSearch=choice.next();
                            am.AstronomerRemove(nameSearch);
                            System.out.println("Your record has been deleted");
                            am.AstronomerFetch();
                        }
                        else
                        {
                            break;
                        }
                    }
                    else if(choiceinput==2)
                    {
                        am.ScientistFetch();
                         String ch;
                        System.out.println("Do you want to delete scientist account?(yes/no)");
                        ch=choice.next();
                        if(ch.equals("yes")||ch.equals("YES"))
                        {
                            String nameSearch;
                            System.out.print("Enter the scientist name you want to delete: ");
                            nameSearch=choice.next();
                            am.ScientistRemove(nameSearch);
                            System.out.println("Your record has been deleted");
                            am.ScientistFetch();
                        }
                        else
                        {
                            break;
                        }
                    }
                    else if(choiceinput==3)
                    {
                        am.UserFetch();
                         String ch;
                        System.out.println("Do you want to delete an User account?(yes/no)");
                        ch=choice.next();
                        if(ch.equals("yes")||ch.equals("YES"))
                        {
                            String nameSearch;
                            System.out.print("Enter the user name you want to delete: ");
                            nameSearch=choice.next();
                            am.UserRemove(nameSearch);
                            System.out.println("Your record has been deleted");
                            am.UserFetch();
                        }
                        else
                        {
                            break;
                        }
                    }
                    else if(choiceinput==4)
                    {
                        do
                        {
                            System.out.println("0. Main Menu");
                            System.out.println("1. Cluster");
                            System.out.println("2. Galaxy");
                            System.out.println("3. Solar System");
                            System.out.println("4. Planets");
                            System.out.println("5. Moons of Planets");
                            System.out.println("6. Rings of Planets");
                            System.out.println("Select your choice");
                            choiceinput=choice.nextInt();
                            if(choiceinput==0)
                            {
                                System.exit(0);
                            }
                            else if(choiceinput==1)
                            {
                                uf.ClusterFetch();
                            }
                            else if(choiceinput==2)
                            {
                                uf.GalaxyFetch();
                            }
                            else if(choiceinput==3)
                            {
                                uf.SolarSystemFetch();
                            }
                            else if(choiceinput==4)
                            {
                                uf.PlanetsFetch();
                            }
                            else if(choiceinput==5)
                            {
                                uf.MoonsFetch();
                            }
                            else if(choiceinput==6)
                            {
                                uf.RingsFetch();
                            }
                            else
                            {
                                System.out.println("please select vlaid choice");
                            }
                        }while(choiceinput!=0);
                        
                        
                        
                        
                    }
                    else if(choiceinput==0)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("Please select valid choice");
                    }
                }while(choiceinput!=0);            
            }
          //case 1 end
          //case 2
            else if(choiceinput==2)
            {
                System.out.println("Hello Scientist");
                log.ScientistLogin();
                do{
                    System.out.println("0. Main Menu");
                    System.out.println("1. Show Existing Information");
                    System.out.println("2. Insert New Information");
                    System.out.println("Select your choice: ");
                    choiceinput=choice.nextInt();
                    if(choiceinput==0)
                    {
                        System.exit(0);
                    }
                    else if(choiceinput==1)
                    {
                        do{
                            System.out.println("0. Main Menu");
                            System.out.println("1. Cluster");
                            System.out.println("2. Galaxy");
                            System.out.println("3. Solar System");
                            System.out.println("4. Sun");
                            System.out.println("5. Planet");
                            System.out.println("Enter your choice:");
                            choiceinput=choice.nextInt();
                            if(choiceinput==0)
                            {
                                System.exit(0);
                            }
                            else if(choiceinput==1)
                            {
                                uf.ClusterFetch();
                            }
                            else if(choiceinput==2)
                            {
                                uf.GalaxyFetch();
                            }
                            else if(choiceinput==3)
                            {
                                uf.SolarSystemFetch();
                            }
                            else if(choiceinput==4)
                            {
                                uf.SunFetch();
                            }
                            else if(choiceinput==5)
                            {
                                uf.PlanetsFetch();
                            }
                            else
                            {
                                System.out.println("please select valid choice");
                            }
                        }while(choiceinput!=0);
                    }
                    else if(choiceinput==2)
                    {
                        do{
                            System.out.println("0. Main Menu");
                            System.out.println("1. Cluster");
                            System.out.println("2. Galaxy");
                            System.out.println("3. Solar System");
                            System.out.println("4. Sun");
                            System.out.println("5. Planet");
                            System.out.println("6. Moons of Planet");
                            System.out.println("7. Rings of Planet");
                            System.out.println("Enter your choice:");
                            choiceinput=choice.nextInt();
                            if(choiceinput==0)
                            {
                                System.exit(0);
                            }
                            else if(choiceinput==1)
                            {
                                int id,totalgalaxy;
                                String cname,cmass,cdescription,ctype;
                                Scanner scan=new Scanner(System.in);
                                System.out.print("Enter ID:");
                                id=scan.nextInt();
                                System.out.print("Enter Cluster Name:");
                                cname=scan.next();
                                System.out.print("Enter Cluster mass:");
                                cmass=scan.next();
                                System.out.print("Enter Cluster Desciption:");
                                cdescription=scan.next();
                                System.out.print("Enter Total Galaxy Number:");
                                totalgalaxy=scan.nextInt();
                                System.out.print("Enter Type of Cluster:");
                                ctype=scan.next();
                                uf.clusterInsert(id,cname,cmass,cdescription,totalgalaxy,ctype);
                            }
                            else if(choiceinput==2)
                            {
                                int id,year,cid;
                                String gname,gdescription;
                                Scanner scan=new Scanner(System.in);
                                System.out.print("Enter ID:");
                                id=scan.nextInt();
                                System.out.print("Enter Galaxy Name:");
                                gname=scan.next();
                                System.out.print("Enter Galaxy Desciption:");
                                gdescription=scan.next();
                                System.out.print("Enter Cluster ID:");
                                cid=scan.nextInt();
                                System.out.print("Enter Year of Galaxy:");
                                year=scan.nextInt();
                                uf.galaxyInsert(id,gname,gdescription,cid,year);
                            }
                            else if(choiceinput==3)
                            {
                                int id,year,gid;
                                String ssmass,ssdistance,ssage;
                                Scanner scan=new Scanner(System.in);
                                System.out.print("Enter ID:");
                                id=scan.nextInt();
                                System.out.print("Enter Solar-System Mass:");
                                ssmass=scan.next();
                                System.out.print("Enter Solar-System Distance:");
                                ssdistance=scan.next();
                                System.out.print("Enter Galaxy ID:");
                                gid=scan.nextInt();
                                System.out.print("Enter Solar-System Age:");
                                ssage=scan.next();
                                System.out.print("Enter Year of Solar-System:");
                                year=scan.nextInt();
                                uf.solarsystemInsert(id,ssmass,ssdistance,gid,ssage,year);
                            }
                            else if(choiceinput==4)
                            {
                                int id,sid;
                                String sdescription;
                                Scanner scan=new Scanner(System.in);
                                System.out.print("Enter ID:");
                                id=scan.nextInt();
                                System.out.print("Enter Sun Description:");
                                sdescription=scan.next();
                                System.out.print("Enter Solar-System ID:");
                                sid=scan.nextInt();
                                uf.sunInsert(id,sdescription,sid);
                            }
                            else if(choiceinput==5)
                            {
                                int id,sid,moon,rings;
                                String pname,ptype,porbital,protation,pdiameter;
                                Scanner scan=new Scanner(System.in);
                                System.out.print("Enter ID:");
                                id=scan.nextInt();
                                System.out.print("Enter Solar-System ID:");
                                sid=scan.nextInt();
                                System.out.print("Enter Number of Moons:");
                                moon=scan.nextInt();
                                System.out.print("Enter Number of Rings:");
                                rings=scan.nextInt();
                                System.out.print("Enter Name of the planet:");
                                pname=scan.next();
                                System.out.print("Enter Type of the planet:");
                                ptype=scan.next();
                                System.out.print("Enter Orbital Period of the planet:");
                                porbital=scan.next();
                                System.out.print("Enter Rotation period of the planet:");
                                protation=scan.next();
                                System.out.print("Enter Diameter of the planet:");
                                pdiameter=scan.next();
                                uf.planetInsert(id,pname,pdiameter,porbital,protation,moon,rings,sid,ptype);
                            }
                            else if(choiceinput==6)
                            {
                                int id,pid;
                                String mname,mdistance,mdescription;
                                Scanner scan=new Scanner(System.in);
                                System.out.print("Enter ID:");
                                id=scan.nextInt();
                                System.out.print("Enter Planet ID:");
                                pid=scan.nextInt();
                                System.out.print("Enter Name of the Moon:");
                                mname=scan.next();
                                System.out.print("Enter Distance of the moon:");
                                mdistance=scan.next();
                                System.out.print("Enter Description of the moon:");
                                mdescription=scan.next();
                                uf.moonInsert(id,mname,mdistance,mdescription,pid);
                            }
                            else if(choiceinput==7)
                            {
                                int id,pid;
                                String rname,rdescription;
                                Scanner scan=new Scanner(System.in);
                                System.out.print("Enter ID:");
                                id=scan.nextInt();
                                System.out.print("Enter Planet ID:");
                                pid=scan.nextInt();
                                System.out.print("Enter Name of the Ring:");
                                rname=scan.next();
                                System.out.print("Enter Description of the Ring:");
                                rdescription=scan.next();
                                uf.ringInsert(id,rname,rdescription,pid);
                            }
                            else
                            {
                                System.out.println("Please select valid choice");
                            }
                        }while(choiceinput!=0);
        
                    }
                    else
                    {
                        System.out.println("Please select valid choice");
                    }
                    
                }while(choiceinput!=0);
            }
          //case 2 end
          //case 3
            else if(choiceinput==3)
            {
                System.out.println("Hello Astronomer");
                log.AstronomerLogin();
                do
                {
                    System.out.println("0. Main Menu");
                    System.out.println("1. Show Existing Information");
                    System.out.println("2. Update Existing Information");
                    System.out.println("Select your choice: ");
                    choiceinput=choice.nextInt();
                    if(choiceinput==0)
                    {
                        System.exit(0);
                    }
                    else if(choiceinput==1)
                    {
                        do{
                            System.out.println("0. Main Menu");
                            System.out.println("1. Cluster");
                            System.out.println("2. Galaxy");
                            System.out.println("3. Solar System");
                            System.out.println("4. Sun");
                            System.out.println("5. Planet");
                            System.out.println("Enter your choice:");
                            choiceinput=choice.nextInt();
                            if(choiceinput==0)
                            {
                                System.exit(0);
                            }
                            else if(choiceinput==1)
                            {
                                uf.ClusterFetch();
                            }
                            else if(choiceinput==2)
                            {
                                uf.GalaxyFetch();
                            }
                            else if(choiceinput==3)
                            {
                                uf.SolarSystemFetch();
                            }
                            else if(choiceinput==4)
                            {
                                uf.SunFetch();
                            }
                            else if(choiceinput==5)
                            {
                                uf.PlanetsFetch();
                            }
                            else
                            {
                                System.out.println("please select valid choice");
                            }
                        }while(choiceinput!=0);
                    }
                    else if(choiceinput==2)
                    {
                        do{
                            System.out.println("0. Main Menu");
                            System.out.println("1. Cluster");
                            System.out.println("2. Galaxy");
                            System.out.println("3. Solar System");
                            System.out.println("4. Sun");
                            System.out.println("5. Planet");
                            System.out.println("6. Rings of Planet");
                            System.out.println("7. Moons of Planet");
                            System.out.println("Enter your choice:");
                            choiceinput=choice.nextInt();
                            if(choiceinput==0)
                            {
                                System.exit(0);
                            }
                            else if(choiceinput==1)
                            {
                               String ans;
                               Scanner temp=new Scanner(System.in);
                               uf.ClusterFetch();
                               System.out.println("Do you want to update any record(yes/no)?");
                               ans=temp.next();
                               if(ans.equals("yes")||ans.equals("YES"))
                               {
                                    int id,ctotal;
                                    String cname,cmass,cdescription,ctype;
                                    Scanner store= new Scanner(System.in);
                                    System.out.println("Enter Cluster ID:");
                                    id=store.nextInt();
                                    System.out.println("Enter Clster Name:");
                                    cname=store.next();
                                    System.out.println("Enter Clster Mass:");
                                    cmass=store.next();
                                    System.out.println("Enter Clster Description:");
                                    cdescription=store.next();
                                    System.out.println("Enter Clster Total Galaxy:");
                                    ctotal=store.nextInt();
                                    System.out.println("Enter Clster Type:");
                                    ctype=store.next();
                                    uf.clusterUpdate(id,cname,cmass,cdescription,ctotal,ctype);
                               }
                               else
                               {
                                   break;
                               } 
                            }
                            else if(choiceinput==2)
                            {
                                String ans;
                               Scanner temp=new Scanner(System.in);
                               uf.GalaxyFetch();
                               System.out.println("Do you want to update any record(yes/no)?");
                               ans=temp.next();
                               if(ans.equals("yes")||ans.equals("YES"))
                               {
                                   int id,gyear,cid;
                                    String gname,gdescription;
                                    Scanner store= new Scanner(System.in);
                                    System.out.println("Enter Galaxy ID:");
                                    id=store.nextInt();
                                    System.out.println("Enter Galaxy Name:");
                                    gname=store.next();
                                    System.out.println("Enter Galaxy Description:");
                                    gdescription=store.next();
                                    System.out.println("Enter Clster ID:");
                                    cid=store.nextInt();
                                    System.out.println("Enter Galaxy Year:");
                                    gyear=store.nextInt();
                                    uf.galaxyUpdate(id,gname,gdescription,cid,gyear);
                               }
                               else
                               {
                                   break;
                               }
                            }
                            else if(choiceinput==3)
                            {
                                String ans;
                               Scanner temp=new Scanner(System.in);
                               uf.SolarSystemFetch();
                               System.out.println("Do you want to update any record(yes/no)?");
                               ans=temp.next();
                               if(ans.equals("yes")||ans.equals("YES"))
                               {
                                    int id,year,gid;
                                    String ssmass,ssdistance,ssage;
                                    Scanner scan=new Scanner(System.in);
                                    System.out.print("Enter ID:");
                                    id=scan.nextInt();
                                    System.out.print("Enter Solar-System Mass:");
                                    ssmass=scan.next();
                                    System.out.print("Enter Solar-System Distance:");
                                    ssdistance=scan.next();
                                    System.out.print("Enter Galaxy ID:");
                                    gid=scan.nextInt();
                                    System.out.print("Enter Solar-System Age:");
                                    ssage=scan.next();
                                    System.out.print("Enter Year of Solar-System:");
                                    year=scan.nextInt();
                                    uf.solarsystemUpdate(id,ssmass,ssdistance,gid,ssage,year);
                               }
                               else
                               {
                                   break;
                               }
                            }
                            else if(choiceinput==4)
                            {
                                String ans;
                               Scanner temp=new Scanner(System.in);
                               uf.SunFetch();
                               System.out.println("Do you want to update any record(yes/no)?");
                               ans=temp.next();
                               if(ans.equals("yes")||ans.equals("YES"))
                               {
                                   int id,sid;
                                    String sdescription;
                                    Scanner scan=new Scanner(System.in);
                                    System.out.print("Enter ID:");
                                    id=scan.nextInt();
                                    System.out.print("Enter Sun Description:");
                                    sdescription=scan.next();
                                    System.out.print("Enter Solar-System ID:");
                                    sid=scan.nextInt();
                                    uf.sunUpdate(id,sdescription,sid);
                               }
                               else
                               {
                                   break;
                               }
                            }
                            else if(choiceinput==5)
                            {
                                String ans;
                               Scanner temp=new Scanner(System.in);
                               uf.PlanetsFetch();
                               System.out.println("Do you want to update any record(yes/no)?");
                               ans=temp.next();
                               if(ans.equals("yes")||ans.equals("YES"))
                               {
                                   int id,sid,moon,rings;
                                    String pname,ptype,porbital,protation,pdiameter;
                                    Scanner scan=new Scanner(System.in);
                                    System.out.print("Enter ID:");
                                    id=scan.nextInt();
                                    System.out.print("Enter Solar-System ID:");
                                    sid=scan.nextInt();
                                    System.out.print("Enter Number of Moons:");
                                    moon=scan.nextInt();
                                    System.out.print("Enter Number of Rings:");
                                    rings=scan.nextInt();
                                    System.out.print("Enter Name of the planet:");
                                    pname=scan.next();
                                    System.out.print("Enter Type of the planet:");
                                    ptype=scan.next();
                                    System.out.print("Enter Orbital Period of the planet:");
                                    porbital=scan.next();
                                    System.out.print("Enter Rotation period of the planet:");
                                    protation=scan.next();
                                    System.out.print("Enter Diameter of the planet:");
                                    pdiameter=scan.next();
                                    uf.planetUpdate(id,pname,pdiameter,porbital,protation,moon,rings,sid,ptype);
                               }
                               else
                               {
                                   break;
                               }
                            }
                            else if(choiceinput==6)
                            {
                                String ans;
                               Scanner temp=new Scanner(System.in);
                               uf.MoonsFetch();
                               System.out.println("Do you want to update any record(yes/no)?");
                               ans=temp.next();
                               if(ans.equals("yes")||ans.equals("YES"))
                               {
                                   int id,pid;
                                    String mname,mdistance,mdescription;
                                    Scanner scan=new Scanner(System.in);
                                    System.out.print("Enter ID:");
                                    id=scan.nextInt();
                                    System.out.print("Enter Planet ID:");
                                    pid=scan.nextInt();
                                    System.out.print("Enter Name of the Moon:");
                                    mname=scan.next();
                                    System.out.print("Enter Distance of the moon:");
                                    mdistance=scan.next();
                                    System.out.print("Enter Description of the moon:");
                                    mdescription=scan.next();
                                    uf.moonUpdate(id,mname,mdistance,mdescription,pid);
                               }
                               else
                               {
                                   break;
                               }
                            }
                            else if(choiceinput==7)
                            {
                                String ans;
                               Scanner temp=new Scanner(System.in);
                               uf.RingsFetch();
                               System.out.println("Do you want to update any record(yes/no)?");
                               ans=temp.next();
                               if(ans.equals("yes")||ans.equals("YES"))
                               {
                                   int id,pid;
                                String rname,rdescription;
                                Scanner scan=new Scanner(System.in);
                                System.out.print("Enter ID:");
                                id=scan.nextInt();
                                System.out.print("Enter Planet ID:");
                                pid=scan.nextInt();
                                System.out.print("Enter Name of the Ring:");
                                rname=scan.next();
                                System.out.print("Enter Description of the Ring:");
                                rdescription=scan.next();
                                uf.ringUpdate(id,rname,rdescription,pid);
                               }
                               else
                               {
                                   break;
                               }
                            }
                            else
                            {
                                System.out.println("Please select valid choice");
                            }
                            
                            
                        }while(choiceinput!=0);
                    }
                }while(choiceinput!=0);      
            }
          //casse 3 end
          //case 4
            else if(choiceinput==4)
            {
                System.out.println("Hello User");
                log.UserLogin();
                do
                {
                    System.out.println("0. Main Menu");
                    System.out.println("1. List all Cluster");
                    System.out.println("2. Search Cluster");
                    System.out.println("3. List all Galaxy");
                    System.out.println("4. Search Galaxy");
                    System.out.println("5. SolarSystem");
                    System.out.println("6. Sun");
                    System.out.println("7. List all Planets");
                    System.out.println("8. Search Planets");
                    System.out.println("9. List all Astronomers");
                    System.out.println("10. Search Astronomer");
                    System.out.println("11. List all Scientist");
                    System.out.println("12. Search Scientist");
                    System.out.println("Enter your choice: ");
                    choiceinput=choice.nextInt();
                    if(choiceinput==0){
                        System.exit(0);
                    }
                    else if(choiceinput==1){
                        uf.ClusterFetch();
                    }
                    else if(choiceinput==2){
                        String clusterName;
                        System.out.println("Enter the Cluster Name you want to know.");
                        clusterName=choice.next();
                        uf.ClusterSearch(clusterName);
                    }
                    else if(choiceinput==3){
                        uf.GalaxyFetch();
                    }
                    else if(choiceinput==4){
                        String galaxyName;
                        System.out.println("Enter the Galaxy Name you want to know.");
                        galaxyName=choice.next();
                        uf.GalaxySearch(galaxyName);
                    }
                    else if(choiceinput==5){
                        uf.SolarSystemFetch();
                    }
                    else if(choiceinput==6){
                        uf.SunFetch();
                    }
                    else if(choiceinput==7){
                        uf.PlanetsFetch();
                    }
                    else if(choiceinput==8){
                        String planetName;
                        System.out.println("Enter the planet Name you want to know.");
                        planetName=choice.next();
                        uf.PlanetSearch(planetName);
                    }
                    else if(choiceinput==9){
                        uf.AstronomerFetch();
                    }
                    else if(choiceinput==10){
                        String astronomerName;
                        System.out.println("Enter the Astronomer Name you want to know.");
                        astronomerName=choice.next();
                        uf.AstronomerSearch(astronomerName);
                    }
                    else if(choiceinput==11){
                        uf.ScientistFetch();
                    }
                    else if(choiceinput==12){
                        String scientistName;
                        System.out.println("Enter the Scientist Name you want to know.");
                        scientistName=choice.next();
                        uf.ScientistSearch(scientistName);
                    }
                    else
                    {
                        System.out.println("Please select valid choice");
                    }
                }while(choiceinput!=0);
            }
          //case 4 end
          //termination condition
            else
            {
                System.out.println("Please select valid choice");
            }
          //termination condition end
        }while(choiceinput!=0);   
    }  
}
