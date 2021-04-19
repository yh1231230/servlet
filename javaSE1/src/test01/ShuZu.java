package test01;

public class ShuZu {

    public static void main(String[] args) {
        Shop s1=new Shop(1,"鼠标","BZ_001",99.21,0.9);
        Shop s2=new Shop(2,"玩偶","WO_102",403.00,0.7);
        Shop s3=new Shop(3,"java","BK_001",89.00,0.8);
        Shop s4=new Shop(4,"西装","GQ_XF_12",700.00,0.5);
        Shop s5=new Shop(5,"手机","DM_PH_13",900.00,0.3);
        Shop[] shops=new Shop[5];
        shops[0]=s1;
        shops[1]=s2;
        shops[2]=s3;
        shops[3]=s4;
        shops[4]=s5;
        bianLi(shops);
        select(shops);
    }

    static void bianLi(Shop[] shops){
            for (int i=0;i<shops.length;i++){
                System.out.println(shops[i]);
            }
    }

    static void select(Shop[] shops){
        for (int i=0;i<shops.length;i++){
            if(shops[i].getPrice()*shops[i].getZk()>150)
                System.out.println(shops[i].getName());
        }
    }
}

class Shop{
    private int id;
    private String name;
    private String size;
    private double price;
    private double zk;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getZk() {
        return zk;
    }

    public void setZk(double zk) {
        this.zk = zk;
    }

    public Shop(){

    }
    public Shop(int id, String name, String size, double price, double zk) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.price = price;
        this.zk = zk;
    }

    @Override
    public String toString() {
        return getId()+'\t'+getName()+'\t'+getSize()+'\t'+getPrice()+'\t'+getZk();
    }
}