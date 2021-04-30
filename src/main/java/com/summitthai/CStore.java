package com.summitthai;

public class CStore {
    private BankingService bankingService;

    public CStore(BankingService bankingService) {

        this.bankingService = bankingService;
    }

    public String deposit(String accountNumber, int amount) {
        // Check Service Time

        int depositOfTheseDay = this.bankingService.getDepositOfTheseDay(accountNumber);

        if (amount + depositOfTheseDay > 50000) {
            return "NO";
        }

        return "OK";
    }
}
