import java.util.*;
import java.lang.Math;

import java.util.*;
import java.lang.Math;

public class m01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String kredit, huruf;
        double performaMatkul, angka;

        kredit = input.nextLine();
        while (!kredit.equals("---")) {
            huruf = input.nextLine();
            if (huruf.equals("A")) {
                angka = 4.0;
            } else {
                if (huruf.equals("AB")) {
                    angka = 3.5;
                } else {
                    if (huruf.equals("B")) {
                        angka = 3.0;
                    } else {
                        if (huruf.equals("BC")) {
                            angka = 2.5;
                        } else {
                            if (huruf.equals("C")) {
                                angka = 2.0;
                            } else {
                                if (huruf.equals("D")) {
                                    angka = 1.0;
                                } else {
                                    angka = 0.0;
                                }
                            }
                        }
                    }
                }
            }
            performaMatkul = Integer.parseInt(kredit) * angka;
            System.out.println(toFixed(performaMatkul,1));
            kredit = input.nextLine();
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
