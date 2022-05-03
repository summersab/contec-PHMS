package com.contec.phms.device.abpm50w;

import com.contec.phms.App_phms;
import com.contec.phms.device.template.DataFilter;
import com.contec.phms.device.template.SendCommand;
import com.contec.phms.manager.device.DeviceManager;
import com.example.bm77_contec08A_code.DeviceCommand;

public class DeviceService extends com.contec.phms.device.template.DeviceService {
    public void initObjects() {
        this.mReceiveThread = new ReceiveThread(this);
        this.mDataFilter = new DataFilter();
        this.mPackManager = new PackManager();
    }

    public void sendCommand() {
        ReceiveThread.mIsNew = false;
        ReceiveThread.mIsOld = false;
        DeviceManager.mDeviceBeanList.mState = 4;
        DeviceManager.m_DeviceBean.mState = 4;
        DeviceManager.m_DeviceBean.mProgress = 0;
        App_phms.getInstance().mEventBusPostOnBackGround.postInMainThread(DeviceManager.m_DeviceBean);
        SendCommand.send(DeviceCommand.REQUEST_HANDSHAKE());
    }

    public void saveSDCard() {
    }
}
