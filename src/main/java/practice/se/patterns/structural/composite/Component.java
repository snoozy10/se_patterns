package practice.se.patterns.structural.composite;

public abstract class Component {
    private final String name;
    public Component(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void printName(int level) {
        System.out.println(getLevelPrefix(level) + this.name);
    }
    public String getLevelPrefix(int level) {
        return "-".repeat(level);
    }
    public abstract void printHierarchy(int level);

}
