import java.util.*;
 
/*
 * Given a 2D array of integers, find the number of unique groups contained
 * therein.
 *   - A group is defined as a set of adjacent of equal integers.
 *   - Adjacency is defined in 4 directions: up, down, left, and right (i.e.
 *     ignore diagonals)
 *
 * For example, given the input:
 *   1 1 1 2 2
 *   1 1 2 2 1
 *   3 3 4 5 1
 *   4 4 4 5 5
 *
 * Your method should return: 6
 *
 * I found out by testing, the correct answer should be: 7
 */
public class MatrixSearchAdjacents {
        public static void main(String[] args) {
                int[][] matrix = new int[][]{
                                {1, 1, 1, 2, 2},
                                {1, 1, 2, 2, 1},
                                {3, 3, 4, 5, 1},
                                {4, 4, 4, 5, 5}
                        };
 
                Set<String> s = new HashSet<String>();
 
                for (int i = 0; i < matrix.length; i++) {
                    int c = 0;
                    int last = matrix[i][0];
 
                    for (int j = 1; j < matrix[i].length; j++) {
                        if (matrix[i][j] == last) {
                            c++;
                        }
                       
                        if (matrix[i][j] != last || j == matrix[i].length - 1) {
                                if (c > 0) {
                                        s.add(last + "_" + (c + 1));
                                }
 
                                c = 0;
                                last = matrix[i][j];
                        }
                    }
                }
               
                System.err.println("The number of unique groups contained horizontally: " + s + ": " + s.size());
               
                for (int i = 0; i < matrix[0].length; i++) {
                    int c = 0;
                    int last = matrix[0][i];
 
                    for (int j = 1; j < matrix.length; j++) {
                        if (matrix[j][i] == last) {
                            c++;
                        }
                       
                        if (matrix[j][i] != last || j == matrix.length - 1) {
                                if (c > 0) {
                                        s.add(last + "_" + (c+1));
                                }
 
                                c = 0;
                                last = matrix[j][i];
                        }
                    }
                }
 
                System.err.println("The number of unique groups contained both directions: " + s + ": " + s.size());
        }
       
}