import java.util.*;

import static java.lang.Integer.max;

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

    public int depth(Position<E> p)
    {
        if(!isRoot(p))
        {
            return depth(parent(p)) + 1;
        }
        return 0;
    }

    public int height(Position<E> p)
    {
        int h = 0;
        for(Position<E> c: children(p))
        {
            h = max(h, 1 + height(c));
        }

        return h;
    }

    /** Adds positions of the subtree rooted at Position p to the given snapshot.*/
    private void preorderSubtree(Position<E> p, List<Position<E>> snapshot)
    {
        snapshot.add(p);                            // for preorder, we add position p before exploring subtrees

        for(Position<E> c: children(p))
        {
            preorderSubtree(c, snapshot);
        }
    }

    /** Returns an iterable collection of positions of the tree, reported in preorder*/
    public Iterable<Position<E>> preorder()
    {
        List<Position<E>> snapshot = new ArrayList<>();

        if(!isEmpty())
        {
            preorderSubtree(root(), snapshot);      // fill the snapshot recursively
        }

        return snapshot;
    }

    /** Adds positions of the subtree rooted at Position p to the given snapshot.*/
    private void postorderSubtree(Position<E> p, List<Position<E>> snapshot)
    {
        for(Position<E> c: children(p))
        {
            preorderSubtree(c, snapshot);
        }

        snapshot.add(p);                            // for postorder, we add position p after exploring subtrees
    }

    /** Returns an iterable collection of positions of the tree, reported in postorder*/
    public Iterable<Position<E>> postorder()
    {
        List<Position<E>> snapshot = new ArrayList<>();

        if(!isEmpty())
        {
            postorderSubtree(root(), snapshot);      // fill the snapshot recursively
        }

        return snapshot;
    }

    /** Adds positions of the subtree rooted at Position p to the given snapshot.*/
    private void inorderSubtree(Position<E> p, List<Position<E>> snapshot)
    {
        Iterator<Position<E>> cList = children(p).iterator();

        if(cList.hasNext())
        {
            inorderSubtree(cList.next(),snapshot);
        }

        snapshot.add(p);

        if(cList.hasNext())
        {
            inorderSubtree(cList.next(), snapshot);
        }

        /*
        * if(left(p) != null)
        * {
        *   inorderSubtree(left(p), snapshot);
        * }
        * snapshot.add(p);
        * if(right(p) != null)
        * {
        *   inorderSubtree(right(p), snapshot);
        * }
        * */
    }

    /** Returns an iterable collection of positions of the tree, reported in postorder*/
    public Iterable<Position<E>> inorder()
    {
        List<Position<E>> snapshot = new ArrayList<>();

        if(!isEmpty())
        {
            inorderSubtree(root(), snapshot);      // fill the snapshot recursively
        }

        return snapshot;
    }

    /** Returns an iterable collection of positions of the tree, reported in level order*/
    public Iterator<Position<E>> inorder()
    {
        List<Position<E>> snapshot = new ArrayList<>();

        Position<E> p;

        if(!isEmpty())
        {
            Queue<Position<E>> llQ = new LinkedList<>();
            llQ.add(root());

            while(!llQ.isEmpty())
            {
                p = llQ.remove();

                for(Position<E> c: children(p))
                {
                    llQ.add(c);
                }

                snapshot.add(p);
            }

        }

        return snapshot;
    }

    //---------------- nested ElementIterator class ---------------
    /** The class adapts the iteration produced by positions() to return elements.*/
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
        //return preorder();
        return inorder();
    }
}
