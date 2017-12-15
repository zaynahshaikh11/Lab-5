import java.io.*;
import java.util.Scanner;
public class BTDriver 
{
	public void main(String[] args) throws IOException
	{
		BinarySearchTree tree = new BinarySearchTree();
		Scanner fileScan = new Scanner(new FileInputStream("input.dat"));
		TreeNode<String> tNode;
		String s;
		
		s=fileScan.nextLine();
		
		tNode = new TreeNode<String>(s);
		tree.insertItem(tNode,s);
	}
}
