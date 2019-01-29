
class Goods{

    private String name;

    private Integer count;

    private Double price;


    public Goods(String name, Integer count, Double price) {

        this.name = name;

        this.count = count;

        this.price = price;

    }


    public String getName() {
 
       return name;

    }


    public void setName(String name) {

        this.name = name;

    }


    public Integer getCount() {

        return count;

    }


    public void setCount(Integer count) {

        this.count = count;

    }


    public Double getPrice() {

        return price;

    }


    public void setPrice(Double price) {

        this.price = price;

    }

}

public class Test3 {

    public static void main(String[] args) {

        List<Goods> list = new ArrayList<>();

        //添加购物车

        list.add(new Goods("macbookPro",10,17800.0));

        list.add(new Goods("《Java从入门到放弃》",100,21.5));

        list.add(new Goods("纪梵希口红",20,300.5));

        list.add(new Goods("鼠标",10,100.5));

        Double allPrice = list.stream().map(obj -> obj.getCount()*obj.getPrice())
                .reduce((sum,x) -> sum+x).get();

    }

}