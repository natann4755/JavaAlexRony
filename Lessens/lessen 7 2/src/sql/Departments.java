package sql;

public class Departments {
    private int departmentsId;
    private String departmentsName;
    private int managerId;
    private int locationId;


    public Departments(int departmentsId, String departmentsName, int managerId, int locationId) {
        this.departmentsId = departmentsId;
        this.departmentsName = departmentsName;
        this.managerId = managerId;
        this.locationId = locationId;
    }
    public Departments() {
    }
    public int getDepartmentsId() {
        return departmentsId;
    }

    public void setDepartmentsId(int departmentsId) {
        this.departmentsId = departmentsId;
    }

    public String getDepartmentsName() {
        return departmentsName;
    }

    public void setDepartmentsName(String departmentsName) {
        this.departmentsName = departmentsName;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }
}
