package server;

import com.jmr.wrapper.common.Connection;
import com.jmr.wrapper.common.listener.SocketListener;


public class ServerListener implements SocketListener {

   

    @Override
    public void connected(Connection con) {
    	 System.out.println("New client connected.");
//    	 whenever a client connects
    	 ConnectionManager.getInstance().addConnection(con);
    }

    @Override
    public void disconnected(Connection con) {
   	 System.out.println("Client disconnected.");
   	ConnectionManager.getInstance().removeConnection(con);

    }
    @Override
    public void received(Connection con, Object object) {
    	
    }

}