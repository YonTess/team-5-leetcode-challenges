class Average {
    public double average(int[] salary) {
        // Find min salary and max salary
        int min = salary[0]; //Initialize min salary
        int max = salary[0]; //Initialize max salary
        for(int sal : salary){ //Use a foreach loop to get min and max
            if (sal < min) {
                min = sal;
            }
            if (sal > max){
                max = sal;
            }
        }
        // Get the sum of all the salary left
        int totalSum = 0;
        for (int sal : salary) { //using a loop to get the sum left
            totalSum += sal;
        }
        int sum = totalSum - min - max;
        // Get the average
        double result = sum / (salary.length - 2);
        return result;
    }
}