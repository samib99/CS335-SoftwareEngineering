import javafx.scene.shape.Circle;

public class TestIteratorPattern {

    public static void main(String[] args) {
        ShapeStorage storage = new ShapeStorage();
        storage.addShape("Polygon");
        storage.addShape("Hexagon");
        storage.addShape("Circle");
        storage.addShape("Rectangle");
        storage.addShape("Square");

        ShapeIterator iterator = new ShapeIterator(storage.getShapes());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //System.out.println(iterator);
        while (iterator.hasPrev()) {
            System.out.println(iterator.prev());
        }
        System.out.println(iterator.contains("Square"));
        System.out.println(iterator.contains("Polygon"));
		System.out.println(iterator.contains("Sami"));

//        System.out.println("Apply removing while iterating...");
//        iterator = new ShapeIterator(storage.getShapes());
//        while (iterator.hasNext()) {
//            iterator.remove();
//        }

    }

}
