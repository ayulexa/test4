package codelab;

public class Armor implements Destroyable {
    @Override
    public void destroy() {
        System.out.println("The armor is destroyed.");
    }
}
