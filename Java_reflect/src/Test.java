
public class Test {
    public static void main(String[] args) throws Exception {
        EmpAction empAction = new EmpAction();
        String value = "emp.name:蛋哥|emp.job:Linux Coder";
        empAction.setValue(value);
        System.out.println(empAction.getEmp());
    }
}
