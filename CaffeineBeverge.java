
//咖啡因饮料是一个抽象类
abstract class CaffeineBeverge{
    //现在用一个prepareRecipe()方法处理茶和咖啡
    //声明为final的原因是想让子类只能用这个方法，而不能覆盖这个方法
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    //咖啡喝茶处理这些方法不同，因此这两个方法必须被声明为抽象方法，留给子类实现
    abstract void brew();
    abstract void addCondiments();
    public void boilWater(){
        System.out.println("将水煮沸");
    }
    public void pourInCup(){
        System.out.println("将饮料到进杯子中");
    }
}

class Coffee extends CaffeineBeverge{
    public void brew(){
        System.out.println("冲泡咖啡");
    }
    public void addCondiments(){
        System.out.println("加糖和牛奶");
    }
}
class Tea extends CaffeineBeverge{
    public void brew(){
        System.out.println("冲泡茶");
    }
    public void addCondiments(){
        System.out.println("加柠檬");
    }
}
public class test{
    public static void main(String[] args){
        CaffeineBeverge coffee = new Coffee();
        CaffeineBeverge tea = new Tea();
        coffee.prepareRecipe();
        tea.prepareRecipe();
    }
}

