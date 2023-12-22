package com.example.layeredarchitecture.dao.impl;

import com.example.layeredarchitecture.dao.SQLutil;
import com.example.layeredarchitecture.dao.custom.QueryDAO;
import com.example.layeredarchitecture.model.CustomDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QueryDAOImpl implements QueryDAO {

    @Override
    public List<CustomDTO> customerOrderDetail() throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLutil.execute("SELECT * FROM Customer join Orders on Customer.id=Orders.customerID");
        List<CustomDTO> joinquery = new ArrayList<>();

        while (rst.next()) {
            CustomDTO dto = new CustomDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getDate(5).toLocalDate()
            );

            joinquery.add(dto);
        }
        return joinquery;
    }

    }

