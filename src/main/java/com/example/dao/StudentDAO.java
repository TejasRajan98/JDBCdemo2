package com.example.dao;

import com.example.data.Student;
import com.example.util.DbConnection;

import java.sql.*;

public class StudentDAO {
    public int insertIntoStudent(Student student) throws SQLException, ClassNotFoundException {
        int studentId = 0;
        Connection connection = DbConnection.getConnection();
        //student_id, name, roll_no, email, address_id, class_id
        String sql = "insert into student_tbl (name, roll_no, email, address_id, class_id) values (?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, student.getName());
        preparedStatement.setInt(2, student.getRollNo());
        preparedStatement.setString(3, student.getEmail());
        int classId = new StandardDAO().checkAndGetClassId(student.getStandard());
        preparedStatement.setInt(5, classId);
        int addressId = new AddressDAO().insertIntoAddress(student.getAddress());
        preparedStatement.setInt(4, addressId);
        int rows = preparedStatement.executeUpdate();
        if (rows == 1) {
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                studentId = resultSet.getInt(1);
            }
        }
        return studentId;
    }
}
