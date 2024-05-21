package vn.edu.kgc.schoolex.Model;

public class Users
{
    private String name, phone, phoneOrder, password, image, address;
    public Users()
    {
    }

    public Users(String name, String phone, String phoneOrder, String password, String image, String address) {
        this.name = name;
        this.phone = phone;
        this.phoneOrder = phoneOrder;
        this.password = password;
        this.image = image;
        this.address = address;
    }

    public String getPhoneOrder() {
        return phoneOrder;
    }

    public void setPhoneOrder(String phoneOrder) {
        this.phoneOrder = phoneOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
