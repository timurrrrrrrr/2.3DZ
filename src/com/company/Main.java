package com.company;



public class Main {

    public static void main (String[]args){
        BackAccount backAccount= new BackAccount();
        backAccount.getAmount();

        backAccount.deposit (20000);



        while (true) {

            try {
                System.out.println("Остаток счета " + backAccount.getAmount() +  "сом");
                backAccount.withDraw(6000);

                System.out.println("-----------------");

            } catch (LimitException e) {
                System.out.println(e.getMessage()+"Запрашиваемая сумма на снятие больше чем остаток денег на счете");

                try {
                    backAccount.withDraw((int) backAccount.getAmount());

                    System.out.println("-----------------");
                    System.out.println("обший счет " + backAccount.getAmount());


                } catch (LimitException limitException) {
                    System.out.println(limitException.getMessage());
                }
                break;
            }
        }

    }
}






