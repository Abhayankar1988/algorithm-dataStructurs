package com.ds.binarytree;

import java.util.Queue;
import java.util.LinkedList;

import java.util.Stack;

public class BinaryTree {

	Node root;

	public Node find (int key){

		Node current = root;

		while(current.data !=key){

			if(key>= current.data){
				current = current.rightChild;
			}else{
				current = current.leftChild;
			}
		}

		if(current == null){
			return null;
		}
		return current;
	}

	public void insert(int key){
		Node newNode = new Node(key);
		Node current = root;

		if(current == null){
			root = newNode;

		}else{
			Node parent = null;
			while(true){
				parent = current;
				if(key>= current.data){
					current = current.rightChild;
					if(current==null){
						parent.rightChild = newNode;
						return;
					}
				}else{
					current = current.leftChild;
					if(current==null){
						parent.leftChild = newNode;
						return;
					}
				}
			}

		}

	}

	public void display(){
		Node current = root;

		while(current!=null){

			System.out.println(current.data);
		}
	}

	public void inOrder(Node localRoot){

		if(localRoot!=null){
			inOrder(localRoot.leftChild);
			System.out.print(localRoot.data + " ");
			inOrder(localRoot.rightChild);
		}	

	}

	public void preOrder(Node localRoot){

		if(localRoot!=null){
			System.out.print(localRoot.data + " ");
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}	

	}

	public void postOrder(Node localRoot){

		if(localRoot!=null){
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			System.out.print(localRoot.data + " ");
		}	

	}


	public void levelOrder (Node root){

		Queue<Node> queue = new LinkedList<Node>();

		queue.add(root);

		while(!queue.isEmpty()){

			Node temp = queue.poll();
			System.out.print(temp.data + " ");

			if(temp.leftChild!=null){
				queue.add(temp.leftChild);
			}

			if(temp.rightChild!=null){
				queue.add(temp.rightChild);
			}

		}
	}

	public void inorderIterative(Node head){

		Stack<Node> stack = new Stack<Node>();

		if(head == null){
			return;
		}

		Node node = head;
		while(node!=null){
			stack.push(node);
			node = node.leftChild;
		}

		while(!stack.isEmpty()){		
			node = stack.pop();
			System.out.print(node.data + " " );

			if(node.rightChild!=null){
				node = node.rightChild;

				while(node!=null){
					stack.push(node);
					node = node.leftChild;
				}

			}

		}

	}
	
	public int maxDepth(Node head){/*
		
		Node current = head;
		
		if(current == null){
			return 0;
		}
		
		int maxDepthLeft = maxDepth(current.leftChild);
		int maxDepthRight = maxDepth(current.rightChild);
		
		System.out.println(" maxDepthLeft " + maxDepthLeft  + "maxDepthRight  " + maxDepthRight);
		
		if(maxDepthLeft>maxDepthRight){
			return 1+ maxDepthLeft;	
		}else{
			return 1 + maxDepthRight;
		}
		
	*/
		
		 Node currentL = root;
	       Node currentR = root;
	       if(root == null){
	           return 0;
	       }
	       
	       int countL = 0;
	       int countR = 0;
	       
	      while(currentL!=null){
	          ++countL;
	          currentL = currentL.leftChild;
	          
	      }
	       
	      while(currentR!=null){
	           ++countR;
	          currentR = currentR.rightChild;
	         
	      }
	         
	       if(countL>countR){
	          return countL;
	       }else{
	           return countR;
	       }
	}




	public static void main(String[] args) {

		//BinaryTree bt = new BinaryTree();

		BinaryTree tree_level = new BinaryTree();
		tree_level.root = new Node(1);
		tree_level.root.leftChild = new Node(2);
		tree_level.root.rightChild = new Node(3);
		tree_level.root.leftChild.leftChild = new Node(4);
		tree_level.root.leftChild.rightChild = new Node(5);

		tree_level.inOrder(tree_level.root);

		System.out.println(" ");

		tree_level.preOrder(tree_level.root);

		System.out.println(" ");

		tree_level.postOrder(tree_level.root);

		System.out.println(" ");

		tree_level.levelOrder(tree_level.root);

		System.out.println("Inorder iterative  " );

		tree_level.inorderIterative(tree_level.root);
		
		System.out.println(" MaxDepth " + tree_level.maxDepth(tree_level.root));
	}

}
