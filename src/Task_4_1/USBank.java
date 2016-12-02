package Task_4_1;

/**
 * Created by Me Mkvia on 02.12.2016.
 */
public class USBank extends Bank {
    public USBank(long id, String bankCountry, Curr currency, int numberOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, rating, totalCapital);
    }

    Curr curr = Curr.USD;

    public int getMonthlyRate() {
        int monthlyRate = 0;
        switch (curr) {
            case USD:
                monthlyRate = 1;
                break;
            case EUR:
                monthlyRate = 2;
                break;
        }
        return monthlyRate;
    }

    public int getLimitOfWithdrawal() {
        int LimitOfWithdrawal = 1000;
        switch (curr) {
            case USD:
                LimitOfWithdrawal = 1000;
                break;
            case EUR:
                LimitOfWithdrawal = 1200;
                break;
        }

        return LimitOfWithdrawal;
    }

    public int getLimitOfFunding() {
        int LimitOfFunding;
        if (curr == Curr.EUR) {
            LimitOfFunding = 10000;
        } else {
            LimitOfFunding = Integer.MAX_VALUE;
        }
        return LimitOfFunding;
    }

    public int getCommission(int summ) {
        int getCommission = 0;
        switch (curr) {
            case USD:
                if (summ < 1000) {
                    getCommission = 5;
                } else if (summ >= 1000) {
                    getCommission = 7;
                }
                break;
            case EUR:
                if (summ < 1000) {
                    getCommission = 6;
                } else if (summ >= 1000) {
                    getCommission = 8;
                }
                break;
        }
        return getCommission;
    }

    public double moneyPaidMonthlyForSalary() {
        return 0;
    }


}
