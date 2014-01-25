package clojure;

import clojure.lang.*;

public final class xml_fn__6926 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "init-proxy");
 }
 public xml_fn__6926() {
  super();
 }
 public java.lang.Object invoke() {
  {
   Object push_content1 = new clojure.xml_fn__6926_push_content__6927();
   Object push_chars2 = new clojure.xml_fn__6926_push_chars__6930(push_content1);
   Object __r4528 = null;
   {
    Object p__5329__auto__3 = new clojure.xml.proxy$java.lang.Object$ContentHandler$3f6d64b6();
    ((IFn)const__0.getRawRoot()).invoke(p__5329__auto__3, RT.mapUniqueKeys("endPrefixMapping", new clojure.xml_fn__6926_fn__6935(), "endElement", new clojure.xml_fn__6926_fn__6937(push_chars2, push_content1), "characters", new clojure.xml_fn__6926_fn__6939(), "ignorableWhitespace", new clojure.xml_fn__6926_fn__6941(), "skippedEntity", new clojure.xml_fn__6926_fn__6943(), "endDocument", new clojure.xml_fn__6926_fn__6945(), "setDocumentLocator", new clojure.xml_fn__6926_fn__6947(), "startElement", new clojure.xml_fn__6926_fn__6949(push_chars2), "startPrefixMapping", new clojure.xml_fn__6926_fn__6953(), "processingInstruction", new clojure.xml_fn__6926_fn__6955(), "startDocument", new clojure.xml_fn__6926_fn__6957()));
    __r4528 = p__5329__auto__3;
   }
   return new clojure.lang.XMLHandler((org.xml.sax.ContentHandler)((org.xml.sax.ContentHandler)__r4528));
  }
 }
}
