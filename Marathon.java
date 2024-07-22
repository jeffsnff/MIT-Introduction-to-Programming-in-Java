class Marathon{
    public static void main(String[] args){
        String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
            };
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};

        String fastestRunner = "";
        int fastestRunnerTime = 0;
        
        for(int i=0; i<names.length; i++){
            if(times[i] > fastestRunnerTime){
                fastestRunner = names[i];
                fastestRunnerTime = times[i];
            }
        }

        System.out.println("Fastest Runner: "+fastestRunner+" and their time: "+fastestRunnerTime);

    }
}