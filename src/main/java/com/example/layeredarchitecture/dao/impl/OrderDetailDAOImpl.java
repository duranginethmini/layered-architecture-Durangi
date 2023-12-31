package com.example.layeredarchitecture.dao.impl;

import com.example.layeredarchitecture.dao.custom.OrderDetailDAO;
import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderDetailDAOImpl implements OrderDetailDAO {
@Override
    public boolean saveOrderDetail(String orderId , OrderDetailDTO dto) throws SQLException,ClassNotFoundException{
    Connection connection = DBConnection.getDbConnection().getConnection();
    PreparedStatement stm = connection.prepareStatement("INSERT INTO OrderDetails (oid, itemCode, unitPrice, qty) VALUES (?,?,?,?)");
    stm.setString(1, orderId);
    stm.setString(2, dto.getItemCode());
    stm.setBigDecimal(3, dto.getUnitPrice());
    stm.setInt(4, dto.getQty());
    boolean b=stm.executeUpdate() >0;
    System.out.println(b);
    if (b) {
        return true;
    }
    connection.rollback();
    DBConnection.getDbConnection().getConnection().setAutoCommit(false);
    return false;
}

    @Override
    public ArrayList<OrderDetailDTO> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean save(OrderDetailDTO dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(OrderDetailDTO dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public void delete(String id) throws SQLException, ClassNotFoundException {

    }

    @Override
    public ResultSet generateNextId() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public OrderDetailDTO search(String id) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ArrayList<OrderDetailDTO> loadAll() throws SQLException, ClassNotFoundException {
        return null;
    }
}

