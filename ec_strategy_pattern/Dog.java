public abstract class Dog {
    // bark for behavior
    private BarkBehavior barkBehavior;

    protected void setBarkBehavior(BarkBehavior barkBehavior) {
        this.barkBehavior = barkBehavior;
    }

    public void performBark() {
        barkBehavior.barkSound();
    }

    public void display() {
        String content = new String();
        content += "Variety: " + getVariety();
        content += ", Age: " + getAge();
        content += ", Color: " + getColor();
        content += ", Pound: " + getPound();

        System.out.println(content);
    }

    public abstract void showSalePrice();

    // information color, pound, age
    private String color;
    private Double pound;
    private Integer age;
    private String variety;

    private String getColor() {
        return color;
    }
    private Double getPound() {
        return pound;
    }
    private Integer getAge() {
        return age;
    }
    private String getVariety() {
        return variety;
    }

    private void setColor(String color) {
        this.color = color;
    }
    private void setPound(Double pound) {
        this.pound = pound;
    }
    private void setAge(Integer age) {
        this.age = age;
    }
    private void setVariety(String variety) {
        this.variety = variety;
    }

    Dog(String variety, String color, Integer age, Double pound) {
        setVariety(variety);
        setColor(color);
        setPound(pound);
        setAge(age);
    }
}