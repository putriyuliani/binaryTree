
import java.lang.reflect.Method;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public interface Binary {
    public int size();
    public boolean isEmpty();
    public Object root();
    public void makeTree(Object root, Object left, Object right);
    public Binary removeLeftSubtree();
    public Binary removeRightSubtree();
    public void preOrder(Method visit);
    public void levelOrder(Method visit);
    public void postOrder(Method visit);
    public void inOrder(Method visit);
}
