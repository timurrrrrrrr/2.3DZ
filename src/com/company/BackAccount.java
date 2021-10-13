package com.company;

class BackAccount {
    private double amount;

    public double getAmount() {

        return amount;

    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void deposit(double sum){
        setAmount(amount+sum);
        System.out.println("Поступило на счет  + " +sum+" сом");
    }
    public double withDraw(int sum) throws LimitException {
        if (sum > amount){
            throw new LimitException(":",getAmount());
        }
        amount -= sum;
        System.out.println("Сумма снятие - " + sum+"сом");
        return amount;
    }

}















