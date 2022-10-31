public class DataTypes {
    public static void main (String [] args){

        int n= 1234567890;
        long nL= 1234567891234L;
        int l= 6445543;

        double nD= 3.14516;
        float nf= 123.6287837327F;

        var salary= 1000;
        var pension = salary*0.03;
        var totalSalary= salary-pension;
        var employeeName= "David Mena";
        System.out.print(salary);
        System.out.print(pension);
        System.out.print(totalSalary);
        System.out.print("Empleado: "+ employeeName + "Salary: "+ totalSalary + "ID: " + l);




    }
}
