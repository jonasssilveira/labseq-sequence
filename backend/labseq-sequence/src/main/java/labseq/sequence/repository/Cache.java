package labseq.sequence.repository;
import labseq.sequence.domain.adapters.ICache;

import java.math.BigInteger;
import java.util.HashMap;

public class Cache implements ICache {
    private final HashMap<Long, BigInteger> cache;

    public Cache() {
        this.cache = new HashMap<>();
    }

    @Override
    public boolean containsKey(Long key) {
        return this.cache.containsKey(key);
    }

    @Override
    public BigInteger get(Long key) {
        return this.cache.get(key);
    }
    @Override
    public void put(Long key, BigInteger value) {
        this.cache.put(key, value);
    }
}
