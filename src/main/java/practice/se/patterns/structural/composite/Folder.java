package practice.se.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {
    private List<Component> components;
    public Folder(String name) {
        super(name);
        this.components = new ArrayList<Component>();
    }
    public List<Component> getSupervisedEmployees() {
        return this.components;
    }

    public void addComponent(Component component) {
        components.add(component);
    }
    public void removeComponent(Component component) {
        components.remove(component);
    }

    public void printHierarchy(int level) {
        super.printName(level);
        for (Component component : components) {
            component.printHierarchy(level + 1);
        }
    }
}
