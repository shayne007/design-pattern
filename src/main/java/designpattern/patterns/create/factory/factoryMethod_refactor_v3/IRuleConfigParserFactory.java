package designpattern.patterns.create.factory.factoryMethod_refactor_v3;

import designpattern.patterns.create.factory.simpleFactory_bad.IRuleConfigParser;

public interface IRuleConfigParserFactory {
    IRuleConfigParser createParser();
}
