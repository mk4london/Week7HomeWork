package homeWorkWeek7;

public class WallMain {

    public static void main(String[] args) {
        WallArea wall = new WallArea(5,4);
        System.out.println("area=" + wall.getArea());
        wall.setHight(-1.5);
        System.out.println("Width=" + wall.getWidth());
        System.out.println("Height=" + wall.getHeight());
        System.out.println("Area=" + wall.getArea());



    }
}
