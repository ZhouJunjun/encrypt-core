package net.junjunzhou.codeUtil.encrypt;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/**
 * @author junjunzhou
 * @date 2023/3/30
 */
public abstract class EncryptRunner {
    abstract public String getName();

    abstract public List<String> getKeyNameList();

    abstract public Map<Integer, String> getKeyDefaultValMap();

    abstract public byte[] run(byte[] input, Charset charset, List<String> keyList) throws Exception;

    @Override
    public String toString() {
        return getName();
    }
}
