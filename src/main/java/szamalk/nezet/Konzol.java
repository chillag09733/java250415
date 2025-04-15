package szamalk.nezet;

import szamalk.modell.Festmeny;
import szamalk.modell.Gyujtemeny;
import szamalk.modell.Mukincs;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Konzol {

    public static void main(String[] args) {
        new Konzol();
    }

    public Konzol(){
        Gyujtemeny ujGyujtemeny = new Gyujtemeny();
        GUIForm gui = new GUIForm();

        fajlbaIr();
        konzolraIr();
    }

    private void fajlbaIr() {
      try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("mutargyak.dat"))){
            oos.writeObject(this);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void konzolraIr(){
        System.out.println("Kiírva: " + this);
    }
}
