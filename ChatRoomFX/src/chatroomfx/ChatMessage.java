/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatroomfx;

import java.io.Serializable;

/**
 *
 * @author BenBody
 */
public class ChatMessage implements Serializable
{
    
    public static final int NORMAL = 0, QUIT = 1, WHOISIN = 2;
    
    private final String message;
    private final int type;
    private final String formattedTime;
    private final String user;
    
    //constructor assigns all variables
    ChatMessage(int t, String mes, String time, String u)
    {
        type = t;
        message = mes;
        formattedTime = time;
        user = u;
    }
    
    //constructor for standard messages
    ChatMessage(String mes, String time, String u)
    {
        this(0, mes, time, u);
    }
     
    public int getType()
    {
        return type;
    }
    
    public String getMessage()
    {
        return message;
    }
    
    public String getTime()
    {
        return formattedTime;
    }
    
    public String getuser()
    {
        return user;
    }
    
}
