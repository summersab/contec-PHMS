package com.contec.phms.db.localdata;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "LDCMSSXT")
public class CmssxtDataDao {
    public static final String DATA = "data";
    public static final String FLAG = "flag";
    public static final String TIME = "time";
    public static final String UNIQUE = "unique";
    @DatabaseField(columnName = "data", id = false)
    public String mData;
    @DatabaseField(columnName = "flag", id = false)
    public String mFlag;
    @DatabaseField(generatedId = true)
    public int mID;
    @DatabaseField(columnName = "time", id = false)
    public String mTime;
    @DatabaseField(columnName = "unique", id = false)
    public String mUnique;
}
