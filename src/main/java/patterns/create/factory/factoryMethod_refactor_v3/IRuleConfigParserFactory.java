package patterns.create.factory.factoryMethod_refactor_v3;

import patterns.create.factory.simpleFactory_bad.IRuleConfigParser;

public interface IRuleConfigParserFactory {
    IRuleConfigParser createParser();
}
