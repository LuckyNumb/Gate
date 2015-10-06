/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gate;

/**
 *
 * @author Mike
 */
public class Gate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Logic l = new Logic();
        System.out.println("a b s c");
        l.PrintHalfAdder(1, 1);
        l.PrintHalfAdder(1, 0);
        l.PrintHalfAdder(0, 1);
        l.PrintHalfAdder(0, 0);
        System.out.println("a  b cin s cout");
        l.FullAdder(0, 0, 0);
        l.FullAdder(0, 0, 1);
        l.FullAdder(0, 1, 0);
        l.FullAdder(1, 0, 0);
        l.FullAdder(0, 1, 1);
        l.FullAdder(1, 0, 1);
        l.FullAdder(1, 1, 0);
        l.FullAdder(1, 1, 1);
    }

}
