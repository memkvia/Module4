package Task_4_1;

/**
 * Created by Me Mkvia on 02.12.2016.
 */
public interface BankSystem {
    void withdrawOfUser (User user, int amount);
    void fundUser (User user, int amount);
    void transferMoney (User fromUser, User toUser,int amount);
    void paySalary (User user);
}
