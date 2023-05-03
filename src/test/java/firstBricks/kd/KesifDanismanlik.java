package firstBricks.kd;

public class KesifDanismanlik {
    private  String name;
    private int salary;
    private int ssn;
    public KesifDanismanlik(){
  //      ***
//Eger bu constroctori yazmazsak parametreli olusturdugumuz constractr default olan constroctori
// override yapiyo cagiramiyoruz baska bi classta
    }

    public KesifDanismanlik(String name, int salary, int ssn){
        this.name=name;
        this.salary=salary;
        this.ssn=ssn;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSsn(int i) {
        return ssn;
    }


    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "KesifDanismanlik{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", ssn=" + ssn +
                '}';
    }


}
