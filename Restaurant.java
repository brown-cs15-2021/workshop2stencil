package workshop2stencil;

public class Restaurant {
    private Chef mainChef;
    //TODO: declare another Chef instance variable
    public Restaurant() {
        this.mainChef = new Chef("Andy");
        // TODO: Create the other chef (initialize and instantiate)
        this.createMenu();
    }
    public void createMenu(){
        this.mainChef.setSignatureDish("cookies");
        this.mainChef.setSignaturePrice(6);

        // TODO: use the getters and setters to add the other chefs signature dish

    }

    public void seeMenu(){
        System.out.println(this.mainChef.getSignatureDish() + ", "+ this.mainChef.getSignaturePrice());
        // TODO: use the getters to print out the sous chefs signature dish
        // TODO: add another dish to the menu
        System.out.println("");

        // TODO: have our 2 chefs cook something
        System.out.println("");

    }
}
