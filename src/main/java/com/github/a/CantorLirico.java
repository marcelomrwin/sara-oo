package com.github.a;

/**
 *
 * @author marcelosales
 */
public class CantorLirico extends Cantor {

    @Override
    public void cantar(int repeticoes) {

        if (repeticoes > 10) {
            System.out.print("LA");
            for (int x = 1; x < repeticoes; x++) {
                System.out.print("A");
            }

        } else {
            for (int x = 0; x < repeticoes; x++) {
                System.out.print("LA ");
            }
        }

        System.out.println("!!!\n");

    }

}
