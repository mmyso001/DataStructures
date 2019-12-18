/**
 *
 * @author Meekaeel Mysorewala
 */


public class BinarySearchTree {
    
    
    public BinarySearchTree()
    {
        root = new Node();        //dummy node as the root
        root.setLeftChild(null);
        root.setRightChild(null);
        root.setKey(null);
        root.setType(null);
    }

    public boolean isEmpty()
    {
        return root.getLeftChild() == null;
    }

    public void display()
    {
        inorderDisplay(root.getLeftChild());
        System.out.println();
    }

    public boolean contains(String x)
    {
        return search(x, root.getLeftChild());
    }

    public void add(String t)
    {
        if (root.getLeftChild() == null)
        {
            Node p = new Node();
            p.setNode(t, null, null);
            root.setLeftChild(p);
        } else
            insert(t, root.getLeftChild());
    }

    public String getMin()
    {
        return getMin(root);
    }

    private Node root;    //root of the bst; implemented as a dummy node.

    private void inorderDisplay(Node p)
    {
        if (p != null)
        {
            inorderDisplay(p.getLeftChild());
            System.out.print(p.getType() + " ");
            inorderDisplay(p.getRightChild());
        }
    }
    
    private void preorderDisplay(Node p)
    {
        if(p != null)
        {
          System.out.print(p.getType() + " ");
          preorderDisplay(p.getLeftChild());
          preorderDisplay(p.getRightChild());
        }
    }
    
    private void postorderDisplay(Node p)
    {
        if(p!= null)
        {
        postorderDisplay(p.getLeftChild());
        postorderDisplay(p.getRightChild());
        System.out.print(p.getType() + " ");
        }
    }

    private boolean search(String x, Node p)
    {
        if (p == null)
        {
            return false;
        }
        else if (x.equals(p.getType()))
        {
            return true;
        }
        else if (x.compareTo(p.getType()) < 0)
        {
            return search(x, p.getLeftChild());
        }
        else
        {
            return search(x, p.getRightChild());
        }
    }

    private void insert(String t, Node p)
    {
        if (t.compareTo(p.getType()) < 0)
        {
            if (p.getLeftChild() == null)
            {
                Node q = new Node();
                q.setNode(t, null, null);
                p.setLeftChild(q);
            } 
            else
            {
                insert(t, p.getLeftChild());
            }
        }
        else if (p.getRightChild() == null)
        {
            Node q = new Node();
            q.setNode(t, null, null);
            p.setRightChild(q);
        } 
        else
        {
            insert(t, p.getRightChild());
        }
    }

    private String getMin(Node p)
    {
        if (p.getLeftChild() == null)
        {
            return p.getType();
        }
        else
        {
            return getMin(p.getLeftChild());
        }
    }
    
    @Override
    public String toString()
    {
        return toString(root.getLeftChild()); 
    }
    
    private String toString(Node p)
    {
        if(p!= null)
        {
            return toString(p.getLeftChild()) + " " + p.getType() + " " +
                    toString(p.getRightChild());
        }
        else
        {
            return " ";
        }
    }
}
