package com.returnready.loopthereitis;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        String multiplicationTable ="";

        for (int rows = 1; rows < 6; rows++ ){
            for ( int columns = 1; columns < 6; columns++){
                System.out.println(rows * columns);
                int product= rows*columns;
                if(product < 10){
                    multiplicationTable +="  "+product+" ";
            }
                else{
                    multiplicationTable +=" "+product+" ";
                }
                multiplicationTable +="|";
        }
            multiplicationTable+="\n";
    }
        return multiplicationTable;

}
    public static String getLargeMultiplicationTable() {

        String multiplicationTable ="";

        for (int rows = 1; rows <=10; rows++ ){
            for ( int columns = 1; columns <=10; columns++){
                System.out.println(rows * columns);
                int product= rows*columns;
                if(product > 9 && product < 100){
                    multiplicationTable +=" "+product+" ";
                }
                else if (product< 10){
                    multiplicationTable +="  "+product+" ";
                }else {
                    multiplicationTable += product+" ";
                }
                multiplicationTable +="|";
            }
            multiplicationTable+="\n";
        }
            return multiplicationTable;
    }


    public static String getMultiplicationTable(int tableSize) {
        String multiplicationTable ="";
        for (int rows = 1; rows <=tableSize; rows++ ){
            for ( int columns = 1; columns <= tableSize; columns++){
                System.out.println(rows * columns);
                int product= rows*columns;
                if(product > 9 && product < 100){
                    multiplicationTable +=" "+product+" ";
                }
                else if (product< 10){
                    multiplicationTable +="  "+product+" ";
                }else {
                    multiplicationTable += product+" ";
                }
                multiplicationTable +="|";
            }
            multiplicationTable+="\n";
        }
        return multiplicationTable;
    }
}
