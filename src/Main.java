public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Итоговые данные:");

        System.out.println();
        System.out.println("Сумма = 1_000_000, Срок = 12, Ставка = 9.99%");
        System.out.println("Ежемесячный платеж: " + service.calculate(1_000_000, 12, 9.99));

        System.out.println();
        System.out.println("Сумма = 1_000_000, Срок = 24, Ставка = 9.99%");
        System.out.println("Ежемесячный платеж: " + service.calculate(1_000_000, 24, 9.99));

        System.out.println();
        System.out.println("Сумма = 1_000_000, Срок = 36, Ставка = 9.99%");
        System.out.println("Ежемесячный платеж: " + service.calculate(1_000_000, 36, 9.99));


    }

}
