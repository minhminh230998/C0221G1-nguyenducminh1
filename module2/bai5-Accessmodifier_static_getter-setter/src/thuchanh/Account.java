package thuchanh;

public class Account<tranferTo> {
    private int id;
    private String name;
    private int balance;

    public Account() {
    }

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void napTien(int tien){
        if(tien<=0){
            System.out.println("nạp tiền không thành công");
        }else {
            this.balance += tien;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void rutTien(int tien){
        if(this.balance<tien){
            System.out.println("rút tiền không thành công");
        }else {
            this.balance -= tien;
        }
    }
    public void chuyenTien(Account nhanTien,int tien){
        if(this.balance<tien){
            System.out.println("chuyễn tiền không thành công");
        }else {
            this.balance -= tien;
            nhanTien.napTien(tien);
        }
    }

    public static void main(String[] args) {
        Account account1=new Account(1,"A",10000);
        Account account2=new Account(2,"B",100);
        System.out.println(account1.toString());
        System.out.println(account2.toString());
        account2.napTien(10000);
        System.out.println(account1.toString());
        account2.rutTien(20);
        System.out.println(account2.toString());
        account1.chuyenTien(account2,1000);
        System.out.println(account1.toString());
        System.out.println(account2.toString());
    }
}

