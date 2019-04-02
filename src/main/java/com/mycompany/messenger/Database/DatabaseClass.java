/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.messenger.Database;

import com.mycompany.messenger.model.Message;
import com.mycompany.messenger.model.Profile;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */

/*Database class which is a static class which have static values*/
public class DatabaseClass {

    //messsage map which map the id to message
    //profils map which map the id to profile
    //any class in the application can acces the map of messages
    //and the map of profile by calling these static method
    //instead of JDBC for learing only
    private static Map<Long, Message> messages = new HashMap();
    private static Map<Long, Profile> profiles = new HashMap();

    // static methods
    public static Map<Long, Message> getMessages() {

        return messages;
    }

    public static Map<Long, Profile> getProfiles() {

        return profiles;
    }

}
