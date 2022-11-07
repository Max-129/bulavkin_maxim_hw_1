public final class Iphone14 extends Iphone{
    private int camera;

    private Color color;

    public Color getColor() {
        return color;
    }

    public int getCamera() {
        return camera;
    }



    public Iphone14(int width, int height, Memory GB, String model, int camera,  Color color) {
        super(width, height, GB, model);
        this.camera = camera;
        this.color = color;
    }

    @Override
    public void method(){
        super.method();
        System.out.println("Это айфон 14");
    }
    @Override
    public String getInfo(){
        return super.getInfo() + "\nCamera: " + camera +
                "\nColor: " + color;
    }
}
