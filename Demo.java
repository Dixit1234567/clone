class Encap {
    private String name; // Added missing semicolons
    private int roll;
    private int age;

    public int getAge() {
        return age; // Corrected variable name and added missing return type
    }

    public int getRoll() {
        return roll; // Corrected variable name
    }

    public String getName() {
        return name; // Corrected variable name
    }

    public void setAge(int a) {
        age = a; // Corrected variable name
    }

    public void setRoll(int r) {
        roll = r; // Corrected variable name
    }

    public void setName(String n) {
        name = n; // Corrected variable name
    }
}

class Demo {
    public static void main(String args[]) { // Corrected 'Static' to 'static'
        Encap e = new Encap();
        e.setName("Dixit"); // Corrected method names to camelCase
        e.setRoll(10224);   // Corrected method names to camelCase
        e.setAge(10);       // Corrected method names to camelCase
        System.out.println("Name: " + e.getName());
        System.out.println("Age: " + e.getAge());
        System.out.println("Roll: " + e.getRoll());
    }
}
