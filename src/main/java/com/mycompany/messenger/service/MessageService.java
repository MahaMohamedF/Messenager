/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.messenger.service;

import com.mycompany.messenger.Database.DatabaseClass;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.messenger.model.Message;
import java.util.Map;

/**
 *
 * @author user
 */

/*2.created a service that return a list of messages*/

 /*will have 
1-getAllMessages() which return a list of all messages
2-getMessage(long); which return a particular messsage which take long which is the id
3-addMessage(Message) which take message object and added it to the database
4-updateMessage(Message)take message object as an argu and update it to the database
5-removeMessage(long);takes id which long id and remove the message in database and return the message that is removed 
can print the method -- but here implem in meromry we will create map in memory
which map odf id to method will remove message from the map get message from that map

 */
public class MessageService {

    //loacl variable called messages which is a map of long and messages
    //and bascily getting messages  from that static instance (getMessages();)
    private  Map<Long, Message> messages = DatabaseClass.getMessages(); //final

    //create a constructor to see few messages
    public MessageService() {
        if(messages.size()==0){ //update -
        messages.put(1L, new Message(1, "Hello", "Maha", "Maha"));
        messages.put(2L, new Message(2, "whatsup", "Maha", "Maha"));
        messages.put(3L, new Message(3, "how re doin", "Maha", "Maha"));
        }
        
    }

    //will use in mer data oject act as database--class Database
    //simple message service that return list of all messages-- A1
    public Message getMessage(long id) {
        return messages.get(id);
        //  get message take an id and does messages .get that id --messages el feh value el men el static database
    }

    //add message take message as an arg
    //what database make that it find the primary key which is is id 
    //and increment it by one to add new message with incrementing the last pk by 1
    //so message .size()+1
    //messages coming from database
    //setid adding the id of the new message
    //message .put im putting it to the map
    //returing the mesage that i have added so returning the id back
    public Message addMessage(Message message) {
        
        message.setId(messages.size()+1);
        messages.put(message.getId(), message);
        
        return message;
        
        
    /*    
Message obj = new Message();
        messages.put(4L, message);
        return message;
  */
    
    }

    //message must have an id set when doing an update
    //when id < than zero return null
    //if id have value make message .put of the id as a key and the message as a value
    public Message updateMessage(Message message) {
        if (message.getId() <= 0) {
            return null;
        }
        messages.put(message.getId(),message);  // messages.put(4L, message);
        return message;
    }

    public Message removeMessage(long id) {

        return messages.remove(id);
    }

    public List<Message> getAllMessages() {
        //creeating to messages adding it to a list
        //and returing this list
        //that why i create a constru to create this list//const in message

        return new ArrayList<Message>(messages.values());
        //this return a list of all the values of the map that is al the messages that we have
        //private Map<Long, Message> *****messages***** =DatabaseClass.getMessages();

    }
}






















/*
  Message m1;
     m1 = new Message(1,"Hello world","Maha");
     Message m2;
     m2 = new Message(2,"Hello Jersy","Maha");
     List<Message> list= new ArrayList<>();
      
       list.add(m1);
       list.add(m2);
       return list;

*/
