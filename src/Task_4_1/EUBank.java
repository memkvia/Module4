package Task_4_1;

/**
 * Created by Me Mkvia on 02.12.2016.
 */
public class EUBank extends Bank {
    Curr curr = Curr.EUR;

    public EUBank(long id, String bankCountry, Curr currency, int numberOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int LimitOfWithdrawal = 0;
        switch (curr) {
            case USD:
                LimitOfWithdrawal = 2200;
                break;
            case EUR:
                LimitOfWithdrawal = 2000;
                break;
        }
        return LimitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int LimitOfFunding = 0;
        switch (curr) {
            case EUR:
                LimitOfFunding = 20000;
                break;
            case USD:
                LimitOfFunding = 10000;
                break;
        }
        return LimitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        int monthlyRate = 0;
        switch (curr) {
            case EUR:
                monthlyRate = 1;
                break;
            case USD:
                monthlyRate = 0;
                break;
        }
        return monthlyRate;
    }

    @Override
    int getCommission(int summ) {
        int commission = 0;
        switch (curr) {
            case EUR:
                if (summ < 1000) {
                    commission = 2;
                } else if (summ >= 100) {
                    commission = 4;
                }
                break;
            case USD:
                if (summ < 1000) {
                    commission = 5;
                } else if (summ >= 100) {
                    commission = 7;
                }
                break;
        }
        return commission;
    }


    @Override
    double moneyPaidMonthlyForSalary() {
        return 0;
    }

}
