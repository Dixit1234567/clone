class Encap {
    private String name; 
    private int roll;
    private int age;

    public int getAge() {
        return age; 
    }

    public int getRoll() {
        return roll; 
    }

    public String getName() {
        return name; 
    }

    public void setAge(int a) {
        age = a; 
    }

    public void setRoll(int r) {
        roll = r; 
    }

    public void setName(String n) {
        name = n; 
    }
}

class Demo {
    public static void main(String args[]) {
        Encap e = new Encap();
        e.setName("Dixit"); 
        e.setRoll(10224);   
        e.setAge(10);      
        System.out.println("Name: " + e.getName());
        System.out.println("Age: " + e.getAge());
        System.out.println("Roll: " + e.getRoll());
    }
}
