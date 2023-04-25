package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MAX_SIZE = 12;
    private static final int EMPTY_RHYMER_INDICATOR = -1;
    private static final int DEFAULT_VALUE = -1;
    private final int[] numbers = new int[MAX_SIZE];

    public int getTotal() {
        return total;
    }

    private int total = EMPTY_RHYMER_INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

        public boolean callCheck() {
            return total == EMPTY_RHYMER_INDICATOR;
        }
        
            public boolean isFull() {
                return total == MAX_SIZE - 1;
            }
        
                protected int returnLast() {
                    if (callCheck())
                        return EMPTY_RHYMER_INDICATOR;
                    return numbers[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return DEFAULT_VALUE;
                        return numbers[total--];
                    }

}
