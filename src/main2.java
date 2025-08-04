/*
this is my seconed java file review on loops ,while ,

arrays



*/



public class main2 {
    public static void main(String[] args){

    for(int i =0;i<6;i++){
        System.out.println(i);


    }
    int x =6;

    while(x < 13){
        System.out.println(1);
        x++;
    }

    String[] cars ={"bmw","mercedes","sosa"};

    for (int y =0; y < cars.length; y++){
        System.out.println(cars[y]);
    };


    int[] nums ={1,2,3,4};
    for(int u : nums){
        System.out.println(u);
    }

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int d= 0; d < myNumbers.length; ++d) {
            for (int j = 0; j < myNumbers[d].length; ++j) {
                System.out.println(myNumbers[d][j]);
            }
        }



    }
}
