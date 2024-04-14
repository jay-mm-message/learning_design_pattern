public class DogSmallGermanShepherd extends Dog {

    DogSmallGermanShepherd(String color, Integer age, Double pound) {
        super("Small German Shepherd", color, age, pound);
        super.setBarkBehavior(new BarkSmall());
    }

    @Override
    public void showSalePrice() {
        System.out.println("1000 US dollars");
    }
    
}
