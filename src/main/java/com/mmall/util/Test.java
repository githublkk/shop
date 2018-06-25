package com.mmall.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    public static void main(String[] args) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");

        String str="2018/6/22 8:00:00";

        try {
            Date data=sdf.parse(str);
            String dd=sdf1.format(data);
            System.out.println(data);
            System.out.println(dd);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
