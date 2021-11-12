package homework;

public class product {
    int id;
    String name;
    String description;
    int price;
    int quantity;
    int quantitySold;
    String brand;
    category category;

    public product(int id, String name, String description, int price, int quantity, int quantitySold, String brand,
            category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.quantitySold = quantitySold;
        this.brand = brand;
        this.category = category;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setCategory(category category) {
        this.category = category;
    }
    public category getCategory() {
        return category;
    }

    public String toString() {
        return "ID: " + id + ", Tên: " + name + ", Giá: " + price + ", Số lượng: " + quantity + ", Đã bán: "
                + quantitySold + ", Thương hiệu: " + brand + ", Danh mục: " + category;
    }
}
