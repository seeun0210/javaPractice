package chapter3_ch14;

public class Employee {
    public static int getSerialNum() {

        int i =0;
//        employeeName="Lee"; //instance 변수는 static method내에서 사용할 수 없다.
        //staic 변수가 메모리에 올라와 있어도 instance가 생성되지 않으면 instance변수는 생성되지 않았기 때문에 거기에 할당하는 건 당연히 불가능하다.
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Employee.serialNum = serialNum;
    }

    private static int serialNum=1000;//기준이 되는 static 변수는 매우 중요하므로 외부에서 변경할 수 없어야 한다.
    private int employeeId;
    private String employeeName;
    private String department;
    public Employee(){
        employeeId=++serialNum;
    }//Employee를 생성할 때 serialNum을 증가시켜 할당시킨다
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }



    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        serialNum++;
        this.employeeName = employeeName;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        serialNum++;//instance method에서 static변수를 할당하는 건 상관없다. 왜냐면 이미 메모리에 올라와 있는 거니까..!!!
        this.department = department;
    }
}
