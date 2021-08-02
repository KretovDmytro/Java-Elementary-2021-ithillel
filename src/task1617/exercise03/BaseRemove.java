package task1617.exercise03;


public class BaseRemove {

    String base;
    String remove;

    public BaseRemove(String base, String remove) {
        this.base = base;
        this.remove = remove;
    }

    public String modifyString() {
        return base.replaceAll(remove, "");
    }
}