public class Iphone extends Mobile{

    private String model;


    public Iphone(int width, int height, Memory GB, String model) {
        super(width, height, GB);
        this.model = model;

    }

    public String getModel() {
        return model;
    }

    public final  void method(String model){
        System.out.println("Это айфон модели " + model);
    }
    public  void method(){
        System.out.println("Это айфон");
    }

    @Override
    public String getInfo(){
        return super.getInfo() + "\nModel: " + model;
    }


}