package com.company;

public class Milk extends Product{
    public Milk(String type, String model, int quantity) {
        super(type, model, quantity);
    }
static class Battern {
   public String  retsept(){

        return "Мен суттон жасалганмын ";
    }
}
static class Tworeg extends Battern{
    public String retsept(){
        return super.retsept()+" жана маслодон жасалганмын";
    }
static class Syr{
        public String metod(){
            return " Мен эн кичинекей классмын";
        }
}
}
}
