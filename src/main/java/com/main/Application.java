package com.main;
public class Application {
    public static void main(String[] args) {
        int choice;
        InvoiceTest invoice = new InvoiceTest();
        while( ( choice =  InvoiceTest.menuList( ) ) != 0 ) {
            switch( choice ) {
                case 1:
                    invoice.acceptRecord();
                    break;
                case 2:
                    invoice.printRecord();
                    break;
            }
        }
    }
}
