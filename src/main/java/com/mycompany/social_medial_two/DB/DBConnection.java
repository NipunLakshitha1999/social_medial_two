/**
 * @author Nipun Lakshitha <nipunlakshithasilva1999@gmail.com>
 * @since 8/07/21
 */

package com.mycompany.social_medial_two.DB;

import java.util.ArrayList;

public class DBConnection {

    ArrayList arrayList = new ArrayList();

    public Integer setData(String name){
        arrayList.add(name);
        return null;
    }

    public Integer deleteData(String name){
       int index =0;

       if(arrayList.size()>0){

           for(int i=0;i<arrayList.size();i++){
               if(name == arrayList.get(i)){
                   index = i;

               }
           }
           arrayList.remove(index);
       }


       return null;
    }
}
