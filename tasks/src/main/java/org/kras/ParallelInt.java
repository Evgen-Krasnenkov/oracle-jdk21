package org.kras;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.function.BinaryOperator;

public class ParallelInt {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int parallelSum = numbers.parallelStream().reduce(0, (a, b) -> Integer.sum(a, b)) + 5;
        int sum = numbers.stream().reduce(0, Integer::sum) + 5;
        ForkJoinPool forkJoinPool = new ForkJoinPool(3);
        Integer forkSum;
        try {
            forkSum = forkJoinPool.submit(() -> numbers.parallelStream().reduce(5, new BinaryOperator<Integer>() {
                        @Override
                        public Integer apply(Integer a1, Integer b1) {
                            return Integer.sum(a1, b1);
                        }
                    }))
                    .get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        forkJoinPool.shutdown();
        Integer reducedSum = numbers.stream().reduce(5, (a, b) -> a + b);
        int elseSum = numbers.parallelStream().reduce((m, n) -> m + n).orElse(5) + 5;

        System.out.println("Parallel sum: " + forkSum);

    }
}
