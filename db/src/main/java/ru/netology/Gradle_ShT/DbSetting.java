package ru.netology.Gradle_ShT;

public class DbSetting extends Db.DbSetting {

    private String name;
    private String password;

    public DbSetting(String name, String password) {
        this.name = name;
        this.password = password;
    }

}
