package edu.tum.cs.l1.pse;

import java.util.*;

//TODO: add the missing inheritance
public class Directory extends FileSystemObject {

    //TODO: add the missing attributes
    private int level;
    private ArrayList<FileSystemObject> fileSystemObjects;

    private FileSystemObject findByName(String name) {
        for (FileSystemObject sysObject : fileSystemObjects) {
            if (sysObject.getName().equals(name)) {
                return sysObject;
            }
        }
        return null;
    }

    //TODO: add the missing constructor
    public Directory(String name) {
        super(name);
        this.fileSystemObjects = new ArrayList<FileSystemObject>();
    }
    public void setLevel(int level){
        this.level = level;
        for(FileSystemObject file : fileSystemObjects){
            file.setLevel(this.level + 1);
        }
    }

    //TODO: add the missing methods
    public void addChild(FileSystemObject child) {
        var exists = this.findByName(child.getName());
        if (exists == null) {
            child.setLevel(this.level + 1);
            fileSystemObjects.add(child);
        } else {
            throw new Error("Dummy DUmmy, file here");
        }
    }

    public void removeChild(FileSystemObject child) {
        var exists = this.findByName(child.getName());
        if (exists == null) {
            throw new Error("DUmmy Dummy, no here");
        } else {
            fileSystemObjects.remove(child);
        }
    }

    public List<FileSystemObject> getChildren() {
        return fileSystemObjects;
    }

    @Override
    public void list(int depth) {
        printName();
        for (FileSystemObject child : fileSystemObjects) {
            if (depth > 0) {
                child.list(depth - 1);
            }
        }
    }
}