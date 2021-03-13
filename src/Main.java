public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 60;
        int height = 3;
        int index = service.calculate(weight,height);
        System.out.println(index);
    }
}
