package project.q2;

public class binary_search_tree {
    
    private node root;
    public double x;
    public double n;
    
                    public binary_search_tree() {
                        root=null;
                        n=0;
                        x=0;
                    }
                    

    public void insert(int data)
     {
         if(srch(data))
            n++;    
            else
            {
            n++;
            x++;
            }
         root = insert(root, data);
     }
    
     //****************************************
     private node insert(node node, int data)
     {
         if (node == null)
             node = new node(data);
         else
         {
             if (data <= node.x)
                 node.left = insert(node.left, data);
             else
                 node.right = insert(node.right, data);
         }
         return node;
      }
     
     //######################################################################################################
    
                    public boolean srch (int val)
                    {
                        return srch(root, val);
                    }

     private boolean srch(node r, int val)
     {
         boolean found = false;
         while ((r != null) && !found)
         {
             int rval = r.x;
             if (val < rval)
                 r = r.left;
             else if (val > rval)
                 r = r.right;
             else
             {
                 found = true;
                 break;
             }
             found = srch(r, val);
         }
         return found;
     }
     
     public double get_current_ratio()
     {
         return n/x;
     }
     
}
