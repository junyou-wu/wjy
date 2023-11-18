/**
 Test_Name:TiXiJieGou3
 Date:2023.11.12
 Number:202131061035
 Name:Wu_Junyou
 **/
public class Person {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", Phone Number: " + number;
    }
    private  String number;

    public Person(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }


}
