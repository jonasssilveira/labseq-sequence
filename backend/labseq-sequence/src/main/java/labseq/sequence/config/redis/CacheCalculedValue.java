package labseq.sequence.config.redis;

import io.quarkus.redis.datasource.RedisDataSource;
import io.quarkus.redis.datasource.value.ValueCommands;
import jakarta.enterprise.context.ApplicationScoped;

import java.math.BigInteger;

@ApplicationScoped
public class CacheCalculedValue {

    private ValueCommands<String, BigInteger> valueCache;

    public CacheCalculedValue(RedisDataSource redisDataSource) {
        this.valueCache = redisDataSource.value(BigInteger.class);
    }

    public void set(String key, BigInteger value) {
        this.valueCache.set(key, value);
    }

    public BigInteger get(String key) {
        return this.valueCache.get(key);
    }

}
