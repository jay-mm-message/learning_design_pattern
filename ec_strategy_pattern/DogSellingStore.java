public class DogSellingStore {
    public static void main(String[] args) {

        System.out.println();
        
        DogHusky husky = new DogHusky("pure white", 3, 6.5);
        DogSmallGermanShepherd smallGermanShepherd = new DogSmallGermanShepherd("brown", 3, 3.5);

        husky.showSalePrice();
        husky.display();
        husky.performBark();

        smallGermanShepherd.showSalePrice();
        smallGermanShepherd.display();
        smallGermanShepherd.performBark();
    }
}
