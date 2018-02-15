/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

/**
 *
 * @author cadelmonterde
 */
public class JavaApplication23
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
    }
    
}
class Node <AnyType>
{
    public Node leftChild;
    public Node rightChild;
    public AnyType data;
    
    public Node()
    {
        leftChild = null;
        rightChild = null;
        data = null;
    }
    public Node(AnyType data)
    {
        leftChild = null;
        rightChild = null;
        this.data = data;
    }
}
class BST<AnyType>
{

}