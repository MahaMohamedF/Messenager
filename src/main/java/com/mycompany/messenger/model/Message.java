/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.messenger.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@XmlRootElement//jax-b/the root element
/*Create a model 1*/
public class Message {

    private long id;
    private String message; //message it self
    private String created; // date message is created
    private String author;    //who created it

    public Message() {
    }
    //this constructor help us to create new instance
//New instance of message class

    public Message(long id, String message, String created, String author) {
        this.id = id;
        this.message = message;
        this.created = created;   //;this.created = new Date();//

        this.author = author;
    }

    public Message(int i, String hello_world, String maha) {

    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

//    public void put( long id, Message message) {
//       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

}
/*after this i need a service that return the list of messages*/
/*which class the messageservice*/
