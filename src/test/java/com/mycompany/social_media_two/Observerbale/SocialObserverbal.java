/**
 * @author Nipun Lakshitha <nipunlakshithasilva1999@gmail.com>
 * @since 8/07/21
 */

package com.mycompany.social_media_two.Observerbale;

import com.mycompany.social_medial_two.obsever.SocialObserverble;
import com.mycompany.social_medial_two.view.ShowContent;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SocialObserverbal {

    @Test
    public void subscribeChannel(){
        SocialObserverble socialObserverble = new SocialObserverble();
        assertEquals(0,socialObserverble.subscribeChannel(new ShowContent("test"),"test"),0);
    }

    @Test
    public void unSubscribeChannel(){
        SocialObserverble socialObserverble = new SocialObserverble();
        assertEquals(0,socialObserverble.unSubsribeChannel("test"),0);
    }

    @Test
    public void sendContent(){
        SocialObserverble socialObserverble = new SocialObserverble();
        assertEquals(0,socialObserverble.sendContent("test"),0);
    }



}
