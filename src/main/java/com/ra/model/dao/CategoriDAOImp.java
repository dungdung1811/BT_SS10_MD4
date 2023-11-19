package com.ra.model.dao;

import com.ra.model.dao.CategoryDAO;
import com.ra.model.entity.Category;
import com.ra.ulti.ConectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriDAOImp implements CategoryDAO {
    @Override
    public List<Category> findAll() {
        List<Category> list = new ArrayList<>();
        Connection connection = null;
        connection = ConectionDB.openConnection();
        try {
            PreparedStatement pstm = connection.prepareStatement("SELECT * FROM category ");
//            ResultSet rs =


        } catch (SQLException e) {


            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Boolean create(Category category) {
        return null;
    }

    @Override
    public Boolean uppdate(Category category, Integer integer) {
        return null;
    }

    @Override
    public Category findById(Integer integer) {
        return null;
    }

    @Override
    public void delete(Integer integer) {

    }
}
