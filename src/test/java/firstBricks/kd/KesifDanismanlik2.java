package firstBricks.kd;

public class KesifDanismanlik2 {
    public static void main(String[] args) {
        KesifDanismanlik employee= new KesifDanismanlik();
        KesifDanismanlik employee2=new KesifDanismanlik("ayten",100000,12345);
    KesifDanismanlik3 employee3=new KesifDanismanlik3();
    employee3.getName();
    employee3.setName("kerime");
    employee3.setSalary(100003);
    employee3.setSsn(11993);
        System.out.println(employee3.getName());
        System.out.println(employee3.toString());
    }
}
