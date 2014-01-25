package clojure;

import clojure.lang.*;

public final class xml_loading__4931__auto__ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Symbol const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "refer");
  const__1 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.core");
 }
 public xml_loading__4931__auto__() {
  super();
 }
 public java.lang.Object invoke() {
  clojure.lang.Var.pushThreadBindings((clojure.lang.Associative)((clojure.lang.Associative)RT.mapUniqueKeys(((clojure.lang.Var)clojure.lang.Compiler.LOADER), ((java.lang.ClassLoader)((java.lang.Class)((java.lang.Class)((java.lang.Object)this).getClass())).getClassLoader()))));
  try {
   ((IFn)const__0.getRawRoot()).invoke(const__1);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(org.xml.sax.ContentHandler.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(org.xml.sax.Attributes.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(org.xml.sax.SAXException.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(javax.xml.parsers.SAXParser.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(javax.xml.parsers.SAXParserFactory.class);
   return null;
  } finally {
   clojure.lang.Var.popThreadBindings();
  }
 }
}
