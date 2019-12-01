package sql;;

import java.sql.*;
import java.util.ArrayList;

public class sqlite {
    public static final String DBFILE="DB2.bd";
    public static final String PATHNAME ="jdbc:sqlite:\\C:\\Users\\stu.RAVTECH\\Desktop\\"+DBFILE;


    public static final String departmentsId = "DEPARTMENT_ID";
    public static final String departmentsName = "DEPARTMENT_NAME";
    public static final String managerId = "MANAGER_ID";
    public static final String locationId = "LOCATION_ID";

    public static final String insert = "INSERT INTO departments"+ '('+ departmentsId +','+departmentsName+','+managerId+','+locationId+") VALUES(?,?,?,?)";




    private Connection c;
    private Statement s;
    private PreparedStatement insertnew;

    public  boolean jj(){
        try {
           c = DriverManager.getConnection(PATHNAME);
            insertnew=c.prepareStatement(insert);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void putValue(int departmentId, String departmentsName, int managerId, int locationId)throws SQLException{
        insertnew.setInt(1,departmentId);
        insertnew.setString(2,departmentsName);
        insertnew.setInt(3,managerId);
        insertnew.setInt(4,locationId);
        insertnew.executeUpdate();
    }

    public ArrayList creatObgect (){
        ArrayList<Departments> D =new ArrayList<>();
        try {
            s=c.createStatement();
            ResultSet rs =s.executeQuery("SELECT * FROM departments;");
            while (rs.next()){
                Departments  d = new Departments();
                d.setDepartmentsId(rs.getInt(departmentsId));
                d.setDepartmentsName(rs.getString(departmentsName));
                d.setManagerId(rs.getInt(managerId));
                d.setLocationId(rs.getInt(locationId));
                D.add(d);
                //D.add(new Departments(rs.getInt(departmentsId),rs.getString(departmentsName),rs.getInt(managerId),rs.getInt(locationId)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return D;
    }

    public void close (){
        if (this.c!=null) {
            try {
                this.c.close();
                System.out.println("The connection closed");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
