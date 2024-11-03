
 public class pen {
    String color;
    String type;

    public void info() {
        System.out.println("Pen is writing");
    }
}

 class prop {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.color = "blue";
        p1.type = "ballpoint";
    }

}



    