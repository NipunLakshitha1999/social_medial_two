/**
 * @author Nipun Lakshitha <nipunlakshithasilva1999@gmail.com>
 * @since 8/07/21
 */

package com.mycompany.social_media_two.Channel;

import com.mycompany.social_medial_two.controller.ChannelController;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChannelTest {

    @Test
    public void addChannelContent(){
        ChannelController channelController = new ChannelController();
        assertEquals(false,channelController.addChannelContent("test"));

    }

}
