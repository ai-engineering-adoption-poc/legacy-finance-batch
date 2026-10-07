import java.io.File;
import java.time.LocalDate;

public class FinanceBatch {

    public static void main(String[] args) {

        System.out.println("Starting finance settlement batch");

        LocalDate processingDate = LocalDate.now();

        File inputFile = new File("input/transactions.csv");

        if (!inputFile.exists()) {
            System.out.println("Transaction input file not found");
            return;
        }

        System.out.println(
            "Processing transactions for " + processingDate
        );

        System.out.println("Settlement completed");
    }
}
