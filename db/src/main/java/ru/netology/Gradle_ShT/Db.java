package ru.netology.Gradle_ShT;

import java.util.UUID;

public class Db {
    private DbSetting dbSetting;
    private MyEntity myEntity;

    public Db(DbSetting dbSetting) {
        this.dbSetting = dbSetting;
        myEntity = new MyEntity("first");
        myEntity.setId(UUID.randomUUID());
    }

    public DbSetting getDbSetting() {
        return dbSetting;
    }

    public MyEntity getMyEntity() {
        return myEntity;
    }

    public void setMyEntity(MyEntity myEntity) {
        this.myEntity = myEntity;
    }

    public static class DbSetting {
        private String name;
        private String password;

        public DbSetting(String name, String password) {
            this.name = name;
            this.password = password;
        }

        public DbSetting() {
        }
    }
}
