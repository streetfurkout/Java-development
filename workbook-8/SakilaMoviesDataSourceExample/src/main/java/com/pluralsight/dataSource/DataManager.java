package com.pluralsight.dataSource;

import javax.sql.DataSource;

public class DataManager {
    public DataSource dataSource;

    public DataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }


}
