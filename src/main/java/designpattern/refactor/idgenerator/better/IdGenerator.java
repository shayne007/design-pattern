package designpattern.refactor.idgenerator.better;

public interface IdGenerator {
    String generate() throws IdGenerationFailureException;
}

// 代码使用举例
// LogTraceIdGenerator logTraceIdGenerator = new RandomIdGenerator();