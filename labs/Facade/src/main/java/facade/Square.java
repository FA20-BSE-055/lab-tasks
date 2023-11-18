
package facade;

public class Square implements Shape {
    public void draw(String... arguments) {
        StringBuilder sb = new StringBuilder();
        sb.append("Drawing Square with arguments: ");
        for (String arg : arguments) {
            sb.append(arg).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length()); 
        System.out.println(sb.toString());
    }

    @Override
    public void draw() {
        System.out.println("Square::draw()"); 
    }
}

