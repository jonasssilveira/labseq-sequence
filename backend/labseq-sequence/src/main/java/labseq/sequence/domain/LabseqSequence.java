package labseq.sequence.domain;

import labseq.sequence.domain.adapters.ICache;

import java.math.BigInteger;
import java.util.HashMap;

public class LabseqSequence {

    private ICache cache;

    public LabseqSequence(ICache cache) {
        this.cache = cache;
    }

    public BigInteger calculate(Long n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        if (n == 0 || n == 2) {
            return BigInteger.ZERO;
        } else if (n == 1 || n == 3) {
            return BigInteger.ONE;
        } else {
            BigInteger result = calculate(n - 4).add(calculate(n - 3));
            cache.put(n, result);
            return result;
        }
    }
}


