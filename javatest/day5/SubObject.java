class SuperObject {
    protected String name;

    public void paint() {
        draw();
    }

    public void draw() {
        System.out.println("SuperObject: " + name);
    }
}

public class SubObject extends SuperObject{
    protected String name;


    @Override
    public void draw() {
        name ="S1";
        //super.name="S2";

        super.draw();
        System.out.println("SubObject: "+ name);
    }

    public static void main(String[] args){
        SuperObject b = new SubObject();
        b.paint();
    }
}
