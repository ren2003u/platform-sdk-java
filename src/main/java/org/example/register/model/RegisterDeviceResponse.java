package org.example.register.model;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import org.example.register.transfer.RegisterDeviceResponseUnmarshaller;

public class RegisterDeviceResponse extends AcsResponse {

    private String boxUUID;
    private NetworkClient networkClient;

    public String getBoxUUID() {
        return this.boxUUID;
    }

    public void setBoxUUID(String boxUUID) {
        this.boxUUID = boxUUID;
    }

    public NetworkClient getNetworkClient() {
        return this.networkClient;
    }

    public void setNetworkClient(NetworkClient networkClient) {
        this.networkClient = networkClient;
    }

    @Override
    public RegisterDeviceResponse getInstance(UnmarshallerContext context) {
        return	RegisterDeviceResponseUnmarshaller.unmarshall(this, context);
    }

    public static class NetworkClient {
        private String clientId;
        private String secretKey;

        public String getClientId() {
            return clientId;
        }

        public void setClientId(String clientId) {
            this.clientId = clientId;
        }

        public String getSecretKey() {
            return secretKey;
        }

        public void setSecretKey(String secretKey) {
            this.secretKey = secretKey;
        }
    }
}