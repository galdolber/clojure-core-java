package clojure;

import clojure.lang.*;

public final class core_load_string extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "load-reader");
 }
 public core_load_string() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  {
   Object rdr2 = new clojure.lang.LineNumberingPushbackReader((java.io.Reader)((java.io.Reader)new java.io.StringReader((java.lang.String)((java.lang.String)s1))));
   return ((IFn)const__0.getRawRoot()).invoke(rdr2);
  }
 }
}
