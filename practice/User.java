 class Poly {
    private int price;
    private String goods;
    public void Setprice(int p){
        price=p;
    }
    public int getprice(){
        return price;
    }
    public void setgoods(String a){
        goods=a;
    }
    public String getGoods(){
        return goods;
    }
}
class User {
    public static void main(String[] args) {
        Poly obj=new Poly();
        obj.setgoods("Coat");
        System.out.println(obj.getGoods());
        obj.Setprice(1000);
        System.out.println(obj.getprice());
    }
}
