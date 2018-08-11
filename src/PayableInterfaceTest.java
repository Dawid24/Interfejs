public class PayableInterfaceTest {
    public static void main(String[] args) {
        Payable[] payableObjects = new Payable[] {
                new Invoice("01234", "siedzenie", 2, 375.00),
                new Invoice("56789", "opona", 4, 79.95),
                new SalariedEmployee("Anna", "Nowak", "111-11-1111", 800.00),
                new SalariedEmployee("Jan", "Kowalski", "888-88-8888", 1200.00)
        };

        System.out.println("Obiekty Invoice i Employee przetwarzane polimorficznie:");

        for (Payable currentPayable : payableObjects) {
            System.out.printf("%n%s %nkwota płatności: %,.2f zł%n", currentPayable.toString(), currentPayable.getPaymentAmount());
        }
    }
}
