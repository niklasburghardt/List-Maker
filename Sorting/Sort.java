package Sorting;

import java.util.Collections;
import java.util.List;

import Interface.Properties;

public class Sort{

    public List<Properties> sort(List<Properties> unsorted){
        Collections.sort(unsorted);
        return unsorted;
    }
    
}