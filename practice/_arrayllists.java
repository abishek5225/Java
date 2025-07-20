public class _arrayllists {
    public static  void main(String[] args){
        String [] [] cars= new String[3][3];
        cars[0][0]="bolero";
                cars[0][1]="camero";
                        cars[0][2]="mustang";
                                cars[1][0]="tesla";
                                        cars[1][1]="maruti";
                                                cars[1][2]="suzuki";
                                                        cars[2][0]="ferrari";
                                                                cars[2][1]="lambo";
                                                                        cars[2][2]="rolles royals";
                                                                        for (int i=0; i<cars.length;i++){
                                                                            System.out.println();
                                                                            for (int j=0;j<cars[i].length;j++){
                                                                                System.out.println(cars[i][j]+"");
                                                                            }
                                                                        }
    }
}
