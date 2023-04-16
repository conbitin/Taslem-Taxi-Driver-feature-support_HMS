package com.tasleem.driver.utils;

import java.net.URISyntaxException;

import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;
import io.socket.engineio.client.transports.WebSocket;

public class SocketHelper {
    public static final String GET_NEW_REQUEST = "get_new_request_";
    public static String UPDATE_LOCATION = "update_location";
    public static String UPDATE_TRIP_STOPS = "update_trip_stops";
    private static SocketHelper socketHelper;
    private String TAG = this.getClass().getSimpleName();
    private final Emitter.Listener onConnectError = new Emitter.Listener() {
        @Override
        public void call(Object... args) {
            AppLog.Log(TAG, "Socket ConnectError");
        }
    };
    private Socket socket;
    private SocketListener socketListener;
    private final Emitter.Listener onConnect = new Emitter.Listener() {
        @Override
        public void call(Object... args) {
            AppLog.Log(TAG, "Socket Connected");
            if (socketListener != null) {
                socketListener.onSocketConnect();
            }


        }
    };
    private final Emitter.Listener onDisconnect = new Emitter.Listener() {
        @Override
        public void call(Object... args) {
            AppLog.Log(TAG, "Socket Disconnected");
            if (socketListener != null) {
                socketListener.onSocketDisconnect();
            }
        }
    };

    private SocketHelper(String providerId) {
        try {
            IO.Options opts = new IO.Options();
            opts.transports = new String[]{WebSocket.NAME};
            opts.query = "user_id=" + providerId;
            socket = IO.socket(ServerConfig.BASE_URL, opts);
        } catch (URISyntaxException e) {
            AppLog.handleException(SocketHelper.class.getSimpleName(), e);
        }
    }

    public static SocketHelper getInstance(String providerId) {
        if (socketHelper == null) {
            synchronized (SocketHelper.class) {
                if (socketHelper == null) {
                    socketHelper = new SocketHelper(providerId);
                }
            }
        }
        return socketHelper;

    }

    public boolean isConnected() {
        return socket.connected();
    }

    public void setSocketConnectionListener(SocketListener socketListener) {
        this.socketListener = socketListener;
    }

    public Socket getSocket() {
        return socket;
    }

    public void socketConnect() {
        if (!socket.connected()) {
            socket.on(Socket.EVENT_CONNECT, onConnect);
            socket.on(Socket.EVENT_DISCONNECT, onDisconnect);
            socket.on(Socket.EVENT_CONNECT_ERROR, onConnectError);
            socket.connect();
        }
    }

    public void socketDisconnect() {
        if (socket.connected()) {
            socket.disconnect();
            socket.off();
        }
    }


    public interface SocketListener {
        void onSocketConnect();

        void onSocketDisconnect();
    }


}

