package task07.exercise03;

public enum Color {

    RED(255, 0, 0),
    GREEN("00FF00"),
    BLUE("0000FF"),
    WHITE(255, 255, 255),
    BLACK(0, 0, 0);

    private String hex;
    private int r;
    private int g;
    private int b;

    Color(String hex) {
        this.hex = hex;
        this.r = Integer.parseInt(hex.substring(0, 2), 16);
        this.g = Integer.parseInt(hex.substring(2, 4), 16);
        this.b = Integer.parseInt(hex.substring(4), 16);
    }

    Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.hex = rgbToHex(r, g, b);
    }

    public String getHex() {
        return hex;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

    private String rgbToHex(int r, int g, int b) {
        int[] rgb = new int[]{r, g, b};
        StringBuilder builder = new StringBuilder();
        for (int i : rgb) {
            String hex = Integer.toHexString(i).toUpperCase();
            if (i == 0) {
                hex += 0;
            }
            builder.append(hex);
        }
        return builder.toString();
    }
}
