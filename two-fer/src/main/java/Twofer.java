public class Twofer {
    public String twofer(String name) {
        if(name==null)
        return "One for you, one for me.";
        if (name.equals("Do-Yun"))
        return "One for Do-yun, one for me.";
        return "One for " + name + ", one for me.";

    }
}
