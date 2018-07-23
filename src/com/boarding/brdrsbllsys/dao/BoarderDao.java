/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boarding.brdrsbllsys.dao;

import com.boarding.brdrsbllsys.conn.DBConnection;
import com.boarding.brdrsbllsys.dto.BoarderDto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author student
 */
public class BoarderDao {

    Connection c = null;

    public boolean insert(BoarderDto dto) throws SQLException, ClassNotFoundException {
        c = DBConnection.getDBConnection().getConnection();
        Statement createStatement = c.createStatement();
        return createStatement.executeUpdate("insert into boarder values('" + dto.getName()+ "');") > 0;

    }

    public boolean delete(BoarderDto dto) throws SQLException, ClassNotFoundException {
        c = DBConnection.getDBConnection().getConnection();
        Statement createStatement = c.createStatement();
        return createStatement.executeUpdate("delete from boarder where name='" + dto.getName() + "';") > 0;

    }

    public BoarderDto select(BoarderDto dto) throws SQLException, ClassNotFoundException {
        c = DBConnection.getDBConnection().getConnection();
        Statement createStatement = c.createStatement();
        ResultSet rst = createStatement.executeQuery("select from boarder where name='" + dto.getName() + "';");
        BoarderDto boarder = null;
        if (null != rst) {
            boarder = new BoarderDto(rst.getString(1));
        }
        return boarder;
    }

    public ArrayList<BoarderDto> selectAll() throws SQLException, ClassNotFoundException {
        c = DBConnection.getDBConnection().getConnection();
        ArrayList<BoarderDto> boarders = new ArrayList<>();
        Statement createStatement = c.createStatement();
        ResultSet rst = createStatement.executeQuery("select * from boarder");
        if (null != rst) {
            while (rst.next()) {
                boarders.add(new BoarderDto(rst.getString(1)));
            }
        }

        return boarders;
    }
}
