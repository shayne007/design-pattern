package designpattern.refactor.idgenerator.v1;

public interface IdGenerator {
    String generate() throws IdGenerationFailureException;
}

// 代码使用举例
// LogTraceIdGenerator logTraceIdGenerator = new RandomIdGenerator();