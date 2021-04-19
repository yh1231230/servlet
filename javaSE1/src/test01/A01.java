package test01;


public class A01 {
    private int id;
    private String name;
    private String pwd;
    private boolean flag;

    public A01() {
    }

    
    public A01(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public A01(int id, String name, String pwd, boolean flag) {
       this(id,name,pwd);
        this.flag = flag;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id<1001||id>9999)
            System.out.println("ID错误");
        else
            this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }


    @Override
    public String toString() {
        return "A01{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", flag=" + flag +
                '}';
    }
}