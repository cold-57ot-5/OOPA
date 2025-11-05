class Account<T> {
    private T balance;
    public Account(T balance) { this.balance = balance; }
    public T getBalance() { return balance; }
    public static <T> void displayBalance(Account<T> acc) {
        System.out.println("Balance: " + acc.getBalance());
    }

    public static void main(String[] args) {
        Account<Double> savings = new Account<>(15000.75);
        Account.displayBalance(savings);
    }
}
