import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractTree<E> implements Tree<E>
{
    public boolean isInternal(Position<E> p)
    {
        return numChildren(p) > 0;
    }

    public boolean isExternal(Position<E> p)
    {
        return numChildren(p) == 0;
    }

    public boolean isRoot(Position<E> p)
    {
        return p == root();
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    /** Adds positions of the subtree rooted at Position p to the given snapshot.*/
    private void preorderSubtree(Position<E> p, List<Position<E>> snapshot)
    {
        snapshot.add(p);                // for preorder, we add position p before exploring subtrees

        for(Position<E> c: children(p))
        {
            preorderSubtree(c, snapshot);
        }
    }

    public Iterable<Position<E>> preorder()
    {
        List<Position<E>> snapshot = new ArrayList<>();

        if(!isEmpty())
        {
            preorderSubtree(root(), snapshot);
        }

        return snapshot;
    }


    //---------------- nested ElementIterator class ---------------
    /** The class adpats the iteration produced by positions() to return elements.*/
    public class ElementIterator implements Iterator<E>
    {
        Iterator<Position<E>> posIterator = positions().iterator();

        @Override
        public boolean hasNext() {
            return posIterator.hasNext();
        }

        public E next()
        {
            return posIterator.next().getElement();         // return element
        }

        public void remove()
        {
            posIterator.remove();
        }
    }

     /** Returns an iterator of the elements stored in the tree*/
     public Iterator<E> iterator()
     {
         return new ElementIterator();
     }

     public Iterable<Position<E>> positions()
     {
         return preorder();
     }
}
