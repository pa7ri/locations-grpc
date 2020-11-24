//$Id$
package com.deepak.grpc.locations;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.deepak.grpc.locations.Location;

import org.deepak.grpc.protoFiles.Locations.APIResponse;
import org.deepak.grpc.protoFiles.Locations.locationId;
import org.deepak.grpc.protoFiles.Locations.locationUpdate;
import org.deepak.grpc.protoFiles.Locations.location;
import org.deepak.grpc.protoFiles.locationsGrpc.locationsImplBase;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import io.grpc.stub.StreamObserver;

public class LocationService extends locationsImplBase {

	@Override
	public void getLocation(locationId request, StreamObserver<APIResponse> responseObserver) {
		Integer pid = request.getId();
		APIResponse.Builder response = APIResponse.newBuilder();
		try{
			Location location = new Location();
			ResultSet rSet = getLocationsById(pid);
			while(rSet.next()){
				location.setId(rSet.getInt(1));
				location.setName(rSet.getString(2));
				location.setLongitude(rSet.getInt(3));
				location.setLatitude(rSet.getInt(4));
				location.setActive(rSet.getInt(5));
			}
			response.setMessageCode(0).setResponseMessage(location.toString());
		}
		catch (Exception e) {
			response.setMessageCode(0).setResponseMessage("Locacion with ID: " + pid + " couldn't be found");
			e.printStackTrace();
		}
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
		
	}

	@Override
	public void addLocation(location request, StreamObserver<APIResponse> responseObserver) {
		String name = request.getLocationName();
		Integer longitude = request.getLocationLongitude();
		Integer latitude = request.getLocationLatitude();
		Integer active = request.getLocationActive();
		
		APIResponse.Builder response = APIResponse.newBuilder();
		Location loc = new Location();
		loc.setName(name);
		loc.setLongitude(longitude);
		loc.setLatitude(latitude);
		loc.setActive(active);
		try{
			PreparedStatement st = addLocation(loc);
			st.executeUpdate();
			response.setMessageCode(0).setResponseMessage("Location inserted");
		}
		catch (Exception e){
			response.setMessageCode(0).setResponseMessage("Location couldn't be inserted");
			e.printStackTrace();
		}
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();

	}
	@Override
	public void updateLocation(locationUpdate request, StreamObserver<APIResponse> responseObserver) {
		Integer id = request.getLocationId();
		String name = request.getLocationName();
		Integer longitude = request.getLocationLongitude();
		Integer latitude = request.getLocationLatitude();
		Integer active = request.getLocationActive();
		
		APIResponse.Builder response = APIResponse.newBuilder();
		Location loc = new Location();
		loc.setId(id);
		loc.setName(name);
		loc.setLongitude(longitude);
		loc.setLatitude(latitude);
		loc.setActive(active);
		try{
			PreparedStatement st = updateLocation(loc);
			st.executeUpdate();
			response.setMessageCode(0).setResponseMessage("Location updated");
		}
		catch (Exception e){
			response.setMessageCode(0).setResponseMessage("Location couldn't be updated");
			e.printStackTrace();
		}
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}
	
	@Override
	public void deleteLocation(locationId request, StreamObserver<APIResponse> responseObserver) {
		Integer pid = request.getId();
		String sql = "delete from locations where id="+pid+";";
		PreparedStatement stmt=null;
		APIResponse.Builder response = APIResponse.newBuilder();
		try{
			//DatabaseConnection.getInstance();
			Class.forName("com.mysql.jdbc.Driver");  
			Connection cons=(Connection)DriverManager.getConnection( "jdbc:mysql://127.0.0.1:3306/maven","root","password");  
			stmt = (PreparedStatement) cons.prepareStatement(sql);
			stmt.executeUpdate();
			response.setMessageCode(0).setResponseMessage("Location deleted");
		}
		catch (Exception e) {
			response.setMessageCode(0).setResponseMessage("Location couldn't be deleted");
			e.printStackTrace();
		}
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	private static ResultSet getLocationsById(int id){
		ResultSet rSet = null;
		try{
			String sql = "select * from locations where id="+id+";";
			Class.forName("com.mysql.jdbc.Driver");  
			Connection cons=(Connection)DriverManager.getConnection( "jdbc:mysql://127.0.0.1:3306/maven","root","password");  
			Statement stmt=(Statement)cons.createStatement(); 
			rSet = stmt.executeQuery(sql);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return rSet;
	}


	private PreparedStatement addLocation(Location loc) {
		String sql = "insert into locations(NAME, LONGITUDE, LATITUDE, ACTIVE) VALUES(?,?,?,?);";
		PreparedStatement st = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection cons=(Connection)DriverManager.getConnection( "jdbc:mysql://127.0.0.1:3306/maven","root","password");  
			st = (PreparedStatement) cons.prepareStatement(sql);
			st.setString(1, loc.getName());
			st.setInt(2, loc.getLongitude());
			st.setInt(3, loc.getLatitude());
			st.setInt(4, loc.getActive());
			return st;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	private PreparedStatement updateLocation(Location loc) {
		String sql = "update locations set NAME = ?, LONGITUDE = ?, LATITUDE = ?, ACTIVE = ? where ID = ?;";
		PreparedStatement st = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection cons=(Connection)DriverManager.getConnection( "jdbc:mysql://127.0.0.1:3306/maven","root","password");  
			st = (PreparedStatement) cons.prepareStatement(sql);
			st.setString(1, loc.getName());
			st.setInt(2, loc.getLongitude());
			st.setInt(3, loc.getLatitude());
			st.setInt(4, loc.getActive());
			st.setInt(5, loc.getId());
			return st;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
