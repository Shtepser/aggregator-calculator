package ru.ac.uniyar.indevcourse;

/** Class that aggregates a lot of values into one summ */
public class Aggregator {
    private double sum = 0;

    /**
     * Add a value to the aggregated number.
     * @param value number to add to the sum
     */
    public void addValue(double value) {
        sum += value;
    }

    /**
     * Get the sum of all valued added so far.
     * @return sum.
     */
    public double getSum() {
        return sum;
    }

    /**
     * Reset the aggregated value
     */
    public void reset() {
        sum = 0;
    }
}
