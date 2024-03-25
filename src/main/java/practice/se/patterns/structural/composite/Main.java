package practice.se.patterns.structural.composite;
/*
 * Pattern name: Composite
 * Type: Structural
 *
 * Useful links:
 * 1. https://refactoring.guru/images/patterns/diagrams/composite/structure-en-2x.png?id=fc41be8ae17c7250ea6d29632a239ba4
 * 2. https://refactoring.guru/design-patterns/composite
 *
 * Component (blueprint): Component
 * Composite component: Folder
 * Leaf component: File
 *
 * Useful points:
 * Do NOT use if the functionalities of the kinds of components differ too much
 * */

public class Main {
    public static void main(String[] args) {

        Folder rootFolder = new Folder("All Pictures");
        int rootFolderLevel = 0;

        Folder folder = new Folder("Wedding");
        folder.addComponent(new File("bride.jpg"));
        folder.addComponent(new File("groom.jpg"));

        rootFolder.addComponent(new File("myDp.jpg"));
        rootFolder.addComponent(folder);
        rootFolder.addComponent(new File("myScreensaver.jpg"));

        rootFolder.printHierarchy(rootFolderLevel);
    }
}
