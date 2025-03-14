package kiosk;

public class MenuItem {

    //속성
    private String name;
    private String price;
    private String ingredient;


    //생성자
    public MenuItem( String name,String price,String ingredient) {
        this.name = name;
        this.price = price;
        this.ingredient = ingredient;
    }

    //기능

    //getter

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getIngredient() {
        return ingredient;
    }

}