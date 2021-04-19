package test01;

public class Fangfa {
    public static void main(String[] args) {
        late(30,1000);
    }

    public static void late(int lateMinute, int salary) {
        int fakuan = 0;
        if (lateMinute < 10)
            System.out.println("警告");
        else if (lateMinute < 20) {
            fakuan = 100;
            System.out.println("罚款100元");
        } else if (lateMinute < 30) {
            fakuan = 200;
            System.out.println("罚款200元");
        } else if (lateMinute < 60) {
            fakuan = (int) (salary / (21.75 * 2));
            System.out.println("罚款半日工资"+fakuan+"元");
        } else {
            fakuan = (int) (salary * 3 / (21.75 * 2));
            System.out.println("罚款三日工资" + fakuan+"元");
        }
    }
}
