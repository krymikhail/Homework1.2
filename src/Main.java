public class Main {

    public static General createObject(String className) {
        switch (className) {
            case "Colonel":
                return new Colonel("Colonel John", 25, "5th Regiment");
            case "LieutenantColonel":
                return new LieutenantColonel("Lt. Colonel Smith", 20, 15);
            case "Major":
                return new Major("Major Davis", 15, true);
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        General object1 = createObject("Colonel");
        General object2 = createObject("LieutenantColonel");
        General object3 = createObject("Major");

        Printable[] objects = new Printable[3];
        objects[0] = (Printable) object1;
        objects[1] = (Printable) object2;
        objects[2] = (Printable) object3;
        
        for (Printable obj : objects) {
            obj.print();
        }
    }
}