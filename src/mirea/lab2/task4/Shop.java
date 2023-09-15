package mirea.lab2.task4;

import mirea.lab2.task4.Computer;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Computer> computerArrayList;
    public Shop(){ computerArrayList = new ArrayList<>(); }

    public void add( Computer currentComputer ) {
        computerArrayList.add( currentComputer );
    }

    public boolean delete( int id ) {
        Computer currentComputer;

        for (int i = 0; i < computerArrayList.size(); i++ ) {
            currentComputer = computerArrayList.get(i);
            if ( currentComputer.getId() == id ) {
                computerArrayList.remove( currentComputer );
                return true;
            }
        }

        return false;
    }

    public Computer search( int id ) {
        Computer currentComputer;

        for (int i = 0; i < computerArrayList.size(); i++ ) {
            currentComputer = computerArrayList.get(i);
            if ( currentComputer.getId() == id ) {
                return currentComputer;
            }
        }

        return null;
    }



}
