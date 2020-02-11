
package org.javacc.parser;

public interface CodeGenerator {

  /**
   * Get the name of the code generator.
   */
  String getName();

  /**
   * Generate any other support files you need.
   */
  boolean generateHelpers(JavaCCContext context, CodeGeneratorSettings settings, TokenizerData tokenizerData);

  /**
   * The Token class generator.
   */
  TokenCodeGenerator getTokenCodeGenerator(JavaCCContext context);

  /**
   * The TokenManager class generator.
   */
  TokenManagerCodeGenerator getTokenManagerCodeGenerator(JavaCCContext context);

  /**
   * The Parser class generator.
   */
  ParserCodeGenerator getParserCodeGenerator(JavaCCContext context);

  /**
   * TODO(sreeni): Fix this when we do tree annotations in the parser code
   * generator. The JJTree preprocesor.
   */
  org.javacc.jjtree.DefaultJJTreeVisitor getJJTreeCodeGenerator();
}
