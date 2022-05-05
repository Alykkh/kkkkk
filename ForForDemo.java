package BIXiangDong;

public class ForForDemo {
    public static void main(String[] args){
        /*for(int x=0;x<=2;x++){//这里循环了三次，控制行。
            for (int y=0;y<2;y++){//这里循环了两次，控制列。
                //所以就是3X2为4.这个结果会被打印6次。


                System.out.print("*");
            }
            System.out.println();
            //如果：这里是：System.out.print();   那么将毫无意义。


        }

         */




        /*
        * 打印一个正的星号三角形？
        * */
        for(int x=1;x<4;x++){


            for (int y=0;y<x;y++){

                System.out.print("*");
            }
            System.out.println();
        }

        /*
        *
        * 打印一个反的星号三角形？
        * */
       for(int x=4;x>1;x--){
           for (int y=x;y>1;y--){
               System.out.print("*");
           }
           System.out.println();


       }
       System.out.println("-----------------------------------------");


/*
* 数字三角形（尖朝上）
*
* */
       for (int x=1;x<=5;x++){
           for(int y=1;y<=x;y++){
               System.out.print(y);

           }
           System.out.println();
       }
       System.out.println("--------------------------------------------");


        /*
        打印一个数字矩阵，（尖朝下）
        */

        for(int x=5;x>=0;x--){
            for (int y=1;y<=x;y++){
                System.out.print(y);
            }
            System.out.println();

        }
         System.out.println("-----------------------------------------");

            System.out.println();
        }

    }



