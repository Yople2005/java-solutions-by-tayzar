public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("1234", "Hammer", 2, 9.99);

        System.out.printf("Part Number: %s%n", invoice.getPartNumber());
        System.out.printf("Part Description: %s%n", invoice.getPartDescription());
        System.out.printf("Quantity: %d%n", invoice.getQuantity());
        System.out.printf("Price per Item: $%.2f%n", invoice.getPricePerItem());
        System.out.printf("Invoice Amount: $%.2f%n", invoice.getInvoiceAmount());

        invoice.setQuantity(-5);
        invoice.setPricePerItem(-15.99);

        System.out.printf("%nModified Invoice Information:%n");
        System.out.printf("Quantity: %d%n", invoice.getQuantity());
        System.out.printf("Price per Item: $%.2f%n", invoice.getPricePerItem());
        System.out.printf("Invoice Amount: $%.2f%n", invoice.getInvoiceAmount());
    }
}
