package ppl;

public class Person {
    private int id;
    private String name;
    private String surname;
    private int idcnt=0;

    public Person(){
        this.id=++idcnt;
    }
    public Person(String name, String surname){
        this();
        this.name=name;
        this.surname=surname;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }

    public String toString(){
        return id+". "+name+" "+surname;
    }

    public String getPosition(){
        return "Student";
    }


}
