package question3;

import question1.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IHMFahrenheit extends JFrame implements ActionListener{
  private JTextField entree = new JTextField( 6 );
  /** Le bouton de conversion. */
  private JButton  boutonDeConversion = new JButton( "convertir" );
  /** La sortie en degré Celsius. */
  private JTextField sortie = new JTextField( 6 );

  public IHMFahrenheit(){
    super("IHM Fahrenheit");
 
    setLayout(new FlowLayout());
    add( entree ); add( boutonDeConversion ); add( sortie );
    sortie.setEditable( false );
    getContentPane().setBackground( Color.pink );
    setLocation(100,100);
    pack();setVisible(true);
    
    boutonDeConversion.addActionListener( this );
  }

    public void actionPerformed( ActionEvent ae ){
        try{
            int fahrenheit = Integer.parseInt(entree.getText());
            float celsius = fahrenheitEnCelsius(fahrenheit);
            if(celsius < -273.1){
                sortie.setText("-273.1");
            }else{
                sortie.setText(Float.toString(celsius));
            }
        }catch(NumberFormatException nfe){
            sortie.setText("error !");
        }
    }
    
    public float fahrenheitEnCelsius( int f){
        float x = 5;
        float y = 9;
        float z = (x/y * (f - 32));
        z = z * 10;
        z = (float)Math.floor(z);
        z = z / 10;
        return z;
    }  
  
    public static void main(String[] args){
        new IHMFahrenheit();
    }
}
