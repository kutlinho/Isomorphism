import java.util.List;
import java.util.Map;

public class Graph {
    private boolean matrix[][];
    private int verticeNumber;

    public Graph(int verticeNumber) {
        this.verticeNumber = verticeNumber;
        this.matrix = new boolean[verticeNumber][verticeNumber];
    }

    public Graph(boolean[][] matrix) {
        this.matrix = matrix;
        this.verticeNumber = matrix.length;
    }

    // Adding edges
    public void addEdge(int i, int j) {
        matrix[i][j] = true;
        matrix[j][i] = true;
    }


    // Getter and setters
    public boolean[][] getMatrix() {
        return matrix;
    }

    public int getVerticeNumber() {
        return verticeNumber;
    }

    public void setMatrix(boolean[][] matrix) {
        this.matrix = matrix;
    }

    public void setVerticeNumber(int verticeNumber) {
        this.verticeNumber = verticeNumber;
    }

}
