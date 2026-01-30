package com.springmvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.springmvc.model.Car;
import com.springmvc.util.DbUtil;

public class CarDao {
	private Connection connection;
	
	public CarDao() {
		connection = DbUtil.getConnection();
	}
	
	public void addCar(Car car) throws SQLException {
		PreparedStatement ps = connection.prepareStatement("insert into carsmvc (manufacturer, model, city,registrationNumber) values (?,?,?,?)");
		ps.setString(1, car.getManufacturer());
		ps.setInt(2, car.getModel());
		ps.setString(3, car.getCity());
		ps.setString(4, car.getRegistrationNumber());
		
		ps.executeUpdate();
	}

	public void deleteCar(int carId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement("delete from carsmvc where carId=?");
		ps.setInt(1, carId);
		ps.executeUpdate();
	}
	
	public void updateCar(Car car) throws SQLException {
		PreparedStatement ps = connection
				.prepareStatement("update carsmvc set manufacturer=?, model=?,city=?,registrationNumber=? where carId=?");
		ps.setString(1, car.getManufacturer());
		ps.setInt(2, car.getModel());
		ps.setString(3, car.getCity());
		ps.setString(4, car.getRegistrationNumber());
		ps.setInt(5, car.getCarId());
		ps.executeUpdate();
	}
	
	public List<Car> getAllCars() throws SQLException{
		List<Car> Cars = new ArrayList<>();
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from carsmvc");
		while (rs.next()) {
			Car car = new Car();
			car.setCarId(rs.getInt("carId"));
			car.setManufacturer(rs.getString("manufacturer"));
			car.setModel(rs.getInt("model"));
			car.setCity(rs.getString("city"));
			car.setRegistrationNumber(rs.getString("registrationNumber"));
			Cars.add(car);
		}
		return Cars;
	}
	
	public Car getCarById(int carId) throws SQLException {
		Car car = new Car();
		PreparedStatement ps = connection.prepareStatement("select * from carsmvc where carId=?");
		ps.setInt(1, car.getCarId());
		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			car.setCarId(rs.getInt("carId"));
			car.setManufacturer(rs.getString("manufacturer"));
			car.setModel(rs.getInt("model"));
			car.setCity(rs.getString("city"));
			car.setRegistrationNumber(rs.getString("registrationNumber"));
		}
		return car;
		
	}
	
	
	
	
}
