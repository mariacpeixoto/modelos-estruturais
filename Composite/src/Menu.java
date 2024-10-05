import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
	private List<MenuComponent> menuComponents = new ArrayList<>();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public void print() {
        System.out.println("Menu: " + name + ", Descrição: " + description);
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
