package com.stackroute;

class MinMaxAvg{

    private int min;
    private int max;
    private float avg;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

}

public class StudentsAndGrades {

    public MinMaxAvg findMinMaxAvg(int lim, int[] arr){

        MinMaxAvg minMaxAvg = new MinMaxAvg();

        int min = 99999, max = 0, sum = 0;
        float avg = 0;

        for (int i=0;i<lim;i++){

            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }

            sum = sum + arr[i];

        }

        avg = sum/lim;

        minMaxAvg.setAvg(avg);
        minMaxAvg.setMax(max);
        minMaxAvg.setMin(min);

        System.out.println(minMaxAvg.getMax());
        System.out.println(minMaxAvg.getMin());
        System.out.println(minMaxAvg.getAvg());

        return minMaxAvg;

    }

}
