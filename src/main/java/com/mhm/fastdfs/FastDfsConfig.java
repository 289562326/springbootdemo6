package com.mhm.fastdfs;

import org.csource.fastdfs.*;

/**
 * fastdfs配置类
 * Created by MHm on 2018/8/7.
 */
public class FastDfsConfig {

    public StorageClient1 initStorageClient()
    {
        StorageClient1 storageClient = null;
        try
        {
            ClientGlobal.init("fdfs-client.properties");
            TrackerClient trackerClient = new TrackerClient(ClientGlobal.g_tracker_group);
            TrackerServer trackerServer = trackerClient.getConnection();
        if (trackerServer == null)
        {
            throw new IllegalStateException("getConnection return null");
        }
        StorageServer storageServer = trackerClient.getStoreStorage(trackerServer);
        if (storageServer == null)
        {
            throw new IllegalStateException("getStoreStorage return null");
        }
        storageClient = new StorageClient1(trackerServer, storageServer);
    }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return storageClient;
    }
}
