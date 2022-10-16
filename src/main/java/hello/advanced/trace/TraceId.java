package hello.advanced.trace;

import lombok.Getter;

import java.util.UUID;

@Getter
public class TraceId {

    private String id;
    private int level;

    //생성자
    public TraceId() {
        this.id = createId();
        this.level = 0;
    }

    private String createId() {
        // UUID 생성 후 너무 길어서 앞 8자리만 사용
        return UUID.randomUUID().toString().substring(0, 8);
    }

    private TraceId (String id, int level) {
        this.id = id;
        this.level = level;
    }

    public TraceId createNextId() {
        return new TraceId(id, level+1);
    }

    public TraceId createPreviousId() {
        return new TraceId(id, level - 1);
    }

    public boolean isFirstLevel() {
        return level == 0;
    }

}
