/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poster.collection;

import javax.swing.JOptionPane;

/**
 *
 * @author Edward Cooney
 * @Date 12/14/2013
 */
public class Poster {
    
    // Class Variables
    private String artistName;
    private String title;
    private String price;
    private String dimensions;
    
    /**
     * Default Constructor
     * 
     * It initializes all fields to empty Strings.
     */
    public Poster () {
        artistName = "";
        title = "";
        price = "";
        dimensions = "";
    }
    
    /**
     * Full Poster Constructor
     * @param a The artist
     * @param ttl The title
     * @param prc The price
     * @param dims The poster dimensions
     */
    public Poster (String a, String ttl, String prc, String dims) {
        this.artistName = a;
        this.title = ttl;
        this.price = prc;
        this.dimensions = dims;
    }
    
    public void setArtistName (String a) {
        if ("".equals(a)) {
            artistName = "Unknown";
        } else {
            artistName = a;
        }
    }
    
    public void setTitle (String t) {
        if ("".equals(t)) {
            title = "Unknown";
        } else {
            title = t;
        }
    }
    
    public void setPrice (String p) {
        if ("".equals(p)) {
            price = "Unknown";
        } else {
            price = "$" + p;
        }
    }
    
    public void setDims (String d) {
        if ("".equals(d)) {
            dimensions = "Unkown";
        } else {
        dimensions = d;
        }
    }
    
    public String getArtistName () {
        return artistName;
    }
    
    public String getTitle () {
        return title;
    }
    
    public String getPrice () {
        return price;
    }
    
    public String getDims () {
        return dimensions;
    }
    
    public void printPoster () {
        JOptionPane.showMessageDialog(null, "Artist: " + getArtistName() + "\n"  
                                        + "Title: " + getTitle() + "\n" +
                                          "Price: " + getPrice() + "\n" + 
                                          "Dimensions: " + getDims() + "\n");
    }
}
