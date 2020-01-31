package edu.tum.cs.l1.pse;

public class FileSystem {

	public static void main(String[] args) {
		
		//TODO: you can uncomment the following code for testing
		
		Directory root = new Directory("root");
		root.addChild(new File("File A"));
		root.addChild(new Directory("Directory B"));

		Directory dir1 = new Directory("Directory 1");
		dir1.addChild(new File("File 1A"));
		dir1.addChild(new File("File 1B"));

		root.addChild(dir1);
		
		root.list(1);
	}

}

