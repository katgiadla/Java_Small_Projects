public class Item implements Print {
    String name;
    ItemCondition condition;
    Double weight;
    Integer amount;

    public Item(String newName, ItemCondition newCondition, Double newWeigtht, Integer newAmount){
        this.name = newName;
        this.condition = newCondition;
        this.weight = newWeigtht;
        this.amount = newAmount;
    }

    @Override
    public void print(){
        System.out.println(String.format("Product: %s", this.name));
        System.out.println(String.format("Condition: " + this.condition));
        System.out.println(String.format("Weight: %.2f", this.weight));
        System.out.println(String.format("Amount: %i", this.amount));
    }

    
}
