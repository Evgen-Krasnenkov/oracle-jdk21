package org.kras;

import java.util.ArrayDeque;
import java.util.Deque;

/*
- 273511
- 117532
• 253117
• 235711
- 112735
• 117325
 */

public class PrimesDeque {
    public static void main(String[] args) {
        String[] primes = {"2", "3", "5", "7", "11"};
        Deque<Integer> numbers = new ArrayDeque<>();
        for (int i = 0; i < primes.length; i++) {
            if (i != ((numbers.peekLast() != null) ? numbers.peekLast() : 0)) {
                numbers.offerFirst(Integer.parseInt(primes[i]));
            } else {
                numbers.offerLast(Integer.parseInt(primes[i]));
            }
        }
        for (Integer number : numbers) {
            System.out.print(number);
        }
    }
}
