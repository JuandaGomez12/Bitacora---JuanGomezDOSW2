package edu.dosw.bitacora.Semana1.Streams;

import java.util.List;

class Transaction {
    private String id;
    private double amount;
    private boolean approved;

    public Transaction(String id, double amount, boolean approved) {
        this.id = id;
        this.amount = amount;
        this.approved = approved;
    }

    public String getId() { return id; }
    public double getAmount() { return amount; }
    public boolean getApproved() { return approved; }

    @Override
    public String toString() {
        return "Transaction{id='" + id + "', amount=" + amount + ", approved=" + approved + "}";
    }
}

public class Reto5 {
    public static void main(String[] args) {
        List<Transaction> transactions = List.of(
            new Transaction("T001", 1500.00, true),
            new Transaction("T002", 200.50, true),
            new Transaction("T003", 980.75, true),
            new Transaction("T004", 450.00, false)
        );

        boolean isValid = !transactions.stream()
                .peek(t -> System.out.println("Procesando: " + t))
                .anyMatch(t -> !t.getApproved());

        System.out.println("Lote válido: " + isValid);
    }
}