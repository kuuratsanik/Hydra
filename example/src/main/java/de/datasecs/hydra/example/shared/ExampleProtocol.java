package de.datasecs.hydra.example.shared;

import de.datasecs.hydra.example.server.ExampleServerPacketListener;
import de.datasecs.hydra.example.shared.packets.ExamplePacket;
import de.datasecs.hydra.example.shared.packets.ExampleSerializationPacket;
import de.datasecs.hydra.shared.protocol.HydraProtocol;

/**
 * Created with love by DataSecs on 03.11.2017.
 */
public class ExampleProtocol extends HydraProtocol {

    public ExampleProtocol() {
        // Register your packets and listener. This is a very important step! Otherwise Hydra can't work with them!
        registerPacket(ExamplePacket.class);
        registerPacket(ExampleSerializationPacket.class);
        registerListener(new ExampleServerPacketListener());
    }
}