public class Mobile {
    private int width;
    private int height;

    public Mobile(int width, int height, Memory GB) {
        this.width = width;
        this.height = height;
        this.GB = GB;
    }

    private Memory GB;

    public Memory getGB() {
        return GB;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getInfo() {
        return "width: " + width +
                "\nheight: " + height +
                "\nGB: " + GB.getGB();
    }
}



