package lesson17;

public class Transaction {
    
    String date;
    String detail;
    int account;
    long money;

    Transaction( String date, String detail, int account, long money) {
        
        this.date = date;
        this.detail = detail;
        this.account = account;
        this.money = money;

    }

      public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getAccount() {
        return account;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public long getMoney() {
        return money;
    }

    public String toString() {    
        return date + " - " + detail + " - " + account + " - " + money +"vnd";
}   

}
