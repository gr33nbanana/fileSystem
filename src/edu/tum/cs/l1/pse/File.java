package edu.tum.cs.l1.pse;

import java.util.Arrays;

//TODO: add the missing inheritance
public class File extends FileSystemObject  {

    //TODO: add the missing constructor
    public File(String name){
        super(name);
    }

    @Override
    public void list(int level) {
        printName();
    }
    //TODO: add the missing methods

}
