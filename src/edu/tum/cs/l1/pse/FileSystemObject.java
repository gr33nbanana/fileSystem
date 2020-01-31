package edu.tum.cs.l1.pse;

import java.util.Arrays;

public abstract class FileSystemObject {

    private final String name;
    private int level;

    public FileSystemObject(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public FileSystemObject(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public void setLevel(int level){
    	this.level = level;
	}

    private String getLevelPrefix(int level) {
        char[] charArray = new char[level];
        Arrays.fill(charArray, '-');
        return new String(Integer.toString(level));
    }

    public void printName() {
        System.out.println(this.getLevelPrefix(this.level) + this.getName());
    }

    public abstract void list(int level);
}
