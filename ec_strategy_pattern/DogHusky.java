public class DogHusky extends Dog {

    DogHusky(String color, Integer age, Double pound) {
        super("Husky", color, age, pound);
        super.setBarkBehavior(new BarkLarge());
    }

    @Override
    public void showSalePrice() {
        System.out.println("500 US dollars");
    }
    
}