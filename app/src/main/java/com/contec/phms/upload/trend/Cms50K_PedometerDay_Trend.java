package com.contec.phms.upload.trend;

import android.util.Base64;
import com.contec.phms.device.template.DeviceData;
import org.apache.commons.httpclient.HttpMethodBase;

public class Cms50K_PedometerDay_Trend extends Trend {
    private static final String TAG = "Cms50DJ_PedometerDay_Trend";
    public DeviceData mData;

    public Cms50K_PedometerDay_Trend(DeviceData datas) {
        this.mData = datas;
        getContent();
    }

    public HttpMethodBase getMethod() {
        return this.mMethod;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String makeContect() {
        /*
            r22 = this;
            r18 = 0
            byte[] r18 = (byte[]) r18
            r10 = 9
            r0 = r22
            com.contec.phms.device.template.DeviceData r0 = r0.mData
            r20 = r0
            if (r20 == 0) goto L_0x028c
            r0 = r22
            com.contec.phms.device.template.DeviceData r0 = r0.mData
            r20 = r0
            r0 = r20
            java.util.ArrayList<java.lang.Object> r0 = r0.mDataList
            r20 = r0
            r21 = 0
            java.lang.Object r20 = r20.get(r21)
            if (r20 == 0) goto L_0x028c
            r0 = r22
            com.contec.phms.device.template.DeviceData r0 = r0.mData
            r20 = r0
            r0 = r20
            java.util.ArrayList<java.lang.Object> r0 = r0.mDataList
            r20 = r0
            int r20 = r20.size()
            r0 = r20
            byte r6 = (byte) r0
            r3 = 14
            int r20 = r6 * r3
            int r4 = r20 + 3
            byte[] r0 = new byte[r4]
            r18 = r0
            r20 = 0
            r18[r20] = r10
            r20 = 1
            r18[r20] = r6
            r20 = 2
            r18[r20] = r3
            r13 = 3
            com.contec.phms.db.LoginUserDao r5 = com.contec.phms.util.PageUtil.getLoginUserInfo()
            r8 = 0
            java.lang.String r0 = r5.mSportTargetCal
            r20 = r0
            if (r20 == 0) goto L_0x006b
            java.lang.String r0 = r5.mSportTargetCal
            r20 = r0
            java.lang.String r21 = ""
            boolean r20 = r20.equalsIgnoreCase(r21)
            if (r20 != 0) goto L_0x006b
            java.lang.String r0 = r5.mSportTargetCal
            r20 = r0
            int r8 = java.lang.Integer.parseInt(r20)
        L_0x006b:
            r16 = 0
            r14 = r13
        L_0x006e:
            r0 = r16
            if (r0 < r6) goto L_0x007b
        L_0x0072:
            r0 = r22
            r1 = r18
            java.lang.String r20 = r0.encodeBASE64(r1)
            return r20
        L_0x007b:
            r0 = r22
            com.contec.phms.device.template.DeviceData r0 = r0.mData
            r20 = r0
            r0 = r20
            java.util.ArrayList<java.lang.Object> r0 = r0.mDataList
            r20 = r0
            r0 = r20
            r1 = r16
            java.lang.Object r9 = r0.get(r1)
            byte[] r9 = (byte[]) r9
            r20 = 4
            byte r20 = r9[r20]
            r0 = r20
            r0 = r0 & 255(0xff, float:3.57E-43)
            r20 = r0
            int r20 = r20 << 8
            r21 = 3
            byte r21 = r9[r21]
            r0 = r21
            r0 = r0 & 255(0xff, float:3.57E-43)
            r21 = r0
            r2 = r20 | r21
            r20 = 6
            byte r20 = r9[r20]
            r0 = r20
            r0 = r0 & 255(0xff, float:3.57E-43)
            r20 = r0
            int r20 = r20 << 8
            r21 = 5
            byte r21 = r9[r21]
            r0 = r21
            r0 = r0 & 255(0xff, float:3.57E-43)
            r21 = r0
            r7 = r20 | r21
            r20 = 65535(0xffff, float:9.1834E-41)
            r0 = r20
            if (r2 == r0) goto L_0x00cf
            r20 = 65535(0xffff, float:9.1834E-41)
            r0 = r20
            if (r7 != r0) goto L_0x00d6
        L_0x00cf:
            r2 = 0
            r7 = 0
            r13 = r14
        L_0x00d2:
            int r16 = r16 + 1
            r14 = r13
            goto L_0x006e
        L_0x00d6:
            int r13 = r14 + 1
            r20 = 0
            byte r20 = r9[r20]
            r18[r14] = r20
            int r14 = r13 + 1
            r20 = 1
            byte r20 = r9[r20]
            r18[r13] = r20
            int r13 = r14 + 1
            r20 = 2
            byte r20 = r9[r20]
            r18[r14] = r20
            int r14 = r13 + 1
            r20 = 0
            r18[r13] = r20
            int r13 = r14 + 1
            r20 = 0
            r18[r14] = r20
            int r14 = r13 + 1
            int r20 = r7 >> 16
            r0 = r20
            r0 = r0 & 255(0xff, float:3.57E-43)
            r20 = r0
            r0 = r20
            byte r0 = (byte) r0
            r20 = r0
            r18[r13] = r20
            int r13 = r14 + 1
            int r20 = r7 >> 8
            r0 = r20
            r0 = r0 & 255(0xff, float:3.57E-43)
            r20 = r0
            r0 = r20
            byte r0 = (byte) r0
            r20 = r0
            r18[r14] = r20
            int r14 = r13 + 1
            r0 = r7 & 255(0xff, float:3.57E-43)
            r20 = r0
            r0 = r20
            byte r0 = (byte) r0
            r20 = r0
            r18[r13] = r20
            int r13 = r14 + 1
            int r20 = r8 >> 16
            r0 = r20
            r0 = r0 & 255(0xff, float:3.57E-43)
            r20 = r0
            r0 = r20
            byte r0 = (byte) r0
            r20 = r0
            r18[r14] = r20
            int r14 = r13 + 1
            int r20 = r8 >> 8
            r0 = r20
            r0 = r0 & 255(0xff, float:3.57E-43)
            r20 = r0
            r0 = r20
            byte r0 = (byte) r0
            r20 = r0
            r18[r13] = r20
            int r13 = r14 + 1
            r0 = r8 & 255(0xff, float:3.57E-43)
            r20 = r0
            r0 = r20
            byte r0 = (byte) r0
            r20 = r0
            r18[r14] = r20
            int r14 = r13 + 1
            int r20 = r2 >> 16
            r0 = r20
            r0 = r0 & 255(0xff, float:3.57E-43)
            r20 = r0
            r0 = r20
            byte r0 = (byte) r0
            r20 = r0
            r18[r13] = r20
            int r13 = r14 + 1
            int r20 = r2 >> 8
            r0 = r20
            r0 = r0 & 255(0xff, float:3.57E-43)
            r20 = r0
            r0 = r20
            byte r0 = (byte) r0
            r20 = r0
            r18[r14] = r20
            int r14 = r13 + 1
            r0 = r2 & 255(0xff, float:3.57E-43)
            r20 = r0
            r0 = r20
            byte r0 = (byte) r0
            r20 = r0
            r18[r13] = r20
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.StringBuilder r20 = new java.lang.StringBuilder
            java.lang.String r21 = "20"
            r20.<init>(r21)
            r21 = 0
            byte r21 = r9[r21]
            java.lang.StringBuilder r20 = r20.append(r21)
            java.lang.String r21 = "-"
            java.lang.StringBuilder r20 = r20.append(r21)
            java.lang.String r20 = r20.toString()
            r0 = r20
            r11.append(r0)
            r20 = 1
            byte r20 = r9[r20]
            r21 = 10
            r0 = r20
            r1 = r21
            if (r0 >= r1) goto L_0x0263
            java.lang.StringBuilder r20 = new java.lang.StringBuilder
            java.lang.String r21 = "0"
            r20.<init>(r21)
            r21 = 1
            byte r21 = r9[r21]
            java.lang.StringBuilder r20 = r20.append(r21)
            java.lang.String r21 = "-"
            java.lang.StringBuilder r20 = r20.append(r21)
            java.lang.String r20 = r20.toString()
            r0 = r20
            r11.append(r0)
        L_0x01d4:
            r20 = 2
            byte r20 = r9[r20]
            r21 = 10
            r0 = r20
            r1 = r21
            if (r0 >= r1) goto L_0x0281
            java.lang.StringBuilder r20 = new java.lang.StringBuilder
            java.lang.String r21 = "0"
            r20.<init>(r21)
            r21 = 2
            byte r21 = r9[r21]
            java.lang.StringBuilder r20 = r20.append(r21)
            java.lang.String r20 = r20.toString()
            r0 = r20
            r11.append(r0)
        L_0x01f8:
            java.lang.String r19 = r11.toString()
            com.contec.phms.App_phms r20 = com.contec.phms.App_phms.getInstance()
            android.content.Context r20 = r20.getApplicationContext()
            com.contec.phms.db.localdata.opration.PedometerDayDataDaoOperation r17 = com.contec.phms.db.localdata.opration.PedometerDayDataDaoOperation.getInstance(r20)
            r0 = r17
            r1 = r19
            boolean r20 = r0.querySql(r1)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r20)
            boolean r20 = r15.booleanValue()
            if (r20 != 0) goto L_0x0260
            com.contec.phms.db.localdata.PedometerDayDataDao r12 = new com.contec.phms.db.localdata.PedometerDayDataDao
            r12.<init>()
            r0 = r19
            r12.mTime = r0
            java.lang.StringBuilder r20 = new java.lang.StringBuilder
            java.lang.String r21 = java.lang.String.valueOf(r2)
            r20.<init>(r21)
            java.lang.String r20 = r20.toString()
            r0 = r20
            r12.mCal = r0
            java.lang.StringBuilder r20 = new java.lang.StringBuilder
            java.lang.String r21 = java.lang.String.valueOf(r7)
            r20.<init>(r21)
            java.lang.String r20 = r20.toString()
            r0 = r20
            r12.mSteps = r0
            r0 = r22
            com.contec.phms.device.template.DeviceData r0 = r0.mData
            r20 = r0
            r0 = r20
            java.lang.String r0 = r0.mFileName
            r20 = r0
            r0 = r20
            r12.mUnique = r0
            java.lang.String r20 = "0"
            r0 = r20
            r12.mFlag = r0
            r0 = r17
            r0.insertPedometerDayDataDao(r12)
        L_0x0260:
            r13 = r14
            goto L_0x00d2
        L_0x0263:
            java.lang.StringBuilder r20 = new java.lang.StringBuilder
            r21 = 1
            byte r21 = r9[r21]
            java.lang.String r21 = java.lang.String.valueOf(r21)
            r20.<init>(r21)
            java.lang.String r21 = "-"
            java.lang.StringBuilder r20 = r20.append(r21)
            java.lang.String r20 = r20.toString()
            r0 = r20
            r11.append(r0)
            goto L_0x01d4
        L_0x0281:
            r20 = 2
            byte r20 = r9[r20]
            r0 = r20
            r11.append(r0)
            goto L_0x01f8
        L_0x028c:
            r20 = 1
            r0 = r20
            byte[] r0 = new byte[r0]
            r18 = r0
            r20 = 0
            r21 = 0
            r18[r20] = r21
            java.lang.String r20 = "*****************************"
            java.lang.String r21 = "**pack**pack***pack**pack*********"
            com.contec.phms.util.CLog.e(r20, r21)
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: com.contec.phms.upload.trend.Cms50K_PedometerDay_Trend.makeContect():java.lang.String");
    }

    public String encodeBASE64(byte[] pack) {
        return Base64.encodeToString(pack, 0);
    }
}
