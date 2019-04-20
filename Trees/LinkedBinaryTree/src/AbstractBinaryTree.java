import java.util.ArrayList;
import java.util.List;

/** An abstract base class providing some functionality of the BinaryTree interface*/
public abstract class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTree<E>
{
    /** Returns the Position of p's sibling (or null if no siblings exists).*/
    public Position<E> sibling(Position<E> p)
    {
        Position<E> parent = parent(p);

        if(parent == null)                  // p must be the root
        {
            return null;
        }
        if(p == left(parent))               // p is a left child
        {
            return right(parent);           // (right child might be null)
        }
        else                                // p is a right child
        {
            return left(parent);            // (left child might be null)
        }
    }

    /** Returns the number of children of Position p.*/
    public int numChildren(Position<E> p)
    {
        int count = 0;

        if(left(p) != null)
        {
            count++;
        }
        if(right(p) != null)
        {
            count++;
        }

        return count;                       // if there is nothing left or right, it returns 0
    }

    /** Returns an iterable collection of the Position representing p's children.*/
    public Iterable<Position<E>> children(Position<E> p)
    {
        List<Position<E>> snapshot = new ArrayList<>(2);

        if(left(p) != null)
        {
            snapshot.add(left(p));
        }
        if(right(p) != null)
        {
            snapshot.add(right(p));
        }

        return snapshot;
    }
}