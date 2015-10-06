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
public class Logic {

    boolean s = false, c = false;

    public Logic() {

    }

    public boolean INV(boolean in) {
        return !in;
    }

    public boolean AND(boolean in1, boolean in2) {
        return in1 && in2;
    }

    public boolean OR(boolean in1, boolean in2) {
        return in1 || in2;
    }

    public void HalfAdder(int in1, int in2) {
        boolean a = false;
        boolean b = false;
        a = in1 == 1;
        b = in2 == 1;
        this.HalfAdder(a, b);
    }

    public void HalfAdder(boolean a, boolean b) {
        c = AND(a, b);
        s = OR(a, b) && INV(c);
    }

    public void PrintHalfAdder(int in1, int in2) {
        boolean la = false, lb = false;
        int A = 0, B = 0, S = 0, C = 0;
        la = in1 == 1;
        lb = in2 == 1;
        this.HalfAdder(la, lb);
        A = la ? 1 : 0;
        B = lb ? 1 : 0;
        S = s ? 1 : 0;
        C = c ? 1 : 0;
        System.out.println(A + " " + B + " " + S + " " + C);
    }

    public void FullAdder(boolean a, boolean b, boolean cin) {
        boolean ha11 = false, ha12 = false, ha21 = false, ha22 = false, cout = false;
        int ia = 0, ib = 0, icin = 0, is = 0, icout = 0;
        HalfAdder(cin, b);
        ha11 = s;
        ha12 = c;
        HalfAdder(ha12, a);
        ha21 = s;
        ha22 = c;
        cout = OR(ha11, ha21);
        ia = a ? 1 : 0;
        ib = b ? 1 : 0;
        icin = cin ? 1 : 0;
        is = ha22 ? 1 : 0;
        icout = cout ? 1 : 0;
        System.out.println(ia + "  " + ib + "  " + icin + "  " + is + "  " + icout);
    }

    public void FullAdder(int in1, int in2, int inc) {
        boolean a = false, b = false, cin = false;
        a = in1 == 1;
        b = in2 == 1;
        cin = inc == 1;
        FullAdder(a, b, cin);
    }
}
