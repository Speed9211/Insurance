package com.insurance.dao.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.insurance.utility.DatabaseUtility;

public class RiderDAOImpl implements RiderDAO {

	@Override
	public boolean addRider(Rider rider) {
		String sql="INSERT INTO `rider`(`ridername`, `premiumintrest`) VALUES (?,?)";
		int index=0;
		try
		{
			PreparedStatement preparedStatement=DatabaseUtility.getDbConnection().prepareStatement(sql);
			preparedStatement.setString(1, rider.getRiderName());
			preparedStatement.setDouble(2,rider.getPremiumIntrest());
			index=preparedStatement.executeUpdate();
		}catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		if(index!=0)
			return true;
		else
			return false;
	}

	@Override
	public List<Rider> getAllRider() {
		
		String sql="SELECT * FROM `rider`";
		List<Rider>riderList=new ArrayList<Rider>();
		try
		{
			PreparedStatement preparedStatement=DatabaseUtility.getDbConnection().prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next())
			{
				riderList.add(new Rider(resultSet.getInt(1), resultSet.getString(2), resultSet.getDouble(3)));
				
			}
			
		}catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		
		return riderList;
	}

}
