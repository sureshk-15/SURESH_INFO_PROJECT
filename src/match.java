/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;





/**
 *
 * @author SURESH
 */
public class match {
     int counter = 10;
    Boolean isIt = false;
    void message()
{System.out.println("abc");
}
   
  
    
    public static int cntt;
    
   public void song()
    {
        
  
        InputStream music;

try{
music=new FileInputStream(new File("src\\pics\\button-1.mp3"));
AudioStream audios=new AudioStream(music);
AudioPlayer.player.start(audios);
}
catch(Exception e){
JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
    }
            
            
    }    
   public void time(int t)
   {    Timer timer = new Timer(); 
        counter = 10; 
        TimerTask task = new TimerTask() {
            public void run() {
                
                counter --;
                if (counter == -1){
                    timer.cancel();
                } else if(isIt){
                    timer.cancel();
                    isIt = false;
                }
                cntt=counter+1;
                System.out.println(cntt);
                
                if(cntt==8){
                    
                   
                }
                
                
            }
        };
        timer.scheduleAtFixedRate(task, 1000, 1000);
   }
 
    }


