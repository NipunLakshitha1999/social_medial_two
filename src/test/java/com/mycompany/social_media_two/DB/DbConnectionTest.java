/**
 * @author Nipun Lakshitha <nipunlakshithasilva1999@gmail.com>
 * @since 8/07/21
 */

package com.mycompany.social_media_two.DB;

import com.mycompany.social_medial_two.DB.DBConnection;
import com.mycompany.social_medial_two.controller.SubscribeController;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DbConnectionTest {

    @Test
    public void setData(){
        DBConnection dbConnection = new DBConnection();
        assertEquals(null,dbConnection.setData("test"));
    }

    @Test
    public void deleteData(){
        DBConnection dbConnection = new DBConnection();
        assertEquals(null,dbConnection.deleteData("test"));
    }
}
