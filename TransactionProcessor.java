import java.util.*;

public class TransactionProcessor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, String> transactions = new HashMap<>();
        List<String> errors = new ArrayList<>();

        System.out.print("Enter number of commands: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {

            System.out.print("Enter command: ");
            String command = sc.nextLine();

            String[] parts = command.split(" ");
            String operation = parts[0];
            String txId = parts[1];

            switch (operation) {

                case "create":
                    transactions.put(txId, "active");
                    break;

                case "update":
                    if (!transactions.containsKey(txId)) {
                        errors.add("update attempted on non-existent transaction " + txId);
                    } 
                    else if (transactions.get(txId).equals("cancelled")) {
                        errors.add("update attempted on cancelled transaction " + txId);
                    }
                   
                    break;

                case "cancel":
                    if (transactions.containsKey(txId)) {
                        transactions.put(txId, "cancelled");
                    }
                    break;

                default:
                    System.out.println("Invalid command");
            }
        }

        // final output
        System.out.println("\nFinal transaction status:");
        for (Map.Entry<String, String> entry : transactions.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nErrors:");
        for (String error : errors) {
            System.out.println(error);
        }

        sc.close();
    }
}
