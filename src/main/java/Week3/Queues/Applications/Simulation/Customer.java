package Week3.Queues.Applications.Simulation;

public class Customer {
    private int clock;
    private int transactionTime;
    private int numberOfArrivals;

    Customer(int clock, int transactionTime, int numberOfArrivals){
        this.clock = clock;
        this.transactionTime = transactionTime;
        this.numberOfArrivals = numberOfArrivals;

    }

    public int getTransactionTime() {
        return transactionTime;
    }

    public int getArrivalTime() {
        return clock;
    }

    public int getCustomerNumber() {
        return numberOfArrivals;
    }
}
