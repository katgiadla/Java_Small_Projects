public class Item {
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

    public void print(){
        System.out.println();
    }
}
