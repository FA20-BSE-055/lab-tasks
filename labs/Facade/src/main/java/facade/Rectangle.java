
package facade;

public class Rectangle implements Shape {
    public void draw(String... arguments) {
        StringBuilder sb = new StringBuilder();
        sb.append("Drawing Rectangle with arguments: ");
        for (String arg : arguments) {
            sb.append(arg).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length()); // Remove the extra comma and space at the end
        System.out.println(sb.toString());
    }

    @Override
    public void draw() {
        System.out.println("Rectngle::draw()"); 
    }
}

