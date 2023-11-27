package labseq.sequence.config.redis;

public class CalculatedValue {

    public String key;
    public long value;

    public CalculatedValue(String key, long value) {
        this.key = key;
        this.value = value;
    }

    public CalculatedValue() {
    }
}
