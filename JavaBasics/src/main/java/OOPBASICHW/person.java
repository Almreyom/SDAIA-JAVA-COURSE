package OOPBASICHW;

public class person extends personRecord {
    private String name;
    private int age;
    private String address;

    public person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0 || age > 150){
            throw new IllegalArgumentException("age must be between 0 and 150");
        }
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String addreszs) {
        this.address = addreszs;
    }

    @Override
    String getDetails() {
        return "Name"+ getName()+
                "age"+getAge()+
                "address"+getAddress();
    }
}

