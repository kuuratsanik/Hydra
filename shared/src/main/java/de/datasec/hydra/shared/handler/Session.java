package de.datasec.hydra.shared.handler;

import de.datasec.hydra.shared.protocol.packets.Packet;

import java.net.SocketAddress;

/**
 * Created with love by DataSec on 01.10.2017.
 */
public interface Session {

    void send(Packet packet);

    void close();

    boolean isConnected();

    SocketAddress getAddress();
}
