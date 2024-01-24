package ppl;

public class Employee extends Person  {
    private String position;
    private double salary;

    public Employee(){
        super();
    }
    public Employee(String name,String surename,String position,double salary){
        super(name,surename);
        this.position=position;
        this.salary=salary;
    }

    public String getPosition(){
        return position;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public double getSalary(){
        return salary;
    }

    public String toString(){
        return "Employee: "+super.toString();
    }




}
