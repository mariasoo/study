public class NutritionFacts {

    private final int servingSize; //(m1,1회 제공량) 필수
    private final int servings; //(m1, n회 제공량) 필수
    private final int calories; //(1회 제공량 당) 선택
    private final int fat; //(g, 1회 제공량) 선택

    private final int sodium; //선택

    private final int carbonhydrate; //선택

//    public NutritionFacts(){}
//    public NutritionFacts(int servingSize, int servings){
//        this.servings = 0;
//        this.servingSize = 0;
//    }
//    public NutritionFacts(int servingSize, int servings, int calories){}
//}

    public static class Builder {
        //필수 매개변수
        private final int servingSize; //(m1,1회 제공량) 필수
        private final int servings; //(m1, n회 제공량) 필수

        // 선택 매개변수
        private int calories = 0; //(1회 제공량 당) 선택
        private int fat = 0; //(g, 1회 제공량) 선택

        private int sodium = 0; //선택

        private int carbonhydrate = 0; //선택

        public Builder(int servingSize, int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }
        public Builder calories(int val){
            calories = val;
            return this;
        }
        public Builder carbohydrate(int val){
            carbonhydrate = val;
            return this;
        }
        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }
    private NutritionFacts(Builder builder){
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbonhydrate = builder.carbonhydrate;
    }
}
