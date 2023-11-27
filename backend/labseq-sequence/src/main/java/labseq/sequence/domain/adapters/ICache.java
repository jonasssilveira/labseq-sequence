package labseq.sequence.domain.adapters;

import java.math.BigInteger;

public interface ICache {

    BigInteger get(Long key);
    void put(Long key, BigInteger value);
    boolean containsKey(Long key);
}
