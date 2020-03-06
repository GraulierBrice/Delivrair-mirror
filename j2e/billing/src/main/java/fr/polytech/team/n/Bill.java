import java.util.Calendar;

public class Bill {
    private int id;
    private double amount;
    private Calendar creationDate;
    private BillStatus status;

    public Bill(int id, double amount) {
        this.id = id;
        this.amount = amount;
        this.creationDate = Calendar.getInstance();
        this.status = BillStatus.PENDING;
    }
}