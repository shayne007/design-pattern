package patterns.factory.factoryMethod_refactor_v3;

import patterns.factory.simpleFactory_bad.IRuleConfigParser;

public interface IRuleConfigParserFactory {
    IRuleConfigParser createParser();
}
