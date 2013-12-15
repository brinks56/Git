/*
 * The input for the poster collection database
 */
package poster.collection;

/**
 * 
 * @author Edward Cooney
 * @date: 12/14/2013
 */

import javax.swing.*;
import java.awt.event.*;

public class InformationEntry extends JFrame {
    
    // Private panel elements
    private JPanel entryPanel;
    private JLabel messageLabelArtist, messageLabelTitle, 
                   messageLabelPrice, messageLabelDimensions;
    private JTextField artistField, titleField, priceField, dimensionsField;
    private JButton enterPosterButton;
    private final int WINDOW_WIDTH = 300;
    private final int WINDOW_HEIGHT = 300;              
    private String frameTitle = "My Poster Collection"; // The entry frame title
    private String enterPosterButtonText = "Enter Poster";    // Entry Pane Button
    
       
    /**
     * Constructor
     */
    public InformationEntry() {
        //Set window title
        setTitle(frameTitle);

        // Set window size
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Close on click
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Build the panel
        buildEntryPanel();
        
        // Add Panel to frame
        add(entryPanel);
        
        // Visible
        setVisible(true);
    }

    private void buildEntryPanel() {
        // Dimension for all JTextFields
        int fieldDim = 15;
        
        // JLabels
        messageLabelArtist = new JLabel("Artist(s): ");
        messageLabelTitle = new JLabel("Title: ");
        messageLabelPrice = new JLabel("Price: ");
        messageLabelDimensions = new JLabel("Dimensions: ");
        
        // JTextFields
        artistField = new JTextField(fieldDim);
        titleField = new JTextField(fieldDim);
        priceField = new JTextField(fieldDim);
        dimensionsField = new JTextField(fieldDim);
        
        // Button to enter data
        enterPosterButton = new JButton(enterPosterButtonText);
        
        // Enter Button Action Event Listener
        enterPosterButton.addActionListener(new enterPosterButtonListener());
        
        // Create entryPanel
        entryPanel = new JPanel();
        
        //** Compose entryPanel **
        entryPanel.add(messageLabelArtist);
        entryPanel.add(artistField);
        entryPanel.add(messageLabelTitle);
        entryPanel.add(titleField);
        entryPanel.add(messageLabelPrice);
        entryPanel.add(priceField);
        entryPanel.add(messageLabelDimensions);
        entryPanel.add(dimensionsField);
        entryPanel.add(enterPosterButton);
    }
    
    private class enterPosterButtonListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            // Local Text
            String artist;
            String title;
            String price;
            String dimensions;
            
            // Get Text
            artist = artistField.getText();
            title = titleField.getText();
            price = priceField.getText();
            dimensions = dimensionsField.getText();
            
            // Create Poster
            Poster aPoster = new Poster();
            aPoster.setArtistName(artist);
            aPoster.setTitle(title);
            aPoster.setPrice(price);
            aPoster.setDims(dimensions);
            
            aPoster.printPoster();
        }
    }
}