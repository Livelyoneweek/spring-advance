package hello.advanced.trace.strategy;

import hello.advanced.trace.strategy.code.template.Callback;
import hello.advanced.trace.strategy.code.template.TimeLogTemplate;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class TemplateCallbackTest {

    /**
     * 템플릿 콜백 패턴 적용
     */
    @Test
    void strategyV1() {
        
        // 익명함수 사용
        TimeLogTemplate template = new TimeLogTemplate();
        template.excute(new Callback() {
            @Override
            public void call() {
                log.info("비즈니스 로직1 실행");
            }
        });

        //람다 사용
        TimeLogTemplate template2 = new TimeLogTemplate();
        template2.excute(() ->  log.info("비즈니스 로직2 실행"));
    }
}
