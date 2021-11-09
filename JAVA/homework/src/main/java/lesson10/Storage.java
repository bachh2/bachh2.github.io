package lesson10;

public class Storage implements Comparable<Storage> {
    private int id;
    private String product;
    private int price;
    private int stock;
    private int sold;
    private category category;

    public void setid(int id)
    {
        this.id = id;
    }

    public void setproduct(String product) {
        this.product = product;
    }

    public void setprice(int price) {
        this.price = price;
    }

    public void setstock(int stock) {
        this.stock = stock;
    }
    
    public void setsold(int sold) {
        this.sold = sold;
    }

    public void setcategory(category category) {
        this.category = category;
    }

    public int getid() {
        return id;
    }

    public String getproduct() {
        return product;
    }

    public int getprice() {
        return price;
    }

    public int getstock() {
        return stock;
    }

    public int getsold() {
        return sold;
    }

    public category getcategory() {
        return category;
    }
    @Override
    public String toString() {
        return id + " " + product + " " + price + ".000 " + stock + " " + sold + " " + category;
    }

    public void display() {
        System.out.println("Mã sản phẩm: " + id + ", Tên sản phẩm: " + product + ", Giá bán: " + price + ".000, "
                + "Trong kho: " + stock + ", Đã bán " + sold + ", Danh mục: " + category);
    }
    
    @Override
    public int compareTo(Storage o)
    {
        int compare = this.getsold() - o.getsold();
        return compare;
    }
    
    
}
