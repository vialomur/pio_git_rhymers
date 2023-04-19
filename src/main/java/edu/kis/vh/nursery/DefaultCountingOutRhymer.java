package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int numbers_size = 12;
    public static final int int_total = -1;
    private final int[] numbers = new int[numbers_size];

    public int total = int_total;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

        public boolean callCheck() {
            return total == int_total;
        }
        
            public boolean isFull() {
                return total == 11;
            }
        
                protected int returnLast() {
                    if (callCheck())
                        return int_total;
                    return numbers[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return int_total;
                        return numbers[total--];
                    }

}
