package clojure;

import clojure.lang.*;

public final class xml_startparse_sax extends clojure.lang.AFunction {
 static {
 }
 public xml_startparse_sax() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1, java.lang.Object ch2) {
  try {
   return Reflector.invokeInstanceMethod(((javax.xml.parsers.SAXParser)((javax.xml.parsers.SAXParserFactory)((javax.xml.parsers.SAXParserFactory)javax.xml.parsers.SAXParserFactory.newInstance())).newSAXParser()), "parse", new Object[]{s1, ch2});
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
