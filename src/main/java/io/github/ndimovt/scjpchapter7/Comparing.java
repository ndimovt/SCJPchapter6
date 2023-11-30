package io.github.ndimovt.scjpchapter7;

import java.util.Comparator;

public class Comparing implements Comparator<Object> {
    public int compare(Object one, Object two){
        if((one instanceof TestSearch) && (two instanceof TestSearch)){
            return (((TestSearch)one).getName()).compareToIgnoreCase(((TestSearch)two).getName());
        }else {
            return 0;
        }
    }
}
