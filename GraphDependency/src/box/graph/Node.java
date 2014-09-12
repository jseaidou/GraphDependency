package box.graph;

import java.awt.Color;

public class Node {
    private final String text;
    private final Color color;
    public Node(String text, Color color) {
        this.text = text;
        this.color = color;
    }
    
    public String getText() {
        return this.text;
    }
    
    public Color getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return this.getText();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Node other = (Node) obj;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (text == null) {
            if (other.text != null)
                return false;
        } else if (!text.equals(other.text))
            return false;
        return true;
    }
}
