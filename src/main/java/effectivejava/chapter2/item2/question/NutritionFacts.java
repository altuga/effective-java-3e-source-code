package effectivejava.chapter2.item2.question;

// Builder Pattern  (Page 13)
// TODO initialize the class
public class NutritionFacts {
    private final int servingSize = 0;
    private final int servings = 0 ;
    private final int calories = 0; // optional
    private final int fat = 0;  // optional
    private final int sodium = 0; // optional
    private final int carbohydrate = 0; // optional


    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts();
        System.out.println(nutritionFacts);
    }
}