package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] Numbers = new int[12];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            Numbers[++total] = in;
    }

        public boolean callCheck() {
            return total == -1;
        }
        
            public boolean isFull() {
                return total == 11;
            }
        
                protected int returnLast() {
                    if (callCheck())
                        return -1;
                    return Numbers[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return -1;
                        return Numbers[total--];
                    }

}
