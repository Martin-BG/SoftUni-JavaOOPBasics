package BashSoft.src.bashsoft;

import BashSoft.src.bashsoft.io.InputReader;

public class Main {

    public static void main(String[] args) {
        try {
            InputReader.readCommands();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
