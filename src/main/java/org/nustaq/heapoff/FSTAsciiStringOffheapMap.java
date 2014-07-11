package org.nustaq.heapoff;

import org.nustaq.heapoff.bytez.ByteSource;
import org.nustaq.heapoff.bytez.bytesource.LeftCutStringByteSource;
import org.nustaq.serialization.FSTConfiguration;

import java.io.Serializable;
import java.util.Iterator;

/**
 * Created by ruedi on 27.06.14.
 */
public class FSTAsciiStringOffheapMap<V> extends FSTSerializedOffheapMap<String,V> {

    LeftCutStringByteSource tmpKey;

    public FSTAsciiStringOffheapMap(int keyLen, long sizeMemBytes, int numberOfEleems, FSTConfiguration conf) {
        super(keyLen, sizeMemBytes, numberOfEleems, conf);
        tmpKey = new LeftCutStringByteSource(null,0,keyLen);
    }

    public FSTAsciiStringOffheapMap(String mappedFile, int keyLen, long sizeMemBytes, int numberOfElems,FSTConfiguration conf) throws Exception {
        super(mappedFile, keyLen, sizeMemBytes, numberOfElems, conf);
        tmpKey = new LeftCutStringByteSource(null,0,keyLen);
    }

    public ByteSource encodeKey(String key) {
        if ( key.length() > tmpKey.length() )
            throw new RuntimeException("key too long");
        tmpKey.setString(key);
        return tmpKey;
    }

}

