package fi.dy.masa.minihud.network;

import net.minecraft.network.PacketBuffer;

public interface BufferReader
{
    void readData(PacketBuffer buf);
}
