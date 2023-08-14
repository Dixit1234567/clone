class Box {
    double width, height, depth; 
    // Constructor with parameters
    Box(double w, double h, double d) {
        width = w;
        height = h; 
        depth = d;  
    }

    double volume() {
        return width * height * depth;
    }
}

class Vbox{
    public static void main(String args[]) {
        Box B1 = new Box(10, 20, 50);
        double vol = B1.volume(); 
        System.out.println("Volume of the box: " + vol); 
    }
}
