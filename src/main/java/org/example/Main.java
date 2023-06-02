package org.example;

public class Main {
    public static void main(String[] args) {
        Connect connect = new Connect();
        Create create = new Create();
        Rename rename = new Rename();
        Update update = new Update();
        Delete delete = new Delete();
        Print print = new Print();

        //connect.connect();
        create.create();
        update.update();
        print.print();
        rename.rename();
        delete.delete();


    }
}