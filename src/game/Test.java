package game;

import game.field.Cell;
import game.field.Letter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<Cell> list = new ArrayList<>(4);
        List<String> list1 = new ArrayList<>(4);

        for (int i = 0; i < 4; i++) {
            Scanner s = new Scanner(System.in);
            String sc = s.next();
           list1.add(sc);
        }
        System.out.println(list1);
            String s = list1.get(0);
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) == "A" ) {
                Cell cell = list1.get(i);
                cell.getLet() = list1.get(i);
                cell.getNum() = 3;
                list.add(list1.get(i) + "" + 3);
            }


            }
        }
    }


//2d
//3d
//4d
//4d
//6f
//5a
//4e
//8h




        //TODO HM
        //b2 c7 c8 e3 ..... (10)



