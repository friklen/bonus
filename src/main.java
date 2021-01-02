class Main {
    public static void main(String[] args) {
        long balance = 100;
        long chek = 1500;
        long amount;
        long bonus = chek / 100;
        if (chek <= 100) {
            bonus = 0;
            amount = balance + chek;
        }
        if (chek > 100) {
            bonus = chek / 100;
            balance = chek+ bonus;
        }
        System.out.println(bonus);
    }
}








