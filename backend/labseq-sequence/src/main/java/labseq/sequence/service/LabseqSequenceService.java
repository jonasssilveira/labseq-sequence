package labseq.sequence.service;

import io.quarkus.redis.client.RedisClient;
import io.vertx.redis.client.Response;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import labseq.sequence.config.redis.CacheCalculedValue;
import labseq.sequence.domain.LabseqSequence;
import labseq.sequence.repository.Cache;

import java.math.BigInteger;

@ApplicationScoped
public class LabseqSequenceService {

    private LabseqSequence labseqSequence;

    @Inject
    CacheCalculedValue redisClient;

    public LabseqSequenceService() {
        this.labseqSequence = new LabseqSequence(new Cache());
    }

    public BigInteger calcule(Long n) {
        var response = redisClient.get(String.valueOf(n));

        if(response != null)
            return response;
        BigInteger calculate = this.labseqSequence.calculate(n);
        redisClient.set(String.valueOf(n), calculate);
        return calculate;
    }

}
