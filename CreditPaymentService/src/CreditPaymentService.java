public class CreditPaymentService {

    public double calculate(double creditAmmount, double rate, double term) {
        double percent = rate / (100 * 12);
        double payment;
        payment = creditAmmount * percent / (1 - Math.pow((1 + percent), -term));

        return payment;
    }
}
