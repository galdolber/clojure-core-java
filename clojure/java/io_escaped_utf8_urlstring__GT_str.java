package clojure.java;

import clojure.lang.*;

public final class io_escaped_utf8_urlstring__GT_str extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.string", "replace");
 }
 public io_escaped_utf8_urlstring__GT_str() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  try {
   return ((java.lang.String)java.net.URLDecoder.decode((java.lang.String)((java.lang.String)((IFn)const__0.getRawRoot()).invoke(s1, "+", ((java.lang.String)java.net.URLEncoder.encode((java.lang.String)((java.lang.String)"+"), (java.lang.String)((java.lang.String)"UTF-8"))))), (java.lang.String)((java.lang.String)"UTF-8")));
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
