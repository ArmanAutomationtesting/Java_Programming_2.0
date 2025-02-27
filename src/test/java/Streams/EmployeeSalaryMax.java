package Streams;
import com.sun.jdi.IntegerType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;

public class EmployeeSalaryMax {
    private  String EmployeeName;
    private  int EmployeeSalary;
    private Date date;

    public EmployeeSalaryMax(String EmployeeName,int EmployeeSalary,Date date){
        this.date = date;
        this.EmployeeSalary = EmployeeSalary;
        this.EmployeeName = EmployeeName;
    }

    @Override
    public String toString() {
        return "EmployeeSalaryMax{" +
                "EmployeeName='" + EmployeeName + '\'' +
                ", EmployeeSalary=" + EmployeeSalary +
                ", date=" + date +
                '}';
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public int getEmployeeSalary() {
        return EmployeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        EmployeeSalary = employeeSalary;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date ArmanDate = simpleDateFormat.parse("04-12-1996");
        Date IqraDate = simpleDateFormat.parse("12-11-2001");

        List<EmployeeSalaryMax> list = Arrays.asList(
               new EmployeeSalaryMax("Arman",80000,ArmanDate),
                new EmployeeSalaryMax("Iqra",90000,IqraDate)
        );

       EmployeeSalaryMax maxSlary =  list.stream().sorted((a,b) -> Double.compare(b.getEmployeeSalary(),a.getEmployeeSalary()))
                       .skip(1)
                               .findFirst()
                                       .get();




        System.out.println(maxSlary);

        IntStream.rangeClosed(1,3).forEach(i -> {

        });
    }






}
