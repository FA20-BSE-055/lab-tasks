
public class Main {
    public static void main(String[] args) {
        ConcreteAggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.addItem("Item 1");
        aggregate.addItem("Item 2");
        aggregate.addItem("Item 3");

        Iterator<String> iterator = aggregate.createIterator();

        // Forward iteration
        System.out.println("Forward iteration:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Move to the last item
        iterator.moveToLast();
        System.out.println("Moved to the last item: " + iterator.next());

        // Move to the first item
        iterator.moveToFirst();
        System.out.println("Moved to the first item: " + iterator.next());

        // Move back to the previous item
        iterator.previous();
        System.out.println("Moved back to the previous item: " + iterator.next());
    }
}