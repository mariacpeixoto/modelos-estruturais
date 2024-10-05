
public class Diner {
	public static void main(String[] args) {
        MenuComponent breakfastMenu = new Menu("Menu de Café da Manhã", "Café da manhã delicioso");
        MenuComponent lunchMenu = new Menu("Menu de Almoço", "Almoços satisfatórios");

        // Adicionando os itens diretamente como Menu
        MenuComponent pancake = new Menu("Panqueca", "Panqueca com xarope de bordo");
        MenuComponent omelette = new Menu("Omelete", "Omelete com queijo e presunto");
        MenuComponent burger = new Menu("Hambúrguer", "Hambúrguer com queijo");
        MenuComponent salad = new Menu("Salada", "Salada fresca com molho");

        breakfastMenu.add(pancake);
        breakfastMenu.add(omelette);
        lunchMenu.add(burger);
        lunchMenu.add(salad);

        // Imprimir os menus
        breakfastMenu.print();
        System.out.println();
        lunchMenu.print();
    }
}
