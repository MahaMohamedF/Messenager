/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.messenger.resources;

import com.mycompany.messenger.model.Message;
import com.mycompany.messenger.service.MessageService;
import static java.util.Collections.list;
import java.util.List;
import javax.ws.rs.Consumes;                                //missing lib
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author user
 */
/*3. making call to the service a returing that list of messages*/
@Path("/messages") //root antotion all the methods of this class is map to \messages 
public class MessageResource {
    
    //API's
    
    

    //create a new instance of mesaage service A.1.1
    //asking jersy to take this list and converted it to application-XML
    //jax-b
    MessageService messagesService = new MessageService();

    @GET
    @Produces(MediaType.APPLICATION_XML)/*function to return static like hello world*/
    public List<Message> getMessages() { //return type list bec it will return list of values 
        return messagesService.getAllMessages();
    } 
    

//getting the message by an id (getmessage Funtuon)
    //how to map the url to mmessage here
    //jersy allow this message anotation @Path(/) to made to the method
    
    //now we need to make an API request to call the get message
    //how to map this URL http://localhost:8084/Messenger/webapi/messages/1 to a method here --an api call
    
    //you have top level path anotition @path("messages)
    //and method level path annot
    
    //so im saying after messaege if there an extra element in the path map this method to it
    @GET 
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    public String test(){
    return "test";
    }
    
    
    
    
    //method that accept JASON annd return JASON
    
    
    
   @POST 
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON) //ssend back to the client 
   public Message addMessage(Message message){
       
     /*  Message newmessage= messagesService.addMessage(message);
       return newmessage;
       */
      return messagesService.addMessage(message);
      
       
   }
   
   
    
    
   // jesry know that that what is you expected w btfhm el request body over postman to this instance meesage
   // opp to the pervious -- we see trhat the message instance been converted to JASON 
   
    
    
   
   
  
 
    
    //{messageId} understand that this is an id 
    //if i have anthor variable
    
   @GET 
   @Path("/{messageId}")
   @Produces(MediaType.APPLICATION_ATOM_XML)
   //telling jesry whatever you mapped in {/messageId} send it as an argurment when this method is called
   //telling jersy that there is a parameter in the path called messageId inject or bind that value lel String messageId 
   //so i can access it in my method
   public Message getMessage(@PathParam("messageId") long id){
       
   return messagesService.getMessage(id); 
  
}



   @PUT
    @Path("/{id}")
    public Message updatemessage(@PathParam("id") int id,Message mes) {
        mes.setId(id);
        return messagesService.updateMessage(mes);
    }
   
   
   
   
   
   
    
  //return by id error
     
 
//post message that request body contnating the new message in jason format 
   //

   
}
