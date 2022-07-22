/**
 * @author Nipun Lakshitha <nipunlakshithasilva1999@gmail.com>
 * @since 8/07/21
 */

package com.mycompany.social_medial_two.obsever;

import java.util.ArrayList;

public class SocialObserverble {

    String content;

    private int removeIndex;

    private ArrayList<SocailObserver> observerArrayList = new ArrayList<>();
    ArrayList<String> nameList = new ArrayList<>();
    public double subscribeChannel(SocailObserver socialObserver, String name){
        observerArrayList.add(socialObserver);
        nameList.add(name);
        return 0;
    }

    public double unSubsribeChannel(String name){
        if(!observerArrayList.isEmpty()){
            for(int i=0;i<observerArrayList.size();i++){
                if(nameList.get(i).equalsIgnoreCase(name)){
                    removeIndex = i;
                }
            }
            observerArrayList.get(removeIndex).closeContent();
        }
       return 0;
    }

    public double notifySubscriber(){
       for(SocailObserver sb : observerArrayList){
           sb.shareContent(this.content);
       }
       return 0;
    }

    public double sendContent(String content){
        this.content = content;
        notifySubscriber();
        return 0;
    }


}
