package implementation;

import myinterface.BinarySearchTreeADT;
import myinterface.Node;

public class MyBinarySearchTree<E extends Comparable<E>> implements BinarySearchTreeADT<E> {
    implementation.Node<E> root;

    @Override
    public void insert(E data) {implementation.Node<E> newNode = new implementation.Node<>(data);
        if(root == null){
            root = newNode;
        }
        else{
            implementation.Node<E> temp = root;
            implementation.Node<E> parent = null;
            while(temp!= null){
                parent = temp;
                if(data.compareTo(temp.getData()) <= 0){
                    temp = temp.getLeft();
                }
                else{
                    temp = temp.getRight();
                }
            }

            if(data.compareTo(parent.getData()) <= 0){
                parent.setLeft(newNode);
            }
            else{
                parent.setRight(newNode);
            }
        }
    }


    @Override
    public boolean search(E searchElement) {
        implementation.Node<E> temp = root;
        while (temp != null) {
            if (searchElement.compareTo(temp.getData()) == 0) {
                return true;
            } else if (searchElement.compareTo(temp.getData()) > 0) {
                temp = temp.getRight();
            } else {
                temp = temp.getLeft();
            }

        }
        return false;
    }

    @Override
    public void inOrder(Node<E> node) {

    }

    @Override
    public void preOrder(Node<E> node) {

    }

    @Override
    public void postOrder(Node<E> node) {

    }

    @Override
    public void reverseInOrder(Node<E> node) {

    }

    @Override
    public void delete(E data) {

    }

    @Override
    public int height(Node<E> node) {
        return 0;
    }
}
