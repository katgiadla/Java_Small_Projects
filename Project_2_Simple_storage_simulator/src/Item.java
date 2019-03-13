public class Item implements Print, Comparable<Item>{
    String name;
    ItemCondition condition;
    Double weight;
    Integer amount;

    Item(String newName, ItemCondition newCondition, Double newWeigtht, Integer newAmount){
        this.name = newName;
        this.condition = newCondition;
        this.weight = newWeigtht;
        this.amount = newAmount;
    }

    @Override
    public void print() {
        System.out.println(String.format("Product: %s", this.name));
        System.out.println("Condition: " + this.condition);
        System.out.println(String.format("Weight: %.2f", this.weight));
        System.out.println(String.format("Amount: %d", this.amount));
    }

    @Override
    public int compareTo(Item exampleItem){
        return name.compareTo(exampleItem.name);
    }

}
