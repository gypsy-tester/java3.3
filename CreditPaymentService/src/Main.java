public class Main {

    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        double myResult = service.calculate(1_000_000, 9.99, 12);
        System.out.println("При сумме кредита 1000000 под процентную ставку 9.99% на год");
        System.out.printf("Ежемесячный платеж составит: " + "%.0f",myResult);
        System.out.println();

        System.out.println("При сумме кредита 1000000 под процентную ставку 9.99% на 2 года");
        System.out.printf("Ежемесячный платеж составит: " + "%.0f",service.calculate(1_000_000, 9.99, 24));
        System.out.println();

        System.out.println("При сумме кредита 1000000 под процентную ставку 9.99% на 3 года");
        System.out.printf("Ежемесячный платеж составит: " + "%.0f",service.calculate(1_000_000, 9.99, 36));
    }


}
