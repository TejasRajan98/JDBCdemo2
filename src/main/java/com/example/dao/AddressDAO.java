package com.example.dao;

import com.example.data.Address;
import com.example.util.DbConnection;

import java.sql.*;

public class AddressDAO {
    public int insertIntoAddress(Address address) throws SQLException, ClassNotFoundException {
        int generatedId = 0;
        Connection connection = DbConnection.getConnection();
        String sql = "insert into address_tbl(flat_no, building_name, street, city, state, pincode, country) " +
                "values(?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, address.getFlatNo());
        preparedStatement.setString(2, address.getBuildingName());
        preparedStatement.setString(3, address.getStreet());
        preparedStatement.setString(4, address.getCity());
        preparedStatement.setString(5, address.getState());
        preparedStatement.setInt(6, address.getPinCode());
        preparedStatement.setString(7, address.getCountry());
        int rows = preparedStatement.executeUpdate();
        if (rows == 1) {
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                generatedId = resultSet.getInt(1);
            }

        }
        return generatedId;
    }

}
