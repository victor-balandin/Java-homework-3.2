public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double massBody = 77.0;
        double heightBody = 1.80;
        double myBmi = service.calculate(massBody, heightBody);
        System.out.print("ИМТ = ");
        System.out.printf("%.1f",myBmi);
    }
}