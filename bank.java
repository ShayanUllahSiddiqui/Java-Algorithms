public class bank {
    int money;

    public bank(int money) {
        this.money = money;
    }
    public int getBalance() {
        return money;
    }
}


class bankA extends bank{
    public bankA(int money) {
        super(money);
        this.money = money;
    }
    @Override
    public int getBalance() {
        return money;
    }
}




class bankB extends bank{
    public bankB(int money) {
        super(money);
        this.money = money;
    }
    @Override
    public int getBalance() {
        return money;
    }
}




class bankC extends bank{
    public bankC(int money) {
        super(money);
        this.money = money;

    }
    @Override
    public int getBalance() {
        return money;
    }



    public static void main(String[] args) {

        bank m = new bankA(1000);
        System.out.println("Bank A got money deposited of amount $"+ m.getBalance());

        bank mm = new bankB(1500);
        System.out.println("Bank B got money deposited of amount $"+ mm.getBalance());

        bank mmm = new bankC(2000);
        System.out.println("Bank C got money deposited of amount $"+ mmm.getBalance());
    }
}

    

