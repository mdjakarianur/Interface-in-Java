public interface Drawing {

 public void draw();

}

public class Line implements Drawing {

 public void draw()
 {
 System.out.println("I am drawing a Line");
 }
 public static void main(String[] args) {
 Line l = new Line();
 l.draw();
}
}
