package project_7;


class А {
     void meth() {
        System.out.println("Этo метод final.");
    }
}

    class В extends А {

        void meth() { // Ошибка! Этот метод не может быть переопределен
            System.out.println("Heдoпycтимo!");
        }
    }