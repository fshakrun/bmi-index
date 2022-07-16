public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 77;
        double height = 1.77;
        double bmi = service.calculate(weight, height);
        System.out.printf("%.2f\n", bmi);
    }
}