package DSA_PROBLEMS;
import java.util.*;

public class TreeMaking {

    static class Tree {
        int Data;
        Tree Left, Right;

        Tree(int value) {
            Data = value;
            Left = Right = null;
        }
    }

    // Convert array into tree considering null values
    public static Tree ConvertIntoTree(String[] Arr, int i) {
        if (i >= Arr.length || Arr[i].equals("null")) {
            return null;
        }

        // Create a new node
        Tree root = new Tree(Integer.parseInt(Arr[i]));
        root.Left = ConvertIntoTree(Arr, 2 * i + 1);  // Left child
        root.Right = ConvertIntoTree(Arr, 2 * i + 2); // Right child

        return root;
    }

    // Display the tree in Pre-order (Root -> Left -> Right)
    public static void Display(Tree root) {
        if (root == null) {
            return;
        }
        System.out.println("\t" + root.Data + "\t");
        Display(root.Left);
        Display(root.Right);
    }

    // Main method
    public static void main(String[] args) {
        // Array representation of the tree with null values
        String[] Arr = {"1", "2", "7", "3", "null", "null", "8", "null", "4", "9", "null", "5", "6", "10", "11"};

        // Build the tree from the array
        Tree root = ConvertIntoTree(Arr, 0);

        // Display the constructed tree
        System.out.println("Pre-order Traversal of Tree:");
        Display(root);
    }
}
