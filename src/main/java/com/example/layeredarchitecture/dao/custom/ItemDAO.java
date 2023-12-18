package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO extends CrudDAO<ItemDTO> {
     /*ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException;
     boolean saveItem (ItemDTO dto) throws SQLException, ClassNotFoundException;
     boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException ;
     boolean existItem(String code) throws SQLException, ClassNotFoundException ;
     void deleteItem(String code) throws SQLException, ClassNotFoundException ;
   ResultSet generateNextId() throws SQLException, ClassNotFoundException ;
    ItemDTO findItem (String code) throws SQLException,ClassNotFoundException;
    ArrayList<ItemDTO> loadAllItemCodes()throws SQLException,ClassNotFoundException;*/
}
