package domain;

import io.quarkus.test.Mock;
import labseq.sequence.domain.LabseqSequence;
import labseq.sequence.domain.adapters.ICache;
import labseq.sequence.repository.Cache;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LabseqSequenceTest {

    @Test
    public void testLabseqSequence() {
        Cache cache = new Cache();

        // Create an instance of LabseqSequence
        LabseqSequence sequence = new LabseqSequence(cache);

        // Test cases
        assertEquals("3", sequence.calculate(10L).toString());
        assertEquals("21", sequence.calculate(20L).toString());
        assertEquals("107", sequence.calculate(28L).toString());
        assertEquals("10379", sequence.calculate(51L).toString());
    }
}