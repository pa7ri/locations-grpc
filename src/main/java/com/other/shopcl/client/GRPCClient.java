//$Id$
package com.other.shopcl.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import org.deepak.grpc.protoFiles.Locations.location;
import org.deepak.grpc.protoFiles.Locations.locationId;
import org.deepak.grpc.protoFiles.Locations.locationUpdate;
import org.deepak.grpc.protoFiles.Locations.APIResponse;
import org.deepak.grpc.protoFiles.locationsGrpc;
import org.deepak.grpc.protoFiles.locationsGrpc.locationsBlockingStub;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GRPCClient {
	
	static locationsBlockingStub locStub;

	public static void main(String[] args){
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9089).usePlaintext().build();
		
		locStub = locationsGrpc.newBlockingStub(channel);
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		APIResponse response;
		
		createMainMenu();		
	}
	
	private static void createMainMenu() {
		JFrame frame= new JFrame(); 
        frame.setTitle("Consult locations");
        
        JButton buttonGet, buttonPost, buttonDelete, buttonPut;
        buttonGet = new JButton("Search location");
        buttonPost = new JButton("Add location");
        buttonDelete = new JButton("Delete location");
        buttonPut = new JButton("Update location");
        
        frame.add(buttonGet);
        buttonGet.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.dispose();
        		createGetMenu();
        	}
        }); 
        frame.add(buttonPost);
        buttonPost.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.dispose();
        		createPostMenu();
        	}
        });
        frame.add(buttonPut);
        buttonPut.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.dispose();
        		createPutMenu();
        	}
        });
        frame.add(buttonDelete);
        buttonDelete.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.dispose();
        		createDeleteMenu();
        	}
        });       
        frame.setLayout(new GridLayout(4,1));
        
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
	}
        
    private static void createGetMenu() {
		JFrame frame= new JFrame(); 
        frame.setTitle("Search location by ID");
        
        JPanel content = new JPanel();
        JLabel label = new JLabel();        
        label.setText("Introduce ID :");
        JTextField inputID = new JTextField("2",10);
        
        content.add(label);
        content.add(inputID);
        content.setLayout(new GridLayout(1,2));
        content.setSize(400, 100);
        
        JPanel buttons = new JPanel(); 
        JButton buttonSearch = new JButton("Search");
        buttonSearch.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String message = "Error en la lectura";
				int alert = JOptionPane.INFORMATION_MESSAGE;
        		
        		try { 
	        		int id = Integer.parseInt(inputID.getText());
	        		locationId locId = locationId.newBuilder().setId(id).build();
	        		APIResponse response = locStub.getLocation(locId);
	    			message = response.getResponseMessage();
	 
				} catch ( NumberFormatException exc) {} finally {
					JOptionPane.showMessageDialog(null, message, "Response", alert);
				}
        	}
        });
        JButton buttonBack = new JButton("Back");
        buttonBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.dispose();
        		createMainMenu();
        	}
        });

        buttons.add(buttonBack);
        buttons.add(buttonSearch);
        buttons.setLayout(new GridLayout(1,2));
        buttons.setSize(400, 100);
        
        
        frame.setLayout(new BorderLayout());
        frame.add(content, BorderLayout.NORTH);
        frame.add(buttons, BorderLayout.SOUTH);
        
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}
        
    private static void createPostMenu() {
		JFrame frame= new JFrame(); 
        frame.setTitle("Add location");
        
        JPanel content = new JPanel();
        JLabel labelName = new JLabel("Introduce name :");
        JTextField inputName = new JTextField("Madrid",10);
        JLabel labelLong = new JLabel("Introduce longitude :");
        JTextField inputLong = new JTextField("24",10);
        JLabel labelLat = new JLabel("Introduce latitude :");
        JTextField inputLat = new JTextField("72",10);
        JLabel labelActive = new JLabel("Introduce active :");
        JTextField inputActive = new JTextField("1",10);

        content.add(labelName);
        content.add(inputName);
        content.add(labelLong);
        content.add(inputLong);
        content.add(labelLat);
        content.add(inputLat);
        content.add(labelActive);
        content.add(inputActive);
        content.setLayout(new GridLayout(4,2));
        content.setSize(400, 250);
        
        JPanel buttons = new JPanel(); 
        JButton buttonUpdate = new JButton("Add");
        buttonUpdate.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String message = "Creation failed";
				int alert = JOptionPane.INFORMATION_MESSAGE;
        		
        		try {        			
	        		String name =inputName.getText();
	        		int longi = Integer.parseInt(inputLong.getText());
	        		int lat = Integer.parseInt(inputLat.getText());
	        		int active = Integer.parseInt(inputActive.getText());
	        		
	        		location loc = location.newBuilder().setLocationName(name).setLocationLongitude(longi).setLocationLatitude(lat).setLocationActive(active).build();
	        		APIResponse response = locStub.addLocation(loc);
	        		message = response.getResponseMessage();
	    			
    			} catch ( NumberFormatException exc) {} finally {
					JOptionPane.showMessageDialog(null, message, "Response", alert);
				}
        	}
        });
        JButton buttonBack = new JButton("Back");
        buttonBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.dispose();
        		createMainMenu();
        	}
        });

        buttons.add(buttonBack);
        buttons.add(buttonUpdate);
        buttons.setLayout(new GridLayout(1,2));
        buttons.setSize(400, 100);
        
        
        frame.setLayout(new BorderLayout());
        frame.add(content, BorderLayout.NORTH);
        frame.add(buttons, BorderLayout.SOUTH);
        
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}
   
    private static void createPutMenu() {
		JFrame frame= new JFrame(); 
        frame.setTitle("Update location");
        
        JPanel content = new JPanel();
        JLabel labelID = new JLabel("Introduce ID :");
        JTextField inputID = new JTextField("2",10);
        JLabel labelName = new JLabel("Introduce name :");
        JTextField inputName = new JTextField("Madrid",10);
        JLabel labelLong = new JLabel("Introduce longitude :");
        JTextField inputLong = new JTextField("24",10);
        JLabel labelLat = new JLabel("Introduce latitude :");
        JTextField inputLat = new JTextField("72",10);
        JLabel labelActive = new JLabel("Introduce active :");
        JTextField inputActive = new JTextField("1",10);

        content.add(labelID);
        content.add(inputID);
        content.add(labelName);
        content.add(inputName);
        content.add(labelLong);
        content.add(inputLong);
        content.add(labelLat);
        content.add(inputLat);
        content.add(labelActive);
        content.add(inputActive);
        content.setLayout(new GridLayout(5,2));
        content.setSize(400, 250);
        
        JPanel buttons = new JPanel(); 
        JButton buttonUpdate = new JButton("Udpate");
        buttonUpdate.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String message = "Update failed";
				int alert = JOptionPane.INFORMATION_MESSAGE;
				
				try {
	        		int id = Integer.parseInt(inputID.getText());
	        		String name =inputName.getText();
	        		int longi = Integer.parseInt(inputLong.getText());
	        		int lat = Integer.parseInt(inputLat.getText());
	        		int active = Integer.parseInt(inputActive.getText());
	    			locationUpdate locUpdate = locationUpdate.newBuilder().setLocationId(id).setLocationName(name).setLocationLongitude(longi).setLocationLatitude(lat).setLocationActive(active).build();
	    			APIResponse response = locStub.updateLocation(locUpdate);
	    			message = response.getResponseMessage();
				} catch ( NumberFormatException exc) {} finally {
					JOptionPane.showMessageDialog(null, message, "Response", alert);
				}
    			
    			

        	}
        });
        JButton buttonBack = new JButton("Back");
        buttonBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.dispose();
        		createMainMenu();
        	}
        });

        buttons.add(buttonBack);
        buttons.add(buttonUpdate);
        buttons.setLayout(new GridLayout(1,2));
        buttons.setSize(400, 100);
        
        
        frame.setLayout(new BorderLayout());
        frame.add(content, BorderLayout.NORTH);
        frame.add(buttons, BorderLayout.SOUTH);
        
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
		
	}
    
    private static void createDeleteMenu() {
		JFrame frame= new JFrame(); 
        frame.setTitle("Delete location by ID");
        
        JPanel content = new JPanel();
        JLabel label = new JLabel();        
        label.setText("Introduce ID :");
        JTextField inputID = new JTextField("2",10);
        
        content.add(label);
        content.add(inputID);
        content.setLayout(new GridLayout(1,2));
        content.setSize(400, 100);
        
        JPanel buttons = new JPanel(); 
        JButton buttonDelete = new JButton("Delete");
        buttonDelete.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String message = "Removal failed";
				int alert = JOptionPane.INFORMATION_MESSAGE;
        		
        		try {
	        		int id = Integer.parseInt(inputID.getText());
	        		locationId locId = locationId.newBuilder().setId(id).build();
	        		APIResponse response = locStub.deleteLocation(locId);
	    			message = response.getResponseMessage();	
    			} catch ( NumberFormatException exc) {} finally {
					JOptionPane.showMessageDialog(null, message, "Response", alert);
				}
        	}
        });
        JButton buttonBack = new JButton("Back");
        buttonBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.dispose();
        		createMainMenu();
        	}
        });

        buttons.add(buttonBack);
        buttons.add(buttonDelete);
        buttons.setLayout(new GridLayout(1,2));
        buttons.setSize(400, 100);
        
        
        frame.setLayout(new BorderLayout());
        frame.add(content, BorderLayout.NORTH);
        frame.add(buttons, BorderLayout.SOUTH);
        
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
	}
        
}
