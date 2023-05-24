package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {

    public static void main(String[] args) {
        Rhymersfactory factory = new DefaultRhymersFactory();

        testRhymers(factory);

    }

    private static void testRhymers(Rhymersfactory factory) {
        DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFIFORhymer(), factory.getHanoiRhymer()};

        fillRhymers(rhymers);
        generateRandomNumbers(rhymers[3]);
        printRhymers(rhymers);
        printRejectedCount(rhymers[3]);
    }

    private static void fillRhymers(DefaultCountingOutRhymer[] rhymers) {
        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                rhymers[j].countIn(i);
    }

    private static void generateRandomNumbers(DefaultCountingOutRhymer rhymer) {
        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++)
            rhymer.countIn(rn.nextInt(20));
    }

    private static void printRhymers(DefaultCountingOutRhymer[] rhymers) {
        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }
    }

    private static void printRejectedCount(DefaultCountingOutRhymer rhymer) {
        System.out.println("total rejected is " + ((HanoiRhymer) rhymer).reportRejected());
    }
}