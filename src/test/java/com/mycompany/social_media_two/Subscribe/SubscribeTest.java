/**
 * @author Nipun Lakshitha <nipunlakshithasilva1999@gmail.com>
 * @since 8/07/21
 */

package com.mycompany.social_media_two.Subscribe;
import com.mycompany.social_medial_two.controller.SubscribeController;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubscribeTest {


    @Test
    public void subscribeChannel(){
        SubscribeController subscribeController = new SubscribeController();
        assertEquals(false,subscribeController.subscribeChannel("test"));

    }

    @Test
    public void unSubscribeChannel(){
        SubscribeController subscribeController = new SubscribeController();
        assertEquals(false,subscribeController.unSubscribeChannel("test"));
    }
}
